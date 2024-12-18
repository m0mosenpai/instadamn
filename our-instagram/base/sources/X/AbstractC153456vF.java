package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.6vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153456vF {
    public static boolean A00;
    public static final HashSet A01 = new HashSet();
    public static final HashSet A02 = new HashSet();

    public static final void A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        HashSet hashSet = A01;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = (C38321qM) it.next();
            C14360o3.A0B(c38321qM, 1);
            C3YS.A00(userSession).A02(c38321qM, false);
            AbstractC25651Mw.A00(userSession).E4s(new C42251Inb(c38321qM));
        }
        HashSet hashSet2 = A02;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            A01(userSession, (C38321qM) it2.next(), false);
        }
        hashSet.clear();
        hashSet2.clear();
    }

    public static final void A01(UserSession userSession, C38321qM c38321qM, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C3YS.A00(userSession).A02(c38321qM, true);
        C3YS.A00(userSession).A01(c38321qM, 15);
        AbstractC25651Mw.A00(userSession).E4s(new C42251Inb(c38321qM));
        if (z) {
            A01.add(c38321qM);
            HashSet hashSet = A02;
            if (hashSet.contains(c38321qM)) {
                hashSet.remove(c38321qM);
            }
        }
    }

    public static final boolean A02(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if ((C18U.A06(c06090Tz, userSession, 36315627819896266L) || C18U.A06(c06090Tz, userSession, 36315627820027340L)) && A00) {
            return true;
        }
        return false;
    }
}
