package X;

/* renamed from: X.Ffm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35194Ffm {
    public static final C35194Ffm A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r4, android.net.Uri r5, com.instagram.common.session.UserSession r6, X.C38321qM r7) {
        /*
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "www.facebook.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            if (r7 == 0) goto L5c
            X.1rF r0 = r7.A0C
            X.JLN r0 = r0.AtQ()
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.B4d()
        L1f:
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri r3 = r0.build()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36609506662356881(0x82102700031791, double:3.215337655700942E-306)
            int r1 = X.AbstractC25225BEi.A07(r2, r6, r0)
            java.lang.String r0 = "com.facebook.wakizashi"
            boolean r2 = X.C0JS.A03(r4, r0, r1)
            java.lang.String r0 = "com.facebook.katana"
            boolean r1 = X.C0JS.A03(r4, r0, r1)
            if (r2 != 0) goto L43
            r0 = 0
            if (r1 == 0) goto L44
        L43:
            r0 = 1
        L44:
            java.lang.String r1 = "android.intent.action.VIEW"
            if (r0 == 0) goto L53
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r5)
            boolean r0 = X.C12260kU.A0B(r4, r0)
            if (r0 != 0) goto L5b
        L53:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r3)
            X.C12260kU.A0E(r4, r0)
        L5b:
            return
        L5c:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35194Ffm.A00(android.content.Context, android.net.Uri, com.instagram.common.session.UserSession, X.1qM):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0078, code lost:
    
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12) {
        /*
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "fb"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "fb_shorts"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "viewer"
            android.net.Uri$Builder r1 = r1.path(r0)
            r0 = 3292(0xcdc, float:4.613E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r0, r12)
            int r0 = r10.intValue()
            if (r0 == 0) goto Lc2
            java.lang.String r3 = "comment_id"
        L29:
            if (r0 == 0) goto Lbe
            java.lang.String r2 = "0"
        L2d:
            android.net.Uri$Builder r4 = r1.appendQueryParameter(r3, r2)
            java.lang.String r1 = "source"
            java.lang.String r0 = "ig"
            android.net.Uri r7 = X.AbstractC31174DnI.A0B(r4, r1, r0)
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r6 = "https"
            android.net.Uri$Builder r0 = r0.scheme(r6)
            java.lang.String r5 = "www.facebook.com"
            android.net.Uri$Builder r1 = r0.authority(r5)
            java.lang.String r0 = "reel"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r12)
            android.net.Uri r3 = X.AbstractC31174DnI.A0B(r0, r3, r2)
            X.C14360o3.A0A(r7)
            X.C14360o3.A0A(r3)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36602295412331139(0x82099800041283, double:3.2107772321472896E-306)
            int r1 = X.AbstractC25225BEi.A07(r2, r9, r0)
            java.lang.String r0 = "com.facebook.wakizashi"
            boolean r2 = X.C0JS.A03(r8, r0, r1)
            java.lang.String r0 = "com.facebook.katana"
            boolean r1 = X.C0JS.A03(r8, r0, r1)
            if (r2 != 0) goto L7a
            r0 = 0
            if (r1 == 0) goto L7b
        L7a:
            r0 = 1
        L7b:
            java.lang.String r4 = "android.intent.action.VIEW"
            if (r0 == 0) goto Lb5
            if (r11 == 0) goto Lb5
            int r0 = r11.length()
            if (r0 == 0) goto Lb5
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r6)
            android.net.Uri$Builder r1 = r0.authority(r5)
            java.lang.String r0 = "inter_app/redirect"
            android.net.Uri$Builder r1 = r1.path(r0)
            java.lang.String r0 = "account_id"
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r11)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "destination_url"
            android.net.Uri r1 = X.AbstractC31174DnI.A0B(r2, r0, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r1)
            boolean r0 = X.C12260kU.A0B(r8, r0)
            if (r0 != 0) goto Lbd
        Lb5:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r3)
            X.C12260kU.A0E(r8, r0)
        Lbd:
            return
        Lbe:
            java.lang.String r2 = "true"
            goto L2d
        Lc2:
            java.lang.String r3 = "open_like_count"
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35194Ffm.A01(android.content.Context, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
