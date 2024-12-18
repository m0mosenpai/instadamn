package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G3X implements InterfaceC37196Ga7 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC37196Ga7
    public final void DJl() {
    }

    @Override // X.InterfaceC37196Ga7
    public final void DV6() {
    }

    public G3X(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC37196Ga7
    public final void DGI(String str) {
        UserSession userSession;
        int i = this.A00;
        C14360o3.A0B(str, 0);
        C1YY A01 = FVI.A01();
        Object obj = this.A03;
        if (i != 0) {
            userSession = ((GBV) obj).A02;
        } else {
            userSession = ((G4S) obj).A00;
        }
        java.util.Set set = FE3.A00;
        A01.A07(userSession, (C189478aR) this.A01, (C189448aO) this.A02, str, "profile_subscriber_channel_click");
    }

    @Override // X.InterfaceC37196Ga7
    public final void Czz(boolean z) {
    }
}
