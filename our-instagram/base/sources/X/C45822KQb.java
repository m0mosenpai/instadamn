package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

/* renamed from: X.KQb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45822KQb extends OptimisticNetworkOperation {
    public int A00;
    public C6C9 A01;
    public final long A02;
    public final NotesRepository A03;
    public final String A04;
    public final String A05;
    public final NotesApi A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45822KQb(NotesApi notesApi, NotesRepository notesRepository, String str, String str2, long j) {
        super(notesApi);
        AbstractC167007dF.A1F(notesApi, 1, str);
        this.A06 = notesApi;
        this.A03 = notesRepository;
        this.A02 = j;
        this.A04 = str;
        this.A05 = str2;
    }
}
