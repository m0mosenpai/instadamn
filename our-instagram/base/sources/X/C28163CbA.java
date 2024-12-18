package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.CbA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28163CbA {
    public final UserSession A00;

    public C28163CbA(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final BQO A00(C38321qM c38321qM, C75113Zb c75113Zb, C28163CbA c28163CbA) {
        EnumC906041v enumC906041v;
        String A02;
        int i = c75113Zb.A02;
        UserSession userSession = c28163CbA.A00;
        AndroidLink A022 = AbstractC905941u.A02(AbstractC166987dD.A0O(AbstractC25225BEi.A0F(userSession)), userSession, c38321qM, i, false);
        if (A022 != null) {
            enumC906041v = AbstractC114965Hm.A01(A022);
        } else {
            enumC906041v = null;
        }
        if (enumC906041v == EnumC906041v.AD_DESTINATION_DIRECT_MESSAGE || (A02 = C87153uY.A02(c38321qM)) == null) {
            return null;
        }
        return new BQO(A02);
    }
}
