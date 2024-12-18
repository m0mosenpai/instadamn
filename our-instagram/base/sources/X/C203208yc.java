package X;

import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate;

/* renamed from: X.8yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203208yc implements CameraControlServiceDelegate {
    public boolean A00;
    public boolean A01;
    public final InterfaceC174767qC A02;

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final boolean canUpdateCaptureDevicePosition(EnumC222549rv enumC222549rv) {
        C14360o3.A0B(enumC222549rv, 0);
        int ordinal = enumC222549rv.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                return this.A01;
            }
            return false;
        }
        return this.A00;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final long getExposureTime() {
        return 0L;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final int getIso() {
        return 0;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final long getMaxExposureTime() {
        return 0L;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final int getMaxIso() {
        return 0;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final long getMinExposureTime() {
        return 0L;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final int getMinIso() {
        return 0;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final boolean isFocusModeSupported(EnumC222519rs enumC222519rs) {
        return false;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final boolean isLockExposureAndFocusSupported() {
        return false;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final void lockExposureAndFocus(long j, int i) {
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final void unlockExposureAndFocus() {
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final void updateCaptureDevicePosition(EnumC222549rv enumC222549rv) {
        InterfaceC174767qC interfaceC174767qC;
        AbstractC184688Hj abstractC184688Hj;
        C14360o3.A0B(enumC222549rv, 0);
        int ordinal = enumC222549rv.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                interfaceC174767qC = this.A02;
                if (!interfaceC174767qC.CR9()) {
                    abstractC184688Hj = new AbstractC184688Hj() { // from class: X.8pJ
                    };
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            interfaceC174767qC = this.A02;
            if (!interfaceC174767qC.CR9()) {
                return;
            } else {
                abstractC184688Hj = new AbstractC184688Hj() { // from class: X.8pK
                };
            }
        }
        interfaceC174767qC.Epe(abstractC184688Hj);
    }

    @Override // com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate
    public final void updateFocusMode(EnumC222519rs enumC222519rs) {
    }

    public C203208yc(InterfaceC174767qC interfaceC174767qC) {
        this.A02 = interfaceC174767qC;
        interfaceC174767qC.CKy(new C176487t6(this));
        interfaceC174767qC.CKl(new C176477t5(this));
    }
}
