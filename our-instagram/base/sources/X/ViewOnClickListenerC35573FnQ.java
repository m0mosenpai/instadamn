package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FnQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35573FnQ implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C99694dm A02;

    public ViewOnClickListenerC35573FnQ(Fragment fragment, UserSession userSession, C99694dm c99694dm) {
        this.A02 = c99694dm;
        this.A01 = userSession;
        this.A00 = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1143267053);
        C99694dm c99694dm = this.A02;
        UserSession userSession = this.A01;
        String str = userSession.userId;
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "subscription_notification_deferral_profile_banner_view_cta");
        AbstractC31171DnF.A1I(A0f, "profile");
        AbstractC31178DnM.A17(A0f, str);
        AbstractC31180DnO.A1I(A0f, "PROFILE");
        FVI.A00();
        C32296EKj c32296EKj = new C32296EKj();
        Bundle A06 = AbstractC31178DnM.A06("origin", "PROFILE");
        AbstractC60492pY.A03(A06, userSession);
        c32296EKj.setArguments(A06);
        AbstractC25229BEm.A18(c32296EKj, AbstractC31175DnJ.A0C(this.A00, userSession));
        C0f9.A0C(1839550173, A05);
    }
}
