package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FW5 {
    public static final User A00(AbstractC12990ll abstractC12990ll, C5HW c5hw) {
        UserSession userSession;
        C14360o3.A0B(abstractC12990ll, 0);
        if (!(abstractC12990ll instanceof UserSession) || (userSession = (UserSession) abstractC12990ll) == null) {
            return null;
        }
        C18A A00 = AnonymousClass189.A00(userSession);
        String str = c5hw.A04.A0f;
        if (str == null) {
            return null;
        }
        User A02 = A00.A02(str);
        if (A02 != null) {
            A01(c5hw, A02, A00);
            return A02;
        }
        C5HX c5hx = c5hw.A04;
        String str2 = c5hx.A0h;
        if (str2 == null || c5hx.A0E == null) {
            return null;
        }
        User user = new User(c5hx.A0f, str2);
        A01(c5hw, user, A00);
        return user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5HW r3, com.instagram.user.model.User r4, X.C18A r5) {
        /*
            X.5HX r0 = r3.A04
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0E
            r4.A0i(r0)
            X.5HX r0 = r3.A04
            X.Mte r0 = r0.A0A
            if (r0 == 0) goto L18
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.A00
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            r2 = 1
            if (r0 == 0) goto L1f
            r4.A1B(r2)
        L1f:
            java.lang.String r1 = "remove_follower"
            X.5HX r0 = r3.A04
            java.util.List r0 = r0.A0t
            if (r0 == 0) goto L30
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L30
            r4.A10(r2)
        L30:
            r0 = 0
            r5.A01(r4, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FW5.A01(X.5HW, com.instagram.user.model.User, X.18A):void");
    }
}
