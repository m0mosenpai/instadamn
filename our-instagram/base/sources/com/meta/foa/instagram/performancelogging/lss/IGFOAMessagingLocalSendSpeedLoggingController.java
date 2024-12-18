package com.meta.foa.instagram.performancelogging.lss;

import X.AbstractC06930Yk;
import X.AbstractC47292Ex;
import X.C14360o3;
import X.C7N0;
import com.instagram.common.session.UserSession;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Map;

/* loaded from: classes3.dex */
public final class IGFOAMessagingLocalSendSpeedLoggingController extends AbstractC47292Ex {
    public static final C7N0 Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGFOAMessagingLocalSendSpeedLoggingController(UserSession userSession) {
        super(true, userSession);
        C14360o3.A0B(userSession, 1);
    }

    public static final IGFOAMessagingLocalSendSpeedLoggingController getInstance(UserSession userSession) {
        return C7N0.A00(userSession);
    }

    public final void onExitThreadView() {
        for (Map.Entry entry : AbstractC06930Yk.A0B(this.activeLoggers).entrySet()) {
            ((Number) entry.getKey()).intValue();
            ((FOAMessagingPerformanceLogger) entry.getValue()).onEndFlowCancel("User exited the thread view.");
        }
        this.activeLoggers.clear();
    }

    public final void onLogGenerateMessageListViewModelsEnd(int i) {
        for (Map.Entry entry : this.activeLoggers.entrySet()) {
            ((Number) entry.getKey()).intValue();
            FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            C14360o3.A0C(fOAMessagingPerformanceLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger");
            IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger = (IGFOAMessagingLocalSendSpeedLogger) fOAMessagingPerformanceLogger;
            iGFOAMessagingLocalSendSpeedLogger.onLogGenerateMessageListViewModelsEnd();
            iGFOAMessagingLocalSendSpeedLogger.annotateNumViewModelsToGenerate(i);
        }
    }

    public final void onLogGenerateMessageListViewModelsStart(int i) {
        for (Map.Entry entry : this.activeLoggers.entrySet()) {
            ((Number) entry.getKey()).intValue();
            FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            C14360o3.A0C(fOAMessagingPerformanceLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger");
            IGFOAMessagingLocalSendSpeedLogger iGFOAMessagingLocalSendSpeedLogger = (IGFOAMessagingLocalSendSpeedLogger) fOAMessagingPerformanceLogger;
            iGFOAMessagingLocalSendSpeedLogger.onLogGenerateMessageListViewModelsStart();
            iGFOAMessagingLocalSendSpeedLogger.annotateNumViewModelsToGenerate(i);
        }
    }

    public final void onLogSnapshotMessagesEnd() {
        for (Map.Entry entry : this.activeLoggers.entrySet()) {
            ((Number) entry.getKey()).intValue();
            FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            C14360o3.A0C(fOAMessagingPerformanceLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger");
            ((IGFOAMessagingLocalSendSpeedLogger) fOAMessagingPerformanceLogger).onLogSnapshotMessagesEnd();
        }
    }

    public final void onLogSnapshotMessagesStart() {
        for (Map.Entry entry : this.activeLoggers.entrySet()) {
            ((Number) entry.getKey()).intValue();
            FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            C14360o3.A0C(fOAMessagingPerformanceLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger");
            ((IGFOAMessagingLocalSendSpeedLogger) fOAMessagingPerformanceLogger).onLogSnapshotMessagesStart();
        }
    }

    public final void onResumeThreadView() {
        for (Map.Entry entry : this.activeLoggers.entrySet()) {
            ((Number) entry.getKey()).intValue();
            FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            C14360o3.A0C(fOAMessagingPerformanceLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger");
            ((IGFOAMessagingLocalSendSpeedLogger) fOAMessagingPerformanceLogger).onLogOnResumeThreadView();
        }
    }

    @Override // X.AbstractC47302Ey
    public IGFOAMessagingLocalSendSpeedLogger getLogger(Integer num) {
        return (IGFOAMessagingLocalSendSpeedLogger) super.getLogger(num);
    }

    @Override // X.AbstractC47302Ey
    public /* bridge */ /* synthetic */ FOAMessagingPerformanceLogger getLogger(Integer num) {
        return super.getLogger(num);
    }
}
