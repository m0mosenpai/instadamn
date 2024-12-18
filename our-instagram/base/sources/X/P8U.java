package X;

import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes9.dex */
public final class P8U implements InterfaceC140616Xp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C3G2 A02;
    public final /* synthetic */ C38E A03;
    public final /* synthetic */ InterfaceC58290Psi A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    public P8U(Reel reel, C3G2 c3g2, C38E c38e, InterfaceC58290Psi interfaceC58290Psi, List list, List list2, int i) {
        this.A03 = c38e;
        this.A04 = interfaceC58290Psi;
        this.A01 = reel;
        this.A06 = list;
        this.A05 = list2;
        this.A02 = c3g2;
        this.A00 = i;
    }

    @Override // X.InterfaceC140616Xp
    public final void DFw(long j) {
        InterfaceC58290Psi interfaceC58290Psi = this.A04;
        if (interfaceC58290Psi != null) {
            interfaceC58290Psi.El5(false);
        }
    }

    @Override // X.InterfaceC140616Xp
    public final void DqK(boolean z, long j) {
        C38E c38e = this.A03;
        InterfaceC58290Psi interfaceC58290Psi = this.A04;
        c38e.A07(this.A01, this.A02, interfaceC58290Psi, this.A06, this.A05, this.A00);
        if (interfaceC58290Psi != null) {
            interfaceC58290Psi.El5(false);
        }
    }

    @Override // X.InterfaceC140616Xp
    public final void onCancel() {
        InterfaceC58290Psi interfaceC58290Psi = this.A04;
        if (interfaceC58290Psi != null) {
            interfaceC58290Psi.El5(false);
        }
    }

    @Override // X.InterfaceC140616Xp
    public final void onStart() {
        InterfaceC58290Psi interfaceC58290Psi = this.A04;
        if (interfaceC58290Psi != null) {
            interfaceC58290Psi.El5(true);
        }
    }
}
