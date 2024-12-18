package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

/* loaded from: classes8.dex */
public final class KQZ extends OptimisticNetworkOperation {
    public int A00;
    public C6C9 A01;
    public final long A02;
    public final String A03;
    public final NotesApi A04;
    public final /* synthetic */ NotesRepository A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KQZ(NotesApi notesApi, NotesRepository notesRepository, String str, long j) {
        super(notesApi);
        C14360o3.A0B(notesApi, 2);
        this.A05 = notesRepository;
        this.A04 = notesApi;
        this.A02 = j;
        this.A03 = str;
    }
}
