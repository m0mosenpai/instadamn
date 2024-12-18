package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FoT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35634FoT implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ InterfaceC148366m6 A05;
    public final /* synthetic */ C2EE A06;

    public ViewOnClickListenerC35634FoT(View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee, int i) {
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A01 = view;
        this.A06 = c2ee;
        this.A05 = interfaceC148366m6;
        this.A03 = interfaceC11380iw;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(129512772);
        UserSession userSession = this.A04;
        FragmentActivity fragmentActivity = this.A02;
        View view2 = this.A01;
        C2EE c2ee = this.A06;
        InterfaceC148366m6 interfaceC148366m6 = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        int i = this.A00;
        interfaceC148366m6.CMc();
        C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
        c50674MYs.A00(2131960685);
        c50674MYs.A01(new ViewOnClickListenerC35633FoO(4, interfaceC148366m6, c2ee, userSession, view2, interfaceC11380iw, fragmentActivity), 2131960683);
        c50674MYs.A01(new ViewOnClickListenerC35638FoX(interfaceC11380iw, view2, c2ee, fragmentActivity, interfaceC148366m6, userSession, i, 0), 2131960684);
        C31727DwY.A00(fragmentActivity, c50674MYs);
        AbstractC2056298m.A00(userSession).A03(i);
        String C7I = c2ee.C7I();
        if (i == 1) {
            str = "thread_ctd_upsell_single_create_messaging_ads_banner_dismiss_button_click";
        } else {
            str = "thread_ctd_upsell_first_banner_dismiss_button_click";
        }
        A0T.A00(interfaceC11380iw, userSession, str, C7I);
        C0f9.A0C(-1931905577, A05);
    }
}
