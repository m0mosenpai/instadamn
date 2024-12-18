package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FNH {
    public boolean A00;
    public final C65974TxR A01;
    public final C65974TxR A02;
    public final C169487hO A03;
    public final C169487hO A04;

    public FNH(UserSession userSession, InterfaceC169467hM interfaceC169467hM) {
        AbstractC167007dF.A1D(interfaceC169467hM, 1, userSession);
        C169487hO c169487hO = new C169487hO();
        this.A03 = c169487hO;
        this.A01 = AbstractC65980TxZ.A00(userSession, null, new AlW(interfaceC169467hM, this, true), null, c169487hO, C05F.A0C, 0L, 200L, false, false);
        C169487hO c169487hO2 = new C169487hO();
        this.A04 = c169487hO2;
        this.A02 = AbstractC65980TxZ.A00(userSession, null, new AlW(interfaceC169467hM, this, false), null, c169487hO2, C05F.A00, 0L, 200L, false, false);
        this.A00 = true;
    }
}
