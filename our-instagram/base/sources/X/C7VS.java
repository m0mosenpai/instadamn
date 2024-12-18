package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7VS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VS implements C7VT {
    public AbstractC59962oe A00;
    public InterfaceC11380iw A01;
    public C4NJ A02;
    public C64842wi A03;
    public C64842wi A04;
    public InterfaceC08830cm A05;
    public boolean A06;
    public final UserSession A07;

    public final void A01(C4NJ c4nj) {
        C14360o3.A0B(c4nj, 0);
        this.A02 = c4nj;
        InterfaceC08830cm interfaceC08830cm = this.A05;
        if (interfaceC08830cm != null) {
            if (((C7U0) interfaceC08830cm.get()).C7r().CeQ() && this.A02 != null) {
                InterfaceC08830cm interfaceC08830cm2 = this.A05;
                if (interfaceC08830cm2 != null) {
                    ((C7U0) interfaceC08830cm2.get()).Avk().EK6(false);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("clientInfraProvider");
        throw C00O.createAndThrow();
    }

    public final void A00() {
        if (this.A02 != null) {
            this.A02 = null;
            InterfaceC08830cm interfaceC08830cm = this.A05;
            if (interfaceC08830cm != null) {
                if (((C7U0) interfaceC08830cm.get()).C7r().CeQ()) {
                    InterfaceC08830cm interfaceC08830cm2 = this.A05;
                    if (interfaceC08830cm2 != null) {
                        ((C7U0) interfaceC08830cm2.get()).Avk().EK6(false);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("clientInfraProvider");
            throw C00O.createAndThrow();
        }
    }

    public C7VS(UserSession userSession) {
        this.A07 = userSession;
    }
}
