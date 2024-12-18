package X;

import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public abstract class LJK {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r8.length() == 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(X.C47308KvJ r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJK.A00(X.KvJ, java.lang.Object):java.lang.String");
    }

    public static final String A01(Object obj) {
        String str;
        C38321qM c38321qM;
        if (obj instanceof C1575375n) {
            c38321qM = ((C1575375n) obj).A01;
        } else if (obj instanceof C38321qM) {
            c38321qM = (C38321qM) obj;
        } else {
            if (obj instanceof C47813L9v) {
                str = ((C47813L9v) obj).A04;
                return AnonymousClass001.A0R("https://www.instagram.com/reel/", str);
            }
            throw AbstractC43594JPz.A0o(obj, "Expected either DirectClipsShare or Media, found: ", AbstractC166987dD.A1C());
        }
        str = c38321qM.A2f();
        return AnonymousClass001.A0R("https://www.instagram.com/reel/", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof X.C47551KzL
            r3 = 0
            if (r0 == 0) goto L4c
            X.KzL r4 = (X.C47551KzL) r4
            X.0do r0 = r4.A01
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = r4.A00
            X.51u r2 = new X.51u
            r2.<init>(r1, r0, r3)
        L14:
            java.lang.Object r4 = r2.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r2.A01
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.A02
            java.lang.String r2 = (java.lang.String) r2
            if (r4 == 0) goto L3d
            if (r3 == 0) goto L3d
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "https://www.instagram.com/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/live/"
            r1.append(r0)
            r1.append(r3)
        L38:
            java.lang.String r0 = r1.toString()
            return r0
        L3d:
            if (r2 == 0) goto L77
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "https://www.instagram.com/tv/"
            r1.append(r0)
            r1.append(r2)
            goto L38
        L4c:
            boolean r0 = r4 instanceof X.IKN
            if (r0 == 0) goto L7a
            X.IKN r4 = (X.IKN) r4
            X.4pt r0 = r4.A01
            if (r0 == 0) goto L72
            com.instagram.user.model.User r0 = r0.A03()
        L5a:
            java.lang.String r3 = r0.getUsername()
        L5e:
            X.4pt r0 = r4.A01
            if (r0 == 0) goto L6f
            java.lang.String r1 = r0.A0X
            r1.getClass()
        L67:
            java.lang.String r0 = r4.A05
            X.51u r2 = new X.51u
            r2.<init>(r3, r1, r0)
            goto L14
        L6f:
            java.lang.String r1 = r4.A03
            goto L67
        L72:
            com.instagram.user.model.User r0 = r4.A02
            if (r0 == 0) goto L5e
            goto L5a
        L77:
            java.lang.String r0 = ""
            return r0
        L7a:
            java.lang.String r0 = "Expected either LiveDeeplinkModel or DirectLiveViewerInvite"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJK.A02(java.lang.Object):java.lang.String");
    }

    public static final String A03(Object obj) {
        C09530e4 A1L;
        String str;
        User A14;
        if (obj instanceof C38321qM) {
            A1L = AbstractC166987dD.A1L(obj, ((C38321qM) obj).A0C.AmM());
        } else if (C9CL.A00(obj, 2)) {
            C9CL c9cl = (C9CL) obj;
            C38321qM c38321qM = (C38321qM) c9cl.A00;
            String str2 = c9cl.A02;
            if (str2 == null) {
                str2 = c38321qM.A0C.AmM();
            }
            A1L = AbstractC166987dD.A1L(c38321qM, str2);
        } else {
            throw AbstractC43594JPz.A0o(obj, "Expected either Media or DirectMediaShare, received ", AbstractC166987dD.A1C());
        }
        C38321qM c38321qM2 = (C38321qM) A1L.A00;
        String str3 = (String) A1L.A01;
        StringBuilder sb = new StringBuilder("https://www.instagram.com");
        if (c38321qM2 != null && (A14 = AbstractC25226BEj.A14(c38321qM2)) != null) {
            sb.append(AnonymousClass001.A0D(A14.getId(), '/'));
        }
        if (c38321qM2 != null) {
            str = c38321qM2.A2f();
        } else {
            str = null;
        }
        sb.append(AnonymousClass001.A0R("/p/", str));
        if (str3 != null) {
            sb.append(AnonymousClass001.A0R("?carousel_share_child_media_id=", str3));
        }
        return AbstractC166987dD.A19(sb);
    }
}
