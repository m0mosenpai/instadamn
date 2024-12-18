package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.FutureTask;

/* renamed from: X.7r3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175297r3 {
    public CameraDevice A00;
    public CameraManager A01;
    public InterfaceC198408pp A02;
    public C177017tx A03;
    public C175307r4 A04;
    public C176697tR A05;
    public C176787ta A06;
    public AbstractC176767tY A07;
    public FutureTask A08;
    public boolean A09;
    public final C175277r1 A0A;
    public final C175227qw A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public final synchronized void A00() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0B.A08(futureTask);
            this.A08 = null;
        }
    }

    public final synchronized void A02(CaptureRequest.Builder builder, C177047u0 c177047u0, long j) {
        B1E b1e = new B1E(builder, this, c177047u0);
        A00();
        this.A08 = this.A0B.A02("reset_focus", b1e, j);
    }

    public C175297r3(C175227qw c175227qw) {
        C175277r1 c175277r1 = new C175277r1(c175227qw);
        this.A0B = c175227qw;
        this.A0A = c175277r1;
    }

    public final void A01(CaptureRequest.Builder builder, C177047u0 c177047u0) {
        InterfaceC177197uF interfaceC177197uF;
        this.A0A.A01("Can only reset focus on the Optic thread.");
        if (this.A04 != null && this.A05 != null && builder != null && this.A07 != null && this.A0D && (interfaceC177197uF = this.A04.A09) != null) {
            this.A0E = false;
            this.A0C = false;
            float A06 = this.A05.A06();
            C176697tR c176697tR = this.A05;
            Rect rect = c176697tR.A04;
            MeteringRectangle[] A04 = C176697tR.A04(c176697tR, c176697tR.A0D);
            C176697tR c176697tR2 = this.A05;
            C175307r4.A01(rect, builder, this.A07, A04, C176697tR.A04(c176697tR2, c176697tR2.A0C), A06);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 2);
            interfaceC177197uF.AGk(builder.build(), null, c177047u0);
            CameraManager cameraManager = this.A01;
            CameraDevice cameraDevice = this.A00;
            cameraDevice.getClass();
            String id = cameraDevice.getId();
            C176787ta c176787ta = this.A06;
            c176787ta.getClass();
            int A00 = AbstractC177647uy.A00(cameraManager, builder, c176787ta, this.A07, id, 0);
            builder.set(key, 0);
            interfaceC177197uF.Ecf(builder.build(), null, c177047u0);
            if (A00 == 1) {
                builder.set(key, 1);
                interfaceC177197uF.AGk(builder.build(), null, c177047u0);
                builder.set(key, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (((java.lang.Number) r6.A06.A02(r1)).intValue() == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.hardware.camera2.CaptureRequest.Builder r7, X.C177047u0 r8, boolean r9) {
        /*
            r6 = this;
            X.7qw r1 = r6.A0B
            java.lang.String r0 = "Method setFocusModeForVideo() must run on the Optic Background Thread."
            r1.A06(r0)
            android.hardware.camera2.CameraManager r0 = r6.A01
            if (r0 == 0) goto L29
            android.hardware.camera2.CameraDevice r0 = r6.A00
            if (r0 == 0) goto L29
            X.7r4 r1 = r6.A04
            if (r1 == 0) goto L29
            if (r7 == 0) goto L29
            X.7tY r0 = r6.A07
            if (r0 == 0) goto L29
            if (r9 != 0) goto L29
            X.7uF r2 = r1.A09
            if (r2 == 0) goto L29
            r4 = 1
            r6.A0E = r4
            boolean r0 = r6.A0C
            if (r0 == 0) goto L2a
            r6.A00()
        L29:
            return
        L2a:
            X.7tY r1 = r6.A07
            X.7tZ r0 = X.AbstractC176767tY.A0D
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
            r5 = 3
        L3b:
            X.7ta r0 = r6.A06
            r3 = 0
            if (r0 == 0) goto L56
            X.7tc r1 = X.AbstractC176797tb.A0e
            java.lang.Object r0 = r0.A02(r1)
            if (r0 == 0) goto L56
            X.7ta r0 = r6.A06
            java.lang.Object r0 = r0.A02(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r4) goto L67
        L56:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.set(r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r7.build()
            r2.AGk(r0, r3, r8)
        L67:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.set(r1, r0)
            android.hardware.camera2.CaptureRequest r0 = r7.build()
            r2.Ecf(r0, r3, r8)
            return
        L82:
            X.7tY r1 = r6.A07
            X.7tZ r0 = X.AbstractC176767tY.A0C
            java.lang.Object r0 = r1.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            r5 = 4
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175297r3.A03(android.hardware.camera2.CaptureRequest$Builder, X.7u0, boolean):void");
    }

    public final void A04(C177047u0 c177047u0) {
        C176787ta c176787ta;
        AbstractC176767tY abstractC176767tY = this.A07;
        abstractC176767tY.getClass();
        if (((Boolean) abstractC176767tY.A01(AbstractC176767tY.A05)).booleanValue() && ((Boolean) this.A07.A01(AbstractC176767tY.A04)).booleanValue() && (c176787ta = this.A06) != null) {
            Object A02 = c176787ta.A02(AbstractC176797tb.A0Q);
            A02.getClass();
            if (((Boolean) A02).booleanValue()) {
                this.A09 = true;
                c177047u0.A06 = new InterfaceC25161BBg() { // from class: X.AaG
                    @Override // X.InterfaceC25161BBg
                    public final void DHf(boolean z) {
                        Integer num;
                        C175297r3 c175297r3 = C175297r3.this;
                        if (z) {
                            num = C05F.A0u;
                        } else {
                            num = C05F.A15;
                        }
                        c175297r3.A05(num, null);
                    }
                };
                return;
            }
        }
        c177047u0.A06 = null;
        this.A09 = false;
    }

    public final void A05(Integer num, float[] fArr) {
        if (this.A02 != null) {
            C176567tE.A00(new RunnableC24738AxM(this, num, fArr));
        }
    }
}
