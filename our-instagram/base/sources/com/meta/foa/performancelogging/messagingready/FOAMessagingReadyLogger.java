package com.meta.foa.performancelogging.messagingready;

import X.C2F9;
import X.C47282Ev;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

/* loaded from: classes.dex */
public interface FOAMessagingReadyLogger extends FOAMessagingPerformanceLogger {
    public static final C2F9 Companion = C2F9.A00;
    public static final C47282Ev FOA_MARKER = new C47282Ev(668669021, "MESSAGING_READY_ARMADILLO");

    void onEndFlowSucceed();

    void onEndFlowSucceed(String str);

    void onStartFlow(boolean z, boolean z2);
}
