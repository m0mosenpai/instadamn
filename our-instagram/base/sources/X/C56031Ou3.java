package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ou3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56031Ou3 implements InterfaceC41501vz {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C146836jL A01;

    public C56031Ou3(C41181vS c41181vS, C146836jL c146836jL) {
        this.A01 = c146836jL;
        this.A00 = c41181vS;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-8929611);
        C211849aB c211849aB = (C211849aB) obj;
        int A0N = AbstractC167017dG.A0N(c211849aB, 1196874628);
        C146836jL c146836jL = this.A01;
        UserSession userSession = c146836jL.A07;
        if (C18U.A06(C06090Tz.A05, userSession, 36329629413556685L)) {
            C196068lw.A00(userSession).A01(c146836jL.A06, new P1Q(1, c211849aB, this.A00, c146836jL), "after_new_fbc");
        } else {
            C146836jL.A03(this.A00, c211849aB, c146836jL);
        }
        C0f9.A0A(-1786719845, A0N);
        C0f9.A0A(1345504476, A03);
    }
}
