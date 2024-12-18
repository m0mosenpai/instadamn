package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.77X, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C77X {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r0 != false) goto L24;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(android.app.Activity r5, X.C83403nh r6) {
        /*
            r4 = 1
            r3 = 0
            r2 = 0
            if (r6 == 0) goto L10
            X.2EY r1 = r6.A10
            X.F1u r0 = X.AbstractC34066F1u.$redex_init_class
            int r0 = r1.ordinal()
            switch(r0) {
                case 2: goto L50;
                case 3: goto L1f;
                case 5: goto L48;
                case 11: goto L50;
                case 12: goto L37;
                case 14: goto L11;
                case 42: goto L48;
                case 43: goto L48;
                case 57: goto L15;
                case 80: goto L48;
                case 81: goto L48;
                case 82: goto L48;
                case 98: goto L50;
                default: goto L10;
            }
        L10:
            return r2
        L11:
            r1 = 2131954280(0x7f130a68, float:1.9545055E38)
            goto L4b
        L15:
            boolean r0 = r6.A1a()
            if (r0 == 0) goto L10
            r1 = 2131954276(0x7f130a64, float:1.9545047E38)
            goto L4b
        L1f:
            X.1qM r0 = r6.A0s
            if (r0 == 0) goto L10
            X.1tc r0 = r0.BRp()
            int r0 = r0.ordinal()
            if (r0 == r3) goto L33
            if (r0 != r4) goto L10
            r1 = 2131954279(0x7f130a67, float:1.9545053E38)
            goto L4b
        L33:
            r1 = 2131954277(0x7f130a65, float:1.9545049E38)
            goto L4b
        L37:
            java.lang.Object r1 = r6.A1T
            boolean r0 = r1 instanceof com.instagram.model.direct.gifs.DirectAnimatedMedia
            if (r0 == 0) goto L10
            com.instagram.model.direct.gifs.DirectAnimatedMedia r1 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r1
            if (r1 == 0) goto L10
            boolean r0 = r1.A06
            r1 = 2131954275(0x7f130a63, float:1.9545045E38)
            if (r0 == 0) goto L4b
        L48:
            r1 = 2131954278(0x7f130a66, float:1.954505E38)
        L4b:
            java.lang.String r2 = r5.getString(r1)
            return r2
        L50:
            java.lang.String r2 = r6.A1q
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77X.A00(android.app.Activity, X.3nh):java.lang.String");
    }

    public static final boolean A01(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        if (c83403nh.A10 == C2EY.A1i) {
            return true;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36319377331133796L) && c83403nh.A2L) {
            return true;
        }
        return false;
    }
}
