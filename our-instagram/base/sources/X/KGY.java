package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGY extends AbstractC61132qb {
    public final C12N A00;
    public final UserSession A01;
    public final C25804BbL A02;
    public final InterfaceC16820sZ A03;

    public /* synthetic */ KGY(UserSession userSession, C25804BbL c25804BbL) {
        C12L c12l = C12L.A00;
        C50255MHk A02 = C50255MHk.A02(userSession, 27);
        AbstractC167027dH.A13(userSession, c25804BbL, c12l);
        this.A01 = userSession;
        this.A02 = c25804BbL;
        this.A00 = c12l;
        this.A03 = A02;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.98s, X.KPK] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C42221xC A00 = AbstractC47843LBl.A00(userSession, "EncryptedBackupsSettingsViewModel");
        Integer num = C05F.A0C;
        C48519LdH A002 = AbstractC46742Klz.A00(userSession, num);
        C25804BbL c25804BbL = this.A02;
        C006802i A0O = AbstractC43594JPz.A0O(userSession);
        InterfaceC02900Bo A003 = C0BQ.A00(userSession);
        C6CF A004 = C6CE.A00(userSession);
        AbstractC167017dG.A1R(A003, A004);
        ?? abstractC2056898s = new AbstractC2056898s(A0O, A004, A003);
        LGY lgy = (LGY) this.A03.invoke();
        return new Jn4(this.A00, A00, userSession, AbstractC46729Klm.A00(userSession, num), c25804BbL, (KPG) userSession.A01(KPG.class, C50247MHc.A01(userSession, 49)), abstractC2056898s, lgy, A002);
    }
}
