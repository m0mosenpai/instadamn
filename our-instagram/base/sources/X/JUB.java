package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JUB extends AbstractC46524KiP {
    public C2EC A00;
    public C47922LEr A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final JUC A05;

    public JUB(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = new JUC(interfaceC11380iw, userSession);
    }
}
