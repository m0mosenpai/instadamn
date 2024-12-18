package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.KFl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45571KFl extends AbstractC61132qb {
    public final UserSession A00;

    public C45571KFl(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        NotesRepository A00 = C4A5.A00(userSession);
        C4F0 A002 = C4Ez.A00(userSession);
        C14360o3.A0B(userSession, 0);
        return new Jn6(userSession, A002, A00, (KZC) userSession.A01(KZC.class, new C50246MHb(userSession, 38)));
    }
}
