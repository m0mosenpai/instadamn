package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.3VC, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3VC {
    /* JADX WARN: Can't wrap try/catch for region: R(11:8|9|10|(2:12|(7:14|15|16|17|(2:19|(2:20|(2:22|(1:36)(3:27|28|(2:30|(2:32|(1:34)(0))(0))(0)))(1:38)))(0)|39|40))|45|15|16|17|(0)(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        X.C0K8.A0G("RtiGracefulSystemMethodHelper", "Failed to getRunningServices", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r8) {
        /*
            java.lang.String r0 = r8.getPackageName()
            java.lang.String r5 = com.facebook.rti.push.service.FbnsServiceDelegate.A00(r0)
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r8, r5)
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            int r0 = r0.getComponentEnabledSetting(r1)     // Catch: java.lang.Exception -> Lb3
            r4 = 1
            if (r0 == r4) goto L1a
            if (r0 != 0) goto Lb3
        L1a:
            java.lang.String r7 = r8.getPackageName()
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r8.getSystemService(r0)     // Catch: java.lang.Exception -> L2f
            if (r1 == 0) goto L2f
            boolean r0 = r2.isInstance(r1)     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r1 = 0
        L30:
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r0 = r1.getRunningServices(r0)     // Catch: java.lang.NullPointerException -> L9b
            if (r0 == 0) goto La3
            java.util.Iterator r6 = r0.iterator()
        L3f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r3 = r6.next()
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3
            android.content.ComponentName r0 = r3.service
            java.lang.String r2 = r0.getClassName()
            android.content.ComponentName r0 = r3.service
            java.lang.String r1 = r0.getPackageName()
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L3f
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L3f
            boolean r0 = r3.started
            if (r0 == 0) goto La3
            java.lang.String r0 = "Orca.STOP"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r0)
            java.lang.String r1 = r8.getPackageName()
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r5)
            r6.setComponent(r0)
            r0 = 0
            X.3VA r3 = new X.3VA
            r3.<init>(r8, r0)
            android.content.ComponentName r0 = r6.getComponent()
            if (r0 == 0) goto La3
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r2 = r3.A00
            X.3UW r1 = r3.A01
            boolean r0 = X.C3V3.A01(r2, r1, r0)
            if (r0 == 0) goto La3
            r3.A02(r6)
            r1.A05(r2, r6)
            goto La3
        L9b:
            r2 = move-exception
            java.lang.String r1 = "RtiGracefulSystemMethodHelper"
            java.lang.String r0 = "Failed to getRunningServices"
            X.C0K8.A0G(r1, r0, r2)
        La3:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r8, r5)
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r0 = 2
            r1.setComponentEnabledSetting(r2, r0, r4)
            r2.getShortClassName()
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3VC.A00(android.content.Context):void");
    }

    public static void A01(Context context, C3V1 c3v1, String str, String str2, String str3, String str4) {
        if (context.getPackageName().equals(str3)) {
            ComponentName componentName = new ComponentName(context, str);
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            componentName.getShortClassName();
        }
        ComponentName componentName2 = new ComponentName(str3, str);
        Intent intent = new Intent(str4);
        intent.setComponent(componentName2);
        intent.putExtra("caller", str2);
        if (c3v1 != null) {
            String str5 = c3v1.A03;
            if (str5 != null) {
                intent.putExtra("caller", str5);
            }
            long j = c3v1.A00;
            if (j != 0) {
                intent.putExtra("EXPIRED_SESSION", j);
            }
            Boolean bool = c3v1.A01;
            if (bool != null) {
                intent.putExtra("EXPLICIT_DELIVERY_ACK", bool);
            }
            Integer num = c3v1.A02;
            if (num != null) {
                intent.putExtra(AbstractC58317Pt9.A00(172), num);
            }
        }
        C3VA c3va = new C3VA(context, null);
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            Context context2 = c3va.A00;
            C3UW c3uw = c3va.A01;
            if (C3V3.A01(context2, c3uw, packageName)) {
                c3va.A02(intent);
                c3uw.A05(context2, intent);
            }
        }
    }
}
