package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6P0, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6P0 {
    public static final Integer A00(UserSession userSession, C41181vS c41181vS) {
        C14360o3.A0B(userSession, 1);
        if (c41181vS.CY4()) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            if (c38321qM.A5n()) {
                return C05F.A0C;
            }
        }
        if (AbstractC70833Fv.A00(userSession).A02(c41181vS)) {
            return C05F.A01;
        }
        if (A01(userSession, c41181vS)) {
            return C05F.A00;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0.A0t != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.common.session.UserSession r2, X.C41181vS r3) {
        /*
            r0 = 1
            X.C14360o3.A0B(r2, r0)
            boolean r0 = r3.CY4()
            r1 = 0
            if (r0 == 0) goto L22
            X.1qM r0 = r3.A0b
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = r0.A3N()
            X.C14360o3.A0B(r0, r1)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = X.AbstractC101614hW.A05(r0)
            if (r0 == 0) goto L22
            boolean r0 = r0.A0t
            if (r0 == 0) goto L22
        L20:
            r1 = 1
        L21:
            return r1
        L22:
            boolean r0 = X.AbstractC140886Yq.A00(r2, r3)
            if (r0 == 0) goto L21
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6P0.A01(com.instagram.common.session.UserSession, X.1vS):boolean");
    }
}
