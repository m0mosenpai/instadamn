package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P10 implements InterfaceC58169PqZ {
    public C54778OIs A00;
    public C52370NFk A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final NKO A05;
    public final boolean A06;
    public final EnumC53380NjV A07;
    public final C81X A08;
    public final AbstractC59962oe A09;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.LinearLayout, X.NFk, android.view.View] */
    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        ?? linearLayout = new LinearLayout(this.A09.requireContext());
        AbstractC50522MSa.A0y(linearLayout);
        linearLayout.setOrientation(1);
        this.A01 = linearLayout;
        NKO nko = this.A05;
        linearLayout.A01 = nko;
        linearLayout.A00 = nko.A00;
        return linearLayout;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A07;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A08;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A09;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 40), C07Y.A00(viewLifecycleOwner));
    }

    public P10(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NKO nko, boolean z) {
        JQ0.A1O(abstractC59962oe, userSession, interfaceC58310Pt2, nko, interfaceC11380iw);
        this.A09 = abstractC59962oe;
        this.A03 = userSession;
        this.A04 = interfaceC58310Pt2;
        this.A05 = nko;
        this.A02 = interfaceC11380iw;
        this.A06 = z;
        this.A08 = C81X.A03;
        this.A07 = EnumC53380NjV.A03;
    }
}
