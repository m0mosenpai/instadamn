package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G54 implements InterfaceC37162GYz {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C7U0 A02;
    public final InterfaceC164947Zj A03;

    @Override // X.InterfaceC37162GYz
    public final boolean isEnabled() {
        InterfaceC163837Ux C7r = this.A02.C7r();
        if (C4GR.A02(AbstractC31172DnG.A00(C7r))) {
            UserSession userSession = this.A01;
            if (C14360o3.A0K(userSession.userId, C7r.Bj3()) && C18U.A06(C06090Tz.A05, userSession, 36322821890124461L)) {
                return true;
            }
        }
        return false;
    }

    public G54(FragmentActivity fragmentActivity, UserSession userSession, C7U0 c7u0, InterfaceC164947Zj interfaceC164947Zj) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = c7u0;
        this.A03 = interfaceC164947Zj;
    }

    @Override // X.InterfaceC37162GYz
    public final List getItems() {
        C01L A1I = C0eM.A1I();
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C7U0 c7u0 = this.A02;
        C32832Eca c32832Eca = new C32832Eca(fragmentActivity, userSession, c7u0);
        if (c32832Eca.isEnabled()) {
            A1I.add(c32832Eca);
        }
        A1I.add(new C36420G4v(c7u0, this.A03, AbstractC31174DnI.A0V(c7u0).A08));
        return C0eM.A1J(A1I);
    }
}
