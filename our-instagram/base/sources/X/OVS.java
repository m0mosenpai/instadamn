package X;

import com.facebook.spm.SentencePieceModel;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OVS {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.OG1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3SN A01(X.C73673Rt r14, X.C3RU r15, X.C3RU r16) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVS.A01(X.3Rt, X.3RU, X.3RU):X.3SN");
    }

    public OVS(UserSession userSession) {
        this.A00 = userSession;
    }

    public static final C3SN A00(OKP okp, C3RU c3ru) {
        try {
            return MSZ.A0O(new SentencePieceModel(okp.A01(c3ru)));
        } catch (Throwable th) {
            return MSW.A0L(null, th.getMessage(), false);
        }
    }
}
