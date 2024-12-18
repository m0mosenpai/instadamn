package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JYZ implements MRN {
    public final UserSession A00;
    public final MRN A01;
    public final MRN A02;
    public final MSI A03;
    public final MSJ A04;

    public JYZ(UserSession userSession, MRN mrn, MRN mrn2) {
        C14360o3.A0B(mrn2, 2);
        this.A01 = mrn;
        this.A02 = mrn2;
        this.A00 = userSession;
        this.A03 = mrn.B7D();
        this.A04 = new JTL(userSession, mrn.C7c(), mrn2.C7c());
    }

    @Override // X.MRN
    public final void Efi(C4I3 c4i3) {
        C14360o3.A0B(c4i3, 0);
        this.A01.Efi(c4i3);
        this.A02.Efi(c4i3);
    }

    @Override // X.MRN
    public final C42221xC AED() {
        return C42221xC.A01(C43926Jbb.A00, this.A01.AED(), this.A02.AED());
    }

    @Override // X.MRN
    public final C42221xC AVJ() {
        return this.A01.AVJ();
    }

    @Override // X.MRN
    public final C42221xC AWK() {
        return this.A01.AWK();
    }

    @Override // X.MRN
    public final MSI B7D() {
        return this.A03;
    }

    @Override // X.MRN
    public final MSJ C7c() {
        return this.A04;
    }

    @Override // X.MRN
    public final C42221xC E41() {
        return C42221xC.A01(JYQ.A00, this.A01.E41(), this.A02.E41());
    }

    @Override // X.MRN
    public final void EUg(C51761Mtk c51761Mtk) {
        this.A01.EUg(c51761Mtk);
        this.A02.EUg(c51761Mtk);
    }

    @Override // X.MRN
    public final void Ead(int i) {
        this.A01.Ead(i);
        this.A02.Ead(i);
    }

    @Override // X.MRN
    public final C42221xC Eq6() {
        return C43601JQh.A00(C42221xC.A01(new JYF(this, 2), this.A01.Eq6(), this.A02.Eq6()), JY6.A00, 4).A0K(JY7.A00);
    }
}
