package X;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.google.ar.core.SharedCamera;

/* loaded from: classes12.dex */
public final class XPV extends CameraDevice.StateCallback {
    public final /* synthetic */ CameraDevice.StateCallback A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ SharedCamera A02;

    public XPV(CameraDevice.StateCallback stateCallback, Handler handler, SharedCamera sharedCamera) {
        this.A02 = sharedCamera;
        this.A01 = handler;
        this.A00 = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(final CameraDevice cameraDevice) {
        Handler handler = this.A01;
        final CameraDevice.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHU
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onClosed(cameraDevice);
            }
        });
        SharedCamera.A07(cameraDevice, this.A02);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(final CameraDevice cameraDevice) {
        Handler handler = this.A01;
        final CameraDevice.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHT
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onDisconnected(cameraDevice);
            }
        });
        SharedCamera.A08(cameraDevice, this.A02);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i) {
        C0fF c0fF = C0fF.$redex_init_class;
        if (C0BU.A04()) {
            C0BU.A02(cameraDevice);
        }
        Handler handler = this.A01;
        final CameraDevice.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YIN
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onError(cameraDevice, i);
            }
        });
        SharedCamera sharedCamera = this.A02;
        sharedCamera.A00.removeCallbacksAndMessages(null);
        sharedCamera.A00.getLooper().quit();
        sharedCamera.A00 = null;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        C0fF c0fF = C0fF.$redex_init_class;
        if (C0BU.A04()) {
            C0BU.A03(cameraDevice);
        }
        SharedCamera sharedCamera = this.A02;
        Y08 y08 = sharedCamera.A02;
        y08.A01 = cameraDevice;
        Handler handler = this.A01;
        final CameraDevice.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHV
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onOpened(cameraDevice);
            }
        });
        SharedCamera.A09(cameraDevice, sharedCamera);
        y08.A00 = SharedCamera.A00(sharedCamera);
        y08.A02 = SharedCamera.A01(sharedCamera);
    }
}
