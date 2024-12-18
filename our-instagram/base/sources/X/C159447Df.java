package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7Df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159447Df {
    public final UserSession A00;
    public final HashSet A01;

    public C159447Df(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new HashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x007b, code lost:
    
        if (r3 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.util.List r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159447Df.A01(java.util.List):void");
    }

    public static final List A00(UserSession userSession, C83403nh c83403nh) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322864839797452L);
        if (C4GU.A01(c83403nh.A1F) && A06) {
            return null;
        }
        C2EY c2ey = c83403nh.A10;
        C2EY c2ey2 = C2EY.A1r;
        if (c2ey == c2ey2) {
            if (c83403nh.A1S() && A06) {
                return null;
            }
            Object obj = c83403nh.A1T;
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.model.GenericFBAttachment>");
            return (List) obj;
        }
        AnonymousClass442 A0P = c83403nh.A0P();
        if (A0P == null || A0P.A0F != c2ey2 || (A0P.A05() && A06)) {
            return null;
        }
        return A0P.A01();
    }
}
