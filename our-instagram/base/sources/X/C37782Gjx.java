package X;

/* renamed from: X.Gjx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37782Gjx implements C3CD {
    public final /* synthetic */ C59952od A00;

    @Override // X.C3CD
    public final void DlF(C38321qM c38321qM, String str) {
    }

    public C37782Gjx(C59952od c59952od) {
        this.A00 = c59952od;
    }

    @Override // X.C3CD
    public final C38321qM BQN() {
        C120985dq A00 = C37624GhJ.A00(this.A00);
        if (A00 != null) {
            return A00.A02;
        }
        return null;
    }

    @Override // X.InterfaceC60162oy
    public final Integer BRW() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC60162oy
    public final String BkH() {
        C38321qM c38321qM;
        C120985dq A00 = C37624GhJ.A00(this.A00);
        if (A00 != null && (c38321qM = A00.A02) != null) {
            return AbstractC25226BEj.A1G(c38321qM);
        }
        return null;
    }

    @Override // X.C3CD
    public final boolean CcS() {
        return C18U.A06(C06090Tz.A05, C59952od.A01(this.A00), 36331033867666567L);
    }

    @Override // X.InterfaceC60162oy
    public final String getMediaId() {
        C38321qM c38321qM;
        C120985dq A00 = C37624GhJ.A00(this.A00);
        if (A00 != null && (c38321qM = A00.A02) != null) {
            return c38321qM.getId();
        }
        return null;
    }
}
