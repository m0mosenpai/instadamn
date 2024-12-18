package X;

import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.6PX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6PX {
    public static Boolean A00;
    public static Boolean A01;
    public static final String[] A02 = {"SM-J500M", "SM-J500F"};

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (X.C15900qk.A00(r4, true) <= 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.content.Context r4) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            java.lang.Boolean r0 = X.C6PX.A00
            if (r0 == 0) goto Ld
            boolean r1 = r0.booleanValue()
            return r1
        Ld:
            X.0xy r0 = X.C17280tP.A4E
            X.0tP r3 = r0.A00()
            X.0ry r2 = r3.A0w
            X.0YR[] r1 = X.C17280tP.A4G
            r0 = 106(0x6a, float:1.49E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CES(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            int r1 = X.C04100Kb.A00(r4)
            r0 = 2008(0x7d8, float:2.814E-42)
            if (r1 < r0) goto L33
            r0 = 2010(0x7da, float:2.817E-42)
            if (r1 < r0) goto L43
        L33:
            X.C15900qk.A01()
            r0 = 1
            long r3 = X.C15900qk.A00(r4, r0)
            r1 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L44
        L43:
            r1 = 0
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C6PX.A00 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6PX.A00(android.content.Context):boolean");
    }

    public static final boolean A01(UserSession userSession) {
        boolean z;
        C14360o3.A0B(userSession, 0);
        Boolean bool = A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (A00(userSession.deviceSession.A06())) {
            String str = Build.MODEL;
            if (str != null && str.length() != 0) {
                String[] strArr = A02;
                int i = 0;
                while (!str.equalsIgnoreCase(strArr[i])) {
                    i++;
                    if (i < 2) {
                    }
                }
            }
            z = true;
            A01 = Boolean.valueOf(z);
            return z;
        }
        z = false;
        A01 = Boolean.valueOf(z);
        return z;
    }
}
