package X;

import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class PTZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C56208OxH A02;
    public final /* synthetic */ FilterGroupModel A03;
    public final /* synthetic */ InterfaceC16660sJ A04;

    public PTZ(C56208OxH c56208OxH, FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A02 = c56208OxH;
        this.A03 = filterGroupModel;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56208OxH c56208OxH = this.A02;
        UserSession userSession = c56208OxH.A06;
        InterfaceC197178nn interfaceC197178nn = c56208OxH.A09;
        C23426AZz c23426AZz = new C23426AZz(userSession, null, this.A03, interfaceC197178nn, new BAO(27, this.A04, c56208OxH), this.A01, this.A00);
        MXD mxd = c56208OxH.A08;
        C178577wV c178577wV = mxd.A00;
        if (c178577wV != null) {
            c178577wV.A06();
            c56208OxH.E3i();
            C197368o7 A00 = mxd.A00(c23426AZz);
            if (A00 != null) {
                A00.A04();
                MXC mxc = c56208OxH.A07;
                AbstractC50523MSb.A0j(mxc.A00.A02, mxc.A01);
                return;
            }
        }
        c23426AZz.cancel();
    }
}
