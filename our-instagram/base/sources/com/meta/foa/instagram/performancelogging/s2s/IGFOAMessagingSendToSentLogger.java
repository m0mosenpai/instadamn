package com.meta.foa.instagram.performancelogging.s2s;

import X.C163307Sp;
import com.instagram.common.session.UserSession;
import com.meta.foa.performancelogging.s2s.FOAMessagingSendToSentLogger;

/* loaded from: classes3.dex */
public interface IGFOAMessagingSendToSentLogger extends FOAMessagingSendToSentLogger {
    public static final C163307Sp Companion = C163307Sp.A07;

    void annotateDirectMutationType(int i);

    void annotateDirectMutationTypeStr(String str);

    void annotateDispatchedFromDisk();

    void annotateEndPointReason(String str);

    void annotateFirstSend(String str);

    void annotateForwardThreadType(boolean z, boolean z2);

    void annotateIsForward(boolean z);

    void annotateIsReshare(boolean z);

    void annotatePreviousMutation(long j, long j2, String str);

    void logTraceAnnotations(boolean z, int i, String str, int i2, String str2, int i3, String str3, boolean z2, Long l, Long l2, boolean z3, String str4, String str5, boolean z4, boolean z5, Integer num, Integer num2, String str6);

    void maybeAnnotateDiskIOBlocking();

    void onLogArmadilloExpressSendEventListenerSendSuccessEnd();

    void onLogArmadilloExpressSendEventListenerSendSuccessStart();

    void onLogArmadilloTlcControlOpenThread();

    void onLogBumpThreadEnd();

    void onLogBumpThreadStart();

    void onLogCancelSendMutations(String str);

    void onLogCreateArmadilloExpressProtobufPayloadEnd();

    void onLogCreateArmadilloExpressProtobufPayloadStart();

    void onLogDirectMutationCancel();

    void onLogDirectMutationConfirm();

    void onLogDirectMutationDispatch();

    void onLogDirectMutationDrop();

    void onLogDirectMutationExecute();

    void onLogDirectMutationFailure();

    void onLogDirectMutationRetry();

    void onLogDirectMutationSuccess();

    void onLogDispatchMutationEnd();

    void onLogDispatchMutationStart(UserSession userSession, boolean z, int i);

    void onLogExecuteMutationEnd();

    void onLogExecuteMutationStart();

    void onLogFirstMutationSystemDispatchEnd(boolean z);

    void onLogFirstMutationSystemDispatchStart();

    void onLogFlowConnectId();

    void onLogHandleOutgoingPayloadEnd();

    void onLogHandleOutgoingPayloadStart();

    void onLogLSSEndFlowSucceed();

    void onLogMCCErrors(long j, long j2, long j3, int i);

    void onLogMQTTACK();

    void onLogMQTTFailure(String str);

    void onLogMQTTPublish();

    void onLogMediaScrutinyFailed();

    void onLogMediaScrutinySuccess();

    void onLogMessageSyncEnd();

    void onLogMessageSyncStart();

    void onLogMsysApiMainContextInvoked();

    void onLogPIIRemovalFailed();

    void onLogPIIRemovalStart();

    void onLogPIIRemovalSuccess();

    void onLogPlatformLayerAnnotationBoolean(String str, boolean z);

    void onLogPlatformLayerPoints(String str, String str2);

    void onLogProcessDmMessageEnd();

    void onLogProcessDmMessageStart();

    void onLogRemoveMessageContextEnd();

    void onLogRemoveMessageContextStart();

    void onLogRenderVideoFailed();

    void onLogRenderVideoSuccess();

    void onLogSendArmadilloExpressPayloadEnd();

    void onLogSendArmadilloExpressPayloadStart();

    void onLogSendMutationEnd();

    void onLogSendMutationStart();

    void onLogSendServerAuthoritative();

    void onLogSendTextMessageMutationEnd();

    void onLogSendTextMessageMutationStart();
}
