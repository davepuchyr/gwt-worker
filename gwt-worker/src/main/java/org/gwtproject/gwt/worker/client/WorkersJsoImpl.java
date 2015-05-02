package org.gwtproject.gwt.worker.client;

import org.gwtproject.gwt.worker.shared.AbstractWorkerScope;
import org.gwtproject.gwt.worker.shared.Promise;
import org.gwtproject.gwt.worker.shared.Worker;
import org.gwtproject.gwt.worker.shared.WorkersBaseImpl;
import org.gwtproject.gwt.worker.shared.service.ServiceWorker;
import org.gwtproject.gwt.worker.shared.shared.SharedWorker;

public class WorkersJsoImpl extends WorkersBaseImpl {

	@Override
	public native boolean inWorkerContext()/*-{
		return typeof $self.importScripts === 'function';
	}-*/;

	@Override
	public native Worker newWorker(String scriptUrl) /*-{
		return new Worker(scriptUrl);
	}-*/;
	
	@Override
	public native SharedWorker newSharedWorker(String scriptUrl, String name)/*-{
		return new SharedWorker(scriptUrl, name);
	}-*/;
	
	@Override
	public Promise<ServiceWorker> registerServiceWorker(String url) {
		return null;
	}
	
	@Override
	public AbstractWorkerScope getScope() {
		return null;
	}

}
