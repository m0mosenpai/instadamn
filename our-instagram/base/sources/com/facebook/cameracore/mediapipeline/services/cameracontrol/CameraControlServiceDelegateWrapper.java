package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.EnumC222519rs;
import X.EnumC222549rv;

/* loaded from: classes4.dex */
public class CameraControlServiceDelegateWrapper {
    public final CameraControlServiceDelegate mDelegate;

    public boolean canUpdateCaptureDevicePosition(int i) {
        EnumC222549rv enumC222549rv;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i >= 0 && i < EnumC222549rv.values().length) {
            enumC222549rv = EnumC222549rv.values()[i];
        } else {
            enumC222549rv = EnumC222549rv.Back;
        }
        return cameraControlServiceDelegate.canUpdateCaptureDevicePosition(enumC222549rv);
    }

    public long getExposureTime() {
        return this.mDelegate.getExposureTime();
    }

    public int getIso() {
        return this.mDelegate.getIso();
    }

    public long getMaxExposureTime() {
        return this.mDelegate.getMaxExposureTime();
    }

    public int getMaxIso() {
        return this.mDelegate.getMaxIso();
    }

    public long getMinExposureTime() {
        return this.mDelegate.getMinExposureTime();
    }

    public int getMinIso() {
        return this.mDelegate.getMinIso();
    }

    public boolean isFocusModeSupported(int i) {
        EnumC222519rs enumC222519rs;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i >= 0 && i < EnumC222519rs.values().length) {
            enumC222519rs = EnumC222519rs.values()[i];
        } else {
            enumC222519rs = EnumC222519rs.AutoFocus;
        }
        return cameraControlServiceDelegate.isFocusModeSupported(enumC222519rs);
    }

    public boolean isLockExposureAndFocusSupported() {
        return this.mDelegate.isLockExposureAndFocusSupported();
    }

    public void lockExposureAndFocus(long j, int i) {
        this.mDelegate.lockExposureAndFocus(j, i);
    }

    public void unlockExposureAndFocus() {
        this.mDelegate.unlockExposureAndFocus();
    }

    public void updateCaptureDevicePosition(int i) {
        EnumC222549rv enumC222549rv;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i >= 0 && i < EnumC222549rv.values().length) {
            enumC222549rv = EnumC222549rv.values()[i];
        } else {
            enumC222549rv = EnumC222549rv.Back;
        }
        cameraControlServiceDelegate.updateCaptureDevicePosition(enumC222549rv);
    }

    public void updateFocusMode(int i) {
        EnumC222519rs enumC222519rs;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i >= 0 && i < EnumC222519rs.values().length) {
            enumC222519rs = EnumC222519rs.values()[i];
        } else {
            enumC222519rs = EnumC222519rs.AutoFocus;
        }
        cameraControlServiceDelegate.updateFocusMode(enumC222519rs);
    }

    public CameraControlServiceDelegateWrapper(CameraControlServiceDelegate cameraControlServiceDelegate) {
        this.mDelegate = cameraControlServiceDelegate;
    }
}
