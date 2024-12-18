package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.friendmap.data.FriendMapRepository;

/* loaded from: classes8.dex */
public final class KGZ extends AbstractC61132qb {
    public final long A00;
    public final UserSession A01;
    public final QuickReplySheetContent A02;
    public final String A03;

    public KGZ(UserSession userSession, QuickReplySheetContent quickReplySheetContent, String str, long j) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = j;
        this.A03 = str;
        this.A02 = quickReplySheetContent;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        NotesRepository A00 = C4A5.A00(userSession);
        C4F0 A002 = C4Ez.A00(userSession);
        FriendMapRepository A003 = AbstractC92954Eo.A00(userSession);
        long j = this.A00;
        return new Jn3(userSession, A002, A00, this.A02, A003, this.A03, j);
    }
}
