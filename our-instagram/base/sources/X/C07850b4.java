package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ServiceInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07850b4 extends C0OK {
    @Override // X.C0OK
    public final boolean A0G() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if ((r2 & 16) != 16) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(android.content.Context r7, android.content.pm.ComponentInfo r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r8.exported
            r5 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2b
            if (r9 == 0) goto L30
            X.C14360o3.A0B(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            android.content.pm.PermissionInfo r0 = r0.getPermissionInfo(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            X.C14360o3.A07(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            int r2 = r0.protectionLevel     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r1 = 16
            r0 = r2 & 2
            if (r0 == r5) goto L2b
            goto L27
        L20:
            X.0bH r0 = r6.A00
            monitor-enter(r0)
            monitor-exit(r0)
            monitor-enter(r0)
            monitor-exit(r0)
            return r4
        L27:
            r0 = r2 & 16
            if (r0 != r1) goto L30
        L2b:
            X.0bH r0 = r6.A00
            monitor-enter(r0)
            monitor-exit(r0)
            return r4
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07850b4.A07(android.content.Context, android.content.pm.ComponentInfo, java.lang.String):boolean");
    }

    @Override // X.C0OK
    public final Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0OK
    public final Integer A0E() {
        return C05F.A0Y;
    }

    @Override // X.C0OK
    public final List A0F(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0OK
    public final boolean A0H(Context context, C08110bX c08110bX) {
        throw new UnsupportedOperationException();
    }

    private Intent A06(Intent intent, List list, boolean z) {
        if (list.isEmpty()) {
            this.A01.EHA("AccessibleByAnyAppIntentScope", "No matching public components.", null);
            return null;
        }
        intent.putExtra("CI_SKIP_CALLER_FROM_ACTIVITY", true);
        if (z) {
            if (list.size() > 1) {
                InterfaceC08100bW interfaceC08100bW = this.A01;
                synchronized (this.A00) {
                }
                AbstractC07940bE.A00(intent, interfaceC08100bW);
                return C0OK.A00(C0OK.A02(intent, list));
            }
            PackageItemInfo packageItemInfo = (PackageItemInfo) list.get(0);
            intent.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
        }
        InterfaceC08100bW interfaceC08100bW2 = this.A01;
        synchronized (this.A00) {
        }
        AbstractC07940bE.A00(intent, interfaceC08100bW2);
        return intent;
    }

    @Override // X.C0OK
    public final Intent A0C(Context context, Intent intent, String str) {
        List A03 = C0OK.A03(context, intent, 65600);
        if (A03.isEmpty() && intent.hasExtra("expect_activity_not_found")) {
            InterfaceC08100bW interfaceC08100bW = this.A01;
            synchronized (this.A00) {
            }
            AbstractC07940bE.A00(intent, interfaceC08100bW);
            return intent;
        }
        boolean z = false;
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = (ActivityInfo) it.next();
            if (!A07(context, activityInfo, activityInfo.permission)) {
                z = true;
                it.remove();
            }
        }
        return A06(intent, A03, z);
    }

    @Override // X.C0OK
    public final Intent A0D(Context context, Intent intent, String str) {
        List A04 = C0OK.A04(context, intent, 65600);
        Iterator it = A04.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ServiceInfo serviceInfo = (ServiceInfo) it.next();
            if (!A07(context, serviceInfo, serviceInfo.permission)) {
                z = true;
                it.remove();
            }
        }
        return A06(intent, A04, z);
    }
}
