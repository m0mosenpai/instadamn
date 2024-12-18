package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class TGP implements InterfaceC25198BCv {
    public final /* synthetic */ C7Y7 A00;

    @Override // X.InterfaceC25198BCv
    public final void DqC(String str) {
        C7Y7 c7y7 = this.A00;
        FragmentActivity requireActivity = c7y7.A01.requireActivity();
        UserSession userSession = c7y7.A03;
        C63397SjR c63397SjR = new C63397SjR(requireActivity, userSession, C2Fb.A1W, str, false);
        c63397SjR.A0E(userSession.userId);
        c63397SjR.A0F((String) c7y7.A08.invoke());
        c63397SjR.A0S = c7y7.A05;
        c63397SjR.A0r = false;
        c63397SjR.A0D = ZonePolicy.A0F;
        c63397SjR.A0A();
    }

    public TGP(C7Y7 c7y7) {
        this.A00 = c7y7;
    }

    @Override // X.InterfaceC25198BCv
    public final void DFf() {
        C7Y7 c7y7 = this.A00;
        c7y7.A01.requireActivity().runOnUiThread(new RunnableC64592TLd(c7y7));
    }
}
