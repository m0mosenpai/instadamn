package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.76B, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C76B {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1rE, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C38321qM A00(X.C83403nh r15) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76B.A00(X.3nh):X.1qM");
    }

    public static final String A01(C83403nh c83403nh) {
        String str;
        android.net.Uri A03;
        C910143t A01 = AbstractC158887Ba.A01(c83403nh);
        if (A01 != null && (str = A01.A0w) != null && (A03 = AbstractC08820cl.A03(str)) != null) {
            return A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        return null;
    }
}
