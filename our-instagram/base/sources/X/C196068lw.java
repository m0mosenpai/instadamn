package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.8lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196068lw {
    public static final C196058lv A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C196058lv) userSession.A01(C196058lv.class, new C206959Ea(userSession, 25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r1 == 0) goto L23;
     */
    @kotlin.Deprecated(message = "Linkage Cache won't refresh with Service Cache and might be stale.", replaceWith = @kotlin.ReplaceWith(expression = "isDestinationValid", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(com.facebook.common.callercontext.CallerContext r11, com.instagram.common.session.UserSession r12) {
        /*
            r10 = this;
            r3 = 0
            X.C14360o3.A0B(r12, r3)
            r2 = 1
            X.8lv r1 = A00(r12)
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.Integer r0 = X.AbstractC196078lx.A00(r0)
            int r0 = r0.intValue()
            r5 = r11
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L1a
            r0 = 0
        L19:
            return r0
        L1a:
            X.0do r0 = r1.A04
            java.lang.Object r4 = r0.getValue()
            X.8ly r4 = (X.C196088ly) r4
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330363852702539(0x8112460000434b, double:3.038806618857662E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L40
            X.5xZ r0 = r4.A00(r11)
            java.lang.String r0 = r0.A03
            int r1 = r0.length()
            r0 = 0
            if (r1 <= 0) goto L19
            r0 = 1
            return r0
        L40:
            X.0do r0 = r4.A01
            java.lang.Object r1 = r0.getValue()
            X.2Ne r1 = (X.C2Ne) r1
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check"
            boolean r0 = r1.A03(r11, r0)
            return r0
        L4f:
            X.0do r0 = r1.A03
            java.lang.Object r2 = r0.getValue()
            X.A7F r2 = (X.A7F) r2
            java.lang.String r7 = r11.A02
            X.C14360o3.A07(r7)
            java.lang.String r6 = "ig_android_ig_to_fb_crossposting"
            java.lang.String r8 = "crossposting"
            java.lang.String r9 = "loading"
            X.9CN r4 = new X.9CN
            r4.<init>(r5, r6, r7, r8, r9)
            X.0do r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.97Q r0 = (X.C97Q) r0
            java.lang.Object r0 = r0.AuS(r4)
            X.DuI r0 = (X.C31590DuI) r0
            if (r0 == 0) goto L8a
            X.9Im r1 = r0.A00
            if (r1 == 0) goto L8a
            com.instagram.common.session.UserSession r0 = r2.A00
            java.lang.String r0 = r1.A00(r4, r0)
            if (r0 == 0) goto L8a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L8b
        L8a:
            r0 = 1
        L8b:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196068lw.A04(com.facebook.common.callercontext.CallerContext, com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A01(C131995xZ c131995xZ) {
        Object obj;
        Iterator it = c131995xZ.A06.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C8m8) obj).A01, "story")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C8m8 c8m8 = (C8m8) obj;
        if (c8m8 == null) {
            C0K8.A0C("CrosspostingAccountLinkingManager", "(isDestinationEligibleForStory) storyToXpostEligibility==null");
            return true;
        }
        return c8m8.A02;
    }

    public static final boolean A02(C131995xZ c131995xZ) {
        if (c131995xZ.A02 != C05F.A0N) {
            return false;
        }
        return true;
    }

    public static final boolean A03(C131995xZ c131995xZ) {
        if (c131995xZ.A03.length() <= 0) {
            return false;
        }
        return true;
    }
}
