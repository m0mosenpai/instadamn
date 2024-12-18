package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GHA implements C7XU {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C163997Vo A01;
    public final /* synthetic */ C7XU A02;
    public final /* synthetic */ C3DN A03;

    @Override // X.C7XU
    public final void DB3() {
    }

    public GHA(Fragment fragment, C163997Vo c163997Vo, C7XU c7xu, C3DN c3dn) {
        this.A03 = c3dn;
        this.A00 = fragment;
        this.A02 = c7xu;
        this.A01 = c163997Vo;
    }

    @Override // X.C7XU
    public final void DAy() {
        C3DN c3dn = this.A03;
        ((C3DP) c3dn).A0H = new GHK(3, this.A02, this.A01);
        c3dn.A0K(this.A00);
    }
}
