package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G56 implements InterfaceC37162GYz {
    public final FragmentActivity A00;
    public final C206269Bj A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final C7U0 A05;
    public final InterfaceC164947Zj A06;

    @Override // X.InterfaceC37162GYz
    public final boolean isEnabled() {
        InterfaceC163837Ux C7r = this.A05.C7r();
        if (C7r.C7W().A16 && AbstractC31172DnG.A00(C7r) == 29) {
            return true;
        }
        return false;
    }

    public G56(FragmentActivity fragmentActivity, C206269Bj c206269Bj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, C7U0 c7u0, InterfaceC164947Zj interfaceC164947Zj) {
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = c7u0;
        this.A06 = interfaceC164947Zj;
        this.A04 = capabilities;
        this.A01 = c206269Bj;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37162GYz
    public final List getItems() {
        InterfaceC37161GYy c36419G4u;
        InterfaceC37161GYy c36420G4v;
        ArrayList A1E = AbstractC166987dD.A1E();
        UserSession userSession = this.A03;
        C7U0 c7u0 = this.A05;
        C206269Bj c206269Bj = this.A01;
        if (AbstractC34116F3s.A00(c206269Bj, userSession, c7u0)) {
            c36419G4u = new G50(this.A00, c206269Bj, this.A02, userSession, c7u0);
        } else {
            if (C18U.A06(C06090Tz.A05, userSession, 2342158856078167671L)) {
                c36419G4u = new C36419G4u(c7u0);
            }
            FragmentActivity fragmentActivity = this.A00;
            AbstractC34117F3t.A00(new C32830EcY(fragmentActivity, userSession, c7u0), A1E);
            if (!AbstractC35172FfP.A03(userSession, C35252Fgl.A00(null, userSession, c7u0), EnumC31337Dq2.A05) && AbstractC159887Fa.A01(userSession, c7u0.C7r().CCa())) {
                c36420G4v = new C36424G4z(fragmentActivity, this.A02, userSession, this.A04, c7u0);
            } else {
                c36420G4v = new C36420G4v(c7u0, this.A06, AbstractC31174DnI.A0V(c7u0).A08);
            }
            AbstractC34117F3t.A00(c36420G4v, A1E);
            return A1E;
        }
        AbstractC34117F3t.A00(c36419G4u, A1E);
        FragmentActivity fragmentActivity2 = this.A00;
        AbstractC34117F3t.A00(new C32830EcY(fragmentActivity2, userSession, c7u0), A1E);
        if (!AbstractC35172FfP.A03(userSession, C35252Fgl.A00(null, userSession, c7u0), EnumC31337Dq2.A05)) {
        }
        c36420G4v = new C36420G4v(c7u0, this.A06, AbstractC31174DnI.A0V(c7u0).A08);
        AbstractC34117F3t.A00(c36420G4v, A1E);
        return A1E;
    }
}
