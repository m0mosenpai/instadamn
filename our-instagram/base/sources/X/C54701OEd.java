package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OEd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54701OEd {
    public final C54381O1n A00;
    public final C54382O1o A01;
    public final C65974TxR A02;
    public final java.util.Set A03;
    public final UserSession A04;
    public final InterfaceC37294Gbv A05;
    public final InterfaceC169497hP A06;

    public C54701OEd(C54381O1n c54381O1n, C54382O1o c54382O1o, UserSession userSession, C1GL c1gl, InterfaceC169497hP interfaceC169497hP) {
        C14360o3.A0B(userSession, 6);
        this.A06 = interfaceC169497hP;
        this.A00 = c54381O1n;
        this.A01 = c54382O1o;
        this.A04 = userSession;
        this.A03 = AbstractC166987dD.A1H();
        C56711PFd c56711PFd = new C56711PFd(this, 1);
        this.A05 = c56711PFd;
        this.A02 = AbstractC65980TxZ.A00(userSession, c1gl, null, c56711PFd, interfaceC169497hP, C05F.A00, 0L, 200L, false, true);
    }
}
