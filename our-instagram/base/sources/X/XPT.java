package X;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.ar.core.SharedCamera;

/* loaded from: classes12.dex */
public final class XPT extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CameraCaptureSession.StateCallback A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ SharedCamera A02;

    public XPT(CameraCaptureSession.StateCallback stateCallback, Handler handler, SharedCamera sharedCamera) {
        this.A02 = sharedCamera;
        this.A01 = handler;
        this.A00 = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.A01;
        final CameraCaptureSession.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHW
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onActive(cameraCaptureSession);
            }
        });
        SharedCamera.A02(cameraCaptureSession, this.A02);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.A01;
        final CameraCaptureSession.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHX
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onClosed(cameraCaptureSession);
            }
        });
        SharedCamera.A03(cameraCaptureSession, this.A02);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.A01;
        final CameraCaptureSession.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHZ
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onConfigureFailed(cameraCaptureSession);
            }
        });
        SharedCamera.A04(cameraCaptureSession, this.A02);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        SharedCamera sharedCamera = this.A02;
        Handler handler = this.A01;
        final CameraCaptureSession.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHa
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onConfigured(cameraCaptureSession);
            }
        });
        SharedCamera.A05(cameraCaptureSession, sharedCamera);
        if (sharedCamera.A02.A01 != null) {
            SharedCamera.A0A(sharedCamera);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.A01;
        final CameraCaptureSession.StateCallback stateCallback = this.A00;
        handler.post(new Runnable() { // from class: X.YHY
            @Override // java.lang.Runnable
            public final void run() {
                stateCallback.onReady(cameraCaptureSession);
            }
        });
        SharedCamera.A06(cameraCaptureSession, this.A02);
    }
}
