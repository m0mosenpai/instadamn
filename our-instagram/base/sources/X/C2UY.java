package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: X.2UY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2UY {
    public static C2UY A01;
    public Vibrator A00;

    private void A00() {
        if (Build.VERSION.SDK_INT >= 29 && this.A00 != null) {
            A07(VibrationEffect.createPredefined(2));
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.2UY] */
    public static void A01(Context context) {
        if (A01 == null) {
            ?? obj = new Object();
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (packageManager.checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
                obj.A00 = (Vibrator) context.getSystemService("vibrator");
            }
            A01 = obj;
        }
    }

    private boolean A02() {
        if (Build.VERSION.SDK_INT < 29 || this.A00 == null) {
            return false;
        }
        return A07(VibrationEffect.createPredefined(0));
    }

    public final void A03() {
        A05(30L);
    }

    public final void A04() {
        if (Build.VERSION.SDK_INT >= 29 && this.A00 != null) {
            A00();
        }
    }

    public final void A05(long j) {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            try {
                vibrator.vibrate(j);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final boolean A06() {
        if (Build.VERSION.SDK_INT >= 29 && this.A00 != null) {
            return A02();
        }
        return false;
    }

    public final boolean A07(VibrationEffect vibrationEffect) {
        Vibrator vibrator = this.A00;
        if (vibrator != null) {
            try {
                vibrator.vibrate(vibrationEffect);
                return true;
            } catch (NullPointerException unused) {
                return false;
            }
        }
        return false;
    }
}
