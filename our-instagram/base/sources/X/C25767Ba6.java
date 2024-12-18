package X;

import java.util.Arrays;

/* renamed from: X.Ba6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25767Ba6 extends C5AR {
    public final C1132859q A00;
    public final C1132859q A01;
    public final float[] A02;

    public C25767Ba6(C1132859q c1132859q, C1132859q c1132859q2) {
        super(c1132859q, c1132859q2, c1132859q, c1132859q2);
        float[] A05;
        this.A01 = c1132859q;
        this.A00 = c1132859q2;
        C1132759p c1132759p = c1132859q.A07;
        C1132759p c1132759p2 = c1132859q2.A07;
        if (AbstractC1133759z.A03(c1132759p, c1132759p2)) {
            A05 = AbstractC1133759z.A05(c1132859q2.A0B, c1132859q.A0D);
        } else {
            float[] fArr = c1132859q.A0D;
            float[] fArr2 = c1132859q2.A0B;
            float[] A00 = c1132759p.A00();
            float[] A002 = c1132759p2.A00();
            C1132759p c1132759p3 = AbstractC1132659o.A01;
            if (!AbstractC1133759z.A03(c1132759p, c1132759p3)) {
                float[] fArr3 = C5A8.A01.A00;
                float[] copyOf = Arrays.copyOf(AbstractC1132659o.A04, 3);
                C14360o3.A07(copyOf);
                fArr = AbstractC1133759z.A05(AbstractC1133759z.A06(fArr3, A00, copyOf), fArr);
            }
            if (!AbstractC1133759z.A03(c1132759p2, c1132759p3)) {
                float[] fArr4 = C5A8.A01.A00;
                float[] copyOf2 = Arrays.copyOf(AbstractC1132659o.A04, 3);
                C14360o3.A07(copyOf2);
                fArr2 = AbstractC1133759z.A04(AbstractC1133759z.A05(AbstractC1133759z.A06(fArr4, A002, copyOf2), c1132859q2.A0D));
            }
            A05 = AbstractC1133759z.A05(fArr2, fArr);
        }
        this.A02 = A05;
    }

    @Override // X.C5AR
    public final long A00(long j) {
        float A03 = C1132359l.A03(j);
        float A02 = C1132359l.A02(j);
        float A01 = C1132359l.A01(j);
        float A00 = C1132359l.A00(j);
        InterfaceC1133159t interfaceC1133159t = this.A01.A02;
        float CP0 = (float) interfaceC1133159t.CP0(A03);
        float CP02 = (float) interfaceC1133159t.CP0(A02);
        float CP03 = (float) interfaceC1133159t.CP0(A01);
        float[] fArr = this.A02;
        float f = (fArr[0] * CP0) + (fArr[3] * CP02) + (fArr[6] * CP03);
        float f2 = (fArr[1] * CP0) + (fArr[4] * CP02) + (fArr[7] * CP03);
        float f3 = (fArr[2] * CP0) + (fArr[5] * CP02) + (fArr[8] * CP03);
        C1132859q c1132859q = this.A00;
        InterfaceC1133159t interfaceC1133159t2 = c1132859q.A04;
        return C5AC.A02(c1132859q, (float) interfaceC1133159t2.CP0(f), (float) interfaceC1133159t2.CP0(f2), (float) interfaceC1133159t2.CP0(f3), A00);
    }
}
