package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WLE implements View.OnClickListener {
    public final /* synthetic */ C6QR A00;

    public WLE(C6QR c6qr) {
        this.A00 = c6qr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1090332728);
        C6QR c6qr = this.A00;
        C6QR.A00(c6qr).A0G(VG4.A0X, "interest");
        C69507Vpc A00 = AbstractC155756z4.A00().A00();
        InterfaceC09390do interfaceC09390do = c6qr.A0S;
        AbstractC31179DnN.A0y(A00.A00((UserSession) interfaceC09390do.getValue(), C6QR.A01(c6qr).A05, C6QR.A01(c6qr).A04), c6qr.requireActivity(), interfaceC09390do);
        C0f9.A0C(-346768975, A05);
    }
}
