package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class UFH extends AbstractC52922bZ {
    public final C2GT A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final InterfaceC09390do A04;

    public UFH(UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1P(userSession, str);
        C14360o3.A0B(str2, 3);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        String str3 = C70399WUb.A00(userSession).A03;
        C14360o3.A07(str3);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC37301Gc2.A1M(A0c, "ads/ads_manager/fetch_promotion_information_v2/", str);
        A0c.A9s("fb_auth_token", str2);
        A0c.A0H("flow_id", str3);
        A0c.A0P(null, C67838UzB.class, C69909Vxa.class, false);
        AbstractC18560vj.A03(AbstractC141776au.A00(this), A0c.A0N().A04(1481009581, 3));
        C17050sx A01 = AbstractC09440dt.A01(new X32(this, 21));
        this.A04 = A01;
        C43818JZg c43818JZg = new C43818JZg(14, new C15340po(new MC5(this, null, 43), (InterfaceC19390xP) A01.getValue()), this);
        this.A00 = AbstractC58232lf.A00(AnonymousClass191.A00, AbstractC208910l.A01(new C45080JxA(null, false), AbstractC141776au.A00(this), c43818JZg, C10I.A00));
    }
}
