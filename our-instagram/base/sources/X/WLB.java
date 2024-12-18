package X;

import android.view.View;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WLB implements View.OnClickListener {
    public final /* synthetic */ C6QR A00;

    public WLB(C6QR c6qr) {
        this.A00 = c6qr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-487381250);
        C6QR c6qr = this.A00;
        C6QR.A00(c6qr).A0G(VG4.A0X, "age_and_gender");
        AbstractC155756z4.A00().A00();
        InterfaceC09390do interfaceC09390do = c6qr.A0S;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        XIGIGBoostDestination xIGIGBoostDestination = C6QR.A01(c6qr).A00;
        C14360o3.A0B(userSession, 0);
        V0M v0m = new V0M();
        v0m.setArguments(AbstractC61636Rr0.A00(AbstractC25229BEm.A1b("destination", xIGIGBoostDestination, new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession.token))));
        AbstractC31179DnN.A0y(v0m, c6qr.requireActivity(), interfaceC09390do);
        C0f9.A0C(1541705750, A05);
    }
}
