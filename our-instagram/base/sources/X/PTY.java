package X;

import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class PTY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ P0A A02;
    public final /* synthetic */ FilterGroupModel A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    public PTY(P0A p0a, FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A02 = p0a;
        this.A03 = filterGroupModel;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P0A p0a = this.A02;
        UserSession userSession = p0a.A0C;
        InterfaceC197178nn interfaceC197178nn = p0a.A0I;
        P0A.A00(new C23426AZz(userSession, p0a.A0H, this.A03, interfaceC197178nn, new BAO(26, this.A04, p0a), this.A01, this.A00), p0a);
    }
}
