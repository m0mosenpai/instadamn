package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.0fG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fG {
    static {
        C0BU.A03 = true;
    }

    public static void A00(CameraDevice cameraDevice) {
        cameraDevice.close();
        if (C0BU.A04()) {
            C0BU.A01(cameraDevice);
        }
    }
}
