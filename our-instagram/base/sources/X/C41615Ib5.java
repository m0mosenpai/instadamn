package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ib5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41615Ib5 {
    public final C57112jm A00;
    public final C63622uj A01;
    public final C39122HJu A02;

    public C41615Ib5(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, String str, String str2, String str3) {
        AbstractC25233BEq.A0w(1, userSession, c57112jm, str);
        this.A00 = c57112jm;
        this.A01 = new C63622uj();
        this.A02 = new C39122HJu(interfaceC11380iw, userSession, str, str2, str3);
    }

    public final void A01(C09530e4 c09530e4) {
        C14360o3.A0B(c09530e4, 0);
        C63622uj c63622uj = this.A01;
        String A00 = A00(c09530e4);
        AbstractC31176DnK.A1V(this.A02, C59062n7.A00(c09530e4, C0eB.A00, A00(c09530e4)), c63622uj, A00);
    }

    public static final String A00(C09530e4 c09530e4) {
        Long l;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("featured_product_pivot_");
        A1C.append(AbstractC37300Gc1.A0V(c09530e4.A00));
        A1C.append('_');
        C38819H7k c38819H7k = ((C38818H7j) c09530e4.A01).A00;
        if (c38819H7k != null) {
            l = c38819H7k.A02;
        } else {
            l = null;
        }
        return AbstractC166997dE.A0v(l, A1C);
    }
}
