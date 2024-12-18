package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.JmV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44525JmV extends AbstractC52922bZ {
    public boolean A00;
    public final C2GT A01;
    public final UserSession A02;
    public final KPC A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C42221xC A08;
    public final C41761wQ A09;

    public C44525JmV(C12N c12n, C42221xC c42221xC, UserSession userSession, KPC kpc) {
        AbstractC167007dF.A1D(userSession, 1, kpc);
        AbstractC167007dF.A1F(c42221xC, 3, c12n);
        this.A02 = userSession;
        this.A03 = kpc;
        this.A08 = c42221xC;
        this.A09 = new C41761wQ(null);
        this.A05 = AbstractC25235BEs.A1A(false);
        C008002u A1H = AbstractC25225BEi.A1H(new C47316KvR(false));
        this.A06 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A07 = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(new C47315KvQ(false));
        this.A04 = A1H3;
        InterfaceC19390xP A15 = AbstractC43593JPy.A15(c12n, C10Q.A00(new C57185PaM(1, null), A1H, A1H3, A1H2), 1705805791);
        this.A01 = AbstractC43594JPz.A0J(new C45021JwC(new C47315KvQ(false), new C47316KvR(false), ""), AbstractC141776au.A00(this), A15, C10I.A00);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A00 = true;
        this.A09.A01();
    }

    public final void A00() {
        C0K8.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", "fetchCode starting");
        this.A03.A05("OTC_DISPLAY_CODE_FETCH_CODE_START");
        this.A04.F8m(new C47315KvQ(false));
        this.A06.F8m(new C47316KvR(true));
        C41761wQ c41761wQ = this.A09;
        C42221xC c42221xC = this.A08;
        MHP mhp = new MHP(this, 12);
        MM0 mm0 = new MM0(this, 37);
        C14360o3.A0B(c41761wQ, 0);
        C15370ps A1F = AbstractC25225BEi.A1F();
        C45716KLt c45716KLt = new C45716KLt(mhp, A1F);
        C14270nr A00 = C14270nr.A00();
        C14360o3.A07(A00);
        A00.A01(c45716KLt, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        c42221xC.A0U(new C48488Lcf(c41761wQ, c45716KLt, A00, mm0, A1F));
    }
}
