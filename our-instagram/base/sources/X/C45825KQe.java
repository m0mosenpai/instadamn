package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

/* renamed from: X.KQe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45825KQe extends OptimisticNetworkOperation {
    public int A00;
    public C6C9 A01;
    public C6C9 A02;
    public final long A03;
    public final UserSession A04;
    public final NotesRepository A05;
    public final String A06;
    public final NotesApi A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45825KQe(UserSession userSession, NotesApi notesApi, NotesRepository notesRepository, String str, long j) {
        super(notesApi);
        C14360o3.A0B(notesApi, 1);
        this.A07 = notesApi;
        this.A05 = notesRepository;
        this.A04 = userSession;
        this.A03 = j;
        this.A06 = str;
    }
}
