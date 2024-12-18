package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;
import java.util.List;

/* renamed from: X.KQc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45823KQc extends OptimisticNetworkOperation {
    public C6C9 A00;
    public final int A01;
    public final long A02;
    public final NotesRepository A03;
    public final String A04;
    public final List A05;
    public final List A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45823KQc(NotesApi notesApi, NotesRepository notesRepository, String str, List list, List list2, int i, long j) {
        super(notesApi);
        AbstractC167007dF.A1G(notesApi, 1, str);
        this.A03 = notesRepository;
        this.A02 = j;
        this.A01 = i;
        this.A04 = str;
        this.A06 = list;
        this.A05 = list2;
    }
}
