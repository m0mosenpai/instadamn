package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes9.dex */
public final class NOV extends AbstractC51040Mgq {
    public boolean A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GT A03;
    public final UserSession A04;
    public final P4V A05;
    public final OIU A06;
    public final String A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NOV(C152406tQ c152406tQ, UserSession userSession, ImageUrl imageUrl, P4V p4v) {
        this();
        String str;
        List list;
        Integer num;
        ICC icc;
        String str2;
        ImageUrl imageUrl2 = imageUrl;
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A05 = p4v;
        Object A00 = c152406tQ.A00("formID");
        if (A00 != null) {
            this.A07 = (String) A00;
            boolean A1T = AbstractC167007dF.A1T(AbstractC50522MSa.A0e(c152406tQ, "submission_successful"));
            this.A06 = new OIU(p4v, AbstractC50523MSb.A0S(c152406tQ), this.A07);
            this.A0D = AbstractC50523MSb.A1Z(c152406tQ, "is_from_lead_ad_activity");
            this.A0B = AbstractC50523MSb.A1Z(c152406tQ, "is_bottom_sheet_flow");
            Boolean A0e = AbstractC50522MSa.A0e(c152406tQ, "is_form_extension");
            this.A0C = A0e != null ? A0e.booleanValue() : false;
            AbstractC166997dE.A1Y(this.A0A, A1T);
            OLJ A002 = OVX.A01.A00(this.A07);
            if (A002 == null) {
                AbstractC31177DnL.A1Q(this, AbstractC141776au.A00(this), 30);
                return;
            }
            int A03 = AbstractC31177DnL.A03((Number) c152406tQ.A00("advertiserFollowerCount"));
            C41108IHz c41108IHz = A002.A00.A03;
            C05A c05a = this.A09;
            String str3 = A002.A00().A01;
            ImageUrl imageUrl3 = A002.A00().A00;
            if (c41108IHz != null) {
                str = c41108IHz.A03;
            } else {
                str = null;
            }
            C5QE A01 = C55205OeH.A01(str);
            if (c41108IHz != null) {
                list = AbstractC001800i.A0a(c41108IHz.A00);
            } else {
                list = C16930sl.A00;
            }
            if ((c41108IHz != null ? c41108IHz.A02 : null) == EnumC53296NhY.LIST_STYLE) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            if (c41108IHz != null && (icc = c41108IHz.A01) != null && (str2 = icc.A00) != null) {
                imageUrl2 = AbstractC25225BEi.A0t(str2);
            }
            c05a.Egh(new C51633MrQ(A01, imageUrl3, imageUrl2, num, str3, list, A03, 0, false));
            this.A00 = A002.A02();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public NOV() {
        C008002u A00 = C10E.A00(null);
        this.A09 = A00;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A02 = AbstractC58232lf.A00(anonymousClass191, A00);
        C008002u A0y = MSZ.A0y();
        this.A0A = A0y;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A0y);
        C008002u A002 = C10E.A00(null);
        this.A08 = A002;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A002);
    }
}
