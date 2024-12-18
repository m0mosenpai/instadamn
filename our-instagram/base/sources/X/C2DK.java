package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2DK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DK {
    public final Context A00;
    public final UserSession A01;
    public final C2DM A02;

    public C2DK(Context context, UserSession userSession, C2DM c2dm) {
        C14360o3.A0B(c2dm, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = c2dm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A01, 36316254885449927L) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00() {
        /*
            r4 = this;
            android.content.Context r3 = r4.A00
            boolean r0 = X.AbstractC14480oK.A01(r3)
            if (r0 == 0) goto L3b
            boolean r0 = X.AbstractC47112Ed.A03(r3)
            if (r0 == 0) goto L2c
            r2 = 0
            X.2Ee r0 = X.EnumC47122Ee.A09
            r1 = 1
            java.lang.Boolean r0 = X.AbstractC47112Ed.A00(r3, r0, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L2c
            X.2Ee r0 = X.EnumC47122Ee.A08
            java.lang.Boolean r0 = X.AbstractC47112Ed.A00(r3, r0, r2)
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 != 0) goto L4b
        L2c:
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316254885449927(0x810571000510c7, double:3.029884051154859E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4b
        L3b:
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342153319864074251(0x208100090000000b, double:4.057370133684338E-152)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L4c
        L4b:
            r0 = 0
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DK.A00():boolean");
    }

    public final boolean A01(String str) {
        if (A00()) {
            long currentTimeMillis = System.currentTimeMillis();
            UserSession userSession = this.A01;
            if ((currentTimeMillis >= AbstractC23021Ah.A00(userSession).A01.getLong("direct_message_mute_all_timestamp", -1L) || !C18U.A06(C06090Tz.A05, userSession, 36316254885318854L)) && str != null && this.A02.A00(str)) {
                return true;
            }
        }
        return false;
    }
}
