package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P0v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56360P0v implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final AbstractC59962oe A01;
    public final InterfaceC58310Pt2 A02;
    public final NK1 A03;
    public final EnumC53380NjV A04;
    public final C81X A05;
    public final UserSession A06;
    public final boolean A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 10), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A06, 36320760305886069L) == false) goto L6;
     */
    @Override // X.InterfaceC58169PqZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ANR() {
        /*
            r4 = this;
            boolean r0 = r4.A07
            if (r0 == 0) goto L16
            com.instagram.common.session.UserSession r3 = r4.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320760305886069(0x81098a00012375, double:3.032733297180547E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r3 = 2131955641(0x7f130fb9, float:1.9547815E38)
            if (r0 != 0) goto L19
        L16:
            r3 = 2131955643(0x7f130fbb, float:1.954782E38)
        L19:
            X.2oe r0 = r4.A01
            android.content.Context r2 = r0.requireContext()
            r1 = 0
            r0 = 2131238940(0x7f08201c, float:1.8094173E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.Mcw r0 = X.OOy.A00(r2, r1, r0, r3)
            r4.A00 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56360P0v.ANR():android.view.View");
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A04;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A05;
    }

    public C56360P0v(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NK1 nk1, boolean z) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        C14360o3.A0B(interfaceC58310Pt2, 5);
        this.A01 = abstractC59962oe;
        this.A06 = userSession;
        this.A03 = nk1;
        this.A07 = z;
        this.A02 = interfaceC58310Pt2;
        this.A05 = C81X.A2e;
        this.A04 = EnumC53380NjV.A0L;
    }
}
