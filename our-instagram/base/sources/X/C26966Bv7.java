package X;

/* renamed from: X.Bv7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26966Bv7 extends C1P1 {
    public C38321qM A00;
    public C75113Zb A01;
    public final C3AG A02;
    public final /* synthetic */ C3AE A03;

    public C26966Bv7(C38321qM c38321qM, C3AE c3ae, C75113Zb c75113Zb, C3AG c3ag) {
        this.A03 = c3ae;
        this.A01 = c75113Zb;
        this.A00 = c38321qM;
        this.A02 = c3ag;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(753005706);
        C9GR.A0F(this.A03.A00.getContext(), "translation_fail", 2131975720);
        this.A02.Dva(this.A00, EnumC75183Zl.A04);
        C0f9.A0A(647067302, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-594901936);
        this.A01.A0N(EnumC75183Zl.A03);
        this.A03.A04.CtR(this.A00);
        C0f9.A0A(194876545, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1850652793);
        int A032 = C0f9.A03(1302799621);
        AbstractC27678CIx.A00(this.A03.A05, ((HAN) obj).A01);
        this.A02.Dva(this.A00, EnumC75183Zl.A06);
        C0f9.A0A(-253172578, A032);
        C0f9.A0A(228071175, A03);
    }
}
