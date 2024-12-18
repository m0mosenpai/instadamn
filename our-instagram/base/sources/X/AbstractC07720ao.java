package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07720ao extends C0OK {
    public final String A00;
    public final C03190Dc A01;

    public AbstractC07720ao(C07970bH c07970bH, InterfaceC08100bW interfaceC08100bW, C03190Dc c03190Dc, String str) {
        super(c07970bH, interfaceC08100bW, C05F.A01);
        this.A00 = str;
        this.A01 = c03190Dc;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:1: B:24:0x0057->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent A06(android.content.Context r10, android.content.Intent r11, java.lang.String r12, java.util.List r13) {
        /*
            r9 = this;
            X.0bW r6 = r9.A01
            X.AbstractC08500cE.A01(r10, r11, r6, r12)
            int r0 = r13.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r3 = r13.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            android.content.pm.ComponentInfo r1 = (android.content.pm.ComponentInfo) r1
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo
            if (r0 == 0) goto L12
            boolean r0 = r9.A07(r10, r0)
            if (r0 == 0) goto L12
            r2.add(r1)
            goto L12
        L2c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L3b
            java.lang.String r2 = r9.A00
            java.lang.String r1 = "No matching packages available."
            r0 = 0
            r6.EHA(r2, r1, r0)
            return r0
        L3b:
            java.lang.Integer r7 = r9.A02
            r1 = 1
            X.0bD r0 = new X.0bD
            r0.<init>()
            java.util.Collections.sort(r2, r0)
            r0 = 0
            java.lang.Object r5 = r2.get(r0)
            android.content.pm.PackageItemInfo r5 = (android.content.pm.PackageItemInfo) r5
            int r0 = r2.size()
            if (r0 <= r1) goto L84
            java.util.Iterator r8 = r2.iterator()
        L57:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r4 = r8.next()
            android.content.pm.PackageItemInfo r4 = (android.content.pm.PackageItemInfo) r4
            java.lang.String r0 = r4.packageName     // Catch: java.lang.SecurityException -> L6e
            boolean r0 = X.AbstractC08450c9.A04(r10, r0)     // Catch: java.lang.SecurityException -> L6e
            r0 = r0 ^ 1
            if (r0 == 0) goto L7c
            goto L7f
        L6e:
            r3 = move-exception
            java.lang.String r2 = r9.A00
            java.lang.String r1 = "Error verifying the signature for "
            java.lang.String r0 = r4.packageName
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r6.EHA(r2, r0, r3)
        L7c:
            java.lang.Integer r0 = X.C05F.A00
            goto L81
        L7f:
            java.lang.Integer r0 = X.C05F.A01
        L81:
            if (r7 != r0) goto L57
            r5 = r4
        L84:
            java.lang.String r2 = r5.packageName
            java.lang.String r1 = r5.name
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            r11.setComponent(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC07720ao.A06(android.content.Context, android.content.Intent, java.lang.String, java.util.List):android.content.Intent");
    }

    private boolean A07(Context context, ApplicationInfo applicationInfo) {
        String str = ((PackageItemInfo) applicationInfo).packageName;
        try {
            if (this.A01.A02(context, applicationInfo.uid)) {
                return true;
            }
            synchronized (super.A00) {
            }
            return false;
        } catch (SecurityException e) {
            super.A01.EHA(this.A00, AnonymousClass001.A0R("Unexpected exception in checking trusted app for ", str), e);
            return !A0A();
        }
    }

    @Override // X.C0OK
    public final List A0F(Context context, Intent intent, String str) {
        InterfaceC08100bW interfaceC08100bW = super.A01;
        AbstractC08500cE.A01(context, intent, interfaceC08100bW, str);
        ArrayList A08 = A08(context, intent);
        if (A08.isEmpty()) {
            interfaceC08100bW.EHA(this.A00, "No matching packages available.", null);
        }
        return A08;
    }

    @Override // X.C0OK
    public final boolean A0H(Context context, C08110bX c08110bX) {
        ApplicationInfo applicationInfo = c08110bX.A00;
        if (applicationInfo == null) {
            return false;
        }
        return A07(context, applicationInfo);
    }

    @Override // X.C0OK
    public final Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        int i;
        String str2;
        int i2 = context.getApplicationInfo().uid;
        C0LG A00 = AbstractC08500cE.A00(context, intent, null, DexStore.DAYS_TO_MS_FACTOR);
        if (A00 == null && (A00 = AbstractC08470cB.A00(broadcastReceiver, context)) == null) {
            i = -1;
        } else {
            i = A00.A00;
        }
        if (!this.A01.A03(A00, AbstractC08450c9.A02(context))) {
            PackageManager packageManager = context.getPackageManager();
            String str3 = "no_name_available";
            if (packageManager == null) {
                str2 = "no_name_available";
            } else {
                str3 = packageManager.getNameForUid(i2);
                str2 = packageManager.getNameForUid(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Access denied. Process ");
            sb.append(i2);
            sb.append("(");
            sb.append(str3);
            sb.append(") cannot receive broadcasts from ");
            sb.append(i);
            sb.append("(");
            sb.append(str2);
            sb.append(")the event is: ");
            sb.append(intent.getAction());
            String obj = sb.toString();
            super.A01.EHA(this.A00, obj, new SecurityException(obj));
            return null;
        }
        return intent;
    }

    @Override // X.C0OK
    public final Intent A0C(Context context, Intent intent, String str) {
        return A06(context, intent, str, C0OK.A03(context, intent, 65600));
    }

    @Override // X.C0OK
    public final Intent A0D(Context context, Intent intent, String str) {
        return A06(context, intent, str, C0OK.A04(context, intent, 65600));
    }
}
