package X;

import android.hardware.camera2.CaptureRequest;

/* renamed from: X.AaH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23444AaH implements InterfaceC25161BBg {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C175297r3 A01;
    public final /* synthetic */ C177047u0 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ float[] A04;

    public C23444AaH(CaptureRequest.Builder builder, C175297r3 c175297r3, C177047u0 c177047u0, float[] fArr, boolean z) {
        this.A01 = c175297r3;
        this.A02 = c177047u0;
        this.A04 = fArr;
        this.A00 = builder;
        this.A03 = z;
    }

    @Override // X.InterfaceC25161BBg
    public final void DHf(boolean z) {
        Integer num;
        C175297r3 c175297r3 = this.A01;
        boolean z2 = c175297r3.A09;
        C177047u0 c177047u0 = this.A02;
        if (z2) {
            c175297r3.A04(c177047u0);
        } else {
            c177047u0.A06 = null;
        }
        if (z) {
            num = C05F.A0N;
        } else {
            num = C05F.A0Y;
        }
        c175297r3.A05(num, this.A04);
        if (!c175297r3.A0E) {
            CaptureRequest.Builder builder = this.A00;
            Number number = (Number) builder.get(CaptureRequest.CONTROL_AE_MODE);
            long j = 4000;
            if (number != null && number.intValue() == 1) {
                if (!this.A03) {
                    j = 2000;
                }
                synchronized (c175297r3) {
                    B1P b1p = new B1P(1, c177047u0, builder, c175297r3);
                    c175297r3.A00();
                    c175297r3.A08 = c175297r3.A0B.A02("monitor_auto_exposure", b1p, j);
                }
                return;
            }
            if (!this.A03) {
                j = 2000;
            }
            c175297r3.A02(builder, c177047u0, j);
        }
    }
}
