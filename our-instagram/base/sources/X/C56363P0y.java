package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56363P0y implements InterfaceC58169PqZ {
    public C52365NFd A00;
    public final AbstractC59962oe A01;
    public final InterfaceC58310Pt2 A02;
    public final C54970OTc A03;
    public final NK3 A04;
    public final NKH A05;
    public final EnumC53380NjV A06;
    public final C81X A07;
    public final UserSession A08;

    public C56363P0y(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, C54970OTc c54970OTc, NK3 nk3, NKH nkh) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, c54970OTc, interfaceC58310Pt2);
        C14360o3.A0B(nk3, 6);
        this.A01 = abstractC59962oe;
        this.A08 = userSession;
        this.A03 = c54970OTc;
        this.A02 = interfaceC58310Pt2;
        this.A05 = nkh;
        this.A04 = nk3;
        this.A07 = C81X.A2f;
        this.A06 = EnumC53380NjV.A0M;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A01;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A08;
        C52365NFd c52365NFd = new C52365NFd(requireContext, userSession, new PHE(this), Ny2.A00(userSession));
        AbstractC50522MSa.A0z(c52365NFd);
        c52365NFd.setController(C1XJ.A00.A0U(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), userSession));
        c52365NFd.setShowIcon(true);
        this.A00 = c52365NFd;
        return c52365NFd;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A06;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A07;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 47), C07Y.A00(viewLifecycleOwner));
    }
}
