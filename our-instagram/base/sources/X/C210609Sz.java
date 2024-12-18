package X;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.9Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210609Sz extends CameraExtensionSession.ExtensionCaptureCallback {
    public InterfaceC177057u1 A00;
    public final /* synthetic */ C23447AaK A03;
    public final C177427uc A02 = new Object();
    public final C177437ud A01 = new C177437ud();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7uc, java.lang.Object] */
    public C210609Sz(InterfaceC177057u1 interfaceC177057u1, C23447AaK c23447AaK) {
        this.A03 = c23447AaK;
        this.A00 = interfaceC177057u1;
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        InterfaceC177057u1 interfaceC177057u1 = this.A00;
        if (interfaceC177057u1 != null) {
            interfaceC177057u1.D2L(this.A03, this.A01);
        }
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        InterfaceC177057u1 interfaceC177057u1 = this.A00;
        if (interfaceC177057u1 != null) {
            interfaceC177057u1.DQu(i);
        }
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C177427uc c177427uc = this.A02;
        c177427uc.A00 = totalCaptureResult;
        InterfaceC177057u1 interfaceC177057u1 = this.A00;
        if (interfaceC177057u1 != null) {
            interfaceC177057u1.D2H(this.A03, c177427uc);
        }
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        InterfaceC177057u1 interfaceC177057u1 = this.A00;
        if (interfaceC177057u1 != null) {
            interfaceC177057u1.D2H(this.A03, this.A02);
        }
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        InterfaceC177057u1 interfaceC177057u1 = this.A00;
        if (interfaceC177057u1 != null) {
            interfaceC177057u1.D2T(captureRequest, this.A03, j, 0L);
        }
    }
}
