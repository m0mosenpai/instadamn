package X;

/* loaded from: classes6.dex */
public final class EfO extends C33H {
    public final /* synthetic */ C3BY A00;

    public EfO(C3BY c3by) {
        this.A00 = c3by;
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        this.A00.A01 = false;
    }

    @Override // X.C33H, X.C33I
    public final void Dtq(C5SW c5sw) {
        C18720vz c18720vz = AbstractC12960li.A00;
        InterfaceC19630xq A0q = AbstractC31172DnG.A0q(c18720vz);
        AbstractC167017dG.A1L(A0q.ARD(), A0q, "preference_long_press_avatar_show_single_account_switcher_tooltip_impressions", 0);
        C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A00);
        A0P.E7G("preference_long_press_avatar_show_single_account_switcher_tooltip_last_impression_time", currentTimeMillis);
        A0P.apply();
    }
}
