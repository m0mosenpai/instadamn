package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7YP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YP {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final InterfaceC08830cm A03;
    public final boolean A04;
    public final InterfaceC08830cm A05;

    public C7YP(InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, boolean z) {
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(c18920wW, 3);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = c18920wW;
        this.A05 = interfaceC08830cm;
        this.A03 = interfaceC08830cm2;
        this.A04 = z;
    }

    public static final C7U0 A00(C7YP c7yp) {
        Object obj = c7yp.A05.get();
        C14360o3.A07(obj);
        return (C7U0) obj;
    }

    public static final void A01(C7YP c7yp, C2EC c2ec) {
        Object obj = c7yp.A03.get();
        C14360o3.A07(obj);
        ((C7ZX) obj).Crx(c2ec, A00(c7yp).C7r().Eje());
    }

    public static final void A02(C7YP c7yp, InterfaceC83733oI interfaceC83733oI) {
        Object obj = c7yp.A03.get();
        C14360o3.A07(obj);
        ((C7ZX) obj).Cry(interfaceC83733oI, A00(c7yp).C7r().C7W().A08, A00(c7yp).C7r().Eje());
    }
}
