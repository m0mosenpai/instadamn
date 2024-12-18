package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ggt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37598Ggt implements JI8 {
    public final InterfaceC41501vz A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC43589JPu A03;
    public final FragmentActivity A04;
    public final C37597Ggs A05;
    public final JI8 A06;

    public final void A00(EnumC120785dO enumC120785dO, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        C14360o3.A0B(c120985dq, 0);
        AbstractC167017dG.A1P(c37644Ghd, enumC120785dO);
        this.A05.A00(this.A04, EnumC120785dO.COMMENT_BUTTON, c120985dq, c37644Ghd, new C43012J0c(3, c120985dq, this), Integer.valueOf(c37644Ghd.A06()), null, false, false, false);
    }

    public final void A01(EnumC120785dO enumC120785dO, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z) {
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        C14360o3.A0B(enumC120785dO, 4);
        if (c120985dq.A01 != EnumC129395t1.A03) {
            UserSession userSession = this.A01;
            AbstractC25651Mw.A00(userSession).A01(this.A00, C3MY.class);
            this.A05.A00(this.A04, enumC120785dO, c120985dq, c37644Ghd, new C36729GGy(3, c120985dq, this, c37644Ghd), Integer.valueOf(c37644Ghd.A06()), str, false, false, z);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                AbstractC37802GkH.A00(MusicPageTabType.A04, userSession).A01(AbstractC25226BEj.A0u(c38321qM), userSession, "open_comments", this.A02.getModuleName());
            }
        }
    }

    @Override // X.JI8
    public final boolean CT2(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return this.A06.CT2(c120985dq);
    }

    @Override // X.JI8
    public final boolean CT3(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return this.A06.CT3(c120985dq);
    }

    @Override // X.JI8
    public final void AGM(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        this.A06.AGM(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    @Override // X.JI8
    public final long BYI() {
        return this.A06.BYI();
    }

    @Override // X.JI8
    public final void Co0(C120985dq c120985dq) {
        this.A06.Co0(c120985dq);
    }

    @Override // X.JI8
    public final void EJo() {
        this.A06.EJo();
    }

    public C37598Ggt(FragmentActivity fragmentActivity, InterfaceC41501vz interfaceC41501vz, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, C37597Ggs c37597Ggs, JI8 ji8) {
        AbstractC167017dG.A1Q(userSession, interfaceC60442pS);
        AbstractC167017dG.A1T(interfaceC43589JPu, c37597Ggs);
        this.A01 = userSession;
        this.A04 = fragmentActivity;
        this.A02 = interfaceC60442pS;
        this.A06 = ji8;
        this.A03 = interfaceC43589JPu;
        this.A05 = c37597Ggs;
        this.A00 = interfaceC41501vz;
    }
}
