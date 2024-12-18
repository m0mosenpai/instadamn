package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.EnumC222519rs;
import X.EnumC222549rv;

/* loaded from: classes4.dex */
public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(EnumC222549rv enumC222549rv);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(EnumC222519rs enumC222519rs);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(EnumC222549rv enumC222549rv);

    void updateFocusMode(EnumC222519rs enumC222519rs);
}
