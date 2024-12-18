package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fzb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36284Fzb implements InterfaceC13000lm {
    public Fragment A00;
    public FragmentActivity A01;
    public EVS A02;
    public final UserSession A03;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        UserSession userSession = this.A03;
        C14360o3.A0B(userSession, 0);
        C41768Iek c41768Iek = C41768Iek.A00;
        InterfaceC19610xo ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
        ARD.E7D(MSV.A00(ReactTextInputManager.IME_ACTION_ID), 0);
        ARD.apply();
        InterfaceC19610xo ARD2 = C41768Iek.A02(userSession, c41768Iek).ARD();
        ARD2.E7G(MSV.A00(1647), 0L);
        ARD2.apply();
    }

    public final void A00(Fragment fragment, FragmentActivity fragmentActivity) {
        this.A01 = fragmentActivity;
        this.A00 = fragment;
        this.A02 = C1XJ.A00.A0W(this.A03);
        Fragment fragment2 = this.A00;
        if (fragment2 instanceof AbstractC59962oe) {
            C14360o3.A0C(fragment2, AbstractC43591JPw.A00(0));
            ((AbstractC59962oe) fragment2).registerLifecycleListener(this.A02);
        }
    }

    public C36284Fzb(UserSession userSession) {
        this.A03 = userSession;
    }
}
