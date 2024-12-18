package X;

/* renamed from: X.Wfu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70728Wfu implements InterfaceC41501vz, XBI, XBE, XBF, XBG, XBH {
    public final /* synthetic */ C67898V1g A00;

    public C70728Wfu(C67898V1g c67898V1g) {
        this.A00 = c67898V1g;
    }

    private final void A00() {
        C67898V1g c67898V1g = this.A00;
        C67922V2m c67922V2m = c67898V1g.A00;
        if (c67922V2m == null) {
            C14360o3.A0F("editSearchHistoryAdapter");
            throw C00O.createAndThrow();
        }
        c67922V2m.A00 = C67898V1g.A00(c67898V1g);
        c67922V2m.A00();
    }

    @Override // X.XBE
    public final void CMK(String str) {
        A00();
    }

    @Override // X.XBF
    public final void CMX(String str) {
        A00();
    }

    @Override // X.XBG
    public final void CMd(String str) {
        A00();
    }

    @Override // X.XBH
    public final void CMr(String str) {
        A00();
    }

    @Override // X.XBI
    public final void CN3(String str) {
        A00();
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1376649097);
        C70710WfZ c70710WfZ = (C70710WfZ) obj;
        int A0N = AbstractC167017dG.A0N(c70710WfZ, -1869043033);
        if (c70710WfZ.A00) {
            C67922V2m c67922V2m = this.A00.A00;
            if (c67922V2m == null) {
                C14360o3.A0F("editSearchHistoryAdapter");
                throw C00O.createAndThrow();
            }
            c67922V2m.A00 = U24.A00();
            c67922V2m.A00();
        } else {
            A00();
        }
        C0f9.A0A(304409343, A0N);
        C0f9.A0A(-1544598996, A03);
    }
}
