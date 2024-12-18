package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Se3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63155Se3 {
    public static ScheduledExecutorService A0A;
    public int A00;
    public WorkSource A01;
    public AtomicInteger A02;
    public boolean A03;
    public final Context A04;
    public final PowerManager.WakeLock A05;
    public final Object A06;
    public final String A07;
    public final Map A08;
    public final java.util.Set A09;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.Tgh, java.lang.Object] */
    public C63155Se3(Context context) {
        Object[] objArr;
        String packageName = context.getPackageName();
        WorkSource workSource = null;
        this.A06 = this;
        this.A03 = true;
        this.A08 = AbstractC166987dD.A1G();
        this.A09 = AbstractC58322PtE.A11();
        this.A02 = MSW.A1C(0);
        C3U5.A06("Analytics WakeLock", "WakeLock: wakeLockName must not be empty");
        Context applicationContext = context.getApplicationContext();
        this.A04 = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.A07 = AbstractC58321PtD.A0v("*gcore*:", "Analytics WakeLock");
        } else {
            this.A07 = "Analytics WakeLock";
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "Analytics WakeLock");
        C0BX.A02(newWakeLock, "Analytics WakeLock");
        this.A05 = newWakeLock;
        if (C63125SdT.A00(context)) {
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = C3U2.A00(context).A00.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo != null) {
                        int i = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method = C63125SdT.A02;
                        try {
                            if (method != null) {
                                objArr = new Object[]{Integer.valueOf(i), packageName};
                            } else {
                                method = C63125SdT.A01;
                                objArr = method != null ? new Object[]{Integer.valueOf(i)} : objArr;
                            }
                            method.invoke(workSource, objArr);
                        } catch (Exception e) {
                            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                        }
                    } else {
                        AbstractC58321PtD.A1Q("Could not get applicationInfo from package: ", packageName, "WorkSourceUtil");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    AbstractC58321PtD.A1Q("Could not find package: ", packageName, "WorkSourceUtil");
                }
            }
            this.A01 = workSource;
            if (workSource != null && C63125SdT.A00(applicationContext)) {
                WorkSource workSource2 = this.A01;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.A01 = workSource;
                }
                try {
                    newWakeLock.setWorkSource(this.A01);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    android.util.Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (A0A == null) {
            synchronized (S77.class) {
                if (S77.A00 == null) {
                    S77.A00 = new Object();
                }
            }
            A0A = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    public static final void A00(C63155Se3 c63155Se3) {
        Method method;
        WorkSource workSource = c63155Se3.A01;
        Boolean bool = C63125SdT.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (workSource != null && (method = C63125SdT.A03) != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C3U5.A02(invoke);
                int A07 = AbstractC58318PtA.A07(invoke);
                if (A07 != 0) {
                    for (int i = 0; i < A07; i++) {
                        Method method2 = C63125SdT.A04;
                        if (method2 != null) {
                            try {
                                String str = (String) method2.invoke(workSource, Integer.valueOf(i));
                                if (str != null && !str.trim().isEmpty()) {
                                    A1E.add(str);
                                }
                            } catch (Exception e) {
                                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static final void A01(C63155Se3 c63155Se3) {
        PowerManager.WakeLock wakeLock = c63155Se3.A05;
        if (wakeLock.isHeld()) {
            try {
                AbstractC09820fg.A01(wakeLock);
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    android.util.Log.e("WakeLock", String.valueOf(c63155Se3.A07).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            wakeLock.isHeld();
        }
    }
}
