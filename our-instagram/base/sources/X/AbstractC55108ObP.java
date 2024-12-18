package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ObP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55108ObP {
    public static final boolean A01(UserSession userSession, AnonymousClass841 anonymousClass841, EnumC40111tc enumC40111tc, String str, ArrayList arrayList) {
        int ordinal;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1E(arrayList, 2, anonymousClass841);
        if (enumC40111tc == null) {
            C0w9.A03(str, "MediaType is null");
            ordinal = -1;
        } else {
            ordinal = enumC40111tc.ordinal();
        }
        if (ordinal != 0 && ordinal != 1) {
            if (!anonymousClass841.CPp()) {
                return false;
            }
            if (!anonymousClass841.CLX() && !anonymousClass841.CMB()) {
                return false;
            }
        }
        if (!AbstractC199308rX.A01(userSession) && !AbstractC199308rX.A04(userSession) && !AbstractC25226BEj.A1b(arrayList) && !AbstractC55229Oez.A0I(userSession, anonymousClass841, true)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, AnonymousClass841 anonymousClass841, C47Z c47z, C55099ObA c55099ObA) {
        C14360o3.A0B(userSession, 0);
        if (!AbstractC199308rX.A03(userSession) && A03(userSession, anonymousClass841, c47z, c55099ObA)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r8.A04() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.common.session.UserSession r5, X.AnonymousClass841 r6, X.C47Z r7, X.C55099ObA r8) {
        /*
            r4 = 1
            if (r7 == 0) goto L28
            X.H2v r0 = r7.A0v
            if (r0 == 0) goto L28
            java.lang.Integer r0 = r0.A00
        L9:
            r3 = 0
            boolean r2 = X.AbstractC167007dF.A1W(r0)
            boolean r0 = r8.A05()
            if (r0 == 0) goto L1b
            boolean r1 = r8.A04()
            r0 = 1
            if (r1 != 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r2 != 0) goto L27
            if (r0 != 0) goto L26
            boolean r0 = X.AbstractC55229Oez.A0I(r5, r6, r4)
            if (r0 == 0) goto L27
        L26:
            r3 = 1
        L27:
            return r3
        L28:
            r0 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55108ObP.A03(com.instagram.common.session.UserSession, X.841, X.47Z, X.ObA):boolean");
    }

    public static final List A00(List list) {
        String A00;
        Long A0j;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = AbstractC38048Gob.A01(((ProductTag) it.next()).A02).A0B;
            if (user != null && (A00 = AbstractC76433bn.A00(user)) != null && (A0j = AbstractC166997dE.A0j(A00)) != null) {
                A1E.add(A0j);
            }
        }
        return A1E;
    }
}
