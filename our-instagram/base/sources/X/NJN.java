package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NJN extends AbstractC55194Oe0 {
    public final UserSession A00;
    public final AnonymousClass841 A01;

    public static final boolean A00(UserSession userSession, C51754Mtd c51754Mtd) {
        EnumC40111tc enumC40111tc;
        if (c51754Mtd != null) {
            enumC40111tc = c51754Mtd.A0D;
        } else {
            enumC40111tc = null;
        }
        if (enumC40111tc == EnumC40111tc.A0Q) {
            return C36A.A09(userSession);
        }
        if ((c51754Mtd != null ? c51754Mtd.A0D : null) == EnumC40111tc.A09) {
            if (!AbstractC55179Odk.A04(c51754Mtd)) {
                return C36A.A05(userSession);
            }
            return C36A.A04(userSession);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return X.AbstractC53982Ntt.A00(r4.A00).A03(r6, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0011, code lost:
    
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (X.AbstractC55179Odk.A04(r5) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5.A0D != X.EnumC40111tc.A0Q) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(X.C51754Mtd r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L10
            X.1tc r1 = r5.A0D
            X.1tc r0 = X.EnumC40111tc.A09
            if (r1 != r0) goto L10
            boolean r0 = X.AbstractC55179Odk.A04(r5)
            r2 = 1
            if (r0 != 0) goto L13
        L10:
            r2 = 0
            if (r5 == 0) goto L1a
        L13:
            X.1tc r1 = r5.A0D
            X.1tc r0 = X.EnumC40111tc.A0Q
            if (r1 != r0) goto L1a
            r3 = 0
        L1a:
            com.instagram.common.session.UserSession r0 = r4.A00
            X.Ovx r0 = X.AbstractC53982Ntt.A00(r0)
            boolean r0 = r0.A03(r6, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJN.A09(X.Mtd, boolean):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJN(UserSession userSession, AnonymousClass841 anonymousClass841) {
        super(userSession, EnumC53117NeU.A03);
        AbstractC167017dG.A1P(userSession, anonymousClass841);
        this.A00 = userSession;
        this.A01 = anonymousClass841;
    }
}
