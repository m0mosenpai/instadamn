package X;

/* loaded from: classes8.dex */
public final class L6D {
    public final /* synthetic */ KCW A00;

    public L6D(KCW kcw) {
        this.A00 = kcw;
    }

    public final void A00() {
        KCW kcw = this.A00;
        EnumC46186KcO enumC46186KcO = kcw.A03;
        if (enumC46186KcO == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        EnumC46186KcO enumC46186KcO2 = EnumC46186KcO.A02;
        if (enumC46186KcO != enumC46186KcO2) {
            if (enumC46186KcO == EnumC46186KcO.A0H) {
                kcw.A03 = enumC46186KcO2;
            }
            kcw.requireArguments().putString("param_extra_initial_tab", "stickers");
            if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(kcw.A0G), 2342171238469614949L)) {
                KCW.A04(kcw);
                return;
            }
            return;
        }
        C3DN c3dn = kcw.A04;
        if (c3dn != null) {
            c3dn.A0B();
        }
        MRR mrr = kcw.A02;
        if (mrr == null) {
            return;
        }
        mrr.Dvf();
    }
}
