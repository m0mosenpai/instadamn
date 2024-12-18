package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45566KFg extends AbstractC61132qb {
    public final UserSession A00;

    public C45566KFg(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.98s, X.KPA] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        KPI A00 = AbstractC46739Klw.A00(userSession);
        C006802i A0O = AbstractC43594JPz.A0O(userSession);
        InterfaceC02900Bo A002 = C0BQ.A00(userSession);
        C6CF A003 = C6CE.A00(userSession);
        AbstractC167017dG.A1R(A002, A003);
        return new C44501Jm7(userSession, new AbstractC2056898s(A0O, A003, A002), A00);
    }
}
