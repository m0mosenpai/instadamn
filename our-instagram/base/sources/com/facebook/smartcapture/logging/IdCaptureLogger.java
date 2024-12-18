package com.facebook.smartcapture.logging;

import X.C14360o3;

/* loaded from: classes10.dex */
public final class IdCaptureLogger extends BaseLogger {
    public final void logButtonClick(IdCaptureButton idCaptureButton) {
        C14360o3.A0B(idCaptureButton, 0);
        logButtonClick(idCaptureButton.getText());
    }

    public final void logStepChange(IdCaptureStep idCaptureStep, IdCaptureStep idCaptureStep2) {
        C14360o3.A0B(idCaptureStep, 0);
        C14360o3.A0B(idCaptureStep2, 1);
        setCurrentScreen(idCaptureStep2.getText());
        logEvent("step_change", BaseLogger.Companion.buildMap("previous", idCaptureStep.getText(), "next", idCaptureStep2.getText()));
    }

    public IdCaptureLogger(SmartCaptureLogger smartCaptureLogger) {
        super(smartCaptureLogger);
    }
}
