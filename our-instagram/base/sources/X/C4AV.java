package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4AV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AV implements InterfaceC12870lZ, InterfaceC13000lm {
    public final C4AW A00;
    public final C41711wL A01;
    public final UserSession A02;
    public final C13920nI A03;

    public C4AV(UserSession userSession, C13920nI c13920nI, C4AW c4aw, C41711wL c41711wL) {
        C14360o3.A0B(c13920nI, 3);
        C14360o3.A0B(userSession, 5);
        this.A00 = c4aw;
        this.A01 = c41711wL;
        this.A03 = c13920nI;
        this.A02 = userSession;
        C218914p.A03(EnumC220415e.A03, this);
    }

    public final void A00(C75363a3 c75363a3) {
        C4AW c4aw = this.A00;
        String str = c75363a3.A0G;
        long j = c75363a3.A06;
        if (j > 0 && j != Long.MAX_VALUE) {
            C1UM c1um = c4aw.A00;
            if (c1um.getLong(str, -1L) < j) {
                C1ZT AR9 = c1um.AR9();
                AR9.A08(str, j);
                AR9.A03();
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A02, C05F.A03)) {
            C218914p.A06(this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(823442479);
        C14120nc.A00().ATO(new V6D(this));
        C0f9.A0A(-77973253, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1133894629, C0f9.A03(99174469));
    }
}
