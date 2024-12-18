package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Cfo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28385Cfo {
    public static final EnumC27398C7b A00(UserSession userSession) {
        Object obj;
        String A04 = C18U.A04(AbstractC25228BEl.A0l(userSession), userSession, 36882159779578298L);
        Iterator<E> it = EnumC27398C7b.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((EnumC27398C7b) obj).A00, A04)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC27398C7b enumC27398C7b = (EnumC27398C7b) obj;
        if (enumC27398C7b == null) {
            return EnumC27398C7b.A09;
        }
        return enumC27398C7b;
    }

    public static final C7O A01(UserSession userSession) {
        Object obj;
        String A04 = C18U.A04(AbstractC25228BEl.A0l(userSession), userSession, 36882159779447225L);
        Iterator<E> it = C7O.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C7O) obj).A00, A04)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C7O c7o = (C7O) obj;
        if (c7o == null) {
            return C7O.A04;
        }
        return c7o;
    }

    public static final C7P A02(UserSession userSession) {
        Object obj;
        String A04 = C18U.A04(AbstractC25228BEl.A0l(userSession), userSession, 36882159777808821L);
        Iterator<E> it = C7P.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C7P) obj).A00, A04)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C7P c7p = (C7P) obj;
        if (c7p == null) {
            return C7P.A03;
        }
        return c7p;
    }

    public static final boolean A03(UserSession userSession) {
        return C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36319209825639494L);
    }
}
