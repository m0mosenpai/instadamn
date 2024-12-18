package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56341P0c implements InterfaceC58169PqZ {
    public C50805McM A00;
    public final NK6 A01;
    public final InterfaceC58310Pt2 A02;
    public final EnumC53380NjV A03;
    public final C81X A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C50805McM c50805McM = new C50805McM(this.A05, this.A06, this.A01, this.A02);
        AbstractC50522MSa.A0z(c50805McM);
        this.A00 = c50805McM;
        c50805McM.A00.A00();
        C50805McM c50805McM2 = this.A00;
        if (c50805McM2 == null) {
            C14360o3.A0F("audienceRow");
            throw C00O.createAndThrow();
        }
        return c50805McM2;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A03;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A04;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A05;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 31), C07Y.A00(viewLifecycleOwner));
    }

    public C56341P0c(AbstractC59962oe abstractC59962oe, UserSession userSession, NK6 nk6, InterfaceC58310Pt2 interfaceC58310Pt2) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A05 = abstractC59962oe;
        this.A06 = userSession;
        this.A01 = nk6;
        this.A02 = interfaceC58310Pt2;
        this.A04 = C81X.A0Q;
        this.A03 = EnumC53380NjV.A07;
    }
}
