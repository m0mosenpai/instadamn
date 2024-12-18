package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VPY {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4) {
        Long l;
        C18920wW A0H = AbstractC37302Gc3.A0H(interfaceC60442pS, new C12210kP(userSession));
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            Long l2 = null;
            C82713mZ A02 = AbstractC82703mY.A02(userSession, A0h, interfaceC60442pS, null, null, -1, AbstractC111324zv.A00(2567));
            if (A02 != null) {
                A02.A4c = str2;
                if (str3 != null) {
                    C38801rC c38801rC = C38321qM.A0h;
                    l = AbstractC25231BEo.A0j(0, C38801rC.A06(str3));
                } else {
                    l = null;
                }
                if (str4 != null) {
                    C38801rC c38801rC2 = C38321qM.A0h;
                    l2 = AbstractC25231BEo.A0j(0, C38801rC.A06(str4));
                }
                AbstractC72637Xiw.A00(A0H, A02, interfaceC60442pS, l, l2);
            }
        }
    }
}
