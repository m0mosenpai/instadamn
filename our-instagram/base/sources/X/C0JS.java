package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.DeadObjectException;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0JS, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0JS {
    public static int A00 = 30;
    public static Handler A01;
    public static boolean A02;
    public static final ConcurrentHashMap A03;
    public static final java.util.Set A04;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0bm, java.lang.Object] */
    public static void A00(Context context) {
        A02 = true;
        A03.clear();
        C0b3.A00();
        C0b3.A02(context.getApplicationContext(), new C0QL(new Object()));
    }

    public static boolean A03(Context context, String str, int i) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 0)) == null || TextUtils.isEmpty(packageInfo.versionName)) {
                return false;
            }
            return Integer.parseInt(packageInfo.versionName.split("\\.", 2)[0]) >= i;
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A04(PackageManager packageManager, String str) {
        Number number;
        if (A02 && (number = (Number) A03.get(str)) != null) {
            if (number.intValue() != 2) {
                return false;
            }
        } else {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 128);
                A01(packageInfo, str);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo == null) {
                    return false;
                }
                if (!applicationInfo.enabled) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                A02(str);
                return false;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof DeadObjectException) {
                    A02(str);
                    return false;
                }
                throw e;
            }
        }
        return true;
    }

    public static boolean A05(PackageManager packageManager, String str) {
        Number number;
        if (packageManager == null) {
            return false;
        }
        if (A02) {
            number = (Number) A03.get(str);
        } else {
            number = null;
        }
        if (number != null) {
            return number.intValue() != 1;
        }
        int i = 2;
        do {
            try {
                A01(packageManager.getPackageInfo(str, 128), str);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                A02(str);
                return false;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof DeadObjectException) {
                    A02(str);
                    return false;
                }
                if (i != 0) {
                    i--;
                } else {
                    throw e;
                }
            }
        } while (i >= 0);
        throw new IllegalStateException("should be unreachable");
    }

    static {
        String[] strArr = {"Pixel", "Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL", "Pixel 3a", "Pixel 3a XL", "Pixel 4", "Pixel 4 XL", "Pixel 4a", "Pixel 4a (5G)", "Pixel 5", "Pixel 5a", "Pixel 6", "Pixel 6 Pro", "Pixel 6a", "Pixel 7", "Pixel 7 Pro", "Pixel C"};
        HashSet hashSet = new HashSet(19);
        int i = 0;
        do {
            String str = strArr[i];
            str.getClass();
            if (hashSet.add(str)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("duplicate element: ");
                sb.append((Object) str);
                throw new IllegalArgumentException(sb.toString());
            }
        } while (i < 19);
        A04 = Collections.unmodifiableSet(hashSet);
        A03 = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.pm.PackageInfo r5, final java.lang.String r6) {
        /*
            boolean r0 = X.C0JS.A02
            if (r0 == 0) goto L2f
            java.util.concurrent.ConcurrentHashMap r2 = X.C0JS.A03
            boolean r0 = r2.containsKey(r6)
            if (r0 != 0) goto L2f
            android.content.pm.ApplicationInfo r0 = r5.applicationInfo
            if (r0 == 0) goto L15
            boolean r1 = r0.enabled
            r0 = 2
            if (r1 != 0) goto L16
        L15:
            r0 = 3
        L16:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r6, r0)
            android.os.Handler r5 = X.C0JS.A01
            if (r5 == 0) goto L2f
            X.0JR r4 = new X.0JR
            r4.<init>()
            int r0 = X.C0JS.A00
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r5.postDelayed(r4, r2)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JS.A01(android.content.pm.PackageInfo, java.lang.String):void");
    }

    public static void A02(final String str) {
        if (A02) {
            ConcurrentHashMap concurrentHashMap = A03;
            if (!concurrentHashMap.containsKey(str)) {
                concurrentHashMap.put(str, 1);
                Handler handler = A01;
                if (handler != null) {
                    handler.postDelayed(new Runnable() { // from class: X.0JQ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0JS.A03.remove(str);
                        }
                    }, A00 * 1000);
                }
            }
        }
    }
}
