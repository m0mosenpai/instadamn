package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TGQ implements InterfaceC25198BCv {
    public final /* synthetic */ C62592SHv A00;

    @Override // X.InterfaceC25198BCv
    public final void DqC(String str) {
        C62592SHv c62592SHv = this.A00;
        FragmentActivity requireActivity = c62592SHv.A00.requireActivity();
        UserSession userSession = c62592SHv.A01;
        C63397SjR c63397SjR = new C63397SjR(requireActivity, userSession, C2Fb.A1W, str, false);
        c63397SjR.A0E(userSession.userId);
        c63397SjR.A0F((String) c62592SHv.A03.invoke());
        c63397SjR.A0S = c62592SHv.A02;
        c63397SjR.A0r = false;
        c63397SjR.A0D = ZonePolicy.A0F;
        c63397SjR.A0A();
    }

    public TGQ(C62592SHv c62592SHv) {
        this.A00 = c62592SHv;
    }

    @Override // X.InterfaceC25198BCv
    public final void DFf() {
        C62592SHv c62592SHv = this.A00;
        c62592SHv.A00.requireActivity().runOnUiThread(new RunnableC64593TLe(c62592SHv));
    }
}
