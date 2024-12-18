package X;

/* renamed from: X.CfH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28357CfH {
    public final C5Y1 A00;
    public final C5Y1 A01;
    public final C6MY A02;
    public final InterfaceC74953Yl A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC74963Ym A05;
    public final InterfaceC74963Ym A06;
    public final CQ6 A07;
    public final L4Q A08;
    public final C19L A09;

    public static final float A00(C28357CfH c28357CfH) {
        float max;
        if (AbstractC25235BEs.A09(c28357CfH.A04) == 0) {
            max = 1.0f;
        } else {
            InterfaceC74953Yl interfaceC74953Yl = c28357CfH.A03;
            max = Math.max(((int) (AbstractC25235BEs.A09(interfaceC74953Yl) >> 32)) / ((int) (AbstractC25235BEs.A09(r6) >> 32)), C119055aN.A00(AbstractC25235BEs.A09(interfaceC74953Yl)) / C119055aN.A00(AbstractC25235BEs.A09(r6)));
        }
        return Math.max(2.0f, max);
    }

    public static final long A01(C28357CfH c28357CfH, float f, long j) {
        long A01 = AbstractC119215ad.A01(AbstractC25235BEs.A09(c28357CfH.A04));
        if (A01 == 9205357640488583168L) {
            throw AbstractC166987dD.A14(AbstractC111324zv.A00(3767));
        }
        float A012 = AbstractC25227BEk.A01(A01) * f;
        float intBitsToFloat = Float.intBitsToFloat((int) (A01 & 4294967295L)) * f;
        long floatToRawIntBits = (Float.floatToRawIntBits(A012) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        float A02 = C5YC.A02(floatToRawIntBits);
        InterfaceC74953Yl interfaceC74953Yl = c28357CfH.A03;
        float A09 = A02 - ((int) (AbstractC25235BEs.A09(interfaceC74953Yl) >> 32));
        if (A09 < 0.0f) {
            A09 = 0.0f;
        }
        float A00 = C5YC.A00(floatToRawIntBits) - C119055aN.A00(AbstractC25235BEs.A09(interfaceC74953Yl));
        if (A00 < 0.0f) {
            A00 = 0.0f;
        }
        long A05 = C119365at.A05(0.5f, AbstractC119395aw.A00(A09, A00));
        float A013 = C119365at.A01(j);
        float A014 = C119365at.A01(A05);
        float A022 = C17s.A02(A013, -A014, A014);
        float A023 = C119365at.A02(j);
        float A024 = C119365at.A02(A05);
        return AbstractC119395aw.A00(A022, C17s.A02(A023, -A024, A024));
    }

    public C28357CfH(C6MY c6my, C19L c19l) {
        AbstractC167017dG.A1P(c19l, c6my);
        this.A09 = c19l;
        this.A02 = c6my;
        this.A00 = new C5Y1(AbstractC118445Xg.A06, AbstractC25225BEi.A0R(0L), null);
        this.A01 = AbstractC118385Xa.A00(1.0f);
        this.A07 = new CQ6(c19l);
        this.A08 = new L4Q(new C50262MHr(this, 33), C30712DfA.A00(this, 26));
        long A0q = AbstractC25232BEp.A0q();
        this.A03 = AbstractC25230BEn.A0U(new C119055aN(A0q));
        this.A04 = AbstractC25229BEm.A0R(new C119055aN(A0q));
        this.A06 = AbstractC25225BEi.A0L(null, new C50154MDh(this, 22));
        this.A05 = AbstractC25225BEi.A0L(null, new C50154MDh(this, 21));
    }
}
