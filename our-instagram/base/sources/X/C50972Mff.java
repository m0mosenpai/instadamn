package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Mff, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50972Mff extends AbstractC52922bZ {
    public BrandedContentGatingInfo A00 = new BrandedContentGatingInfo(null, null, null, null, null);
    public String A01 = "";
    public String A02 = "";
    public String A03;
    public final C2GT A04;
    public final UserSession A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;

    public final void A00(BrandedContentGatingInfo brandedContentGatingInfo, String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = brandedContentGatingInfo;
        this.A01 = str;
        this.A02 = str2;
        ArrayList A1E = AbstractC166987dD.A1E();
        UserSession userSession = this.A05;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36314377984543259L)) {
            EnumC53261Ngz enumC53261Ngz = EnumC53261Ngz.A06;
            String str3 = this.A03;
            if (str3 == null) {
                str3 = "";
            }
            A1E.add(new C56110OvV(new ViewOnClickListenerC55467OkM(this, 36), enumC53261Ngz, str3, false, false));
        }
        A1E.addAll(AbstractC16960so.A1Q(new C56110OvV(null, EnumC53261Ngz.A04, this.A01, false, false), new Ov7(C05F.A15, "feed"), new C56110OvV(null, EnumC53261Ngz.A09, this.A02, false, false), new Ov7(C05F.A1F, "feed")));
        this.A08.Egh(A1E);
    }

    public C50972Mff(UserSession userSession) {
        this.A05 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A08 = A0o;
        this.A04 = AbstractC31172DnG.A0E(A0o);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A06 = A12;
        this.A07 = AbstractC07080Za.A03(A12);
    }
}
