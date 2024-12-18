package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class BW1 implements C6GS {
    public final /* synthetic */ BVY A00;
    public final /* synthetic */ InterfaceC31081DlP A01;
    public final /* synthetic */ InterfaceC16610sE A02;

    public BW1(BVY bvy, InterfaceC31081DlP interfaceC31081DlP, InterfaceC16610sE interfaceC16610sE) {
        this.A00 = bvy;
        this.A02 = interfaceC16610sE;
        this.A01 = interfaceC31081DlP;
    }

    @Override // X.C6GS
    public final float AF3(float f, float f2) {
        BVY bvy = this.A00;
        InterfaceC74953Yl interfaceC74953Yl = bvy.A0C;
        int i = ((BVX) interfaceC74953Yl.getValue()).A05 + ((BVX) interfaceC74953Yl.getValue()).A06;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = bvy.A02;
        if (f < 0.0f) {
            i2++;
        }
        int A03 = C17s.A03(((int) (f2 / i)) + i2, 0, bvy.A04());
        interfaceC74953Yl.getValue();
        interfaceC74953Yl.getValue();
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i3 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int abs = Math.abs((C17s.A03(C17s.A03(A03, i3, (int) j3), 0, bvy.A04()) - i2) * i) - i;
        if (abs >= 0 && abs != 0) {
            return Math.signum(f) * abs;
        }
        return 0.0f;
    }

    @Override // X.C6GS
    public final float AFI(float f) {
        float f2;
        int A06;
        BVY bvy = this.A00;
        InterfaceC74953Yl interfaceC74953Yl = bvy.A0C;
        C6GQ c6gq = AbstractC25230BEn.A0S(interfaceC74953Yl).A0A;
        List list = AbstractC25230BEn.A0S(interfaceC74953Yl).A0F;
        int size = list.size();
        boolean z = false;
        int i = 0;
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        while (true) {
            f2 = 0.0f;
            if (i >= size) {
                break;
            }
            InterfaceC30776DgD interfaceC30776DgD = (InterfaceC30776DgD) list.get(i);
            BVX A0S = AbstractC25230BEn.A0S(interfaceC74953Yl);
            C6M3 c6m3 = A0S.A09;
            C6M3 c6m32 = C6M3.Vertical;
            long A0s = AbstractC25232BEp.A0s(A0S.A0J);
            if (c6m3 == c6m32) {
                A06 = C119055aN.A00(A0s);
            } else {
                A06 = AbstractC25225BEi.A06(A0s);
            }
            int i2 = -AbstractC25230BEn.A0S(interfaceC74953Yl).A08;
            int i3 = AbstractC25230BEn.A0S(interfaceC74953Yl).A03;
            int i4 = AbstractC25230BEn.A0S(interfaceC74953Yl).A05;
            BWF bwf = (BWF) interfaceC30776DgD;
            float E4p = bwf.A01 - c6gq.E4p(A06, i4, i2, i3, bwf.A03, bvy.A04());
            if (E4p <= 0.0f && E4p > f3) {
                f3 = E4p;
            }
            if (E4p >= 0.0f && E4p < f4) {
                f4 = E4p;
            }
            i++;
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f4;
        }
        if (f4 == Float.POSITIVE_INFINITY) {
            f4 = f3;
        }
        if (AbstractC28009CWg.A00(bvy) == 0.0f) {
            z = true;
        }
        boolean z2 = !z;
        if (!AbstractC25230BEn.A1X(bvy.A0R)) {
            if (z2 && AbstractC28009CWg.A01(bvy)) {
                f3 = 0.0f;
            }
            f4 = 0.0f;
        }
        if (!AbstractC25230BEn.A1X(bvy.A0Q)) {
            if (z2 && !AbstractC28009CWg.A01(bvy)) {
                f4 = 0.0f;
            }
        } else {
            f2 = f3;
        }
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f4);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float A09 = AbstractC166987dD.A09(this.A02.invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2)));
        if (A09 != floatValue && A09 != floatValue2 && A09 != 0.0f) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Final Snapping Offset Should Be one of ");
            A1C.append(floatValue);
            A1C.append(", ");
            A1C.append(floatValue2);
            throw AbstractC166987dD.A14(AbstractC166997dE.A0x(" or 0.0", A1C));
        }
        if (A09 == Float.POSITIVE_INFINITY || A09 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return A09;
    }
}
