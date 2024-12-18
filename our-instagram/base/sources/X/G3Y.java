package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G3Y implements InterfaceC37196Ga7 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C189478aR A01;
    public final /* synthetic */ C189448aO A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    @Override // X.InterfaceC37196Ga7
    public final void DGI(String str) {
        C14360o3.A0B(str, 0);
        C1YY A01 = FVI.A01();
        UserSession userSession = this.A00;
        java.util.Set set = FE3.A00;
        A01.A07(userSession, this.A01, this.A02, str, "message_in_story");
    }

    @Override // X.InterfaceC37196Ga7
    public final void DJl() {
    }

    @Override // X.InterfaceC37196Ga7
    public final void DV6() {
    }

    public G3Y(UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = userSession;
        this.A02 = c189448aO;
        this.A01 = c189478aR;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC37196Ga7
    public final void Czz(boolean z) {
        this.A03.invoke();
    }
}
