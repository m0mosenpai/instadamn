package X;

/* renamed from: X.1o2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37041o2 {
    public static C37041o2 A00;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r1.A00 != X.C05F.A0C) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(android.os.Bundle r7, androidx.fragment.app.FragmentActivity r8, X.AbstractC12990ll r9) {
        /*
            r6 = this;
            r2 = 1
            X.C14360o3.A0B(r8, r2)
            boolean r0 = r9 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L11
            X.1Ur r0 = X.AbstractC35178FfV.A00()
            r0.A00(r8, r7, r9)
        Lf:
            r3 = 0
            return r3
        L11:
            r1 = r9
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r5 = 1
            java.lang.String r4 = "short_url"
            if (r7 == 0) goto L3c
            boolean r0 = r7.containsKey(r4)
            if (r0 != r2) goto L3c
        L20:
            X.2mJ r1 = X.AbstractC58592mI.A00(r1)
            boolean r0 = r1.A02
            if (r0 == 0) goto L2f
            java.lang.Integer r1 = r1.A00
            java.lang.Integer r0 = X.C05F.A0C
            r3 = 1
            if (r1 == r0) goto L30
        L2f:
            r3 = 0
        L30:
            java.lang.String r2 = "Required value was null."
            if (r3 != 0) goto L44
            if (r5 == 0) goto L62
            if (r7 == 0) goto L3e
            X.AbstractC35275FhA.A06(r7, r8, r9)
            goto Lf
        L3c:
            r5 = 0
            goto L20
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L44:
            java.lang.String r0 = "instagram://clips_home"
            android.net.Uri r1 = X.AbstractC08820cl.A03(r0)
            if (r5 == 0) goto L79
            android.net.Uri$Builder r1 = r1.buildUpon()
            if (r7 == 0) goto L5c
            java.lang.String r0 = r7.getString(r4)
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r4, r0)
            goto L75
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L62:
            java.lang.String r0 = "instagram://explore"
            android.net.Uri r0 = X.AbstractC08820cl.A03(r0)
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "ClipsConstants.URL_PARAM_AUTO_LAUNCH_EXPLORE_CLIPS_VIEWER"
            java.lang.String r0 = "1"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
        L75:
            android.net.Uri r1 = r0.build()
        L79:
            X.14I r0 = X.C14H.A03
            X.14H r0 = r0.A00()
            android.content.Intent r0 = r0.A01(r8)
            android.content.Intent r0 = r0.setData(r1)
            X.C14360o3.A07(r0)
            X.C12260kU.A0C(r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37041o2.A00(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0ll):boolean");
    }
}
