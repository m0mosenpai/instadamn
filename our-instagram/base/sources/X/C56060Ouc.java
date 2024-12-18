package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ouc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56060Ouc implements InterfaceC12870lZ, InterfaceC13050lr {
    public int A00;
    public final C71383Hz A01;
    public final UserSession A02;
    public final List A03;

    public C56060Ouc(C71383Hz c71383Hz, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, c71383Hz);
        this.A02 = userSession;
        this.A01 = c71383Hz;
        this.A03 = AbstractC166987dD.A1E();
        C218914p.A05(this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-891488963);
        if (AbstractC166987dD.A1b(this.A03)) {
            C14120nc.A00().ATO(new NG7(this));
        }
        C0f9.A0A(1241492679, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(332003939, C0f9.A03(-1674877750));
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C218914p.A06(this);
    }
}
