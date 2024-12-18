package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppFlag;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SfC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63208SfC {
    public static C63208SfC A05;
    public static final long A06;
    public static final long A07;
    public final ComponentName A00;
    public final SharedPreferences A01;
    public final PackageManager A02;
    public final C1Ro A03;
    public final Context A04;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A07 = timeUnit.toMillis(7L);
        A06 = AbstractC43593JPy.A09(timeUnit);
    }

    public static synchronized C63208SfC A00(Context context) {
        C63208SfC c63208SfC;
        synchronized (C63208SfC.class) {
            c63208SfC = A05;
            if (c63208SfC == null) {
                Context applicationContext = context.getApplicationContext();
                c63208SfC = new C63208SfC(applicationContext, new C1Ro(applicationContext, applicationContext.getPackageManager()));
                A05 = c63208SfC;
            }
        }
        return c63208SfC;
    }

    public final boolean A03() {
        C1Ro c1Ro = this.A03;
        boolean z = true;
        if (!c1Ro.A00().A05 || !c1Ro.A01(1)) {
            z = false;
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        synchronized (this) {
            if (this.A02.getComponentEnabledSetting(this.A00) == 1) {
                z2 = true;
            }
        }
        return z2;
    }

    public C63208SfC(Context context, C1Ro c1Ro) {
        this.A04 = context;
        this.A03 = c1Ro;
        this.A01 = AbstractC58318PtA.A0F(context, "oxygen_preloads_sdk");
        this.A02 = context.getPackageManager();
        this.A00 = new ComponentName(context, (Class<?>) IsManagedAppFlag.class);
    }

    public final void A01() {
        long j;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            C1Ro c1Ro = this.A03;
            if (c1Ro.A00().A05 && c1Ro.A01(1)) {
                synchronized (this) {
                    if (this.A02.getComponentEnabledSetting(this.A00) != 0) {
                        SharedPreferences sharedPreferences = this.A01;
                        long j2 = sharedPreferences.getLong("/is_managed_app_cache/is_managed_app_last_check", 0L);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (j2 > currentTimeMillis) {
                            sharedPreferences.edit().putLong("/is_managed_app_cache/is_managed_app_last_check", currentTimeMillis).apply();
                        } else {
                            if (c1Ro.A01(9)) {
                                j = A07;
                            } else {
                                j = A06;
                            }
                            if (currentTimeMillis > j2 + j) {
                            }
                        }
                        return;
                    }
                    A02();
                    return;
                }
            }
            return;
        }
        throw AbstractC166987dD.A14("Cannot block UI thread when waiting for service call.");
    }

    public final void A02() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            C1Ro c1Ro = this.A03;
            if (c1Ro.A00().A05 && c1Ro.A01(1)) {
                boolean z = SXA.A00(this.A04).A07;
                synchronized (this) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = 2;
                    if (z) {
                        i = 1;
                    }
                    PackageManager packageManager = this.A02;
                    ComponentName componentName = this.A00;
                    packageManager.setComponentEnabledSetting(componentName, i, 1);
                    this.A01.edit().putLong("/is_managed_app_cache/is_managed_app_last_check", currentTimeMillis).apply();
                    packageManager.getComponentEnabledSetting(componentName);
                }
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Cannot block UI thread when waiting for service call.");
    }
}
