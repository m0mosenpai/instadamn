package com.facebook.realtime.clientsync;

import X.C00O;
import X.C09170dP;
import X.C72560Xgg;

/* loaded from: classes12.dex */
public abstract class DelegatingEventHandler {
    public static final C72560Xgg Companion = new Object();

    private final void onEntityUpdatePayloadReceived(String str, String str2, int i) {
        throw C00O.createAndThrow();
    }

    private final void onError(int i) {
        throw C00O.createAndThrow();
    }

    private final void onPresenceUpdatePayloadReceived(String str, int i) {
        throw C00O.createAndThrow();
    }

    private final void onPresenceUpdatePayloadReceived(String str, int i, String str2) {
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xgg] */
    static {
        C09170dP.A0C("realtime-client-sync-jni");
    }

    private final void onConnectionStatusChange(int i) {
        throw C00O.createAndThrow();
    }

    private final void onEntityUpdatePayloadReceived(String str, String str2, int i, String str3) {
        throw C00O.createAndThrow();
    }

    private final void onError(int i, String str) {
        throw C00O.createAndThrow();
    }

    private final void onSave(Object obj, String str) {
        throw C00O.createAndThrow();
    }
}
