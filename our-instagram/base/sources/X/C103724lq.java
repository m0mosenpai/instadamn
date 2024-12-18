package X;

import android.content.Context;
import android.location.LocationManager;
import android.location.LocationProvider;

/* renamed from: X.4lq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103724lq {
    public static final String[] A02 = {"gps", "network"};
    public final Context A00;
    public final LocationManager A01;

    public static Integer A00(C103724lq c103724lq, Integer num, java.util.Set set, java.util.Set set2, boolean z) {
        Integer num2;
        LocationProvider locationProvider;
        String[] strArr = A02;
        Integer num3 = null;
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            try {
                str.getClass();
                try {
                    locationProvider = c103724lq.A01.getProvider(str);
                } catch (IllegalArgumentException | IllegalStateException | NullPointerException unused) {
                    locationProvider = null;
                }
                if (locationProvider == null) {
                    num2 = C05F.A01;
                } else if (locationProvider.getPowerRequirement() == 3 && num != C05F.A0C) {
                    num2 = C05F.A01;
                } else {
                    locationProvider.hasMonetaryCost();
                    if (!c103724lq.A01.isProviderEnabled(str)) {
                        num2 = C05F.A0C;
                    } else if (z) {
                        boolean z2 = false;
                        try {
                            if (c103724lq.A00.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                                z2 = true;
                            }
                        } catch (Throwable unused2) {
                        }
                        if (z2) {
                            num2 = C05F.A0N;
                        } else {
                            num2 = C05F.A00;
                        }
                    } else {
                        boolean z3 = false;
                        try {
                            if (c103724lq.A00.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                                z3 = true;
                            }
                        } catch (Throwable unused3) {
                        }
                        if (z3) {
                            num2 = C05F.A0N;
                        } else {
                            num2 = C05F.A00;
                        }
                    }
                }
            } catch (SecurityException unused4) {
                num2 = C05F.A00;
            }
            if (num2 == C05F.A0N) {
                if (set != null) {
                    set.add(str);
                }
            } else if (num2 == C05F.A0C && set2 != null) {
                set2.add(str);
            }
            if (num3 == null || num3.compareTo(num2) < 0) {
                num3 = num2;
            }
        }
        if (num3 == null) {
            return C05F.A01;
        }
        return num3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0013, code lost:
    
        if (r3.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C58513Pwh A01(java.lang.Integer r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            android.content.Context r3 = r7.A00     // Catch: java.lang.Throwable -> Lb
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Lb
            goto L15
        Lb:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            android.content.Context r3 = r7.A00     // Catch: java.lang.Throwable -> L44
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L44
        L15:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.lang.Integer r4 = A00(r7, r8, r6, r5, r9)
            java.lang.Integer r2 = X.C05F.A0N
            if (r4 == r2) goto L2f
            java.lang.Integer r2 = X.C05F.A00
        L29:
            X.Pwh r3 = new X.Pwh
            r3.<init>(r4, r2, r6, r5)
            return r3
        L2f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L41
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            int r0 = r3.checkCallingOrSelfPermission(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L3e
            goto L29
        L3e:
            java.lang.Integer r2 = X.C05F.A0C
            goto L29
        L41:
            java.lang.Integer r2 = X.C05F.A01
            goto L29
        L44:
            java.lang.Integer r2 = X.C05F.A00
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            X.Pwh r3 = new X.Pwh
            r3.<init>(r2, r2, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103724lq.A01(java.lang.Integer, boolean):X.Pwh");
    }

    public C103724lq(Context context, LocationManager locationManager) {
        this.A00 = context;
        this.A01 = locationManager;
    }
}
