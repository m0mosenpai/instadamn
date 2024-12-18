package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.LhS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48760LhS implements C4FR {
    public final /* synthetic */ Jn0 A00;

    @Override // X.C4FR
    public final void E0Z(C4F5 c4f5) {
        C14360o3.A0B(c4f5, 0);
        for (InterfaceC50424MOe interfaceC50424MOe : c4f5.A0J) {
            String str = c4f5.A0G;
            if (str != null) {
                NotesRepository notesRepository = this.A00.A09;
                notesRepository.A0Q(interfaceC50424MOe.BXJ().A0H, str);
                notesRepository.A0P(str);
            }
        }
    }

    @Override // X.C4FR
    public final void FAD(C4F5 c4f5, boolean z) {
    }

    public C48760LhS(Jn0 jn0) {
        this.A00 = jn0;
    }

    @Override // X.C4FR
    public final void CkM(C4F5 c4f5, long j) {
        if (c4f5 != null) {
            AbstractC135966Db.A01(this.A00.A08).A0O(c4f5, j);
        }
    }

    @Override // X.C4FR
    public final void DNI(C4F5 c4f5, long j) {
        UserSession userSession = this.A00.A08;
        if (C18U.A06(C06090Tz.A05, userSession, 36321267112289551L) && c4f5 != null) {
            AbstractC135966Db.A01(userSession).A0P(c4f5, j);
        }
    }

    @Override // X.C4FR
    public final void F89(C4F5 c4f5, long j) {
        if (c4f5 != null) {
            AbstractC135966Db.A01(this.A00.A08).A0D.add(AbstractC167007dF.A0p(c4f5, j));
        }
    }
}
