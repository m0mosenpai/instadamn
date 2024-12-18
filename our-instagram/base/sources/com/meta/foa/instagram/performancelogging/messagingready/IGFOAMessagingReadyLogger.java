package com.meta.foa.instagram.performancelogging.messagingready;

import X.C47272Eu;
import com.meta.foa.performancelogging.messagingready.FOAMessagingReadyLogger;

/* loaded from: classes.dex */
public interface IGFOAMessagingReadyLogger extends FOAMessagingReadyLogger {
    public static final C47272Eu Companion = C47272Eu.A02;

    void annotateConnectionFailureCode(int i);

    void annotateLoginResult(String str);

    void annotateLoginType(String str);

    void annotateMsysCallsite(String str);

    void annotateNotifTriggered(boolean z);

    void onBuildFailure(String str);

    void onLogActConnectionEnd();

    void onLogActConnectionStart();

    void onLogActLoginEnd();

    void onLogActLoginStart();

    void onLogInitMsysArmadillo();

    void onLogMailboxBootstrapEnd();

    void onLogMailboxBootstrapStart();

    void onLogMailboxDepCallbackEnd();

    void onLogMailboxDepCallbackStart();

    void onLogMainFeedFragmentCreated();

    void onLogMainFeedFragmentResumed();

    void onLogMainFeedRequestEnd();

    void onLogMainFeedRequestStart();

    void onLogMainFragmentOnCreate();

    void onLogOfflineSyncStart();

    void onLogRxActCallbackEnd();

    void onLogRxActCallbackStart();

    void onLogSecureMessageCryptoCallbackEnd();

    void onLogSecureMessageCryptoCallbackStart();

    void onOfflineCompletion(int i);

    void onOfflineMessageProcessed();

    void onOfflineMessageProcessedFailed();

    void onPersistFailure(String str);

    void onPersistMessage(String str);

    void onProcessFailure(String str);

    void onReceiveOfflineMessage(String str);

    void onRenderFailure(String str);

    void onValidateTotalOfflineDispatch(int i);
}
