package X;

import android.hardware.camera2.CameraCaptureSession;
import java.util.concurrent.Callable;

/* renamed from: X.7uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177207uG extends CameraCaptureSession.StateCallback {
    public C177187uE A00;
    public final /* synthetic */ C175337r9 A01;

    public C177207uG(C175337r9 c175337r9) {
        this.A01 = c175337r9;
    }

    private C177187uE A00(CameraCaptureSession cameraCaptureSession) {
        C177187uE c177187uE = this.A00;
        if (c177187uE == null || c177187uE.A00 != cameraCaptureSession) {
            C177187uE c177187uE2 = new C177187uE(cameraCaptureSession);
            this.A00 = c177187uE2;
            return c177187uE2;
        }
        return c177187uE;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C175337r9 c175337r9 = this.A01;
        A00(cameraCaptureSession);
        if (c175337r9.A03 == 1) {
            c175337r9.A03 = 0;
            c175337r9.A05 = false;
            c175337r9.A01.A01();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C175337r9 c175337r9 = this.A01;
        C177187uE A00 = A00(cameraCaptureSession);
        if (c175337r9.A03 == 1) {
            c175337r9.A03 = 0;
            c175337r9.A05 = true;
            c175337r9.A04 = A00;
            c175337r9.A01.A01();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        C175337r9 c175337r9 = this.A01;
        A00(cameraCaptureSession);
        final C175327r8 c175327r8 = c175337r9.A00;
        if (c175327r8 != null) {
            c175327r8.A00.A0P.A00(new C176427t0(), "camera_session_active", new Callable() { // from class: X.7uz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C175307r4 c175307r4 = C175327r8.this.A00;
                    c175307r4.A0J.A01("Method onCameraSessionActive must be called on Optic Thread.");
                    final C177697v3 c177697v3 = new C177697v3();
                    c175307r4.A0P.A04("camera_session_active_on_camera_handler_thread", new Callable() { // from class: X.7v4
                        @Override // java.util.concurrent.Callable
                        public final /* bridge */ /* synthetic */ Object call() {
                            InterfaceC176367st interfaceC176367st;
                            C177047u0 c177047u0;
                            C175307r4 c175307r42 = C175307r4.this;
                            InterfaceC177197uF interfaceC177197uF = c175307r42.A09;
                            if (interfaceC177197uF != null && c175307r42.A02 != null && (interfaceC176367st = c175307r42.A0E) != null && (c177047u0 = c175307r42.A08) != null) {
                                interfaceC176367st.setCameraSessionActivated(interfaceC177197uF, c177047u0);
                            }
                            C177697v3 c177697v32 = c177697v3;
                            c177697v32.A00.A01();
                            return c177697v32;
                        }
                    });
                    return null;
                }
            });
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        C175337r9 c175337r9 = this.A01;
        C177187uE A00 = A00(cameraCaptureSession);
        if (c175337r9.A03 == 2) {
            c175337r9.A03 = 0;
            c175337r9.A05 = true;
            c175337r9.A04 = A00;
            c175337r9.A01.A01();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        C175337r9 c175337r9 = this.A01;
        C177187uE A00 = A00(cameraCaptureSession);
        if (c175337r9.A03 == 3) {
            c175337r9.A03 = 0;
            c175337r9.A05 = true;
            c175337r9.A04 = A00;
            c175337r9.A01.A01();
        }
    }
}
