package X;

/* renamed from: X.J0t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43028J0t implements C7XU {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ C37644Ghd A01;
    public final /* synthetic */ C3DN A02;
    public final /* synthetic */ C59952od A03;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C43028J0t(C120985dq c120985dq, C37644Ghd c37644Ghd, C3DN c3dn, C59952od c59952od) {
        this.A03 = c59952od;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = c3dn;
    }

    @Override // X.C7XU
    public final void DAy() {
        C37540Gfw c37540Gfw = this.A03.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        c37540Gfw.A0J(this.A00, this.A01);
        this.A02.A0Q(null);
    }
}
