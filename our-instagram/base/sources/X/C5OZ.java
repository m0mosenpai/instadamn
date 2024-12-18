package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5OZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5OZ implements C5OV {
    public static final C116215Oa A01 = new Object();
    public final UserSession A00;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36319540535107057L) == false) goto L8;
     */
    @Override // X.C5OV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E3b(X.C5OW r9) {
        /*
            r8 = this;
            X.5Oa r6 = X.C5OZ.A01
            com.instagram.common.session.UserSession r5 = r8.A00
            boolean r0 = X.C116215Oa.A00(r5)
            r4 = 0
            if (r0 == 0) goto L48
            X.0vz r0 = X.AbstractC12960li.A00
            X.0y2 r7 = X.AbstractC19730y1.A00(r0)
            X.0y2 r0 = X.AbstractC19730y1.A00(r0)
            X.0xq r1 = r0.A00
            java.lang.String r0 = "preference_has_denied_push_system_dialog"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L2d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319540535107057(0x81086e00001df1, double:3.031961909228277E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L2e
        L2d:
            r0 = 0
        L2e:
            r3 = 33
            if (r0 == 0) goto L49
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36601015511879774(0x82086e0001105e, double:3.209967817948101E-306)
            long r1 = X.C18U.A01(r2, r5, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L48
            boolean r0 = r6.A01(r5, r1)
            if (r0 == 0) goto L48
        L47:
            r4 = 1
        L48:
            return r4
        L49:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L48
            X.0xq r1 = r7.A00
            java.lang.String r0 = "preference_has_asked_push_permission_in_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L48
            java.lang.String r0 = "preference_push_permission_impression_count"
            int r0 = r1.getInt(r0, r4)
            if (r0 != 0) goto L48
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5OZ.E3b(X.5OW):boolean");
    }

    public C5OZ(UserSession userSession) {
        this.A00 = userSession;
    }
}
