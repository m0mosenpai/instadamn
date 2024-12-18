package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56340P0b implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final UserSession A01;
    public final NK6 A02;
    public final InterfaceC58310Pt2 A03;
    public final EnumC53380NjV A04;
    public final C81X A05;
    public final AbstractC59962oe A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50821Mcw A00 = OOy.A00(this.A06.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 27), Integer.valueOf(R.drawable.instagram_eye_pano_outline_24), 2131955273);
        this.A00 = A00;
        return A00;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A04;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A06;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 30), C07Y.A00(viewLifecycleOwner));
    }

    public C56340P0b(AbstractC59962oe abstractC59962oe, UserSession userSession, NK6 nk6, InterfaceC58310Pt2 interfaceC58310Pt2) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A06 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = nk6;
        this.A03 = interfaceC58310Pt2;
        this.A05 = C81X.A0Q;
        this.A04 = EnumC53380NjV.A07;
    }
}
