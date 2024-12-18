package X;

/* loaded from: classes9.dex */
public final class P1Z implements InterfaceC57943Pmn {
    public final /* synthetic */ P1D A00;

    public P1Z(P1D p1d) {
        this.A00 = p1d;
    }

    @Override // X.InterfaceC57943Pmn
    public final void Dav() {
        C52369NFj c52369NFj;
        P1D p1d = this.A00;
        C52369NFj c52369NFj2 = p1d.A00;
        if (c52369NFj2 != null) {
            c52369NFj2.setEnableSwitchView(true);
            if (C196218mC.A00(p1d.A05) && (c52369NFj = p1d.A00) != null) {
                c52369NFj.setChecked(true);
            }
            p1d.A02 = true;
            C52369NFj c52369NFj3 = p1d.A00;
            if (c52369NFj3 != null) {
                c52369NFj3.setOnCheckedClickedListener(null);
            }
            C52369NFj c52369NFj4 = p1d.A00;
            if (c52369NFj4 != null) {
                c52369NFj4.setDescription(P1D.A01(p1d));
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
