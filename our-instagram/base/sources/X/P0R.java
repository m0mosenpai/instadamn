package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class P0R implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final AbstractC59962oe A01;
    public final InterfaceC58310Pt2 A02;
    public final NK8 A03;
    public final C81X A04;
    public final InterfaceC16660sJ A05;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50821Mcw A00 = OOy.A00(this.A01.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 26), Integer.valueOf(R.drawable.instagram_money_pano_outline_24), 2131955378);
        this.A00 = A00;
        return A00;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A04;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("dealSelectorRow");
            throw C00O.createAndThrow();
        }
        interfaceC16660sJ.invoke(c50821Mcw.A0A);
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 29), C07Y.A00(viewLifecycleOwner));
    }

    public P0R(AbstractC59962oe abstractC59962oe, InterfaceC58310Pt2 interfaceC58310Pt2, NK8 nk8, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167027dH.A13(abstractC59962oe, interfaceC58310Pt2, nk8);
        this.A01 = abstractC59962oe;
        this.A02 = interfaceC58310Pt2;
        this.A03 = nk8;
        this.A05 = interfaceC16660sJ;
        this.A04 = C81X.A0r;
    }
}
