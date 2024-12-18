package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OLg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54823OLg {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public C54823OLg(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new C50162MDp(this, 26));
        this.A02 = AbstractC09440dt.A01(new C50162MDp(this, 27));
    }

    public final AbstractC53524Nlq A00() {
        AbstractC53524Nlq abstractC53524Nlq;
        if (!AbstractC167007dF.A1Z(this.A02) && !AbstractC167007dF.A1Z(this.A01)) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession, 36310894765932912L)) {
                abstractC53524Nlq = NUJ.A00;
            } else if (C18U.A06(c06090Tz, userSession, 36310894767047025L)) {
                abstractC53524Nlq = NUK.A00;
            }
            return abstractC53524Nlq;
        }
        abstractC53524Nlq = NUI.A00;
        return abstractC53524Nlq;
    }

    public final boolean A01() {
        return C18U.A06(C06090Tz.A05, this.A00, 36310894768357752L);
    }

    public final boolean A02() {
        if (A00() instanceof NUJ) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36310894768095605L)) {
                return true;
            }
        }
        return false;
    }
}
