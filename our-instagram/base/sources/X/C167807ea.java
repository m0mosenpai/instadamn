package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167807ea {
    public static final C167807ea A00 = new Object();

    public static final Integer A00(C166047bW c166047bW, boolean z, boolean z2) {
        if (z2) {
            return C05F.A0N;
        }
        if (!z) {
            return C05F.A0C;
        }
        if (c166047bW == null) {
            return C05F.A00;
        }
        if (c166047bW.A0T) {
            return C05F.A01;
        }
        int ordinal = c166047bW.A05.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return C05F.A0u;
            }
            return C05F.A0j;
        }
        return C05F.A0Y;
    }

    public static final boolean A01(User user, String str, List list, boolean z, boolean z2) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C167297di c167297di = (C167297di) it.next();
                if (c167297di.A0H != C05F.A00) {
                    return false;
                }
                if ((!C14360o3.A0K(user, c167297di.A0C) && !z && !z2) || C14360o3.A0K(c167297di.A0K, str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x020e, code lost:
    
        if (r13 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r37.A0d != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019b, code lost:
    
        if (X.C18U.A06(r9, r39, 36322967919667996L) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
    
        if (X.C18U.A06(r9, r39, 36322967919667996L) == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A02(X.C167297di r36, X.C166047bW r37, X.C166007bS r38, com.instagram.common.session.UserSession r39, com.instagram.user.model.User r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167807ea.A02(X.7di, X.7bW, X.7bS, com.instagram.common.session.UserSession, com.instagram.user.model.User, boolean, boolean, boolean, boolean, boolean, boolean):java.util.ArrayList");
    }

    public final boolean A03(UserSession userSession, List list, boolean z) {
        if (z) {
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!C2TN.A04(userSession, ((C167297di) it.next()).A0C)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
