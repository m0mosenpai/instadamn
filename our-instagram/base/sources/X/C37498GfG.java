package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.GfG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37498GfG implements InterfaceC65952yX {
    public final UserSession A00;

    public C37498GfG(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65952yX
    public final /* bridge */ /* synthetic */ boolean EjD(Object obj) {
        C38321qM BQN;
        C130535uy c130535uy;
        int i;
        InterfaceC127955qO interfaceC127955qO = (AbstractC127945qN) obj;
        C14360o3.A0B(interfaceC127955qO, 0);
        if ((interfaceC127955qO instanceof C127935qM) && ((i = (c130535uy = ((C127935qM) interfaceC127955qO).A01).A00) < 0 || i >= c130535uy.A02().size())) {
            String format = String.format("Clips Unit (%s, %s) has preview index (%s) out of Clips item bounds (%s)", Arrays.copyOf(new Object[]{c130535uy.A0A, c130535uy.A01().toString(), Integer.valueOf(c130535uy.A00), Integer.valueOf(c130535uy.A03(this.A00).size())}, 4));
            C14360o3.A07(format);
            C0w9.A03("DiscoveryGridItemFilter", format);
            return false;
        }
        if ((interfaceC127955qO instanceof InterfaceC127975qQ) && (BQN = ((InterfaceC127975qQ) interfaceC127955qO).BQN()) != null && BQN.A00 != 0) {
            C0w9.A03("DiscoveryGridItemFilter", "MediaProvider was invalid");
            return false;
        }
        return true;
    }
}
