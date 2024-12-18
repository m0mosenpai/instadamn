package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.fbpay.w3c.client.W3CClient$fbPaymentServiceAddressCallback$1;
import com.fbpay.w3c.client.W3CClient$fbPaymentServiceCardDetailsCallback$1;
import com.fbpay.w3c.client.W3CClient$fbPaymentServiceContactCallback$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2GP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GP {
    public static final C02N A0E = C2GQ.A00;
    public ServiceConnection A00;
    public ServiceConnection A01;
    public IBinder A02;
    public IBinder A03;
    public final Context A04;
    public final C2GS A05;
    public final C2GS A06;
    public final C2GS A07;
    public final C2GS A08;
    public final FBPaymentServiceAddressCallback A09;
    public final FBPaymentServiceCardDetailsCallback A0A;
    public final FBPaymentServiceContactCallback A0B;
    public final ArrayList A0C;
    public final C5G6 A0D;

    public C2GP(Context context, C5G6 c5g6) {
        C14360o3.A0B(context, 1);
        this.A04 = context;
        this.A0D = c5g6;
        this.A0C = AbstractC16960so.A1M("https://www.facebook.com/basiccard");
        this.A07 = new C2GS() { // from class: X.2GR
            @Override // X.C2GT
            public final void A03() {
                C2GP c2gp = C2GP.this;
                synchronized (c2gp) {
                    C02N c02n = C2GP.A0E;
                    IBinder iBinder = c2gp.A03;
                    if (c2gp.A01 != null && iBinder != null) {
                        c02n.accept(iBinder);
                    } else {
                        c2gp.A01 = new ServiceConnectionC63440SkJ(c02n, c2gp);
                        Context context2 = c2gp.A04;
                        Intent A01 = C2GP.A01(context2, c2gp, "com.fbpay.w3c.FB_EXTENSIONS");
                        if (A01 != null) {
                            if (C0b3.A00().A07().A04(context2, A01, c2gp.A01, 1)) {
                            }
                        }
                        c2gp.A01 = null;
                        c2gp.A03 = null;
                    }
                }
            }

            @Override // X.C2GT
            public final void A04() {
                C2GP c2gp = C2GP.this;
                C2GP.A02(c2gp.A01, c2gp);
                c2gp.A01 = null;
                c2gp.A03 = null;
            }
        };
        this.A08 = new C2GS() { // from class: X.2GR
            @Override // X.C2GT
            public final void A03() {
                C2GP c2gp = C2GP.this;
                synchronized (c2gp) {
                    C02N c02n = C2GP.A0E;
                    IBinder iBinder = c2gp.A03;
                    if (c2gp.A01 != null && iBinder != null) {
                        c02n.accept(iBinder);
                    } else {
                        c2gp.A01 = new ServiceConnectionC63440SkJ(c02n, c2gp);
                        Context context2 = c2gp.A04;
                        Intent A01 = C2GP.A01(context2, c2gp, "com.fbpay.w3c.FB_EXTENSIONS");
                        if (A01 != null) {
                            if (C0b3.A00().A07().A04(context2, A01, c2gp.A01, 1)) {
                            }
                        }
                        c2gp.A01 = null;
                        c2gp.A03 = null;
                    }
                }
            }

            @Override // X.C2GT
            public final void A04() {
                C2GP c2gp = C2GP.this;
                C2GP.A02(c2gp.A01, c2gp);
                c2gp.A01 = null;
                c2gp.A03 = null;
            }
        };
        this.A06 = new C2GS() { // from class: X.2GR
            @Override // X.C2GT
            public final void A03() {
                C2GP c2gp = C2GP.this;
                synchronized (c2gp) {
                    C02N c02n = C2GP.A0E;
                    IBinder iBinder = c2gp.A03;
                    if (c2gp.A01 != null && iBinder != null) {
                        c02n.accept(iBinder);
                    } else {
                        c2gp.A01 = new ServiceConnectionC63440SkJ(c02n, c2gp);
                        Context context2 = c2gp.A04;
                        Intent A01 = C2GP.A01(context2, c2gp, "com.fbpay.w3c.FB_EXTENSIONS");
                        if (A01 != null) {
                            if (C0b3.A00().A07().A04(context2, A01, c2gp.A01, 1)) {
                            }
                        }
                        c2gp.A01 = null;
                        c2gp.A03 = null;
                    }
                }
            }

            @Override // X.C2GT
            public final void A04() {
                C2GP c2gp = C2GP.this;
                C2GP.A02(c2gp.A01, c2gp);
                c2gp.A01 = null;
                c2gp.A03 = null;
            }
        };
        this.A0A = new W3CClient$fbPaymentServiceCardDetailsCallback$1(this);
        this.A0B = new W3CClient$fbPaymentServiceContactCallback$1(this);
        this.A09 = new W3CClient$fbPaymentServiceAddressCallback$1(this);
        this.A05 = new C2GS() { // from class: X.2Gb
            @Override // X.C2GT
            public final void A03() {
                C2GS c2gs;
                SED sed;
                C2GP c2gp = C2GP.this;
                synchronized (c2gp) {
                    if (c2gp.A00 == null) {
                        String A03 = c2gp.A03();
                        if (A03 != null) {
                            c2gp.A00 = new ServiceConnectionC63433SkC(c2gp);
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(A03, "com.fbpay.w3c.ipc.AutofillKeyFetchServiceImpl"));
                            ServiceConnection serviceConnection = c2gp.A00;
                            if (!C0b3.A00().A06().A04(c2gp.A04, intent, serviceConnection, 1)) {
                                c2gp.A02 = null;
                                c2gp.A00 = null;
                                c2gs = c2gp.A05;
                                sed = new SED(null, new Throwable(AnonymousClass001.A0R("Couldn't bind to service for ", A03)));
                            }
                        } else {
                            c2gs = c2gp.A05;
                            sed = new SED(null, new Throwable("Package name could not be found."));
                        }
                        c2gs.A0A(sed);
                    }
                }
            }

            @Override // X.C2GT
            public final void A04() {
                C2GP c2gp = C2GP.this;
                C2GP.A02(c2gp.A00, c2gp);
                c2gp.A00 = null;
                c2gp.A02 = null;
            }
        };
    }

    public static final void A02(ServiceConnection serviceConnection, C2GP c2gp) {
        Context context = c2gp.A04;
        synchronized (c2gp) {
            if (serviceConnection != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (IllegalArgumentException e) {
                    C0K8.A0F("W3CClient", "Service is already unbound.", e);
                }
            }
        }
    }

    public final String A03() {
        PackageManager packageManager;
        String str;
        boolean z;
        Context context = this.A04;
        String packageName = context.getPackageName();
        if (packageName != null) {
            int hashCode = packageName.hashCode();
            if (hashCode != -662003450) {
                if (hashCode != 419128298) {
                    if (hashCode == 714499313) {
                        str = "com.facebook.katana";
                    }
                } else {
                    str = "com.facebook.wakizashi";
                }
                if (packageName.equals(str)) {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (packageManager2 != null) {
                        try {
                            packageManager2.getPackageInfo("com.instagram.android", 128);
                            z = true;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (!z && context.getPackageManager() != null) {
                            try {
                                ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo("com.instagram.android", 128).applicationInfo;
                                if (applicationInfo == null) {
                                    return "com.instagram.android";
                                }
                                if ((applicationInfo.flags & 2) == 0) {
                                    return "com.instagram.android";
                                }
                                return null;
                            } catch (PackageManager.NameNotFoundException unused2) {
                                return null;
                            }
                        }
                    }
                    z = false;
                    return !z ? null : null;
                }
            } else {
                if (packageName.equals("com.instagram.android") && (packageManager = context.getPackageManager()) != null) {
                    try {
                        packageManager.getPackageInfo("com.facebook.katana", 128);
                        return "com.facebook.katana";
                    } catch (PackageManager.NameNotFoundException unused3) {
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (X.AbstractC08450c9.A04(r21, r12.getPackage()) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent A00(android.content.Context r21, X.C2GP r22) {
        /*
            java.lang.String r4 = "org.chromium.intent.action.PAY"
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r4)
            r5 = r21
            android.content.pm.PackageManager r3 = r5.getPackageManager()
            r0 = 128(0x80, float:1.8E-43)
            java.util.List r0 = r3.queryIntentActivities(r12, r0)
            X.C14360o3.A07(r0)
            java.util.Iterator r11 = r0.iterator()
            r6 = 0
        L21:
            boolean r0 = r11.hasNext()
            r8 = r22
            if (r0 == 0) goto Lc4
            int r10 = r6 + 1
            java.lang.Object r7 = r11.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.pm.ActivityInfo r0 = r7.activityInfo
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = r0.name
            r12.setClassName(r1, r0)
            android.content.pm.ActivityInfo r0 = r7.activityInfo
            java.lang.String r0 = r0.packageName
            r12.setPackage(r0)
            java.lang.String r0 = r12.getPackage()
            if (r0 == 0) goto L60
            java.lang.String r1 = r12.getPackage()
            java.lang.String r0 = r5.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L60
            java.lang.String r0 = r12.getPackage()
            boolean r1 = X.AbstractC08450c9.A04(r5, r0)
            r0 = 1
            if (r1 != 0) goto L61
        L60:
            r0 = 0
        L61:
            if (r0 == 0) goto Lc1
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            X.C14360o3.A06(r9)
            android.os.Bundle r1 = r9.metaData
            if (r1 == 0) goto L8e
            java.lang.String r0 = "org.chromium.payment_method_names"
            int r1 = r1.getInt(r0)
            if (r1 == 0) goto L8e
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            android.content.res.Resources r0 = r3.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            java.lang.String[] r1 = r0.getStringArray(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            int r0 = r1.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            java.util.HashSet r9 = new java.util.HashSet     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            r9.<init>(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L96
            goto L9d
        L8e:
            java.util.Set r9 = java.util.Collections.emptySet()
            X.C14360o3.A07(r9)
            goto L9d
        L96:
            java.util.Set r9 = java.util.Collections.emptySet()
            X.C14360o3.A07(r9)
        L9d:
            java.util.ArrayList r0 = r8.A0C
            boolean r0 = java.util.Collections.disjoint(r0, r9)
            if (r0 == 0) goto Lf8
            java.lang.String r0 = "queried_activity_package_name_"
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r6)
            android.content.pm.ActivityInfo r0 = r7.activityInfo
            java.lang.String r0 = r0.packageName
            r2.put(r1, r0)
            java.lang.String r0 = "queried_supported_payment_method_"
            java.lang.String r1 = X.AnonymousClass001.A0O(r0, r6)
            java.lang.String r0 = r9.toString()
            r2.put(r1, r0)
        Lc1:
            r6 = r10
            goto L21
        Lc4:
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "context_package_name"
            r2.put(r0, r1)
            java.lang.String r0 = "w3c_activity_requested"
            r2.put(r0, r4)
            X.5G6 r0 = r8.A0D
            r12 = 0
            if (r0 == 0) goto Lf8
            X.Sau r3 = r0.A01
            java.lang.Integer r1 = X.C05F.A01
            r22 = 0
            r21 = 1022(0x3fe, float:1.432E-42)
            X.Bfo r11 = new X.Bfo
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = "W3C_NULL_ACTIVITY_ERROR"
            r3.A01(r12, r11, r1, r0)
        Lf8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2GP.A00(android.content.Context, X.2GP):android.content.Intent");
    }

    public static final Intent A01(Context context, C2GP c2gp, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent A00 = A00(context, c2gp);
        if (A00 == null) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(A00.getPackage());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        C14360o3.A07(queryIntentServices);
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            intent.setClassName(((PackageItemInfo) serviceInfo).packageName, ((PackageItemInfo) serviceInfo).name);
            if (intent.getPackage() != null) {
                if (context.getPackageName().equals(intent.getPackage()) && AbstractC08450c9.A04(context, intent.getPackage())) {
                    return intent;
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("context_package_name", context.getPackageName());
        linkedHashMap.put("w3c_service_requested", str);
        C5G6 c5g6 = c2gp.A0D;
        if (c5g6 != null) {
            c5g6.A01.A01(null, new C26061Bfo((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) linkedHashMap, 1022, false), C05F.A01, "W3C_NULL_SERVICE_INTENT_ERROR");
        }
        return null;
    }
}
