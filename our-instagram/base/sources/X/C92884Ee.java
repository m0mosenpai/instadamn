package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;

/* renamed from: X.4Ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92884Ee extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public C92884Ee(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C92904Eg A00 = AbstractC92894Ef.A00(userSession);
        NotesRepository A002 = C4A5.A00(userSession);
        FriendMapRepository A003 = AbstractC92954Eo.A00(userSession);
        SpotlightFetchRepository A004 = AbstractC92994Ew.A00(userSession);
        C14360o3.A07(A004);
        return new C92874Ed(userSession, C4Ez.A00(userSession), A002, A00, A003, A004, this.A01);
    }
}
