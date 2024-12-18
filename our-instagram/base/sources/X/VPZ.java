package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public abstract class VPZ {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        Long l;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            C18920wW A0H = AbstractC37302Gc3.A0H(interfaceC60442pS, new C12210kP(userSession));
            Long l2 = null;
            C82713mZ A02 = AbstractC82703mY.A02(userSession, A0h, interfaceC60442pS, null, null, -1, AbstractC111324zv.A00(2568));
            if (A02 != null) {
                User CDj = A0h.A0C.CDj();
                if (CDj != null) {
                    A02.A5P = AbstractC38851rI.A06(CDj.B7L());
                }
                if (str2 != null) {
                    l = AbstractC25231BEo.A0j(0, C38801rC.A06(str2));
                } else {
                    l = null;
                }
                if (str3 != null) {
                    l2 = AbstractC25231BEo.A0j(0, C38801rC.A06(str3));
                }
                AbstractC72638Xix.A00(A0H, A02, interfaceC60442pS, l, l2);
            }
        }
    }
}
