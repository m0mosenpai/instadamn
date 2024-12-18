package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class JXM implements InterfaceC13050lr {
    public final UserSession A00;
    public final List A01;
    public final List A02;
    public final InterfaceC16820sZ A03;
    public final JZL A04;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A02.clear();
        this.A01.clear();
        C72Z.A01(null);
        if (AbstractC201688vy.A01(this.A00, C05F.A00) || z) {
            C24231Gs.A00().A02(this.A04);
        }
    }

    public JXM(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167017dG.A1P(userSession, interfaceC16820sZ);
        this.A00 = userSession;
        this.A03 = interfaceC16820sZ;
        this.A02 = AbstractC166987dD.A1E();
        this.A01 = AbstractC166987dD.A1E();
        JZL jzl = new JZL(this, 0);
        this.A04 = jzl;
        C24231Gs.A00().A01(jzl);
    }
}
