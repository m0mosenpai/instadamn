package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

/* renamed from: X.KQd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45824KQd extends OptimisticNetworkOperation {
    public int A00;
    public C6C9 A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final NotesApi A05;
    public final /* synthetic */ NotesRepository A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45824KQd(NotesApi notesApi, NotesRepository notesRepository, String str, String str2, long j) {
        super(notesApi);
        AbstractC43594JPz.A1P(notesApi, str);
        this.A06 = notesRepository;
        this.A05 = notesApi;
        this.A02 = j;
        this.A03 = str;
        this.A04 = str2;
    }
}
