package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FoD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35622FoD implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC148366m6 A04;
    public final /* synthetic */ C2EE A05;

    public ViewOnClickListenerC35622FoD(View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee) {
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A00 = view;
        this.A05 = c2ee;
        this.A04 = interfaceC148366m6;
        this.A02 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1987420026);
        UserSession userSession = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        View view2 = this.A00;
        C2EE c2ee = this.A05;
        InterfaceC148366m6 interfaceC148366m6 = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        interfaceC148366m6.CMc();
        C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
        c50674MYs.A00(2131960685);
        c50674MYs.A01(new ViewOnClickListenerC35633FoO(2, interfaceC148366m6, c2ee, userSession, view2, interfaceC11380iw, fragmentActivity), 2131960683);
        c50674MYs.A01(new ViewOnClickListenerC35633FoO(3, interfaceC148366m6, c2ee, userSession, view2, interfaceC11380iw, fragmentActivity), 2131960684);
        C31727DwY.A00(fragmentActivity, c50674MYs);
        AbstractC34050F1d.A00(interfaceC11380iw, userSession, "thread_armadillo_biz_tools_upsell_banner_dismiss_button_click", c2ee.C7I());
        C0f9.A0C(-1871268184, A05);
    }
}
