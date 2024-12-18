package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.7ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177417ub extends CameraCaptureSession.CaptureCallback {
    public final InterfaceC177057u1 A00;
    public final /* synthetic */ C177187uE A03;
    public final C177427uc A02 = new Object();
    public final C177437ud A01 = new C177437ud();

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        this.A00.D2T(captureRequest, this.A03, j, j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7uc, java.lang.Object] */
    public C177417ub(InterfaceC177057u1 interfaceC177057u1, C177187uE c177187uE) {
        this.A03 = c177187uE;
        this.A00 = interfaceC177057u1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        C177427uc c177427uc = this.A02;
        c177427uc.A00 = totalCaptureResult;
        this.A00.D2H(this.A03, c177427uc);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        C177437ud c177437ud = this.A01;
        c177437ud.A00 = captureFailure.getReason();
        this.A00.D2L(this.A03, c177437ud);
    }
}
