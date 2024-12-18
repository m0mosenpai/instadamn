package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public abstract class BNP {
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.BeZ] */
    public static final boolean A00(C120985dq c120985dq, UserSession userSession) {
        String A0s;
        boolean CdW;
        C38321qM c38321qM;
        if (A01(userSession)) {
            return false;
        }
        boolean z = false;
        if (c120985dq.CdW() && !c120985dq.A0F() && !c120985dq.A0G() && (c38321qM = c120985dq.A02) != null && c38321qM.Cff()) {
            z = true;
        }
        boolean z2 = z;
        if (C18U.A06(C06090Tz.A06, userSession, 2342165865463818940L)) {
            z = false;
            if (c120985dq.CdW() && c120985dq.A06().A0t) {
                CdW = true;
                if (z2) {
                    z = true;
                }
            } else {
                CdW = false;
            }
            A0s = AbstractC25231BEo.A0s(c120985dq.A02);
        } else {
            A0s = AbstractC25231BEo.A0s(c120985dq.A02);
            CdW = c120985dq.CdW();
        }
        Boolean valueOf = Boolean.valueOf(CdW);
        boolean z3 = !z;
        Boolean valueOf2 = Boolean.valueOf(z3);
        if (A0s != null) {
            ConcurrentHashMap concurrentHashMap = CKI.A00(userSession).A00;
            C25985BeZ c25985BeZ = (C25985BeZ) concurrentHashMap.get(A0s);
            C25985BeZ c25985BeZ2 = c25985BeZ;
            if (c25985BeZ == null) {
                ?? obj = new Object();
                obj.A02 = false;
                obj.A01 = false;
                obj.A00 = null;
                c25985BeZ2 = obj;
            }
            if (valueOf != null) {
                c25985BeZ2.A01 = valueOf.booleanValue();
            }
            if (valueOf2 != null) {
                c25985BeZ2.A02 = z3;
            }
            concurrentHashMap.put(A0s, c25985BeZ2);
        }
        return z;
    }

    public static final boolean A01(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36322856249862842L)) {
            if (!C18U.A06(c06090Tz, userSession, 36322856250256062L) && !BT8.A00(userSession) && !C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250583743L) && !C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250780353L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
