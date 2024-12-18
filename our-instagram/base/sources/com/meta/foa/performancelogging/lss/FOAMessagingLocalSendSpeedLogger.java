package com.meta.foa.performancelogging.lss;

import X.C47282Ev;
import X.C73275XzL;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

/* loaded from: classes3.dex */
public interface FOAMessagingLocalSendSpeedLogger extends FOAMessagingPerformanceLogger {
    public static final C73275XzL Companion = C73275XzL.A00;
    public static final C47282Ev FOA_MARKER = new C47282Ev(668675774, "LOCAL_SEND_SPEED");

    void annotateIsBundledWithMediaSend(boolean z);

    void annotateIsEncrypted(boolean z);

    void annotateIsGroup(boolean z);

    void annotateLocalDataId(String str);

    void annotateMediaSource(String str);

    void annotateMessageType(LocalSendSpeedMessageTypes localSendSpeedMessageTypes);

    void annotateSendSurface(String str);

    void annotateTransportType(String str);

    void onEndFlowSucceed();

    void onLogDataProcessingEnd();

    void onLogDataProcessingStart();

    void onLogRenderEnd();

    void onLogRenderStart();

    void onLogRenderWillDisplay();

    void onStartFlow(boolean z);
}
