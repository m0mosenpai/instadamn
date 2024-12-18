package com.meta.foa.performancelogging.s2s;

import X.C47282Ev;
import X.C73277XzN;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

/* loaded from: classes3.dex */
public interface FOAMessagingSendToSentLogger extends FOAMessagingPerformanceLogger {
    public static final C73277XzN Companion = C73277XzN.A00;
    public static final C47282Ev FOA_MARKER = new C47282Ev(668676445, "MESSAGE_SEND_TO_SENT");

    void onEndFlowSucceed();

    void onEndFlowSucceed(String str);

    void onStartFlow();
}
