package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OEf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54703OEf {
    public final C54624OAz A00;
    public final OB0 A01;
    public final C54568O8u A02;
    public final OCK A03;
    public final OKW A04;
    public final C54569O8v A05;
    public final C54475O5d A06;

    public C54703OEf(UserSession userSession, C147236jz c147236jz) {
        OB0 ob0 = new OB0();
        this.A01 = ob0;
        this.A03 = new OCK();
        String str = c147236jz.A00.A00;
        this.A00 = new C54624OAz(ob0, str == null ? "" : str);
        this.A04 = new OKW();
        this.A06 = new C54475O5d(userSession);
        this.A05 = new C54569O8v();
        this.A02 = new C54568O8u();
    }
}
