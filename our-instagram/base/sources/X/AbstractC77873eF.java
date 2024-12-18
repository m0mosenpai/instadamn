package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3eF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77873eF {
    public static final C51722Yv A00(C51722Yv c51722Yv, UserSession userSession, InterfaceC75403a7 interfaceC75403a7, EnumC65592xv enumC65592xv, C76623c7 c76623c7, C75113Zb c75113Zb, boolean z) {
        C14360o3.A0B(c51722Yv, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC75403a7, 2);
        C14360o3.A0B(c76623c7, 3);
        C14360o3.A0B(c75113Zb, 4);
        C14360o3.A0B(enumC65592xv, 5);
        C65502xm A00 = AbstractC65492xl.A00(userSession);
        if (z || A00.A0V) {
            C9CV c9cv = new C9CV(C05F.A00, new C77843eC(C123995jD.A00, new C206259Bi(interfaceC75403a7, enumC65592xv, c76623c7, c75113Zb)), 2);
            if (c51722Yv == C51722Yv.A02) {
                c51722Yv = null;
            }
            return new C51722Yv(c51722Yv, c9cv);
        }
        return c51722Yv;
    }
}
