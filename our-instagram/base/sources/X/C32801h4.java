package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1h4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32801h4 implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1h5
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1559166379);
            int A032 = C0f9.A03(-145777343);
            C32801h4 c32801h4 = new C32801h4(new B2D(userSession, this));
            C0f9.A0A(1670847755, A032);
            C0f9.A0A(-838232171, A03);
            return c32801h4;
        }
    };
    public final InterfaceC08830cm A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        AbstractC31275Dox.A0A((C32771h1) c1ow, (C2DS) this.A00.get(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        AbstractC31275Dox.A0A((C32771h1) c1ow, (C2DS) this.A00.get(), ((JTV) mnp2).A02);
    }

    public C32801h4(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
