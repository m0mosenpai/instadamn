package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G53 implements InterfaceC37162GYz {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C7U0 A03;

    @Override // X.InterfaceC37162GYz
    public final boolean isEnabled() {
        return this.A03.C7r().CPl();
    }

    public G53(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = c7u0;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37162GYz
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C7U0 c7u0 = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C36422G4x c36422G4x = new C36422G4x(fragmentActivity, interfaceC11380iw, userSession, c7u0);
        if (c36422G4x.isEnabled()) {
            A1E.add(c36422G4x);
        }
        C36423G4y c36423G4y = new C36423G4y(fragmentActivity, interfaceC11380iw, userSession, c7u0);
        if (c36423G4y.isEnabled()) {
            A1E.add(c36423G4y);
        }
        return A1E;
    }
}
