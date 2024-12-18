package X;

/* renamed from: X.OnE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55629OnE implements InterfaceC57897Pm1 {
    public final /* synthetic */ C52690NTb A00;

    public C55629OnE(C52690NTb c52690NTb) {
        this.A00 = c52690NTb;
    }

    @Override // X.InterfaceC57897Pm1
    public final void APJ() {
        C51905Mwn c51905Mwn;
        C51905Mwn c51905Mwn2;
        C52690NTb c52690NTb = this.A00;
        InterfaceC09390do interfaceC09390do = c52690NTb.A0S;
        if (AbstractC25226BEj.A10(interfaceC09390do).A01.getInt("rtc_floating_participant_tool_tip_shown_count", 0) < 1) {
            C51905Mwn c51905Mwn3 = (C51905Mwn) ((AbstractC55206OeJ) c52690NTb).A01;
            if (c51905Mwn3 != null) {
                c51905Mwn2 = C51905Mwn.A00(null, null, c51905Mwn3, null, null, null, 98303, false, false, false, false, false, false, false, true, false);
            } else {
                c51905Mwn2 = null;
            }
            c52690NTb.A0J(c51905Mwn2);
            AbstractC167017dG.A0g(AbstractC25226BEj.A10(interfaceC09390do).A01, "rtc_floating_participant_tool_tip_shown_count").apply();
            return;
        }
        c52690NTb.A0A.A05(PEA.A00);
        C51905Mwn c51905Mwn4 = (C51905Mwn) ((AbstractC55206OeJ) c52690NTb).A01;
        if (c51905Mwn4 != null) {
            c51905Mwn = C51905Mwn.A00(null, null, c51905Mwn4, null, null, null, 98303, false, false, false, false, false, false, false, false, false);
        } else {
            c51905Mwn = null;
        }
        c52690NTb.A0J(c51905Mwn);
    }
}
