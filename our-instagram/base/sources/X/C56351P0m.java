package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56351P0m implements InterfaceC58169PqZ {
    public C50807McO A00;
    public final UserSession A01;
    public final O2R A02;
    public final NKJ A03;
    public final EnumC53380NjV A04;
    public final C81X A05;
    public final AbstractC59962oe A06;
    public final InterfaceC58310Pt2 A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        UserSession userSession = this.A01;
        C50807McO c50807McO = new C50807McO(this.A06, userSession, this.A07, this.A03);
        AbstractC50522MSa.A0z(c50807McO);
        this.A00 = c50807McO;
        c50807McO.A00.A00();
        C50807McO c50807McO2 = this.A00;
        if (c50807McO2 == null) {
            C14360o3.A0F("audienceRow");
            throw C00O.createAndThrow();
        }
        return c50807McO2;
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
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 24), C07Y.A00(viewLifecycleOwner));
    }

    public C56351P0m(AbstractC59962oe abstractC59962oe, UserSession userSession, O2R o2r, InterfaceC58310Pt2 interfaceC58310Pt2, NKJ nkj) {
        MSZ.A1O(abstractC59962oe, interfaceC58310Pt2);
        this.A06 = abstractC59962oe;
        this.A01 = userSession;
        this.A03 = nkj;
        this.A07 = interfaceC58310Pt2;
        this.A02 = o2r;
        this.A05 = C81X.A0Q;
        this.A04 = EnumC53380NjV.A07;
    }
}
