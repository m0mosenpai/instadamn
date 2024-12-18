package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56346P0h implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final C81X A01;
    public final UserSession A02;
    public final InterfaceC58310Pt2 A03;
    public final NK2 A04;
    public final C51022MgU A05;
    public final AbstractC59962oe A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A06;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 9), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C52369NFj A01 = OOy.A01(this.A06.requireContext(), null, null, Integer.valueOf(R.drawable.instagram_crown_pano_outline_24), 2131961930);
        this.A00 = A01;
        ViewOnClickListenerC55466OkL.A02(A01, 44, this);
        C52369NFj c52369NFj = this.A00;
        if (c52369NFj == null) {
            C14360o3.A0F("subscribersOnlyToggle");
            throw C00O.createAndThrow();
        }
        C52369NFj.A02(c52369NFj, this, 20);
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

    public C56346P0h(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NK2 nk2, C51022MgU c51022MgU) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, c51022MgU);
        C14360o3.A0B(interfaceC58310Pt2, 5);
        this.A06 = abstractC59962oe;
        this.A02 = userSession;
        this.A04 = nk2;
        this.A05 = c51022MgU;
        this.A03 = interfaceC58310Pt2;
        this.A01 = C81X.A11;
    }
}
