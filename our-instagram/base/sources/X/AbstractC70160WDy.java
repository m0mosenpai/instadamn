package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WDy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70160WDy {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r2.has("client_input_params") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap A00(android.net.Uri r5) {
        /*
            java.lang.String r4 = "server_params"
            java.lang.String r0 = "params"
            java.lang.String r3 = r5.getQueryParameter(r0)
            if (r3 == 0) goto L56
            int r0 = r3.length()
            if (r0 == 0) goto L56
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r2.has(r4)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L24
            java.lang.String r0 = "client_input_params"
            boolean r1 = r2.has(r0)     // Catch: java.lang.Throwable -> L50
            r0 = 0
            if (r1 == 0) goto L25
        L24:
            r0 = 1
        L25:
            if (r0 == 0) goto L33
            boolean r0 = r2.has(r4)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L32
            java.lang.String r3 = r2.getString(r4)     // Catch: java.lang.Throwable -> L50
            goto L33
        L32:
            r3 = 0
        L33:
            if (r3 != 0) goto L3b
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            return r0
        L3b:
            X.15v r0 = X.AbstractC221915u.A00     // Catch: java.lang.Throwable -> L50
            X.16L r0 = r0.A03(r3)     // Catch: java.lang.Throwable -> L50
            r0.A1J()     // Catch: java.lang.Throwable -> L50
            java.util.HashMap r0 = X.FTf.A00(r0)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L5b
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L50
            return r0
        L50:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        L56:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70160WDy.A00(android.net.Uri):java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.Context r7, android.net.Uri r8, com.instagram.common.session.UserSession r9, int r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70160WDy.A01(android.content.Context, android.net.Uri, com.instagram.common.session.UserSession, int):void");
    }

    public static void A02(Context context, UserSession userSession, String str) {
        android.net.Uri A03 = AbstractC08820cl.A03(str);
        AbstractC191798eb.A03(context, new C191778eZ(userSession), A03.getQueryParameter("app_id"), null, A00(A03), 600L);
    }

    public static void A03(UserSession userSession, Context context, String str) {
        A01(context, AbstractC08820cl.A03(str), userSession, 0);
    }
}
