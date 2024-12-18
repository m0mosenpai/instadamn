package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class BW2 implements C5E5 {
    public final C6M3 A00;
    public final BVY A01;

    @Override // X.C5E5
    public final Object DZz(InterfaceC23621Ds interfaceC23621Ds, long j, long j2) {
        return new C25242BFb(C25242BFb.A01(0.0f, 0.0f, 1, j2));
    }

    @Override // X.C5E5
    public final long Da2(long j, long j2, int i) {
        float A02;
        if (i == 2) {
            if (this.A00 == C6M3.Horizontal) {
                A02 = C119365at.A01(j2);
            } else {
                A02 = C119365at.A02(j2);
            }
            if (A02 != 0.0f) {
                throw new CancellationException("Scroll cancelled");
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.C5E5
    public final long DaA(long j, int i) {
        float A02;
        if (i == 1) {
            BVY bvy = this.A01;
            C57F c57f = bvy.A0N.A04;
            if (Math.abs(c57f.B72()) > 1.0E-6d) {
                float B72 = c57f.B72();
                InterfaceC74953Yl interfaceC74953Yl = bvy.A0C;
                float f = B72 * ((BVX) interfaceC74953Yl.getValue()).A05;
                float f2 = ((AbstractC25230BEn.A0S(interfaceC74953Yl).A05 + AbstractC25230BEn.A0S(interfaceC74953Yl).A06) * (-Math.signum(c57f.B72()))) + f;
                if (c57f.B72() > 0.0f) {
                    f2 = f;
                    f = f2;
                }
                C6M3 c6m3 = this.A00;
                C6M3 c6m32 = C6M3.Horizontal;
                if (c6m3 == c6m32) {
                    A02 = C119365at.A01(j);
                } else {
                    A02 = C119365at.A02(j);
                }
                float f3 = -bvy.A0G.APr(-C17s.A02(A02, f, f2));
                if (c6m3 != c6m32) {
                    f3 = C119365at.A01(j);
                }
                float A022 = C119365at.A02(j);
                return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(A022) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.C5E5
    public final /* synthetic */ Object Da5(InterfaceC23621Ds interfaceC23621Ds, long j) {
        return new C25242BFb(0L);
    }

    public BW2(C6M3 c6m3, BVY bvy) {
        this.A01 = bvy;
        this.A00 = c6m3;
    }
}
