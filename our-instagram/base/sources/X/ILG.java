package X;

/* loaded from: classes7.dex */
public final class ILG {
    public final /* synthetic */ C37726Gj1 A00;

    public ILG(C37726Gj1 c37726Gj1) {
        this.A00 = c37726Gj1;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0oO, java.lang.Object] */
    public final void A00(C38321qM c38321qM) {
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        boolean z = false;
        boolean A1W = AbstractC167007dF.A1W(c38321qM);
        A01.A0P(A01.A02, "REELS_MOST_RECENT_FLASH_CACHE_LOAD_END");
        C226418s.A07(A01.A02, "reels_most_recent_flash_cache_load_successful", A1W);
        ?? obj = new Object();
        if (c38321qM != null) {
            C37726Gj1 c37726Gj1 = this.A00;
            if (AbstractC166997dE.A1Z(c37726Gj1.A0H.get(AbstractC37655Gho.A00(c38321qM)), true)) {
                C120985dq A00 = C37726Gj1.A00(c37726Gj1, AbstractC16960so.A1N(c38321qM), AbstractC166987dD.A1E());
                if (C18U.A06(C06090Tz.A05, c37726Gj1.A08, 36323358761364671L) && c37726Gj1.A0D.A0A.A0a()) {
                    return;
                } else {
                    C11T.A02(new RunnableC43138J5b(A00, c37726Gj1, obj));
                }
            }
        }
        C226418s A012 = C226218q.A01(c18720vz);
        boolean z2 = obj.A00;
        if (c38321qM != null) {
            C37726Gj1 c37726Gj12 = this.A00;
            z = AbstractC80543ij.A00(c37726Gj12.A08).A00(c37726Gj12.A04, c38321qM);
        }
        C226418s.A07(A012.A02, "reels_most_recent_flash_cache_inserted", z2);
        C226418s.A07(A012.A02, "reels_tab_first_item_media_is_cached", z);
        boolean z3 = obj.A00;
        C37726Gj1 c37726Gj13 = this.A00;
        if (z3) {
            C37803GkI c37803GkI = new C37803GkI(1, c37726Gj13, c38321qM);
            c37726Gj13.A09.B6V(new C37764Gjf(c37726Gj13.A06), c37803GkI, c37726Gj13.A0A);
            return;
        }
        C11T.A02(new J41(c37726Gj13));
    }
}
