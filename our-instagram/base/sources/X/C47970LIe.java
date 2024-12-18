package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.LIe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47970LIe {
    public final UserSession A00;
    public final C47661L2u A01;
    public final L7X A02;
    public final C2DS A03;
    public final LAB A04;
    public final L8o A05;
    public final C132515ya A06;

    public final String A02(C2EC c2ec, long j) {
        Object obj;
        String id;
        C14360o3.A0B(c2ec, 1);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A00;
        Long BTC = c08730cb.A01(userSession).BTC();
        if (BTC != null && BTC.longValue() == j) {
            id = userSession.userId;
        } else {
            Iterator it = c2ec.BSH().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Long BTC2 = ((User) obj).BTC();
                    if (BTC2 != null && BTC2.longValue() == j) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                id = user.getId();
            }
            throw AbstractC166997dE.A0g();
        }
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    public /* synthetic */ C47970LIe(UserSession userSession, L7X l7x, C2DS c2ds, LAB lab, L8o l8o, C132515ya c132515ya) {
        C47661L2u c47661L2u = new C47661L2u(userSession, l8o);
        JQ0.A1O(userSession, c2ds, l8o, lab, c132515ya);
        this.A00 = userSession;
        this.A03 = c2ds;
        this.A05 = l8o;
        this.A04 = lab;
        this.A06 = c132515ya;
        this.A02 = l7x;
        this.A01 = c47661L2u;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC24481Hr A00(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r41, X.EnumC46242KdI r42, X.C2EC r43, X.C47970LIe r44, java.lang.String r45, java.lang.String r46, long r47, long r49) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47970LIe.A00(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload, X.KdI, X.2EC, X.LIe, java.lang.String, java.lang.String, long, long):X.1Hr");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r1 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C45984KWy A01(X.C83403nh r6, X.C2EC r7, X.C47970LIe r8) {
        /*
            boolean r0 = r6.A2P
            r5 = 0
            if (r0 == 0) goto L76
            com.instagram.common.session.UserSession r4 = r8.A00
            java.lang.String r1 = r4.userId
            java.lang.String r0 = r6.A0h()
            r3 = 0
            X.C14360o3.A0B(r1, r3)
            boolean r0 = X.C4GQ.A0A(r7, r1, r0)
            if (r0 == 0) goto L76
            java.lang.String r2 = r6.A0g()
            if (r2 == 0) goto L24
            X.L8o r1 = r8.A05
            r0 = 7027(0x1b73, float:9.847E-42)
            r1.A00(r2, r5, r0, r3)
        L24:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318861932894868(0x8107d000281a94, double:3.031532758456777E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L76
            java.lang.String r0 = r4.userId
            X.3jT r1 = r7.Av3(r0)
            X.3nh r0 = r7.BM6()
            if (r0 == 0) goto L95
            java.lang.String r2 = r0.A0h()
        L41:
            if (r1 == 0) goto L93
            X.3kf r0 = r1.A02
            if (r0 == 0) goto L93
            java.lang.String r1 = r0.A01
        L49:
            if (r2 == 0) goto L8f
            if (r1 == 0) goto L53
            int r0 = r1.compareTo(r2)
            if (r0 > 0) goto L8f
        L53:
            long r2 = X.C4H6.A00(r2)
            r0 = 1
            long r2 = r2 + r0
            java.lang.String r0 = r6.A0h()
            java.lang.String r0 = X.C4H6.A03(r0)
            if (r0 == 0) goto L97
            java.lang.String r4 = X.C4H6.A04(r0, r2)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            r6.A1F(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A1B(r0)
        L76:
            com.instagram.common.session.UserSession r1 = r8.A00
            com.instagram.model.direct.DirectThreadKey r0 = r7.BKb()
            X.3oE r0 = X.AbstractC83823oR.A00(r0)
            if (r0 == 0) goto L86
            X.3oE r5 = X.AbstractC1345466e.A02(r0)
        L86:
            r6.A12(r1, r5)
            X.KWy r0 = new X.KWy
            r0.<init>(r6, r7)
            return r0
        L8f:
            r2 = r1
            if (r1 == 0) goto L76
            goto L53
        L93:
            r1 = r5
            goto L49
        L95:
            r2 = r5
            goto L41
        L97:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47970LIe.A01(X.3nh, X.2EC, X.LIe):X.KWy");
    }
}
