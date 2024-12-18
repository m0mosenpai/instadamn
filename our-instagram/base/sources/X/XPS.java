package X;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* loaded from: classes12.dex */
public final class XPS extends CameraCaptureSession.StateCallback {
    public CameraCaptureSession.StateCallback A00;

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onActive(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            try {
                stateCallback.onClosed(cameraCaptureSession);
            } catch (Throwable unused) {
            }
            this.A00 = null;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onConfigureFailed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onConfigured(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            try {
                stateCallback.onReady(cameraCaptureSession);
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }
}
