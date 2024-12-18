package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class Ld4 implements InterfaceC13000lm {
    public boolean A00;
    public final C42221xC A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public Ld4(C42221xC c42221xC, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = c42221xC;
        this.A02 = AbstractC31174DnI.A0S();
        this.A05 = AbstractC09440dt.A01(C50255MHk.A02(this, 46));
        this.A06 = AbstractC09440dt.A01(C50255MHk.A02(this, 47));
        this.A04 = AbstractC09440dt.A01(C50255MHk.A02(this, 45));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A01();
    }
}
