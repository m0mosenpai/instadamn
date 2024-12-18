package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fzk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36290Fzk implements InterfaceC13000lm {
    public C173867oe A00;
    public final UserSession A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.7oe] */
    public C36290Fzk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new Object();
    }

    public static final boolean A00(C36290Fzk c36290Fzk, boolean z) {
        boolean A1b;
        UserSession userSession = c36290Fzk.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36314442408921657L)) {
            A1b = false;
        } else {
            if (z) {
                c06090Tz = C06090Tz.A05;
            }
            A1b = AbstractC31174DnI.A1b(C18U.A06(c06090Tz, userSession, 36314442409118268L));
        }
        if (A1b || !C18U.A06(C06090Tz.A05, userSession, 2342155956974061110L) || !AbstractC166987dD.A0x(userSession).getBoolean("fx_cal_profile_pic_is_upsell_seen", false)) {
            return false;
        }
        return true;
    }

    public final boolean A01(boolean z) {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342155956973995573L) && this.A00.A04 && !A00(this, false)) {
            if (!z) {
                c06090Tz = C06090Tz.A06;
            }
            return C18U.A06(c06090Tz, userSession, 36312943465334323L);
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C36290Fzk.class);
    }
}
