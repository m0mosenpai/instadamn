package X;

/* renamed from: X.2l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC57872l0 {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r1 != 2) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(com.instagram.common.session.UserSession r6, android.content.Context r7) {
        /*
            X.0xq r1 = X.C1H6.A00()
            java.lang.String r0 = "KEY_CONFIG_CURRENT_SYSTEM_UI_MODE"
            r2 = -1
            int r5 = r1.getInt(r0, r2)
            X.0xq r1 = X.C1H6.A00()
            java.lang.String r0 = "KEY_CONFIG_UI_MODE"
            int r1 = r1.getInt(r0, r2)
            X.0vz r0 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r0)
            int r0 = r0.A00()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = -1
            r3 = 1
            if (r1 == r2) goto L52
            if (r1 == r3) goto L4d
            r0 = 2
            if (r1 == r0) goto L52
        L2c:
            X.0wW r2 = X.AbstractC12220kQ.A02(r6)
            java.lang.String r1 = "ig_dark_mode_opt"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L84
            r0 = 32
            if (r5 == r0) goto L43
            r3 = 0
        L43:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "os_dark_mode_settings"
            r2.A7v(r0, r1)
            goto L57
        L4d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L2c
        L52:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L2c
        L57:
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r7.getSystemService(r0)     // Catch: java.lang.Exception -> L68
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch: java.lang.Exception -> L68
            if (r0 != 0) goto L63
            r0 = -1
            goto L69
        L63:
            int r0 = r0.getNightMode()     // Catch: java.lang.Exception -> L68
            goto L69
        L68:
            r0 = -1
        L69:
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "dark_mode_in_app_toggle"
            r2.A9K(r0, r1)
            int r0 = r4.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "in_app_dark_mode_setting"
            r2.A9K(r0, r1)
            r2.Cht()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC57872l0.A00(com.instagram.common.session.UserSession, android.content.Context):void");
    }
}
