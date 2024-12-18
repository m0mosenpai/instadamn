package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125565m2 {
    public static final C4I3 A00(C2EB c2eb) {
        int ordinal;
        if (c2eb == null || ((ordinal = c2eb.ordinal()) != 1 && ordinal != 6 && ordinal != 7)) {
            return C4I3.A03;
        }
        return C4I3.A0M;
    }

    public static final boolean A01(UserSession userSession, C2EC c2ec, Integer num) {
        List Axh;
        boolean z = false;
        if (System.currentTimeMillis() - TimeUnit.MILLISECONDS.convert(c2ec.BLF(), TimeUnit.MICROSECONDS) < C4GQ.A00) {
            z = true;
        }
        if ((z || C2E9.A06(userSession)) && (Axh = c2ec.Axh()) != null) {
            if ((Axh instanceof Collection) && Axh.isEmpty()) {
                return false;
            }
            Iterator it = Axh.iterator();
            while (it.hasNext()) {
                if (((C206419By) it.next()).A01 == num) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
