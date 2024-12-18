package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ILx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41208ILx {
    public final C57112jm A00;
    public final C63622uj A01;
    public final String A02;
    public final C39121HJt A03;

    public C41208ILx(UserSession userSession, C57112jm c57112jm, C41731Ie2 c41731Ie2, String str, String str2) {
        AbstractC167027dH.A0a(1, userSession, str, str2, c57112jm);
        this.A02 = str;
        this.A00 = c57112jm;
        this.A03 = new C39121HJt(userSession, c41731Ie2, str, str2);
        this.A01 = new C63622uj();
    }

    public final void A00(java.util.Set set, boolean z) {
        C14360o3.A0B(set, 0);
        C39121HJt c39121HJt = this.A03;
        c39121HJt.A00 = z;
        String A0R = AnonymousClass001.A0R("seller_funded_discounts_banner:", this.A02);
        AbstractC31176DnK.A1V(c39121HJt, C59062n7.A00(set, C0eB.A00, A0R), this.A01, A0R);
    }
}
