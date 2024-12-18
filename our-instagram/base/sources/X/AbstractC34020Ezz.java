package X;

/* renamed from: X.Ezz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34020Ezz {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FQ r7, X.C6FW r8) {
        /*
            java.lang.Object r1 = r8.A01()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.C14360o3.A0C(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.F8K.A00()
            java.util.HashMap r0 = X.C6BQ.A0H(r1)
            java.lang.StringBuilder r3 = X.AbstractC166987dD.A1C()
            java.util.Iterator r2 = X.AbstractC166997dE.A14(r0)
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L44
            java.util.Map$Entry r1 = X.AbstractC166987dD.A1K(r2)
            java.lang.String r0 = "\""
            r3.append(r0)
            java.lang.String r0 = X.AbstractC31172DnG.A17(r1)
            r3.append(r0)
            java.lang.String r0 = "\":\""
            r3.append(r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            java.lang.String r0 = "\","
            r3.append(r0)
            goto L1a
        L44:
            int r0 = r3.length()
            if (r0 <= 0) goto L6f
            int r0 = r3.length()
            int r0 = r0 + (-1)
            r3.deleteCharAt(r0)
            java.lang.String r2 = "{"
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "}"
            java.lang.String r0 = X.AnonymousClass001.A0g(r2, r1, r0)
            X.16L r0 = X.C16V.A00(r0)     // Catch: java.io.IOException -> L68
            com.instagram.infocenter.model.InfoCenterFactShareInfo r6 = X.AbstractC47056KrD.parseFromJson(r0)     // Catch: java.io.IOException -> L68
            goto L70
        L68:
            java.lang.String r1 = "InfoCenterPluginImpl"
            java.lang.String r0 = "Unable to parse info center fact."
            X.C0w9.A03(r1, r0)
        L6f:
            r6 = 0
        L70:
            r5 = 0
            if (r6 == 0) goto L9f
            com.instagram.common.session.UserSession r4 = X.AbstractC31177DnL.A0S(r7)
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = X.C6BQ.A04(r7)
            X.3DN r3 = r1.A00(r0)
            if (r3 == 0) goto L9f
            X.1Zo r0 = X.C28531Zo.A04
            X.1Zl r2 = r0.A02
            X.2EY r1 = X.C2EY.A13
            X.0iw r0 = X.C6BQ.A08(r7)
            X.FRp r2 = r2.A07(r0, r4, r1)
            android.os.Bundle r1 = r2.A07
            java.lang.String r0 = "DirectShareSheetConstants.info_center_fact"
            r1.putParcelable(r0, r6)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r2.A00()
            r3.A0K(r0)
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34020Ezz.A00(X.6FQ, X.6FW):java.lang.Object");
    }
}
