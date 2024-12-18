package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I0I {
    public static final void A00(UserSession userSession, C38321qM c38321qM, EnumC77213d7 enumC77213d7) {
        Integer BqH = c38321qM.A0C.BqH();
        if (BqH != null) {
            int intValue = BqH.intValue();
            Integer BqH2 = c38321qM.A0C.BqH();
            if (BqH2 != null && BqH2.intValue() == 0 && enumC77213d7 == EnumC77213d7.A03) {
                return;
            }
            AbstractC37300Gc1.A0Z();
            int i = intValue - 1;
            if (enumC77213d7 == EnumC77213d7.A04) {
                i = intValue + 1;
            }
            c38321qM.A0C.Ed1(Integer.valueOf(i));
            c38321qM.AEH(userSession);
        }
    }
}
