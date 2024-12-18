package X;

/* renamed from: X.CnQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28794CnQ implements InterfaceC74963Ym {
    public final C6MD A00;
    public final InterfaceC74953Yl A01;
    public final InterfaceC74953Yl A02;
    public final InterfaceC74953Yl A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC74953Yl A05;
    public final InterfaceC74953Yl A06;
    public final InterfaceC74953Yl A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final InterfaceC74953Yl A0A;
    public final InterfaceC74953Yl A0B;
    public final InterfaceC74963Ym A0C;
    public final InterfaceC74963Ym A0D;
    public final InterfaceC74963Ym A0E;

    public static final void A00(C28794CnQ c28794CnQ, float f) {
        SQ2 sq2;
        AbstractC25227BEk.A18(c28794CnQ.A08, f);
        if (AbstractC25230BEn.A1X(c28794CnQ.A0B) && (sq2 = (SQ2) c28794CnQ.A02.getValue()) != null) {
            f -= f % (1.0f / sq2.A01);
        }
        AbstractC25227BEk.A18(c28794CnQ.A07, f);
    }

    public final int A01() {
        return AbstractC25231BEo.A0E(this.A04);
    }

    @Override // X.InterfaceC74963Ym
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(AbstractC25231BEo.A03(this.A07));
    }

    public C28794CnQ() {
        Boolean A0a = AbstractC166997dE.A0a();
        this.A03 = AbstractC25230BEn.A0U(A0a);
        this.A04 = AbstractC25229BEm.A0R(1);
        this.A05 = AbstractC25229BEm.A0R(1);
        this.A09 = AbstractC25229BEm.A0R(A0a);
        this.A01 = AbstractC25229BEm.A0R(null);
        this.A0A = AbstractC25229BEm.A0R(AbstractC25227BEk.A0m());
        this.A0B = AbstractC25229BEm.A0R(A0a);
        this.A0D = AbstractC25225BEi.A0L(null, new C57514Pfo(this, 31));
        this.A02 = AbstractC25229BEm.A0R(null);
        Float A0l = AbstractC25227BEk.A0l();
        this.A08 = AbstractC25229BEm.A0R(A0l);
        this.A07 = AbstractC25229BEm.A0R(A0l);
        this.A06 = AbstractC25229BEm.A0R(Long.MIN_VALUE);
        this.A0C = AbstractC25225BEi.A0L(null, new C57514Pfo(this, 30));
        this.A0E = AbstractC25225BEi.A0L(null, new C57514Pfo(this, 32));
        this.A00 = new C6MD();
    }
}
