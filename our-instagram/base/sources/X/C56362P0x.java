package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56362P0x implements InterfaceC58169PqZ {
    public View A00;
    public C55037OZj A01;
    public final UserSession A02;
    public final InterfaceC58310Pt2 A03;
    public final NKC A04;
    public final boolean A05;
    public final C81X A06;
    public final AbstractC59962oe A07;

    public C56362P0x(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, EnumC53117NeU enumC53117NeU, NKC nkc) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, interfaceC58310Pt2, nkc);
        this.A07 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = interfaceC58310Pt2;
        this.A04 = nkc;
        this.A05 = AbstractC167007dF.A1X(enumC53117NeU, EnumC53117NeU.A03);
        this.A06 = C81X.A05;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A07;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 16), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A07;
        UserSession userSession = this.A02;
        boolean z = this.A05;
        InterfaceC58310Pt2 interfaceC58310Pt2 = this.A03;
        C56362P0x c56362P0x = this;
        if (z) {
            c56362P0x = null;
        }
        this.A01 = new C55037OZj(abstractC59962oe, userSession, c56362P0x, interfaceC58310Pt2, z);
        View A0A = AbstractC31172DnG.A0A(AbstractC31175DnJ.A06(abstractC59962oe), null, R.layout.add_event);
        AbstractC50522MSa.A0z(A0A);
        this.A00 = A0A;
        return A0A;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A06;
    }
}
