package X;

import android.app.Activity;
import android.app.Dialog;
import com.instagram.common.session.UserSession;

/* renamed from: X.VsB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69608VsB {
    public Dialog A00;
    public final Activity A01;
    public final UserSession A02;
    public final String A03;
    public final boolean A04;

    public final Dialog A00(XCV xcv) {
        C14360o3.A0B(xcv, 0);
        Activity activity = this.A01;
        if (activity == null) {
            return null;
        }
        WHP whp = new WHP(xcv, 43);
        WHP whp2 = new WHP(this, 44);
        DialogInterfaceOnClickListenerC70206WHe dialogInterfaceOnClickListenerC70206WHe = new DialogInterfaceOnClickListenerC70206WHe(8, xcv, this);
        DialogInterfaceOnDismissListenerC55322Ogk dialogInterfaceOnDismissListenerC55322Ogk = new DialogInterfaceOnDismissListenerC55322Ogk(0, this, xcv);
        WHF whf = new WHF(xcv, 0);
        C193328hC c193328hC = new C193328hC(activity);
        c193328hC.A0A(2131975279);
        c193328hC.A09(2131975278);
        c193328hC.A0J(whp, 2131956794);
        c193328hC.A0X(whp2, EnumC193348hE.A04, AbstractC166997dE.A0p(activity, 2131975280), false);
        c193328hC.A0D(dialogInterfaceOnClickListenerC70206WHe);
        boolean z = !this.A04;
        c193328hC.A0s(z);
        c193328hC.A0t(z);
        c193328hC.A0C(whf);
        c193328hC.A0g(dialogInterfaceOnDismissListenerC55322Ogk);
        return c193328hC.A02();
    }

    public C69608VsB(Activity activity, UserSession userSession, String str, boolean z) {
        this.A01 = activity;
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = z;
    }
}
