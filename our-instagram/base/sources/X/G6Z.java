package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G6Z implements GZ2 {
    public final /* synthetic */ C31603DuV A00;
    public final /* synthetic */ InterfaceC37158GYv A01;
    public final /* synthetic */ C3o9 A02;
    public final /* synthetic */ boolean A03;

    public G6Z(C31603DuV c31603DuV, InterfaceC37158GYv interfaceC37158GYv, C3o9 c3o9, boolean z) {
        this.A00 = c31603DuV;
        this.A02 = c3o9;
        this.A03 = z;
        this.A01 = interfaceC37158GYv;
    }

    @Override // X.GZ2
    public final void D9X() {
        InterfaceC37158GYv interfaceC37158GYv;
        C31603DuV c31603DuV = this.A00;
        C3o9 c3o9 = this.A02;
        C31603DuV.A00(c31603DuV, c3o9, true);
        c31603DuV.AOm(c3o9);
        InterfaceC16660sJ interfaceC16660sJ = c31603DuV.A00;
        UserSession userSession = c31603DuV.A02;
        C81663kb B3U = ((C2DS) interfaceC16660sJ.invoke(userSession)).B3U(JRE.A01(c3o9));
        if (B3U != null && B3U.C7g() == 29) {
            AbstractC147806l5.A00(userSession).A0J(C05F.A00, B3U.C7I(), B3U.C7q(), B3U.AdZ());
        }
        if (this.A03 && (interfaceC37158GYv = this.A01) != null) {
            interfaceC37158GYv.AOQ();
        }
    }

    @Override // X.GZ2
    public final void onDismiss() {
        C31603DuV.A00(this.A00, this.A02, false);
    }
}
