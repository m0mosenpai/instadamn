package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* loaded from: classes6.dex */
public final class G4R implements InterfaceC165717ay {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final DirectAggregatedMediaViewerController A02;
    public final InterfaceC164957Zk A03;
    public final C32886EdT A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC16820sZ A06;
    public final C2DS A07;

    public G4R(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC164957Zk interfaceC164957Zk, C2DS c2ds, InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1G(abstractC59962oe, 2, c2ds);
        C14360o3.A0B(interfaceC164957Zk, 7);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A06 = interfaceC16820sZ;
        this.A07 = c2ds;
        this.A05 = interfaceC08830cm;
        this.A03 = interfaceC164957Zk;
        this.A02 = new DirectAggregatedMediaViewerController(fragmentActivity, userSession, null, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, true, false);
        this.A04 = C32886EdT.A00.A00(userSession);
    }

    @Override // X.InterfaceC165717ay
    public final void CrE(View view, C158797Aq c158797Aq) {
        C3o9 c3o9;
        C14360o3.A0B(view, 0);
        C3o9 c3o92 = (C3o9) this.A06.invoke();
        if (c3o92 != null) {
            if (AbstractC34068F1w.A00(this.A00.requireActivity(), this.A01, c3o92)) {
                C83693oE BNh = ((InterfaceC163837Ux) this.A05.get()).BNh();
                if (BNh != null) {
                    c3o9 = AbstractC1345466e.A05(BNh);
                } else {
                    c3o9 = null;
                }
                C41761wQ c41761wQ = new C41761wQ(null);
                C32886EdT c32886EdT = this.A04;
                c41761wQ.A02(c32886EdT.A09(c3o92, c3o9).A0M(new C36264FzH(2, GVZ.A00)).A0G().A0K(C36234Fyn.A00).A0K(C36235Fyo.A00).A0O(AbstractC142856cl.A01), new C36798GJx(3, view, c158797Aq, this, c41761wQ, c3o92));
                c32886EdT.A0A(c3o92, null);
            }
        }
    }
}
