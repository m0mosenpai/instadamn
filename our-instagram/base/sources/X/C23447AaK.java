package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.AaK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23447AaK implements InterfaceC177197uF {
    public final CameraExtensionSession A00;
    public final Executor A01;

    @Override // X.InterfaceC177197uF
    public final void A73() {
    }

    @Override // X.InterfaceC177197uF
    public final boolean CU5() {
        return true;
    }

    @Override // X.InterfaceC177197uF
    public final int AGk(CaptureRequest captureRequest, Handler handler, InterfaceC177057u1 interfaceC177057u1) {
        return this.A00.capture(captureRequest, this.A01, new C210609Sz(interfaceC177057u1, this));
    }

    @Override // X.InterfaceC177197uF
    public final int Ecf(CaptureRequest captureRequest, Handler handler, InterfaceC177057u1 interfaceC177057u1) {
        return this.A00.setRepeatingRequest(captureRequest, this.A01, new C210609Sz(interfaceC177057u1, this));
    }

    @Override // X.InterfaceC177197uF
    public final void close() {
        try {
            this.A00.close();
        } catch (CameraAccessException unused) {
            AbstractC175037qd.A02("Camera2ExtensionSession", "CameraAccessException on close()!");
        }
    }

    public C23447AaK(CameraExtensionSession cameraExtensionSession, Executor executor) {
        this.A00 = cameraExtensionSession;
        this.A01 = executor;
    }

    public static void A01(CameraDevice cameraDevice, final C175337r9 c175337r9, List list, final Executor executor, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A1E.add(new OutputConfiguration(((C177157uB) list.get(i2)).A02));
        }
        cameraDevice.createExtensionSession(new ExtensionSessionConfiguration(i, A1E, executor, new CameraExtensionSession.StateCallback() { // from class: X.9T0
            public C23447AaK A00;

            /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
            
                if (r0 != r5) goto L6;
             */
            @Override // android.hardware.camera2.CameraExtensionSession.StateCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClosed(android.hardware.camera2.CameraExtensionSession r5) {
                /*
                    r4 = this;
                    X.7r9 r3 = X.C175337r9.this
                    java.util.concurrent.Executor r1 = r2
                    X.AaK r2 = r4.A00
                    if (r2 == 0) goto Le
                    android.hardware.camera2.CameraExtensionSession r0 = X.C23447AaK.A00(r2)
                    if (r0 == r5) goto L15
                Le:
                    X.AaK r2 = new X.AaK
                    r2.<init>(r5, r1)
                    r4.A00 = r2
                L15:
                    int r1 = r3.A03
                    r0 = 2
                    if (r1 != r0) goto L2a
                    r0 = 0
                    r3.A03 = r0
                    java.lang.Boolean r0 = X.AbstractC166997dE.A0b()
                    r3.A05 = r0
                    r3.A04 = r2
                    X.7qi r0 = r3.A01
                    r0.A01()
                L2a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9T0.onClosed(android.hardware.camera2.CameraExtensionSession):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
            
                if (r0 != r4) goto L6;
             */
            @Override // android.hardware.camera2.CameraExtensionSession.StateCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onConfigureFailed(android.hardware.camera2.CameraExtensionSession r4) {
                /*
                    r3 = this;
                    X.7r9 r2 = X.C175337r9.this
                    java.util.concurrent.Executor r1 = r2
                    X.AaK r0 = r3.A00
                    if (r0 == 0) goto Le
                    android.hardware.camera2.CameraExtensionSession r0 = X.C23447AaK.A00(r0)
                    if (r0 == r4) goto L15
                Le:
                    X.AaK r0 = new X.AaK
                    r0.<init>(r4, r1)
                    r3.A00 = r0
                L15:
                    int r1 = r2.A03
                    r0 = 1
                    if (r1 != r0) goto L28
                    r0 = 0
                    r2.A03 = r0
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r2.A05 = r0
                    X.7qi r0 = r2.A01
                    r0.A01()
                L28:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9T0.onConfigureFailed(android.hardware.camera2.CameraExtensionSession):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
            
                if (r0 != r5) goto L6;
             */
            @Override // android.hardware.camera2.CameraExtensionSession.StateCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onConfigured(android.hardware.camera2.CameraExtensionSession r5) {
                /*
                    r4 = this;
                    X.7r9 r3 = X.C175337r9.this
                    java.util.concurrent.Executor r1 = r2
                    X.AaK r2 = r4.A00
                    if (r2 == 0) goto Le
                    android.hardware.camera2.CameraExtensionSession r0 = X.C23447AaK.A00(r2)
                    if (r0 == r5) goto L15
                Le:
                    X.AaK r2 = new X.AaK
                    r2.<init>(r5, r1)
                    r4.A00 = r2
                L15:
                    int r0 = r3.A03
                    r1 = 1
                    if (r0 != r1) goto L2a
                    r0 = 0
                    r3.A03 = r0
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    r3.A05 = r0
                    r3.A04 = r2
                    X.7qi r0 = r3.A01
                    r0.A01()
                L2a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9T0.onConfigured(android.hardware.camera2.CameraExtensionSession):void");
            }
        }));
    }
}
