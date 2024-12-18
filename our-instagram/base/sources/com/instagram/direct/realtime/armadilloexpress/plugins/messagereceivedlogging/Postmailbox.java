package com.instagram.direct.realtime.armadilloexpress.plugins.messagereceivedlogging;

import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class Postmailbox {
    public UserSession mAppContext;
    public AccountSession mPluginContext;

    public void IGMessageReceivedLoggingImplExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract void IGMessageReceivedLoggingImpl_MEMMessageReceivedLog(String str, long j, long j2, int i, int i2);

    public abstract void IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingMarkerPoint(String str, String str2);

    public abstract void IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingStart(String str, int i, boolean z);

    public abstract void IGMessageReceivedLoggingImpl_MEMUpdateLatestNotificationPayloadContent(Object obj);

    private void IGMessageReceivedLoggingImpl_MEMUpdateLatestNotificationPayloadContentJNI(Object obj) {
    }

    public Postmailbox(AccountSession accountSession, UserSession userSession) {
        this.mPluginContext = accountSession;
        this.mAppContext = userSession;
    }

    private void IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingStartJNI(String str, int i, boolean z) {
        IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingStart(str, i, z);
    }

    private void IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingMarkerPointJNI(String str, String str2) {
        IGMessageReceivedLoggingImpl_MEMMessageReceivedLoggingMarkerPoint(str, str2);
    }

    private void IGMessageReceivedLoggingImpl_MEMMessageReceivedLogJNI(String str, long j, long j2, int i, int i2) {
    }
}
