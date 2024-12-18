package X;

/* renamed from: X.GmD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37916GmD implements InterfaceC41501vz {
    public final /* synthetic */ C59952od A00;

    public C37916GmD(C59952od c59952od) {
        this.A00 = c59952od;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C5SW c5sw;
        int A03 = C0f9.A03(1966835451);
        int A032 = C0f9.A03(-176574871);
        C59952od c59952od = this.A00;
        C37540Gfw c37540Gfw = c59952od.A09;
        if (c37540Gfw != null) {
            C37784Gjz c37784Gjz = c37540Gfw.A0I;
            if (c37784Gjz != null && (c5sw = c37784Gjz.A00) != null) {
                c5sw.A08(false);
            }
            C37540Gfw c37540Gfw2 = c59952od.A09;
            if (c37540Gfw2 != null) {
                C37661Ghu.A03(c37540Gfw2.A11, false);
                C0f9.A0A(-1115193366, A032);
                C0f9.A0A(1844418712, A03);
                return;
            }
        }
        C14360o3.A0F("clipsViewerFragmentViewModel");
        throw C00O.createAndThrow();
    }
}
