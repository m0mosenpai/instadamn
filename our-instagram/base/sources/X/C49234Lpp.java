package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lpp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49234Lpp implements InterfaceC29301b7 {
    public final UserSession A00;
    public final InterfaceC25941Ob A01;

    @Override // X.InterfaceC29301b7
    public final boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        InterfaceC25941Ob interfaceC25941Ob = this.A01;
        UserSession userSession = this.A00;
        C1ON AES = interfaceC25941Ob.AES(userSession, c1ow);
        AES.A00 = new K8U(userSession, interfaceC37261GbE);
        C1GJ.A03(AES);
    }

    public C49234Lpp(UserSession userSession, InterfaceC25941Ob interfaceC25941Ob) {
        this.A00 = userSession;
        this.A01 = interfaceC25941Ob;
    }
}
