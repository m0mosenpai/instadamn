package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class Hx3 {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num, Integer num2, String str) {
        Integer num3;
        String str2;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            C18920wW A0H = AbstractC37302Gc3.A0H(interfaceC60442pS, new C12210kP(userSession));
            if (num != null && num2 != null) {
                if (num.intValue() > num2.intValue()) {
                    num3 = C05F.A00;
                } else {
                    num3 = C05F.A01;
                }
            } else {
                num3 = null;
            }
            C82713mZ A0F = AbstractC37301Gc2.A0F(userSession, A0h, interfaceC60442pS, AbstractC111324zv.A00(2570));
            if (num != null) {
                A0F.A08(num.intValue());
            }
            if (num3 != null) {
                if (1 - num3.intValue() != 0) {
                    str2 = "swipe_left";
                } else {
                    str2 = "swipe_right";
                }
                A0F.A7T = str2;
            }
            XN2.A00(A0H, A0F, interfaceC60442pS);
        }
    }
}
