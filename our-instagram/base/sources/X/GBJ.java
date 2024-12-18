package X;

import android.content.Context;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GBJ implements C73R {
    public final Context A00;
    public final InterfaceC151446rm A01;
    public final C73S A02;
    public final User A03;

    public GBJ(Context context, InterfaceC151446rm interfaceC151446rm, User user) {
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
        String str;
        User user = this.A03;
        String B5B = user.A03.B5B();
        C5F6 B4r = user.A03.B4r();
        if (B4r != null) {
            str = B4r.Aqb();
        } else {
            str = null;
        }
        if (B5B == null || B5B.length() == 0) {
            if (str != null && str.length() != 0) {
                return str;
            }
            return AbstractC166997dE.A0p(this.A00, 2131953972);
        }
        return B5B;
    }

    @Override // X.C73R
    public final void onClick() {
        this.A01.D0f(this.A03, "button_tray");
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A02;
    }
}
