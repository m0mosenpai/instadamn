package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.4A5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4A5 {
    public static final NotesRepository A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (NotesRepository) userSession.A01(NotesRepository.class, new C206869Dr(userSession, 9));
    }
}
