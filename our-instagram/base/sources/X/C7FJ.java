package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7FJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FJ {
    public static final List A01;
    public static final List A02;
    public final UserSession A00;

    public C7FJ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    static {
        C2EY c2ey = C2EY.A1i;
        C2EY c2ey2 = C2EY.A19;
        C2EY c2ey3 = C2EY.A1u;
        C2EY c2ey4 = C2EY.A1C;
        A01 = AbstractC16960so.A1Q(c2ey, c2ey2, c2ey3, c2ey4);
        A02 = AbstractC16960so.A1Q(c2ey, c2ey4);
    }

    public final boolean A00() {
        return C18U.A06(C06090Tz.A05, this.A00, 36319828297981636L);
    }

    public final boolean A01(C2EY c2ey) {
        if (AbstractC001800i.A0u(A02, c2ey) && !A00()) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36318282109687893L) && C18U.A06(c06090Tz, userSession, 36316907720217300L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.C2EY r5, boolean r6) {
        /*
            r4 = this;
            java.util.List r0 = X.C7FJ.A01
            boolean r0 = X.AbstractC001800i.A0u(r0, r5)
            if (r0 == 0) goto L20
            boolean r0 = r4.A00()
            if (r6 == 0) goto L22
            if (r0 != 0) goto L20
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320871975298009(0x8109a4000523d9, double:3.0328039173663145E-306)
        L19:
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            return r0
        L22:
            if (r0 != 0) goto L20
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316907720151763(0x810609000012d3, double:3.0302969064490544E-306)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7FJ.A02(X.2EY, boolean):boolean");
    }
}
