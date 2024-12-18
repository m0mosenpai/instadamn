package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;

/* renamed from: X.5cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120485cs {
    public static final int A00(UserSession userSession, InterfaceC62242sP interfaceC62242sP, C101484hA c101484hA, int i) {
        int i2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC62242sP, 1);
        C14360o3.A0B(c101484hA, 3);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36321426027390384L);
        long A01 = C18U.A01(c06090Tz, userSession, 36602901004161897L);
        if (A06) {
            Collection collection = c101484hA.A00;
            if (!collection.isEmpty()) {
                int i3 = 0;
                Object obj = null;
                for (Object obj2 : collection) {
                    if (obj != null && interfaceC62242sP.AZN(obj) >= 0 && interfaceC62242sP.ACU(obj, obj2)) {
                        i2 = 1;
                    } else {
                        i2 = (int) A01;
                    }
                    i3 += i2;
                    obj = obj2;
                }
                return i - i3;
            }
            return i;
        }
        return i;
    }
}
