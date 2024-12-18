package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31931fd implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1fe
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(103859458);
            int A032 = C0f9.A03(450444651);
            C31931fd c31931fd = new C31931fd(new B2F(userSession, this));
            C0f9.A0A(-1173128805, A032);
            C0f9.A0A(504685968, A03);
            return c31931fd;
        }
    };
    public final InterfaceC08830cm A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        AbstractC31275Dox.A0C((C31891fZ) c1ow, (C2DS) this.A00.get(), ((JTV) mnp).A02);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        AbstractC31275Dox.A0C((C31891fZ) c1ow, (C2DS) this.A00.get(), ((JTV) mnp2).A02);
    }

    public C31931fd(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
