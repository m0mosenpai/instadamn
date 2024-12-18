package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1oY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37351oY {
    public static C37351oY A03;
    public C35043FcG A00;
    public FP0 A01;
    public XjB A02;

    public final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36321043773858902L) && A00(userSession)) {
            return true;
        }
        return false;
    }

    public final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36321043773727828L) && A00(userSession)) {
            return true;
        }
        return false;
    }

    public final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36321043774645345L) && A00(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A00(UserSession userSession) {
        if (C17060sy.A01.A01(userSession).A03.BYy() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FcG] */
    public final C35043FcG A01() {
        C35043FcG c35043FcG = this.A00;
        if (c35043FcG == null) {
            ?? obj = new Object();
            this.A00 = obj;
            return obj;
        }
        return c35043FcG;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FP0] */
    public final FP0 A02() {
        FP0 fp0 = this.A01;
        if (fp0 == null) {
            ?? obj = new Object();
            this.A01 = obj;
            return obj;
        }
        return fp0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.XjB, java.lang.Object] */
    public final void A03() {
        if (this.A02 == null) {
            this.A02 = new Object();
        }
    }
}
