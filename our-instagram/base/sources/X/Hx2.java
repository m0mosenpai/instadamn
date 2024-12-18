package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class Hx2 {
    public static final void A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, boolean z) {
        String str;
        C14360o3.A0B(userSession, 1);
        C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, c38321qM, interfaceC60442pS, "hide_response");
        InterfaceC39541sb A0F2 = AbstractC37300Gc1.A0F(c38321qM);
        if (A0F2 != null) {
            str = A0F2.AZE();
        } else {
            str = null;
        }
        A0F.A4T = str;
        A0F.A61 = c38321qM.getId();
        A0F.A74 = interfaceC60442pS.getModuleName();
        A0F.A1C = true;
        A0F.A1d = Boolean.valueOf(z);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_ad_hide_undo");
        C11520jB A01 = A0F.A01();
        if (A0f.isSampled()) {
            A0f.AAP("a_pk", String.valueOf(A01.A01(C5I8.A0Z)));
            A0f.AAP("ad_id", AbstractC37300Gc1.A0R(C5I8.A0B, A01));
            A0f.A7v(AbstractC111324zv.A00(2618), (Boolean) A01.A01(C5I8.A4T));
            AbstractC37300Gc1.A0l(A0f, AbstractC37300Gc1.A0R(C5I8.A5K, A01));
            AbstractC37300Gc1.A0o(A0f, AbstractC37300Gc1.A0R(C5I8.A9R, A01));
            A0f.A9K("carousel_index", (Long) A01.A01(C5I8.A0z));
            A0f.Cht();
        }
    }
}
