package X;

/* renamed from: X.BJo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25345BJo {
    public long A00;
    public final C6M3 A01;

    public final C119365at A00(BFo bFo, float f) {
        float A02;
        float abs;
        float A022;
        long A00;
        long A07 = C119365at.A07(this.A00, C119365at.A06(bFo.A06, bFo.A07));
        this.A00 = A07;
        C6M3 c6m3 = this.A01;
        if (c6m3 == null) {
            abs = C119365at.A00(A07);
        } else {
            if (c6m3 == C6M3.Horizontal) {
                A02 = C119365at.A01(A07);
            } else {
                A02 = C119365at.A02(A07);
            }
            abs = Math.abs(A02);
        }
        if (abs >= f) {
            if (c6m3 == null) {
                A00 = C119365at.A06(A07, C119365at.A05(f, C119365at.A04(C119365at.A00(A07), A07)));
            } else {
                C6M3 c6m32 = C6M3.Horizontal;
                if (c6m3 == c6m32) {
                    A022 = C119365at.A01(A07);
                } else {
                    A022 = C119365at.A02(A07);
                }
                float signum = A022 - (Math.signum(A022) * f);
                if (c6m3 == c6m32) {
                    A00 = AbstractC119395aw.A00(signum, C119365at.A02(A07));
                } else {
                    A00 = AbstractC119395aw.A00(C119365at.A01(A07), signum);
                }
            }
            return AbstractC25225BEi.A0R(A00);
        }
        return null;
    }

    public C25345BJo(C6M3 c6m3) {
        this.A01 = c6m3;
        this.A00 = 0L;
    }

    public C25345BJo() {
        this(null);
    }
}
