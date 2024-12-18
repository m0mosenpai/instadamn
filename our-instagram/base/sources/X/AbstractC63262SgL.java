package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.SgL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63262SgL {
    public static List A00;
    public static Boolean A01;

    public static void A01(Intent intent, String str) {
        if (str == null) {
            return;
        }
        try {
            android.net.Uri A03 = AbstractC08820cl.A03(str);
            String scheme = A03.getScheme();
            String authority = A03.getAuthority();
            if (scheme != null && authority != null) {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("Referer", AnonymousClass001.A0g(scheme, "://", authority));
                intent.putExtra("com.android.browser.headers", A0b);
            }
        } catch (NullPointerException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r0 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(android.content.Context r3) {
        /*
            java.lang.Boolean r0 = X.AbstractC63262SgL.A01
            if (r0 == 0) goto L9
            boolean r1 = r0.booleanValue()
            return r1
        L9:
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L1f
            android.app.Activity r3 = (android.app.Activity) r3
            r2 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L53
            android.content.ComponentName r0 = r3.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L53
            android.content.pm.ActivityInfo r0 = r1.getActivityInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L53
            java.lang.String r1 = r0.processName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L53
            goto L47
        L1f:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            int r3 = android.os.Process.myPid()
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L5c
            java.util.Iterator r2 = r0.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r1 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r0 = r1.pid
            if (r0 != r3) goto L35
            java.lang.String r1 = r1.processName
        L47:
            if (r1 == 0) goto L5c
            java.lang.String r0 = ":browser"
            boolean r0 = r1.endsWith(r0)
            r1 = 1
            if (r0 != 0) goto L5d
            goto L5c
        L53:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = "BrowserContextHelper"
            java.lang.String r0 = "Y U can't find the activity info!"
            X.AbstractC63254SgB.A02(r1, r0, r2)
        L5c:
            r1 = 0
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.AbstractC63262SgL.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63262SgL.A02(android.content.Context):boolean");
    }

    static {
        LinkedList A11 = AbstractC58318PtA.A11();
        A00 = A11;
        A11.add(new Object());
        A11.add(new Object());
        A11.add(new Object());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r7 != null) goto L36;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.A6V, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.A6V A00(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r5 = 0
            if (r0 == 0) goto L11
            r1 = r5
        L8:
            X.A6V r3 = new X.A6V
            r3.<init>()
            if (r1 == 0) goto L99
            r4 = 0
            goto L28
        L11:
            android.content.Intent r1 = X.AbstractC07860b5.A00(r8)     // Catch: java.net.URISyntaxException -> L26
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r0)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r1.addCategory(r0)
            r1.setComponent(r5)
            r1.setSelector(r5)
            goto L8
        L26:
            r1 = r5
            goto L8
        L28:
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.Exception -> L33 java.lang.Exception -> L83
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r4)     // Catch: java.lang.Exception -> L33 java.lang.Exception -> L83
            if (r0 == 0) goto L3f
            goto L77
        L33:
            r0 = move-exception
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Exception -> L83
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "BrowserContextHelper"
            X.AbstractC63254SgB.A02(r0, r6, r2)     // Catch: java.lang.Exception -> L83
        L3f:
            java.lang.String r6 = r1.getPackage()     // Catch: java.lang.Exception -> L83
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L75
            java.util.List r0 = X.AbstractC63262SgL.A00     // Catch: java.lang.Exception -> L83
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L83
        L4f:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L99
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L83
            X.TmB r0 = (X.InterfaceC65539TmB) r0     // Catch: java.lang.Exception -> L83
            android.os.Bundle r1 = r0.ALk(r5, r6, r9)     // Catch: java.lang.Exception -> L83
            boolean r0 = r0.F8o(r7, r1)     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L4f
            r2 = 1
            r3.A01 = r2     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "package_names"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)     // Catch: java.lang.Exception -> L83
            java.util.ArrayList r0 = X.C58889QEz.A00     // Catch: java.lang.Exception -> L83
            if (r1 != r0) goto L99
            r3.A00 = r2     // Catch: java.lang.Exception -> L83
            return r3
        L75:
            if (r7 == 0) goto L99
        L77:
            java.lang.String r0 = X.AbstractC61546RpQ.A00     // Catch: java.lang.Exception -> L83 android.content.ActivityNotFoundException -> L99
            A01(r1, r0)     // Catch: java.lang.Exception -> L83 android.content.ActivityNotFoundException -> L99
            X.AbstractC07840b2.A01(r7, r1)     // Catch: java.lang.Exception -> L83 android.content.ActivityNotFoundException -> L99
            r0 = 1
            r3.A01 = r0     // Catch: java.lang.Exception -> L83
            return r3
        L83:
            r0 = move-exception
            java.lang.String r2 = "url passed in: "
            java.lang.String r1 = "\n"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = X.AnonymousClass001.A0u(r2, r8, r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "BrowserContextHelper"
            X.AbstractC63254SgB.A02(r0, r2, r1)
            return r3
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63262SgL.A00(android.content.Context, java.lang.String, boolean):X.A6V");
    }
}
