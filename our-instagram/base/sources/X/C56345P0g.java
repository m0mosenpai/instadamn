package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56345P0g implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final O2S A03;
    public final NKM A04;
    public final EnumC53380NjV A05;
    public final C81X A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 1), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C52369NFj A01 = OOy.A01(abstractC59962oe.requireContext(), null, AbstractC167027dH.A0P(abstractC59962oe.requireContext(), 2131955743), Integer.valueOf(R.drawable.instagram_facebook_circle_pano_outline_24), 2131955702);
        this.A00 = A01;
        return A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A06;
    }

    public C56345P0g(AbstractC59962oe abstractC59962oe, UserSession userSession, O2S o2s, NKM nkm) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A04 = nkm;
        this.A03 = o2s;
        this.A06 = C81X.A1s;
        this.A05 = EnumC53380NjV.A0G;
    }
}
