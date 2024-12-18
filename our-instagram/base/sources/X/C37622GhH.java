package X;

/* renamed from: X.GhH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37622GhH implements C3CQ {
    public final /* synthetic */ C59952od A00;
    public final /* synthetic */ boolean A01;

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (this.A01) {
            C37546Gg2 c37546Gg2 = this.A00.A0C;
            if (c37546Gg2 == null) {
                C14360o3.A0F("viewerAdapter");
                throw C00O.createAndThrow();
            }
            if (c37546Gg2.A0A.A0D(c38321qM) <= -1) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        boolean z = this.A01;
        C37546Gg2 c37546Gg2 = this.A00.A0C;
        if (z) {
            if (c37546Gg2 != null) {
                c37546Gg2.CtR(c38321qM);
                return;
            }
        } else if (c37546Gg2 != null) {
            return;
        }
        C14360o3.A0F("viewerAdapter");
        throw C00O.createAndThrow();
    }

    public C37622GhH(C59952od c59952od, boolean z) {
        this.A01 = z;
        this.A00 = c59952od;
    }
}
