package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ILb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41188ILb {
    public final HD4 A00;
    public final C61972ry A01;
    public final UserSession A02;

    public C41188ILb(C61972ry c61972ry, UserSession userSession, HD4 hd4) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = c61972ry;
        this.A00 = hd4;
    }

    public final void A00(String str, String str2, String str3) {
        UserSession userSession = this.A02;
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("ads/pbia_info/");
        A0M.A9s("ad_id", str);
        A0M.A0H("media_id", str2);
        A0M.A0H("ig_user_id", str3);
        A0M.A02 = new C25591Mp(new C07510aQ(userSession), new C25611Mr(null), IRY.class, A1Y);
        C1ON A0N = A0M.A0N();
        C61972ry c61972ry = this.A01;
        C39030HGg.A00(A0N, this, 14);
        c61972ry.schedule(A0N);
    }
}
