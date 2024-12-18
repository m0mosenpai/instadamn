package X;

/* renamed from: X.Ggo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37593Ggo implements InterfaceC41501vz {
    public final /* synthetic */ C59952od A00;

    public C37593Ggo(C59952od c59952od) {
        this.A00 = c59952od;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1206075296);
        C3MY c3my = (C3MY) obj;
        int A032 = C0f9.A03(1046056747);
        C14360o3.A0B(c3my, 0);
        boolean z = c3my.A00;
        C59952od c59952od = this.A00;
        if (z) {
            C120985dq A00 = C37624GhJ.A00(c59952od);
            if (A00 != null) {
                C37540Gfw c37540Gfw = c59952od.A09;
                if (c37540Gfw != null) {
                    if (!c37540Gfw.A1K.A0e(A00.getId())) {
                        C37540Gfw c37540Gfw2 = c59952od.A09;
                        if (c37540Gfw2 != null) {
                            c37540Gfw2.A1K.A0W("resume", false);
                        }
                    }
                }
                C14360o3.A0F("clipsViewerFragmentViewModel");
                throw C00O.createAndThrow();
            }
            C0f9.A0A(1504737013, A032);
            C0f9.A0A(-1092697789, A03);
            return;
        }
        C37540Gfw c37540Gfw3 = c59952od.A09;
        if (c37540Gfw3 != null) {
            c37540Gfw3.A1K.A0S(null, "end_scene", false, true);
            C0f9.A0A(1504737013, A032);
            C0f9.A0A(-1092697789, A03);
            return;
        }
        C14360o3.A0F("clipsViewerFragmentViewModel");
        throw C00O.createAndThrow();
    }
}
