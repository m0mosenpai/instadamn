package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Arrays;

/* renamed from: X.3bK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76153bK {
    public static final int A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        EnumC75203Zn enumC75203Zn;
        int hashCode;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        if (C76173bM.A04.A01(userSession, c38321qM, c75113Zb, interfaceC60442pS.getModuleName())) {
            enumC75203Zn = c75113Zb.A0l;
        } else {
            enumC75203Zn = null;
        }
        boolean z = false;
        String A34 = c38321qM.A34();
        Boolean valueOf = Boolean.valueOf(c38321qM.A5n());
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null) {
            z = A2B.getReminderEnabled();
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        if (!c75113Zb.A1z) {
            hashCode = Integer.MIN_VALUE;
        } else {
            hashCode = Arrays.hashCode(new Object[]{c38321qM.A3M(), c38321qM.A3I()});
        }
        return Arrays.hashCode(new Object[]{enumC75203Zn, A34, valueOf, valueOf2, Integer.valueOf(hashCode), AbstractC76193bO.A02(userSession, c38321qM, c38321qM), c38321qM.A3j(), c38321qM.A0C.BZ5(), Boolean.valueOf(c38321qM.A5G())});
    }
}
