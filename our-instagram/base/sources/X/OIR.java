package X;

import android.app.Activity;
import android.app.Dialog;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OIR {
    public final UserSession A00;
    public final Activity A01;
    public final AbstractC1564470p A02;

    public OIR(Activity activity, UserSession userSession, AbstractC1564470p abstractC1564470p) {
        C14360o3.A0B(userSession, 3);
        this.A01 = activity;
        this.A02 = abstractC1564470p;
        this.A00 = userSession;
    }

    public final void A00(InterfaceC58134Ppx interfaceC58134Ppx) {
        AbstractC1564470p abstractC1564470p = this.A02;
        InterfaceC58198Pr4 upsellContent = abstractC1564470p.getUpsellContent();
        String str = abstractC1564470p.entryPoint;
        Activity activity = this.A01;
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        AbstractC31173DnH.A15(activity, A0H, R.drawable.ig_illustrations_illo_account_linking_refresh);
        A0H.A05 = upsellContent.BDH(AbstractC166987dD.A0O(activity));
        A0H.A0r(upsellContent.Aqu(AbstractC166987dD.A0O(activity)));
        A0H.A0s(true);
        A0H.A0t(true);
        A0H.A0d(new DialogInterfaceOnClickListenerC55287Og2(this, interfaceC58134Ppx, str, 1), upsellContent.BgN(AbstractC166987dD.A0O(activity)));
        A0H.A0b(new DialogInterfaceOnClickListenerC55287Og2(this, interfaceC58134Ppx, str, 2), upsellContent.BrY(AbstractC166987dD.A0O(activity)));
        A0H.A0C(new DialogInterfaceOnCancelListenerC55250OfO(this, interfaceC58134Ppx, str, 2));
        Dialog A02 = A0H.A02();
        if (!activity.isFinishing()) {
            C0fJ.A00(A02);
            UserSession userSession = this.A00;
            C14360o3.A0B(str, 1);
            C35191Ffj.A00(userSession, "upsell_screen_shown", str);
            new MWX(userSession).A01(str);
        }
    }
}
