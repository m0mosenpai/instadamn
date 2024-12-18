package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1fX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1fX implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1fY
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(909964330);
            int A032 = C0f9.A03(-1408100721);
            C1fX c1fX = new C1fX(new B2C(userSession, this));
            C0f9.A0A(-267746069, A032);
            C0f9.A0A(-1342124966, A03);
            return c1fX;
        }
    };
    public final InterfaceC08830cm A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        AbstractC31275Dox.A09((C31851fT) c1ow, (C2DS) this.A00.get(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        AbstractC31275Dox.A09((C31851fT) c1ow, (C2DS) this.A00.get(), ((JTV) mnp2).A02);
    }

    public C1fX(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
