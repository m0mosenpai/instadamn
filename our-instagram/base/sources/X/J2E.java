package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J2E implements MRA {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    @Override // X.MRA
    public final /* synthetic */ void Czw(boolean z) {
    }

    @Override // X.MRA
    public final /* synthetic */ void Dfe() {
    }

    @Override // X.MRA
    public final /* synthetic */ void Dfh(String str) {
    }

    @Override // X.MRA
    public final /* synthetic */ void DpY(String str, String str2, String str3) {
    }

    public J2E(UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.MRA
    public final void DpZ(String str) {
        UserSession userSession = this.A00;
        String str2 = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str2);
        if (A0h != null) {
            C3YS.A00(userSession).A02(A0h, true);
        }
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(str2);
        }
    }
}
