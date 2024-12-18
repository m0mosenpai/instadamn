package X;

/* loaded from: classes9.dex */
public final class NVj extends OwC {
    public static final OGa A01 = new Object();
    public C82H A00;

    public final int A07() {
        int i;
        InterfaceC19630xq interfaceC19630xq;
        String str;
        C23031Ai A00 = AbstractC23021Ah.A00(this.A0E);
        C82H c82h = this.A00;
        if (c82h == null) {
            C14360o3.A0F("upsellVariant");
            throw C00O.createAndThrow();
        }
        if (c82h == C82H.A0G) {
            interfaceC19630xq = A00.A01;
            str = "story_xpost_user_migration_upsell_second_wave_display_count";
        } else if (c82h == C82H.A0F) {
            interfaceC19630xq = A00.A01;
            str = "feed_xpost_user_migration_upsell_second_wave_display_count";
        } else {
            i = 0;
            return i + 1;
        }
        i = AbstractC31172DnG.A01(interfaceC19630xq, str);
        return i + 1;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A0E.A03(NVj.class);
    }
}
