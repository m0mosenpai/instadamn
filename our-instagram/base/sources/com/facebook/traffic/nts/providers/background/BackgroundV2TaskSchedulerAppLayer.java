package com.facebook.traffic.nts.providers.background;

/* loaded from: classes10.dex */
public interface BackgroundV2TaskSchedulerAppLayer {
    void executeReadyTasksAndReschedule();

    void setUpcallImpl(BackgroundV2TaskSchedulerAppLayerUpcalls backgroundV2TaskSchedulerAppLayerUpcalls);
}
