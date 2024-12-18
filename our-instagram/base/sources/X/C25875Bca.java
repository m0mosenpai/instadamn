package X;

/* renamed from: X.Bca, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25875Bca extends AbstractC52922bZ {
    public final C05A A00;
    public final C05A A01;
    public final C05A A02;
    public final C0UO A03;
    public final C0UO A04;
    public final C0UO A05;
    public final long A06;
    public final C0UO A07;

    public static final float A00(C114205Dh c114205Dh, C25875Bca c25875Bca, long j) {
        float f;
        float A00;
        float A02 = c114205Dh.A00 + C119365at.A02(j);
        C05A c05a = c25875Bca.A02;
        float A002 = C5YC.A00(((C5YC) c05a.getValue()).A00);
        C05A c05a2 = c25875Bca.A01;
        if (A02 > A002 + C119365at.A02(((C119365at) c05a2.getValue()).A00)) {
            f = C5YC.A00(((C5YC) c05a.getValue()).A00);
            A00 = C119365at.A02(((C119365at) c05a2.getValue()).A00);
        } else {
            float f2 = c114205Dh.A03;
            long j2 = c25875Bca.A06;
            if (A02 >= C5YC.A00(j2) + f2) {
                return A02;
            }
            f = f2;
            A00 = C5YC.A00(j2);
        }
        return f + A00;
    }

    public static final float A01(C114205Dh c114205Dh, C25875Bca c25875Bca, long j) {
        float A01 = c114205Dh.A01 + C119365at.A01(j);
        C05A c05a = c25875Bca.A01;
        if (A01 < C119365at.A01(((C119365at) c05a.getValue()).A00)) {
            return C119365at.A01(((C119365at) c05a.getValue()).A00);
        }
        float f = c114205Dh.A02;
        long j2 = c25875Bca.A06;
        if (A01 <= f - C5YC.A02(j2)) {
            return A01;
        }
        return f - C5YC.A02(j2);
    }

    public static final float A02(C114205Dh c114205Dh, C25875Bca c25875Bca, long j) {
        float f;
        float A02;
        float A01 = c114205Dh.A02 + C119365at.A01(j);
        C0UO c0uo = c25875Bca.A05;
        float A022 = C5YC.A02(((C5YC) c0uo.getValue()).A00);
        C05A c05a = c25875Bca.A01;
        if (A01 > A022 + C119365at.A01(((C119365at) c05a.getValue()).A00)) {
            f = C5YC.A02(((C5YC) c0uo.getValue()).A00);
            A02 = C119365at.A01(((C119365at) c05a.getValue()).A00);
        } else {
            float f2 = c114205Dh.A01;
            long j2 = c25875Bca.A06;
            if (A01 >= C5YC.A02(j2) + f2) {
                return A01;
            }
            f = f2;
            A02 = C5YC.A02(j2);
        }
        return f + A02;
    }

    public static final float A03(C114205Dh c114205Dh, C25875Bca c25875Bca, long j) {
        float A02 = c114205Dh.A03 + C119365at.A02(j);
        C05A c05a = c25875Bca.A01;
        if (A02 < C119365at.A02(((C119365at) c05a.getValue()).A00)) {
            return C119365at.A02(((C119365at) c05a.getValue()).A00);
        }
        float f = c114205Dh.A00;
        long j2 = c25875Bca.A06;
        if (A02 <= f - C5YC.A00(j2)) {
            return A02;
        }
        return f - C5YC.A00(j2);
    }

    public C25875Bca(long j) {
        this.A06 = j;
        C008002u A1H = AbstractC25225BEi.A1H(new C5YC(j));
        this.A02 = A1H;
        this.A05 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C114205Dh(0.0f, 0.0f, C5YC.A02(j), C5YC.A00(j)));
        this.A00 = A1H2;
        AbstractC166987dD.A1Z(new MBT(this, null, 43), AbstractC141776au.A00(this));
        this.A03 = A1H2;
        C15150pV A03 = C10Q.A03(new D5A(null), A1H2, A1H);
        this.A07 = AbstractC208910l.A01(new C114205Dh(0.0f, 0.0f, 1.0f, 1.0f), AbstractC141776au.A00(this), A03, C10I.A01);
        C008002u A1H3 = AbstractC25225BEi.A1H(AbstractC25225BEi.A0R(0L));
        this.A01 = A1H3;
        this.A04 = A1H3;
    }
}
