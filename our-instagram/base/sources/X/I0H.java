package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I0H {
    public static final void A00(UserSession userSession, EnumC77173d3 enumC77173d3, EnumC77173d3 enumC77173d32, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        AbstractC37300Gc1.A0Z();
        if (enumC77173d3 != enumC77173d32) {
            c38321qM.A4C(enumC77173d32);
            EnumC77173d3 enumC77173d33 = EnumC77173d3.A02;
            int A0w = c38321qM.A0w();
            int i = A0w - 1;
            if (enumC77173d32 == enumC77173d33) {
                i = A0w + 1;
            }
            c38321qM.A42(i);
            c38321qM.AEH(userSession);
        }
    }
}
