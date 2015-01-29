package project;

public class ProjectCallLoggingResource {
	
	private NextActionEnqueuer actionQueue;
	private ClientInteractionsAuditService interactionsAudit;
	
	public ProjectCallLoggingResource() {
		actionQueue = new NextActionEnqueuer();
		interactionsAudit = new ClientInteractionsAuditService();
	}
	
	public void handleCall(Call call, Client client, String projectName) {
		ProjectContactService contactService = new ProjectContactService();
		CallResultService callResultService = new CallResultService(); 
		
		NextAction callAction = callResultService.getCallResult(call, client);
		actionQueue.addActionToQueue(callAction);
		
		contactService.logClientContact(projectName);
		if (contactService.getNumberOfContactsWithClient(projectName) % 100 == 0) {
			interactionsAudit.startAudit();
		}
	}

}
