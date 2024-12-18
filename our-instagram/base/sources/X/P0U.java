package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0U implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final C52478NJw A05;

    public P0U(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, C52478NJw c52478NJw) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, c52478NJw, interfaceC58310Pt2);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = c52478NJw;
        this.A04 = interfaceC58310Pt2;
        this.A01 = C81X.A1n;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57173PZr A02 = C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 49);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, A02, A00);
        AbstractC23641Du.A05(anonymousClass191, new C50122MBw(A0K, c07s, this, null, 0), C07Y.A00(A0K));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C52369NFj A01 = OOy.A01(this.A02.requireContext(), null, null, Integer.valueOf(R.drawable.instagram_promote_pano_outline_24), 2131970738);
        this.A00 = A01;
        ViewOnClickListenerC55466OkL.A02(A01, 36, this);
        C52369NFj c52369NFj = this.A00;
        if (c52369NFj == null) {
            C14360o3.A0F("boostToggle");
            throw C00O.createAndThrow();
        }
        C52369NFj.A02(c52369NFj, this, 17);
        return c52369NFj;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }
}
