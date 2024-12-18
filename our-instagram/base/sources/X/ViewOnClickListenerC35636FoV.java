package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FoV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35636FoV implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ InterfaceC148366m6 A05;
    public final /* synthetic */ C2EE A06;

    public ViewOnClickListenerC35636FoV(View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee, int i) {
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
        int A05 = C0f9.A05(-1120123500);
        UserSession userSession = this.A04;
        View view2 = this.A01;
        C2EE c2ee = this.A06;
        InterfaceC148366m6 interfaceC148366m6 = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        AbstractC35056FcT.A01(view2, interfaceC148366m6);
        AbstractC2056298m.A00(userSession).A03(this.A00);
        A0T.A00(interfaceC11380iw, userSession, "thread_ctd_upsell_first_banner_no_click", c2ee.C7I());
        C0f9.A0C(-2052046913, A05);
    }
}
