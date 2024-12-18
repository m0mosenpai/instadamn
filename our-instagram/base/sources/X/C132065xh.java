package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132065xh {
    public final UserSession A00;
    public final C1341764d A01;
    public final C42221xC A02;

    public C132065xh(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C42201xA c42201xA = C1334460n.A00(userSession, EnumC132075xi.A0k).A02;
        C14360o3.A07(c42201xA);
        this.A02 = c42201xA.A0K(C132085xj.A00);
        this.A01 = (C1341764d) userSession.A01(C1341764d.class, C64c.A00);
    }

    public final C42221xC A02(String str) {
        UserSession userSession = this.A00;
        if (AbstractC132045xf.A00(userSession)) {
            L6Q A00 = AbstractC46875KoI.A00(userSession);
            String str2 = (String) this.A01.A01.get(2);
            if (str2 == null) {
                str2 = "";
            }
            C49212LpT c49212LpT = new C49212LpT(this, A00);
            C91P A01 = C6JS.A05.A00(A00.A00).A01();
            if (A01 != null) {
                return new LFg(A01).A01(str).A0T(new RunnableC50020M6j(A01, c49212LpT, A00, str2, str));
            }
            return C42221xC.A09(false);
        }
        return this.A02.A0L(new C1341864e(new C50258MHn(this, str)));
    }

    public final C42221xC A00() {
        return this.A02.A0L(new C1341864e(new C9EL(this, 33)));
    }

    public final C42221xC A01(int i, int i2, boolean z) {
        UserSession userSession = this.A00;
        L6Q A00 = AbstractC46875KoI.A00(userSession);
        if (AbstractC132045xf.A00(userSession)) {
            boolean A01 = this.A01.A01(i);
            C49211LpS c49211LpS = new C49211LpS(this, A00);
            C91P A012 = C6JS.A05.A00(A00.A00).A01();
            if (A012 != null) {
                return LFg.A00(new LFg(A012)).A0L(new C48345LaL(new C50265MHu(i, i2, z))).A0T(new M77(A012, c49211LpS, A00, i, i2, A01, z));
            }
            return C42221xC.A09(false);
        }
        return this.A02.A0L(new C1341864e(new MI3(this, i, i2, z)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C133075zY r14) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132065xh.A03(X.5zY):void");
    }
}
