package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.SgI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63260SgI {
    public static final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    public static android.net.Uri A00(Context context, android.net.Uri uri) {
        if (AbstractC72723Nt.A00(context) && uri.getQueryParameter("theme") == null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("theme", "dark");
            return buildUpon.build();
        }
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A01(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r6 = X.AbstractC12880la.A04(r6)
            java.lang.String r5 = "#"
            r2 = 2
            java.lang.String[] r1 = r7.split(r5, r2)
            r0 = 0
            r0 = r1[r0]
            java.lang.StringBuilder r4 = X.AbstractC58318PtA.A0s(r0)
            int r0 = r1.length
            if (r0 != r2) goto L2d
            r0 = 1
            r3 = r1[r0]
        L18:
            java.lang.String r0 = "?"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "?android=1"
        L22:
            r4.append(r0)
            java.lang.String r1 = "&instagram_android_version="
            if (r6 == 0) goto L37
            goto L2f
        L2a:
            java.lang.String r0 = "&android=1"
            goto L22
        L2d:
            r3 = 0
            goto L18
        L2f:
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r6, r0)     // Catch: java.lang.Exception -> L37
            goto L38
        L37:
            r0 = 0
        L38:
            X.AbstractC50523MSb.A1N(r1, r0, r4)
            java.lang.String r2 = "&android_version="
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            if (r1 == 0) goto L49
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.lang.Exception -> L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            X.AbstractC50523MSb.A1N(r2, r0, r4)
            java.lang.String r2 = "&android_sdk="
            java.lang.String r1 = android.os.Build.VERSION.SDK
            if (r1 == 0) goto L5b
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.lang.Exception -> L5b
            goto L5c
        L5b:
            r0 = 0
        L5c:
            X.AbstractC50523MSb.A1N(r2, r0, r4)
            java.lang.String r2 = "&android_device_model="
            java.lang.String r1 = android.os.Build.MODEL
            if (r1 == 0) goto L6d
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.lang.Exception -> L6d
            goto L6e
        L6d:
            r0 = 0
        L6e:
            X.AbstractC50523MSb.A1N(r2, r0, r4)
            java.lang.String r2 = "&android_device_manuf="
            java.lang.String r1 = android.os.Build.MANUFACTURER
            if (r1 == 0) goto L7f
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.lang.Exception -> L7f
            goto L80
        L7f:
            r0 = 0
        L80:
            X.AbstractC50523MSb.A1N(r2, r0, r4)
            java.lang.String r2 = "&android_device_brand="
            java.lang.String r1 = android.os.Build.BRAND
            if (r1 == 0) goto L91
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.lang.Exception -> L91
            goto L92
        L91:
            r0 = 0
        L92:
            X.AbstractC50523MSb.A1N(r2, r0, r4)
            java.lang.String r2 = "&android_device_name="
            java.lang.String r1 = android.os.Build.DEVICE
            if (r1 == 0) goto La3
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.lang.Exception -> La3
            goto La4
        La3:
            r0 = 0
        La4:
            X.AbstractC50523MSb.A1N(r2, r0, r4)
            if (r3 == 0) goto Laf
            r4.append(r5)
            r4.append(r3)
        Laf:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63260SgI.A01(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String A02(Context context, String str) {
        android.net.Uri A01;
        if (AbstractC72723Nt.A00(context) && (A01 = AbstractC08820cl.A01(A00, str)) != null) {
            return A00(context, A01).toString();
        }
        return str;
    }
}
