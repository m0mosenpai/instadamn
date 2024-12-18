package X;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Sju, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ComponentCallbacks2C63416Sju implements ComponentCallbacks2 {
    public static volatile ComponentCallbacks2C63416Sju A09;
    public static volatile boolean A0A;
    public final Q20 A00;
    public final InterfaceC65571Tn4 A01;
    public final C63361SiK A02;
    public final C58821QBe A03;
    public final C61689Rs4 A04;
    public final C63460Skf A05;
    public final List A06 = AbstractC166987dD.A1E();
    public final SAS A07;
    public final C63182Seh A08;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r1v40, types: [X.Tn4] */
    /* JADX WARN: Type inference failed for: r1v42, types: [X.Rs4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.QBe, X.SPb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public static ComponentCallbacks2C63416Sju A00(Context context) {
        List unmodifiableList;
        ?? r1;
        if (A09 == null) {
            try {
                Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (android.util.Log.isLoggable("Glide", 5)) {
                    android.util.Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            }
            synchronized (ComponentCallbacks2C63416Sju.class) {
                if (A09 == null) {
                    if (!A0A) {
                        A0A = true;
                        SJY sjy = new SJY();
                        Context applicationContext = context.getApplicationContext();
                        android.util.Log.isLoggable("ManifestParser", 3);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        try {
                            ApplicationInfo A0C = AbstractC58320PtC.A0C(applicationContext, applicationContext.getPackageManager());
                            if (((PackageItemInfo) A0C).metaData == null) {
                                android.util.Log.isLoggable("ManifestParser", 3);
                            } else {
                                android.util.Log.isLoggable("ManifestParser", 2);
                                Iterator A14 = AbstractC58319PtB.A14(((PackageItemInfo) A0C).metaData);
                                while (A14.hasNext()) {
                                    String A1B = AbstractC166987dD.A1B(A14);
                                    if ("GlideModule".equals(((PackageItemInfo) A0C).metaData.get(A1B))) {
                                        try {
                                            Class<?> cls = Class.forName(A1B);
                                            try {
                                                throw AbstractC166987dD.A18(AbstractC167017dG.A0n(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), "Expected instanceof GlideModule, but found: ", AbstractC166987dD.A1C()));
                                            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                                                throw AbstractC58318PtA.A0e(AbstractC167017dG.A0n(cls, "Unable to instantiate GlideModule implementation for ", AbstractC166987dD.A1C()), e2);
                                            }
                                        } catch (ClassNotFoundException e3) {
                                            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
                                        }
                                    }
                                }
                                android.util.Log.isLoggable("ManifestParser", 3);
                            }
                            if (android.util.Log.isLoggable("Glide", 3)) {
                                Iterator it = A1E.iterator();
                                if (it.hasNext()) {
                                    it.next();
                                    throw AbstractC166987dD.A15("getClass");
                                }
                            }
                            Iterator it2 = A1E.iterator();
                            if (it2.hasNext()) {
                                it2.next();
                                throw AbstractC166987dD.A15("applyOptions");
                            }
                            if (sjy.A09 == null) {
                                ?? obj = new Object();
                                InterfaceC65608Tnx interfaceC65608Tnx = InterfaceC65608Tnx.A00;
                                if (ExecutorServiceC64807TUv.A02 == 0) {
                                    ExecutorServiceC64807TUv.A02 = Math.min(4, Runtime.getRuntime().availableProcessors());
                                }
                                int i = ExecutorServiceC64807TUv.A02;
                                sjy.A09 = AbstractC61686Rs0.A00(interfaceC65608Tnx, CacheBehaviorLogger.SOURCE, obj, i, i, false);
                            }
                            if (sjy.A08 == null) {
                                sjy.A08 = AbstractC61686Rs0.A00(InterfaceC65608Tnx.A00, "disk-cache", new Object(), 1, 1, true);
                            }
                            if (sjy.A07 == null) {
                                if (ExecutorServiceC64807TUv.A02 == 0) {
                                    ExecutorServiceC64807TUv.A02 = Math.min(4, Runtime.getRuntime().availableProcessors());
                                }
                                int i2 = 1;
                                if (ExecutorServiceC64807TUv.A02 >= 4) {
                                    i2 = 2;
                                }
                                sjy.A07 = AbstractC61686Rs0.A00(InterfaceC65608Tnx.A00, "animation", new Object(), i2, i2, true);
                            }
                            SHE she = sjy.A06;
                            if (she == null) {
                                float f = 1.0f;
                                ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
                                DisplayMetrics A0K = AbstractC167007dF.A0K(applicationContext);
                                if (activityManager.isLowRamDevice()) {
                                    f = 0.0f;
                                }
                                she = new SHE(activityManager, applicationContext, A0K, f);
                                sjy.A06 = she;
                            }
                            if (sjy.A0A == null) {
                                sjy.A0A = new Object();
                            }
                            if (sjy.A02 == null) {
                                int i3 = she.A01;
                                if (i3 > 0) {
                                    r1 = new C63797Str(i3);
                                } else {
                                    r1 = new Object();
                                }
                                sjy.A02 = r1;
                            }
                            if (sjy.A03 == null) {
                                sjy.A03 = new C63361SiK(sjy.A06.A00);
                            }
                            C58821QBe c58821QBe = sjy.A05;
                            C58821QBe c58821QBe2 = c58821QBe;
                            if (c58821QBe == null) {
                                ?? c62750SPb = new C62750SPb(sjy.A06.A02);
                                sjy.A05 = c62750SPb;
                                c58821QBe2 = c62750SPb;
                            }
                            SAX sax = sjy.A04;
                            if (sax == null) {
                                sax = new SAX(applicationContext);
                                sjy.A04 = sax;
                            }
                            if (sjy.A01 == null) {
                                sjy.A01 = new C63182Seh(sax, c58821QBe2, sjy.A08, sjy.A09, new ExecutorServiceC64807TUv(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC64807TUv.A01, TimeUnit.MILLISECONDS, new SynchronousQueue(), new TVE(InterfaceC65608Tnx.A00, "source-unlimited", new Object(), false))), sjy.A07);
                            }
                            List list = sjy.A0B;
                            if (list == null) {
                                unmodifiableList = Collections.emptyList();
                            } else {
                                unmodifiableList = Collections.unmodifiableList(list);
                            }
                            sjy.A0B = unmodifiableList;
                            SAU sau = new SAU(sjy.A0C);
                            C63460Skf c63460Skf = new C63460Skf(sau);
                            C63182Seh c63182Seh = sjy.A01;
                            C58821QBe c58821QBe3 = sjy.A05;
                            ComponentCallbacks2C63416Sju componentCallbacks2C63416Sju = new ComponentCallbacks2C63416Sju(applicationContext, sjy.A00, sau, c63182Seh, sjy.A02, sjy.A03, c58821QBe3, sjy.A0A, c63460Skf, sjy.A0B, A1E, sjy.A0D);
                            applicationContext.registerComponentCallbacks(componentCallbacks2C63416Sju);
                            A09 = componentCallbacks2C63416Sju;
                            A0A = false;
                        } catch (PackageManager.NameNotFoundException e4) {
                            throw AbstractC58318PtA.A0e("Unable to find metadata to parse GlideModules", e4);
                        }
                    } else {
                        throw AbstractC166987dD.A14("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return A09;
    }

    public static Sv5 A01(Context context) {
        if (context != null) {
            return A00(context).A05.A03(context);
        }
        throw AbstractC166987dD.A15("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.Rs7] */
    public ComponentCallbacks2C63416Sju(Context context, SAS sas, SAU sau, C63182Seh c63182Seh, InterfaceC65571Tn4 interfaceC65571Tn4, C63361SiK c63361SiK, C58821QBe c58821QBe, C61689Rs4 c61689Rs4, C63460Skf c63460Skf, List list, List list2, Map map) {
        this.A08 = c63182Seh;
        this.A01 = interfaceC65571Tn4;
        this.A02 = c63361SiK;
        this.A03 = c58821QBe;
        this.A05 = c63460Skf;
        this.A04 = c61689Rs4;
        this.A07 = sas;
        this.A00 = new Q20(context, sas, sau, c63182Seh, c63361SiK, new Object(), new C63887SvL(this, list2), list, map);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C63375Sim.A04();
        this.A03.A01(0L);
        this.A01.AHt();
        C63361SiK c63361SiK = this.A02;
        synchronized (c63361SiK) {
            C63361SiK.A02(c63361SiK, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ComponentCallbacks2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTrimMemory(int r7) {
        /*
            r6 = this;
            X.C63375Sim.A04()
            java.util.List r2 = r6.A06
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L59
        La:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L14
            r1.next()     // Catch: java.lang.Throwable -> L59
            goto La
        L14:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            X.QBe r5 = r6.A03
            r4 = 40
            if (r7 < r4) goto L2c
            r2 = 0
        L1d:
            r5.A01(r2)
        L20:
            X.Tn4 r0 = r6.A01
            r0.F8f(r7)
            X.SiK r1 = r6.A02
            monitor-enter(r1)
            if (r7 < r4) goto L42
            r0 = 0
            goto L3c
        L2c:
            r0 = 20
            if (r7 >= r0) goto L34
            r0 = 15
            if (r7 != r0) goto L20
        L34:
            monitor-enter(r5)
            long r2 = r5.A01     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            r0 = 2
            long r2 = r2 / r0
            goto L1d
        L3c:
            X.C63361SiK.A02(r1, r0)     // Catch: java.lang.Throwable -> L40
            goto L51
        L40:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L53
        L42:
            r0 = 20
            if (r7 >= r0) goto L4a
            r0 = 15
            if (r7 != r0) goto L51
        L4a:
            int r0 = r1.A01     // Catch: java.lang.Throwable -> L53
            int r0 = r0 / 2
            X.C63361SiK.A02(r1, r0)     // Catch: java.lang.Throwable -> L53
        L51:
            monitor-exit(r1)
            return
        L53:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L56:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L59:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ComponentCallbacks2C63416Sju.onTrimMemory(int):void");
    }
}
