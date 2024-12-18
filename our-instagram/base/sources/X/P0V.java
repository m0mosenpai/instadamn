package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class P0V implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final AbstractC59962oe A01;
    public final InterfaceC58310Pt2 A02;
    public final C52475NJt A03;
    public final EnumC53380NjV A04;
    public final C81X A05;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        String str = ((C51740MtP) this.A03.A04.getValue()).A00;
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("renameOriginalAudioRow");
            throw C00O.createAndThrow();
        }
        if (str == null) {
            str = AbstractC25227BEk.A0v(this.A01, 2131955765);
        }
        c50821Mcw.setInlineSubtitle(str);
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 3), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50821Mcw A00 = OOy.A00(this.A01.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 37), Integer.valueOf(R.drawable.instagram_audio_page_pano_outline_24), 2131955766);
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

    public P0V(AbstractC59962oe abstractC59962oe, InterfaceC58310Pt2 interfaceC58310Pt2, C52475NJt c52475NJt) {
        AbstractC167027dH.A13(abstractC59962oe, interfaceC58310Pt2, c52475NJt);
        this.A01 = abstractC59962oe;
        this.A02 = interfaceC58310Pt2;
        this.A03 = c52475NJt;
        this.A05 = C81X.A1u;
        this.A04 = EnumC53380NjV.A0H;
    }
}
