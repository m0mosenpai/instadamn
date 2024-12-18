package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NH5 extends AbstractC64162vb {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public NH5(InterfaceC11380iw interfaceC11380iw, UserSession userSession, int i) {
        super(C1BX.A03.A01(new C681034y(userSession, "ig_threads_in_stories_unit")));
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = i;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        AbstractC54889OPk.A00(this.A01, this.A02, c41181vS, this.A00, false);
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C41181vS c41181vS = (C41181vS) obj;
        C14360o3.A0B(c41181vS, 0);
        AbstractC54889OPk.A00(this.A01, this.A02, c41181vS, this.A00, true);
    }
}
