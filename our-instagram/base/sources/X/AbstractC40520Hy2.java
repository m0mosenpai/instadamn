package X;

/* renamed from: X.Hy2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40520Hy2 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FQ r16, X.C6FW r17) {
        /*
            r15 = 0
            r2 = 1
            r3 = r17
            java.lang.Object r1 = r3.A03(r15)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Number"
            int r14 = X.AbstractC25230BEn.A0D(r1, r0)
            java.util.List r0 = r3.A00
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            X.0ll r10 = X.AbstractC31175DnJ.A0J(r16)
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            if (r2 == 0) goto L26
            java.lang.String r0 = "module"
            java.lang.String r12 = X.AbstractC166987dD.A1A(r0, r2)
            if (r12 != 0) goto L28
        L26:
            java.lang.String r12 = ""
        L28:
            r3 = 0
            if (r2 == 0) goto L50
            java.lang.String r0 = "submodule"
            java.lang.String r13 = X.AbstractC166987dD.A1A(r0, r2)
            java.lang.String r0 = "shopping_session_id"
            java.lang.String r11 = X.AbstractC166987dD.A1A(r0, r2)
        L37:
            X.HiZ r7 = X.EnumC39644HiZ.UNKNOWN
            X.Hie r9 = X.EnumC39649Hie.A0C
            X.Hif r8 = X.EnumC39650Hif.A0I
            X.Hig r6 = X.EnumC39651Hig.A0I
            if (r2 == 0) goto La5
            java.lang.String r0 = "analytics_experience"
            java.lang.String r1 = X.AbstractC166987dD.A1A(r0, r2)
            if (r1 == 0) goto L5d
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = X.AbstractC166997dE.A10(r0, r1)
            goto L53
        L50:
            r13 = r3
            r11 = r3
            goto L37
        L53:
            java.lang.Class<X.HiZ> r0 = X.EnumC39644HiZ.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L5b
            if (r0 != 0) goto L5c
        L5b:
            r0 = r7
        L5c:
            r7 = r0
        L5d:
            java.lang.String r0 = "analytics_page"
            java.lang.String r1 = X.AbstractC166987dD.A1A(r0, r2)
            if (r1 == 0) goto L75
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = X.AbstractC166997dE.A10(r0, r1)
            java.lang.Class<X.Hie> r0 = X.EnumC39649Hie.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L73
            if (r0 != 0) goto L74
        L73:
            r0 = r9
        L74:
            r9 = r0
        L75:
            java.lang.String r0 = "analytics_module"
            java.lang.String r1 = X.AbstractC166987dD.A1A(r0, r2)
            if (r1 == 0) goto L8d
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = X.AbstractC166997dE.A10(r0, r1)
            java.lang.Class<X.Hif> r0 = X.EnumC39650Hif.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L8b
            if (r0 != 0) goto L8c
        L8b:
            r0 = r8
        L8c:
            r8 = r0
        L8d:
            java.lang.String r0 = "analytics_component"
            java.lang.String r1 = X.AbstractC166987dD.A1A(r0, r2)
            if (r1 == 0) goto La5
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = X.AbstractC166997dE.A10(r0, r1)
            java.lang.Class<X.Hig> r0 = X.EnumC39651Hig.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch: java.lang.IllegalArgumentException -> La3
            if (r0 != 0) goto La4
        La3:
            r0 = r6
        La4:
            r6 = r0
        La5:
            X.1XJ r4 = X.C1XJ.A00
            androidx.fragment.app.FragmentActivity r5 = X.C6BQ.A04(r16)
            X.HiZ r7 = (X.EnumC39644HiZ) r7
            X.Hie r9 = (X.EnumC39649Hie) r9
            X.Hif r8 = (X.EnumC39650Hif) r8
            X.Hig r6 = (X.EnumC39651Hig) r6
            r4.A0n(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC40520Hy2.A00(X.6FQ, X.6FW):java.lang.Object");
    }
}
