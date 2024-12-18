package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3V2, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3V2 {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0014, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(android.content.Context r9) {
        /*
            java.lang.Object r7 = X.C3UY.A00
            X.3Uq r7 = (X.C74123Uq) r7
            java.lang.String r1 = r7.A05
            java.lang.String r0 = r7.A04
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r8 = r0.iterator()
        L14:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r6 = r8.next()
            java.lang.String r6 = (java.lang.String) r6
            X.3UW r1 = X.C3UW.A02
            boolean r0 = X.C3V3.A01(r9, r1, r6)
            if (r0 == 0) goto L14
            r0 = 4160(0x1040, float:5.83E-42)
            X.3UX r2 = r1.A01(r9, r6, r0)
            X.C3V3.A00(r9, r2)
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.C05F.A15
            if (r1 != r0) goto L14
            android.content.pm.PackageInfo r0 = r2.A01
            if (r0 == 0) goto L14
            android.content.pm.PackageInfo r0 = r2.A01
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L14
            android.content.pm.PackageInfo r2 = r2.A01
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            int r1 = r0.flags
            r0 = r1 & 1
            if (r0 != 0) goto L50
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L50
            goto L14
        L50:
            java.lang.String[] r5 = r2.requestedPermissions
            if (r5 == 0) goto L14
            int[] r4 = r2.requestedPermissionsFlags
            if (r4 == 0) goto L14
            java.util.Set r1 = r7.A09
            r2 = 0
            r3 = 0
        L5c:
            int r0 = r5.length
            if (r2 >= r0) goto L7c
            int r0 = r4.length
            if (r2 >= r0) goto L7c
            r0 = r5[r2]
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L79
            r0 = r4[r2]
            r0 = r0 & 2
            if (r0 == 0) goto L14
            int r0 = r1.size()
            int r3 = r3 + 1
            if (r0 != r3) goto L79
            return r6
        L79:
            int r2 = r2 + 1
            goto L5c
        L7c:
            int r0 = r1.size()
            if (r0 != r3) goto L14
            return r6
        L83:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3V2.A00(android.content.Context):java.lang.String");
    }

    public static void A01(Context context, List list, List list2) {
        Iterator it = ((C74123Uq) C3UY.A00).A08.iterator();
        while (it.hasNext()) {
            C3UX A01 = C3UW.A02.A01(context, (String) it.next(), 64);
            C3V3.A00(context, A01);
            if (A01.A02 == C05F.A0Y || A01.A02 == C05F.A0C || A01.A02 == C05F.A15 || A01.A02 == C05F.A0j) {
                list.add(A01.A00);
            }
            if (A01.A02 == C05F.A15) {
                list2.add(A01.A00);
            }
        }
    }

    public static boolean A02(String str) {
        C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
        if (!c74123Uq.A05.equals(str) && !c74123Uq.A04.equals(str)) {
            return false;
        }
        return true;
    }
}
