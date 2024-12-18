package X;

import android.app.ActivityThread;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.common.artdistract.NativeArtDistract;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.facebook.fixie.fixes.memory.leak.MemoryLeakFixer;
import com.facebook.mobileboost.framework.os.jni.MobileBoostNative;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10410h9 {
    public static C10410h9 A04;
    public C211511r A00;
    public C0Rw A01;
    public C05730Rz A02;
    public boolean A03;

    public static LightweightQuickPerformanceLogger A00(C10410h9 c10410h9) {
        C05730Rz c05730Rz = c10410h9.A02;
        if (c05730Rz == null) {
            return null;
        }
        return (LightweightQuickPerformanceLogger) c05730Rz.A00.get();
    }

    private void A01(String str) {
        if (this.A03 && A00(this) != null) {
            A00(this).markerPoint(157825012, str);
        }
    }

    public final void A03(Integer num) {
        String str;
        long j;
        try {
            if (!this.A03) {
                this.A03 = true;
                if (A00(this) != null) {
                    LightweightQuickPerformanceLogger A00 = A00(this);
                    if (C0L6.A04 == null) {
                        j = 0;
                    } else {
                        j = C0L6.A04.A00;
                    }
                    A00.markerStart(157825012, 0, j, TimeUnit.MILLISECONDS);
                }
            }
            List<InterfaceC05710Rv> A02 = A02(this.A01, num);
            if (A02 != null) {
                if (num.intValue() != 0) {
                    str = "POST_APP_START";
                } else {
                    str = "ASAP";
                }
                A01(AnonymousClass001.A0R(str, "_start"));
                for (InterfaceC05710Rv interfaceC05710Rv : A02) {
                    if (interfaceC05710Rv != null) {
                        try {
                            String name = interfaceC05710Rv.getName();
                            A01(AnonymousClass001.A0R(name, "_start"));
                            C05730Rz c05730Rz = this.A02;
                            if (c05730Rz != null) {
                                ((C0R8) interfaceC05710Rv).A00 = c05730Rz;
                            }
                            interfaceC05710Rv.CNZ();
                            A01(AnonymousClass001.A0R(name, "_end"));
                        } catch (Throwable th) {
                            A04(th);
                        }
                    }
                }
                A01(AnonymousClass001.A0R(str, "_end"));
            }
        } catch (Throwable th2) {
            A04(th2);
        }
    }

    public final void A04(Throwable th) {
        C0f6 c0f6;
        C0K8.A0H("Fixie", "exception in FixieInitializer", th);
        C05730Rz c05730Rz = this.A02;
        if (c05730Rz != null && c05730Rz.A01.get() != null) {
            C05730Rz c05730Rz2 = this.A02;
            if (c05730Rz2 == null) {
                c0f6 = null;
            } else {
                c0f6 = (C0f6) c05730Rz2.A01.get();
            }
            C0f5 AEq = c0f6.AEq(true, "FixieInitializer", 817901561);
            AEq.ERI(th);
            AEq.report();
        }
    }

    public final List A02(final C0Rw c0Rw, Integer num) {
        InterfaceC05710Rv[] interfaceC05710RvArr;
        if (num.intValue() != 0) {
            interfaceC05710RvArr = new InterfaceC05710Rv[]{new C114425Ej(c0Rw), new C0R8(c0Rw) { // from class: X.5dl
                public boolean A00 = false;
                public final boolean A01;
                public final boolean A02;

                @Override // X.InterfaceC05710Rv
                public final String getName() {
                    return "LicmCrashFixer";
                }

                @Override // X.InterfaceC05710Rv
                public final void CNZ() {
                    if (this.A01 && !this.A00 && MobileBoostNative.sNativeLibLoaded) {
                        this.A00 = MobileBoostNative.enableLicmFix(this.A02);
                        A08();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
                
                    if (X.AbstractC14490oL.A09(r4.A01) != false) goto L8;
                 */
                {
                    /*
                        r6 = this;
                        r6.<init>(r7)
                        r5 = 0
                        r6.A00 = r5
                        java.lang.Class<X.0hA> r0 = X.C10420hA.class
                        X.0Rw r4 = r6.A05(r0)
                        X.0hA r4 = (X.C10420hA) r4
                        if (r4 == 0) goto L2b
                        com.instagram.common.session.UserSession r3 = r4.A00
                        r3.getClass()
                        X.0Tz r2 = X.C06090Tz.A05
                        r0 = 36314103109388728(0x81037c002c09b8, double:3.02852325930925E-306)
                        boolean r0 = X.C18U.A06(r2, r3, r0)
                        if (r0 == 0) goto L2b
                        android.content.Context r0 = r4.A01
                        boolean r1 = X.AbstractC14490oL.A09(r0)
                        r0 = 1
                        if (r1 == 0) goto L2c
                    L2b:
                        r0 = 0
                    L2c:
                        r6.A01 = r0
                        if (r4 == 0) goto L43
                        com.instagram.common.session.UserSession r3 = r4.A00
                        r3.getClass()
                        X.0Tz r2 = X.C06090Tz.A05
                        r0 = 36314103109323191(0x81037c002b09b7, double:3.028523259267804E-306)
                        boolean r0 = X.C18U.A06(r2, r3, r0)
                        if (r0 == 0) goto L43
                        r5 = 1
                    L43:
                        r6.A02 = r5
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C120935dl.<init>(X.0Rw):void");
                }
            }, new C0R8(c0Rw) { // from class: X.5dm
                public final boolean A00;
                public final boolean A01;

                @Override // X.InterfaceC05710Rv
                public final String getName() {
                    return "BrowserLiteCookieManagerFixer";
                }

                @Override // X.InterfaceC05710Rv
                public final void CNZ() {
                    if (this.A00) {
                        AbstractC61545RpP.A01 = true;
                        A0B("mFlushInBackground");
                    }
                    if (this.A01) {
                        AbstractC61545RpP.A00 = true;
                        A0B("mSkipFlush");
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
                
                    if (X.C18U.A06(X.C06090Tz.A05, r3, 36314103110502849L) == false) goto L6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
                
                    if (X.C18U.A06(X.C06090Tz.A05, r3, 36314103110306239L) != false) goto L11;
                 */
                {
                    /*
                        r6 = this;
                        r6.<init>(r7)
                        java.lang.Class<X.0hA> r0 = X.C10420hA.class
                        X.0Rw r5 = r6.A05(r0)
                        X.0hA r5 = (X.C10420hA) r5
                        r4 = 1
                        if (r5 == 0) goto L21
                        com.instagram.common.session.UserSession r3 = r5.A00
                        r3.getClass()
                        X.0Tz r2 = X.C06090Tz.A05
                        r0 = 36314103110502849(0x81037c003d09c1, double:3.0285232600138246E-306)
                        boolean r1 = X.C18U.A06(r2, r3, r0)
                        r0 = 1
                        if (r1 != 0) goto L22
                    L21:
                        r0 = 0
                    L22:
                        r6.A01 = r0
                        if (r5 == 0) goto L3b
                        com.instagram.common.session.UserSession r3 = r5.A00
                        r3.getClass()
                        X.0Tz r2 = X.C06090Tz.A05
                        r0 = 36314103110306239(0x81037c003a09bf, double:3.0285232598894876E-306)
                        boolean r0 = X.C18U.A06(r2, r3, r0)
                        if (r0 == 0) goto L3b
                    L38:
                        r6.A00 = r4
                        return
                    L3b:
                        r4 = 0
                        goto L38
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C120945dm.<init>(X.0Rw):void");
                }
            }, new C0R8(c0Rw) { // from class: X.5dn
                @Override // X.InterfaceC05710Rv
                public final String getName() {
                    return "IgdsToastMemoryLeakFixer";
                }

                @Override // X.InterfaceC05710Rv
                public final void CNZ() {
                    C10420hA c10420hA = (C10420hA) A05(C10420hA.class);
                    if (c10420hA != null) {
                        AnonymousClass926.A00 = new AnonymousClass925(c10420hA, this);
                    }
                }
            }};
        } else {
            C1SK c1sk = new C1SK(c0Rw);
            C1SO c1so = new C1SO(c0Rw);
            C26911Sm c26911Sm = new C26911Sm(c0Rw);
            C26931So c26931So = new C26931So(c0Rw);
            C0R8 c0r8 = new C0R8(c0Rw);
            C0R8 c0r82 = new C0R8(c0Rw);
            C0R8 c0r83 = new C0R8(c0Rw);
            C0R8 c0r84 = new C0R8(c0Rw);
            C26981Su c26981Su = new C26981Su(c0Rw);
            C26991Sw c26991Sw = new C26991Sw(c0Rw);
            C27011Sy c27011Sy = new C27011Sy(c0Rw);
            C0R8 c0r85 = new C0R8(c0Rw) { // from class: X.1T1
                public final int A00;
                public final Context A01;
                public final Handler A02;
                public final boolean A03;
                public final boolean A04;

                @Override // X.InterfaceC05710Rv
                public final String getName() {
                    return "PackageInfoCache";
                }

                @Override // X.InterfaceC05710Rv
                public final void CNZ() {
                    if (this.A03) {
                        A08();
                        if (this.A04) {
                            C0JS.A00(this.A01);
                            return;
                        }
                        Handler handler = this.A02;
                        int i = this.A00;
                        C0JS.A02 = true;
                        C0JS.A01 = handler;
                        C0JS.A03.clear();
                        C0JS.A00 = i;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
                
                    if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103110764994L)) == false) goto L6;
                 */
                {
                    /*
                        r8 = this;
                        r8.<init>(r9)
                        java.lang.Class<X.0hA> r0 = X.C10420hA.class
                        X.0Rw r7 = r8.A05(r0)
                        r4 = 1
                        if (r7 == 0) goto L1c
                        r0 = 36314103110764994(0x81037c004109c2, double:3.028523260179606E-306)
                        X.0tH r0 = X.AbstractC20100yh.A00(r0)
                        boolean r1 = X.C20150ym.A07(r0)
                        r0 = 1
                        if (r1 != 0) goto L1d
                    L1c:
                        r0 = 0
                    L1d:
                        r8.A03 = r0
                        android.os.Handler r0 = r9.Aex()
                        r8.A02 = r0
                        if (r7 == 0) goto L60
                        r5 = 36595578087672001(0x82037c004408c1, double:3.2065291689843554E-306)
                        X.0tH r0 = X.AbstractC20100yh.A00(r5)
                        long r2 = X.C20150ym.A01(r0)
                        int r1 = (int) r2
                        r0 = 30
                        if (r1 < r0) goto L60
                        X.0tH r0 = X.AbstractC20100yh.A00(r5)
                        long r1 = X.C20150ym.A01(r0)
                        int r0 = (int) r1
                    L42:
                        r8.A00 = r0
                        X.0RK r9 = (X.C0RK) r9
                        android.content.Context r0 = r9.A01
                        r8.A01 = r0
                        if (r7 == 0) goto L5e
                        r0 = 36314103111354823(0x81037c004a09c7, double:3.0285232605526163E-306)
                        X.0tH r0 = X.AbstractC20100yh.A00(r0)
                        boolean r0 = X.C20150ym.A07(r0)
                        if (r0 == 0) goto L5e
                    L5b:
                        r8.A04 = r4
                        return
                    L5e:
                        r4 = 0
                        goto L5b
                    L60:
                        r0 = 300(0x12c, float:4.2E-43)
                        goto L42
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1T1.<init>(X.0Rw):void");
                }
            };
            C0R8 c0r86 = new C0R8(c0Rw) { // from class: X.1T2
                public static final boolean A01;
                public static final String[] A02;
                public final boolean A00;

                public static void origSetProcessState(ActivityThread.ApplicationThread applicationThread, int i) {
                }

                @Override // X.InterfaceC05710Rv
                public final String getName() {
                    return "ApplicationThreadHook";
                }

                static {
                    boolean z = false;
                    if (Build.VERSION.SDK_INT <= 31) {
                        z = true;
                    }
                    A01 = z;
                    A02 = new String[]{"com.facebook.katana", "com.facebook.wakizashi", "com.facebook.orca", "com.instagram.android"};
                }

                @Override // X.InterfaceC05710Rv
                public final void CNZ() {
                    Object[] objArr;
                    String str;
                    A05(C10420hA.class).getClass();
                    if (this.A00) {
                        try {
                            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                                A09("Hidden apis are not accessible");
                                return;
                            }
                            Class<?> cls = Class.forName("android.app.ActivityThread$ApplicationThread");
                            Class cls2 = Integer.TYPE;
                            Method declaredMethod = C1T2.class.getDeclaredMethod("hookSetProcessState", cls, cls2);
                            Method declaredMethod2 = C1T2.class.getDeclaredMethod("origSetProcessState", cls, cls2);
                            ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                            Field declaredField = ActivityThread.class.getDeclaredField("mAppThread");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(currentActivityThread);
                            if (obj != null) {
                                Method declaredMethod3 = obj.getClass().getDeclaredMethod("setProcessState", cls2);
                                int i = C3v8.A00;
                                declaredMethod3.getClass();
                                C87433v9 c87433v9 = new C87433v9(declaredMethod3);
                                declaredMethod.getClass();
                                C87433v9 c87433v92 = new C87433v9(declaredMethod);
                                declaredMethod2.getClass();
                                C87433v9 c87433v93 = new C87433v9(declaredMethod2);
                                c87433v92.getClass();
                                c87433v9.getClass();
                                c87433v93.getClass();
                                if (C3v8.A00 == 0) {
                                    C3v8.A00 = -7;
                                }
                                Method method = c87433v92.A00;
                                Method method2 = c87433v9.A00;
                                Method method3 = c87433v93.A00;
                                if (!Modifier.isStatic(method.getModifiers())) {
                                    objArr = new Object[]{c87433v92};
                                    str = "Hook method %s must be static";
                                } else if (!Modifier.isStatic(method3.getModifiers())) {
                                    objArr = new Object[]{c87433v93};
                                    str = "Orig method holder %s must be static";
                                } else {
                                    if (C3v8.A01(c87433v92, c87433v9) && C3v8.A01(c87433v9, c87433v93)) {
                                        if (C3v8.A00 != 0) {
                                            if (NativeArtDistract.PLATFORM_SUPPORTED && NativeArtDistract.nativeHookMethod(method, method2, method3, false)) {
                                                A08();
                                                return;
                                            }
                                            return;
                                        }
                                        throw new IllegalStateException("Must init java resolved methods before calling");
                                    }
                                    C3v8.A02.A08("Cannot hook %s with %s because the methods are not of the correct type.", c87433v9, c87433v92);
                                }
                                C3v8.A00(str, objArr);
                                C3v8.A02.A08("Cannot hook %s with %s because the methods are not of the correct type.", c87433v9, c87433v92);
                            }
                        } catch (Throwable th) {
                            A0C(th);
                            C0XV c0xv = C0XV.A03;
                            if (c0xv != null && c0xv.A00 != -1) {
                                C0XV.A00(-1);
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
                
                    if (r2 == false) goto L9;
                 */
                {
                    /*
                        r4 = this;
                        r4.<init>(r5)
                        java.lang.Class<X.0hA> r0 = X.C10420hA.class
                        X.0Rw r3 = r4.A05(r0)
                        java.lang.String[] r0 = X.C1T2.A02
                        java.util.List r1 = java.util.Arrays.asList(r0)
                        X.0JA r0 = X.C0JA.A00()
                        java.lang.String r0 = r0.A01
                        boolean r2 = r1.contains(r0)
                        boolean r0 = X.C1T2.A01
                        if (r0 == 0) goto L31
                        if (r3 == 0) goto L31
                        r0 = 36314103109061043(0x81037c002709b3, double:3.0285232591020206E-306)
                        X.0tH r0 = X.AbstractC20100yh.A00(r0)
                        boolean r0 = X.C20150ym.A07(r0)
                        if (r0 == 0) goto L31
                        r0 = 1
                        if (r2 != 0) goto L32
                    L31:
                        r0 = 0
                    L32:
                        r4.A00 = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1T2.<init>(X.0Rw):void");
                }

                public static void hookSetProcessState(ActivityThread.ApplicationThread applicationThread, int i) {
                    C0XV.A00(i);
                }
            };
            C1T3 c1t3 = new C1T3(c0Rw);
            C1T6 c1t6 = new C1T6(c0Rw);
            C0R8 c0r87 = new C0R8(c0Rw);
            C211511r c211511r = this.A00;
            interfaceC05710RvArr = new InterfaceC05710Rv[]{c1sk, c1so, c26911Sm, c26931So, c0r8, c0r82, c0r83, c0r84, c26981Su, c26991Sw, c27011Sy, c0r85, c0r86, c1t3, c1t6, c0r87, new C1T9(c211511r, c0Rw), new MemoryLeakFixer(c211511r, c0Rw), new C0R8(c0Rw) { // from class: X.1TF
                public static final boolean A02;
                public static final String[] A03;
                public final Handler A00;
                public final boolean A01;

                @Override // X.InterfaceC05710Rv
                public final String getName() {
                    return "OplusActivityManagerHook";
                }

                static {
                    boolean z = false;
                    if (Build.VERSION.SDK_INT >= 30) {
                        z = true;
                    }
                    A02 = z;
                    A03 = new String[]{"oppo", "realme", "oneplus"};
                }

                @Override // X.InterfaceC05710Rv
                public final void CNZ() {
                    if (this.A01) {
                        this.A00.post(new Runnable() { // from class: X.5En
                            @Override // java.lang.Runnable
                            public final void run() {
                                Field A032;
                                Object obj;
                                Class A01;
                                Field A033;
                                Object obj2;
                                Class A012;
                                final C1TF c1tf = C1TF.this;
                                ApiExemption.enableUnsafeExemption();
                                ApiExemption.removeRestriction_DO_NOT_USE();
                                C0HC A00 = C0HC.A00();
                                try {
                                    Class A013 = A00.A01("android.app.OplusActivityManager");
                                    if (A013 != null && (A032 = A00.A03(A013, "IOplusActivityManagerSingleton")) != null && (obj = A032.get(null)) != null && (A01 = A00.A01("android.util.Singleton")) != null && (A033 = A00.A03(A01, "mInstance")) != null && (obj2 = A033.get(obj)) != null && (A012 = A00.A01("android.app.IOplusActivityManager")) != null) {
                                        A033.set(obj, new C0HX(A012, obj2, "OplusActivityManager", false).A00);
                                    }
                                } catch (Throwable unused) {
                                }
                                C0HU.A03(new AbstractC04410Lh() { // from class: X.5Eo
                                    @Override // X.AbstractC04410Lh, X.C0HV
                                    public final C0HW Ajg(C0HX c0hx, String str, Method method, Object[] objArr) {
                                        if (!str.equals("OplusActivityManager") || !method.getName().equals("sendTheiaEvent")) {
                                            return null;
                                        }
                                        return new C0HW(null);
                                    }
                                });
                            }
                        });
                        A08();
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
                
                    if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103112075724L)) == false) goto L8;
                 */
                {
                    /*
                        r3 = this;
                        r3.<init>(r4)
                        java.lang.String r1 = android.os.Build.BRAND
                        java.util.Locale r0 = java.util.Locale.US
                        java.lang.String r1 = r1.toLowerCase(r0)
                        java.lang.String[] r0 = X.C1TF.A03
                        java.util.List r0 = java.util.Arrays.asList(r0)
                        boolean r2 = r0.contains(r1)
                        java.lang.Class<X.0hA> r0 = X.C10420hA.class
                        X.0Rw r1 = r3.A05(r0)
                        boolean r0 = X.C1TF.A02
                        if (r0 == 0) goto L33
                        if (r2 == 0) goto L33
                        if (r1 == 0) goto L33
                        r0 = 36314103112075724(0x81037c005509cc, double:3.028523261008517E-306)
                        X.0tH r0 = X.AbstractC20100yh.A00(r0)
                        boolean r1 = X.C20150ym.A07(r0)
                        r0 = 1
                        if (r1 != 0) goto L34
                    L33:
                        r0 = 0
                    L34:
                        r3.A01 = r0
                        android.os.Handler r0 = r4.Aex()
                        r3.A00 = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1TF.<init>(X.0Rw):void");
                }
            }, new C1TG(c0Rw), new C1TH(c0Rw), new C1TI(c0Rw), new C0R8(c0Rw) { // from class: X.1TJ
                public final boolean A00;

                @Override // X.InterfaceC05710Rv
                public final String getName() {
                    return "WatchdogInitializer";
                }

                @Override // X.InterfaceC05710Rv
                public final void CNZ() {
                    if (this.A00) {
                        final C106484r2 A00 = C106484r2.A00();
                        A00.A00 = A07();
                        C0Rw c0Rw2 = this.A01;
                        A00.A01(c0Rw2.Aex());
                        C87923w0 c87923w0 = C87923w0.A02;
                        if (c87923w0 != null) {
                            A00.A01(c87923w0.A00);
                        }
                        if (A05(C10420hA.class) != null) {
                            if (C20150ym.A07(AbstractC20100yh.A00(36314103113386457L))) {
                                C106484r2.A00().A04(C14120nc.A00());
                            }
                            if (C20150ym.A07(AbstractC20100yh.A00(36314103113451994L))) {
                                Handler Aex = c0Rw2.Aex();
                                C14360o3.A0B(Aex, 0);
                                C60538R6b c60538R6b = new C60538R6b(new String[]{"Litho.TreeFuture.Run"});
                                AbstractC50692Uq.A00.add(c60538R6b);
                                Aex.postDelayed(new RunnableC64561TJy(c60538R6b), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                            }
                            if (A00.A01 == null) {
                                Thread thread = new Thread(new Runnable() { // from class: X.4rA
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C106484r2 c106484r2 = C106484r2.this;
                                        Process.setThreadPriority(0);
                                        ArrayList arrayList = new ArrayList();
                                        while (true) {
                                            arrayList.clear();
                                            synchronized (c106484r2.A03) {
                                                arrayList.addAll(c106484r2.A04);
                                                Iterator it = c106484r2.A05.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.remove((InterfaceC106504r4) it.next());
                                                }
                                            }
                                            if (!Debug.isDebuggerConnected()) {
                                                Iterator it2 = arrayList.iterator();
                                                while (it2.hasNext()) {
                                                    ((InterfaceC106514r5) it2.next()).Cpp();
                                                }
                                            }
                                            long j = 30000;
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            do {
                                                try {
                                                    Thread.sleep(j);
                                                } catch (InterruptedException unused) {
                                                }
                                                j -= SystemClock.uptimeMillis() - uptimeMillis;
                                            } while (j > 0);
                                            boolean z = true;
                                            if (!Debug.isDebuggerConnected()) {
                                                Iterator it3 = arrayList.iterator();
                                                while (it3.hasNext()) {
                                                    z &= ((InterfaceC106504r4) it3.next()).AHE();
                                                }
                                            }
                                            long j2 = 30000;
                                            long uptimeMillis2 = SystemClock.uptimeMillis();
                                            do {
                                                try {
                                                    Thread.sleep(j2);
                                                } catch (InterruptedException unused2) {
                                                }
                                                j2 -= SystemClock.uptimeMillis() - uptimeMillis2;
                                            } while (j2 > 0);
                                            if (!z && !Debug.isDebuggerConnected()) {
                                                Iterator it4 = arrayList.iterator();
                                                while (it4.hasNext()) {
                                                    ((InterfaceC106504r4) it4.next()).EHc();
                                                }
                                            }
                                        }
                                    }
                                }, "watchdog");
                                A00.A01 = thread;
                                thread.start();
                            }
                            A08();
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
                
                    if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103113320920L)) == false) goto L6;
                 */
                {
                    /*
                        r2 = this;
                        r2.<init>(r3)
                        java.lang.Class<X.0hA> r0 = X.C10420hA.class
                        X.0Rw r0 = r2.A05(r0)
                        if (r0 == 0) goto L1b
                        r0 = 36314103113320920(0x81037c006809d8, double:3.028523261795984E-306)
                        X.0tH r0 = X.AbstractC20100yh.A00(r0)
                        boolean r1 = X.C20150ym.A07(r0)
                        r0 = 1
                        if (r1 != 0) goto L1c
                    L1b:
                        r0 = 0
                    L1c:
                        r2.A00 = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1TJ.<init>(X.0Rw):void");
                }
            }};
        }
        return Arrays.asList(interfaceC05710RvArr);
    }
}
