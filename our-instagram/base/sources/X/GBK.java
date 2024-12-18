package X;

import android.content.Context;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GBK implements C73R {
    public final Context A00;
    public final InterfaceC151446rm A01;
    public final C73S A02;
    public final User A03;

    public GBK(Context context, InterfaceC151446rm interfaceC151446rm, User user) {
        C14360o3.A0B(interfaceC151446rm, 2);
        this.A00 = context;
        this.A01 = interfaceC151446rm;
        this.A03 = user;
        this.A02 = C73S.A0G;
    }

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    @Override // X.C73R
    public final String Aj7() {
        return AbstractC166997dE.A0p(this.A00, 2131960904);
    }

    @Override // X.C73R
    public final void onClick() {
        this.A01.D0i(this.A00, this.A03, "button_tray");
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A02;
    }
}
