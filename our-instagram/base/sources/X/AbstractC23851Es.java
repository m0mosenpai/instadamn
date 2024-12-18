package X;

import android.os.SystemClock;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23851Es {
    public static long A00;
    public static EnumC23861Et A01;
    public static long A02;
    public static EnumC23861Et A03;
    public static java.util.Set A04;
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);

    public static EnumC23861Et A00() {
        if (SystemClock.elapsedRealtime() - A02 > A05) {
            EnumC23861Et A012 = A01(A03);
            if (A012 == null || !A012.A02) {
                A012 = null;
            }
            A03 = A012;
            A02 = SystemClock.elapsedRealtime();
        }
        return A03;
    }

    public static EnumC23861Et A01(EnumC23861Et enumC23861Et) {
        if (enumC23861Et != null && AbstractC13180m4.A03(enumC23861Et.A01)) {
            return enumC23861Et;
        }
        for (EnumC23861Et enumC23861Et2 : A02()) {
            if (enumC23861Et2 != enumC23861Et && AbstractC13180m4.A03(enumC23861Et2.A01)) {
                return enumC23861Et2;
            }
        }
        return null;
    }

    public static java.util.Set A02() {
        java.util.Set set = A04;
        if (set == null) {
            set = new LinkedHashSet();
            set.add(EnumC23861Et.A05);
            set.add(EnumC23861Et.A06);
            for (EnumC23861Et enumC23861Et : EnumC23861Et.values()) {
                if (!set.contains(enumC23861Et)) {
                    set.add(enumC23861Et);
                }
            }
            A04 = set;
        }
        return set;
    }

    public static boolean A03() {
        if (A00() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1 >= r3.A00) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04(android.content.Context r5) {
        /*
            X.1Et r0 = A00()
            if (r0 != 0) goto L45
            long r0 = X.AbstractC23851Es.A00
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r0
            long r1 = X.AbstractC23851Es.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            X.1Et r0 = X.AbstractC23851Es.A01
            X.1Et r3 = A01(r0)
            if (r3 == 0) goto L47
            boolean r0 = r3.A02
            if (r0 != 0) goto L47
            r2 = 0
            X.C14360o3.A0B(r5, r2)
            java.lang.String r1 = r3.A01
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            X.C14360o3.A0A(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            int r1 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            goto L34
        L33:
            r1 = -1
        L34:
            int r0 = r3.A00
            if (r1 < r0) goto L47
        L38:
            X.AbstractC23851Es.A01 = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.AbstractC23851Es.A00 = r0
        L40:
            X.1Et r1 = X.AbstractC23851Es.A01
            r0 = 0
            if (r1 == 0) goto L46
        L45:
            r0 = 1
        L46:
            return r0
        L47:
            r3 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23851Es.A04(android.content.Context):boolean");
    }
}
