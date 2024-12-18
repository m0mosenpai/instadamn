package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

/* loaded from: classes8.dex */
public final class KQY extends OptimisticNetworkOperation {
    public int A00;
    public C6C9 A01;
    public final long A02;
    public final NotesRepository A03;
    public final String A04;
    public final NotesApi A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KQY(NotesApi notesApi, NotesRepository notesRepository, String str, long j) {
        super(notesApi);
        C14360o3.A0B(notesApi, 1);
        this.A05 = notesApi;
        this.A03 = notesRepository;
        this.A02 = j;
        this.A04 = str;
    }
}
