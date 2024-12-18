package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56359P0u implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final O2T A03;
    public final InterfaceC58310Pt2 A04;
    public final NKM A05;
    public final EnumC53380NjV A06;
    public final C81X A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 2), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50821Mcw A00 = OOy.A00(this.A01.requireContext(), null, Integer.valueOf(R.drawable.instagram_facebook_circle_pano_outline_24), 2131955702);
        this.A00 = A00;
        A00.A07.setFocusable(false);
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("recommendOnFbContainer");
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

    public C56359P0u(AbstractC59962oe abstractC59962oe, UserSession userSession, O2T o2t, InterfaceC58310Pt2 interfaceC58310Pt2, NKM nkm) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A05 = nkm;
        this.A04 = interfaceC58310Pt2;
        this.A03 = o2t;
        this.A07 = C81X.A1s;
        this.A06 = EnumC53380NjV.A0G;
    }
}
