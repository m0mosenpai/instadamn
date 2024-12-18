package com.facebook.mediastreaming.opt.transport.videoprotocolimpl;

import X.C09170dP;
import X.C62630SJn;
import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.HTTPThread;

/* loaded from: classes10.dex */
public final class TransportEventBaseProvider {
    public static final C62630SJn Companion = new Object();
    public static TransportEventBaseProvider provider;
    public final EventBase eventBase;
    public final Thread networkThread;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.SJn] */
    static {
        C09170dP.A0C("liger");
    }

    public static final synchronized Object provideEventBase() {
        Object provideEventBase;
        synchronized (TransportEventBaseProvider.class) {
            provideEventBase = Companion.provideEventBase();
        }
        return provideEventBase;
    }

    public TransportEventBaseProvider() {
        HTTPThread hTTPThread = new HTTPThread();
        Thread thread = new Thread(hTTPThread);
        this.networkThread = thread;
        thread.setPriority(5);
        thread.start();
        hTTPThread.waitForInitialization();
        this.eventBase = hTTPThread.getEventBase();
    }
}
