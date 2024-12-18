package X;

import android.content.Context;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G8V implements GZB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ C71603Jf A03;

    @Override // X.GZB
    public final void D3J(Context context) {
        C14360o3.A0B(context, 0);
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = AbstractC206099Aq.A00;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C65761Ttc.A02(new C65761Ttc(interfaceC11380iw, userSession), this.A03.A03(0L), "ig_quiet_mode_in_app_upsell_tap", "in_app_upsell");
        FragmentActivity fragmentActivity = this.A00;
        C71603Jf c71603Jf = new C71603Jf(userSession);
        C71165Wp0 c71165Wp0 = new C71165Wp0(userSession, c71603Jf);
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        AbstractC31173DnH.A15(context, A0H, R.drawable.ig_illustrations_qp_moon_refresh);
        AbstractC31172DnG.A1C(context, A0H, 2131971373);
        AbstractC31173DnH.A16(context, A0H, 2131971372);
        A0H.A0d(new DialogInterfaceOnClickListenerC35359Fia(3, context, userSession, fragmentActivity, c71165Wp0, c71603Jf), AbstractC166997dE.A0p(context, 2131975803));
        DialogInterfaceOnClickListenerC35455FkC.A02(A0H, userSession, c71603Jf, 66, 2131968687);
        try {
            AbstractC166987dD.A1W(A0H);
            AbstractC167017dG.A1N(userSession, interfaceC11380iw);
            C65761Ttc.A02(new C65761Ttc(interfaceC11380iw, userSession), c71603Jf.A03(0L), "ig_quiet_mode_upsell_dialog_shown", "in_app_upsell");
        } catch (WindowManager.BadTokenException e) {
            AbstractC167017dG.A1N(userSession, interfaceC11380iw);
            new C65761Ttc(interfaceC11380iw, userSession).A04(c71603Jf.A03(0L), "in_app_upsell", e.toString(), "In app upsell dialog could not render", 0L, 0L, false);
            C0w9.A03("QuietModeViewHelper#showQuietModeInAppUpsellDialog()", "BadTokenException when trying to call .show() on a dialog after the activity has stopped.");
        }
    }

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8V(FragmentActivity fragmentActivity, UserSession userSession, User user, C71603Jf c71603Jf) {
        this.A01 = userSession;
        this.A03 = c71603Jf;
        this.A00 = fragmentActivity;
        this.A02 = user;
    }
}
