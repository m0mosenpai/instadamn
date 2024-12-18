package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56349P0k implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC58310Pt2 A03;
    public final C52481NJz A04;
    public final OWR A05;
    public final EnumC53380NjV A06;
    public final C81X A07;

    public C56349P0k(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, C52481NJz c52481NJz, OWR owr) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, interfaceC58310Pt2, c52481NJz);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = interfaceC58310Pt2;
        this.A04 = c52481NJz;
        this.A05 = owr;
        this.A07 = C81X.A0A;
        this.A06 = EnumC53380NjV.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50821Mcw A00 = OOy.A00(this.A01.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 16), Integer.valueOf(R.drawable.instagram_settings_pano_outline_24), 2131971152);
        this.A00 = A00;
        A00.setId(R.id.advanced_settings_view);
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("advancedSettingsRow");
            throw C00O.createAndThrow();
        }
        return c50821Mcw;
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
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 21), C07Y.A00(viewLifecycleOwner));
        AbstractC50522MSa.A14(abstractC59962oe, PZV.A02(this, null, 31), this.A04.A06);
    }
}
