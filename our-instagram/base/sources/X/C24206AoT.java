package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.AoT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24206AoT implements InterfaceC168627fw {
    public final /* synthetic */ C56065Oui A00;

    @Override // X.InterfaceC168627fw
    public final void Cqc() {
    }

    @Override // X.InterfaceC168627fw
    public final boolean Ei4() {
        return false;
    }

    public C24206AoT(C56065Oui c56065Oui) {
        this.A00 = c56065Oui;
    }

    @Override // X.InterfaceC168627fw
    public final void Crv() {
        C56065Oui c56065Oui = this.A00;
        FragmentActivity requireActivity = c56065Oui.A09.requireActivity();
        UserSession userSession = c56065Oui.A0A;
        AbstractC35239FgY.A04(requireActivity, userSession);
        FDR.A00(AbstractC12220kQ.A01(null, userSession), userSession, null, "post_caption", "click", "cant_mention_alert_nux_go_to_settings");
    }

    @Override // X.InterfaceC168627fw
    public final boolean Ei5() {
        return AbstractC167007dF.A1W(this.A00.A09.getActivity());
    }
}
