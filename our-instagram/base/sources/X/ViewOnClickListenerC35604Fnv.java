package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fnv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35604Fnv implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C19270xB A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C71603Jf A03;

    public ViewOnClickListenerC35604Fnv(Activity activity, C19270xB c19270xB, UserSession userSession, C71603Jf c71603Jf) {
        this.A02 = userSession;
        this.A01 = c19270xB;
        this.A03 = c71603Jf;
        this.A00 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-105758530);
        UserSession userSession = this.A02;
        C19270xB c19270xB = this.A01;
        AbstractC167017dG.A1N(userSession, c19270xB);
        C65761Ttc.A02(new C65761Ttc(c19270xB, userSession), this.A03.A03(C455127l.A03(userSession).A0O()), "ig_quiet_mode_self_profile_indicator_tap", "self_profile");
        Activity activity = this.A00;
        AbstractC31171DnF.A1P(activity);
        C14360o3.A0B(activity, 1);
        AbstractC31175DnJ.A0N(userSession).A02(activity, new C33187EkZ());
        InterfaceC11380iw interfaceC11380iw = AbstractC206099Aq.A00;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C65761Ttc.A02(new C65761Ttc(interfaceC11380iw, userSession), new C71603Jf(userSession).A03(0L), "ig_quiet_mode_self_profile_bottom_sheet_shown", "self_profile");
        C0f9.A0C(994963349, A05);
    }
}
