package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.PvU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58446PvU {
    public static final AtomicInteger A03 = MSW.A1C((int) SystemClock.elapsedRealtime());
    public Bundle A00;
    public final Context A01;
    public final String A02;

    public static final synchronized Bundle A00(C58446PvU c58446PvU) {
        Bundle bundle;
        synchronized (c58446PvU) {
            bundle = c58446PvU.A00;
            if (bundle == null) {
                try {
                    ApplicationInfo applicationInfo = c58446PvU.A01.getPackageManager().getApplicationInfo(c58446PvU.A02, 128);
                    if (applicationInfo != null && (bundle = ((PackageItemInfo) applicationInfo).metaData) != null) {
                        c58446PvU.A00 = bundle;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String valueOf = String.valueOf(e);
                    android.util.Log.w("FirebaseMessaging", MSZ.A0u("Couldn't get own application info: ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 35)));
                }
                bundle = Bundle.EMPTY;
            }
        }
        return bundle;
    }

    public C58446PvU(Context context, String str) {
        this.A01 = context;
        this.A02 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A01(android.os.Bundle r13, X.C58446PvU r14, java.lang.String r15) {
        /*
            java.lang.String r12 = A02(r13, r15)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L62
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r7 = "_loc_key"
            int r8 = r7.length()
            if (r8 == 0) goto L69
            java.lang.String r0 = r1.concat(r7)
        L1a:
            java.lang.String r2 = A02(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r12 = 0
            if (r0 != 0) goto L62
            android.content.Context r0 = r14.A01
            android.content.res.Resources r3 = r0.getResources()
            java.lang.String r1 = r14.A02
            java.lang.String r0 = "string"
            int r6 = r3.getIdentifier(r2, r0, r1)
            java.lang.String r5 = " Default value will be used."
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = java.lang.String.valueOf(r15)
            if (r6 != 0) goto L6f
            if (r8 == 0) goto L63
            java.lang.String r0 = r1.concat(r7)
        L44:
            r1 = 6
            java.lang.String r2 = r0.substring(r1)
            int r0 = X.AbstractC58319PtB.A05(r2)
            int r0 = r0 + 49
            java.lang.StringBuilder r1 = X.AbstractC58320PtC.A15(r15, r0)
            r1.append(r2)
            java.lang.String r0 = " resource not found: "
            r1.append(r0)
            java.lang.String r0 = X.MSZ.A0u(r15, r5, r1)
            android.util.Log.w(r4, r0)
        L62:
            return r12
        L63:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L44
        L69:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L1a
        L6f:
            java.lang.String r10 = "_loc_args"
            int r11 = r10.length()
            if (r11 == 0) goto L86
            java.lang.String r0 = r1.concat(r10)
        L7b:
            java.lang.String r7 = A02(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto Ld1
            goto L8c
        L86:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L7b
        L8c:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: org.json.JSONException -> La3
            r9.<init>(r7)     // Catch: org.json.JSONException -> La3
            int r8 = r9.length()     // Catch: org.json.JSONException -> La3
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch: org.json.JSONException -> La3
            r1 = 0
        L98:
            if (r1 >= r8) goto Ld2
            java.lang.Object r0 = r9.opt(r1)     // Catch: org.json.JSONException -> La3
            r2[r1] = r0     // Catch: org.json.JSONException -> La3
            int r1 = r1 + 1
            goto L98
        La3:
            java.lang.String r1 = java.lang.String.valueOf(r15)
            if (r11 == 0) goto Ld9
            java.lang.String r0 = r1.concat(r10)
        Lad:
            r1 = 6
            java.lang.String r2 = r0.substring(r1)
            int r0 = X.AbstractC58319PtB.A05(r2)
            int r0 = r0 + 41
            java.lang.StringBuilder r1 = X.AbstractC58320PtC.A15(r7, r0)
            java.lang.String r0 = "Malformed "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "  Default value will be used."
            X.AbstractC58320PtC.A1O(r0, r4, r1)
        Ld1:
            r2 = r12
        Ld2:
            if (r2 != 0) goto Ldf
            java.lang.String r12 = r3.getString(r6)
            return r12
        Ld9:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto Lad
        Ldf:
            java.lang.String r12 = r3.getString(r6, r2)     // Catch: java.util.MissingFormatArgumentException -> Le4
            return r12
        Le4:
            r3 = move-exception
            java.lang.String r2 = java.util.Arrays.toString(r2)
            int r0 = X.AbstractC58319PtB.A05(r15)
            int r0 = r0 + 58
            java.lang.StringBuilder r1 = X.AbstractC58320PtC.A15(r2, r0)
            java.lang.String r0 = "Missing format argument for "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.lang.String r0 = X.MSZ.A0u(r2, r5, r1)
            android.util.Log.w(r4, r0, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58446PvU.A01(android.os.Bundle, X.PvU, java.lang.String):java.lang.String");
    }

    public static String A02(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return bundle.getString(str.replace("gcm.n.", "gcm.notification."));
        }
        return string;
    }

    public static void A03(Intent intent, Bundle bundle) {
        Iterator A14 = AbstractC58319PtB.A14(bundle);
        while (A14.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A14);
            if (A1B.startsWith("google.c.a.") || A1B.equals("from")) {
                intent.putExtra(A1B, bundle.getString(A1B));
            }
        }
    }
}
