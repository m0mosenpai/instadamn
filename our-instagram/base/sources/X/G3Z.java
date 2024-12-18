package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G3Z implements InterfaceC37196Ga7 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C189448aO A02;
    public final /* synthetic */ C1YA A03;

    @Override // X.InterfaceC37196Ga7
    public final void Czz(boolean z) {
    }

    @Override // X.InterfaceC37196Ga7
    public final void DJl() {
    }

    @Override // X.InterfaceC37196Ga7
    public final void DV6() {
    }

    public G3Z(Bundle bundle, UserSession userSession, C189448aO c189448aO, C1YA c1ya) {
        this.A03 = c1ya;
        this.A01 = userSession;
        this.A00 = bundle;
        this.A02 = c189448aO;
    }

    @Override // X.InterfaceC37196Ga7
    public final void DGI(String str) {
        C1YY A01 = FVI.A01();
        UserSession userSession = this.A01;
        Bundle bundle = this.A00;
        java.util.Set set = FE3.A00;
        String string = bundle.getString("origin", "ssc_invite_notification");
        A01.A07(userSession, this.A03.A00, this.A02, str, string);
    }
}
