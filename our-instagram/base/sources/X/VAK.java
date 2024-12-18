package X;

/* loaded from: classes11.dex */
public final class VAK extends AbstractC67878V0j {
    public static final String __redex_internal_original_name = "TopSerpGridFragment";
    public final InterfaceC09390do A01 = C1XM.A00(new X2z(this, 16));
    public final XB9 A00 = C71019Wma.A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "serp_non_profiled";
    }

    @Override // X.AbstractC67878V0j, X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        int i;
        super.onSetUserVisibleHint(z, z2);
        if (z && (i = AbstractC23021Ah.A00(getSession()).A01.getInt("not_personalized_message_on_top_serp_count", 0)) < 3) {
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A0D = getString(2131968669);
            AbstractC25233BEq.A1F(c146106i8);
            AbstractC167007dF.A18(AbstractC23021Ah.A00(getSession()).A01, "not_personalized_message_on_top_serp_count", i + 1);
        }
    }
}
