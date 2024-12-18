package com.facebook.traffic.nts.providers.background;

/* loaded from: classes10.dex */
public interface BackgroundV2TaskSchedulerConfig {
    boolean getAsyncBackgroundJobEnabled();

    boolean getExecuteIfIdleEnabled();

    boolean getExecuteIfNetworkConnectedEnabled();

    boolean getRescheduleOnExecuteEnabled();

    long getSchedulingAlignmentInterval();

    long getTimeoutAwaitSchedulerSeconds();

    boolean getVerifyNtsManagerEnabled();

    boolean getVerifyNtsSchedulerEnabled();
}
