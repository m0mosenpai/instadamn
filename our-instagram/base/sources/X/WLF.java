package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WLF implements View.OnClickListener {
    public final /* synthetic */ C6QR A00;

    public WLF(C6QR c6qr) {
        this.A00 = c6qr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(871314523);
        C6QR c6qr = this.A00;
        C6QR.A00(c6qr).A0G(VG4.A0X, "location");
        FragmentActivity requireActivity = c6qr.requireActivity();
        InterfaceC09390do interfaceC09390do = c6qr.A0S;
        C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do);
        AbstractC155756z4.A00().A00();
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, 0);
        V0K v0k = new V0K();
        AbstractC25233BEq.A15(v0k, "IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A0c.A0D(v0k);
        A0c.A04();
        C0f9.A0C(382162401, A05);
    }
}
