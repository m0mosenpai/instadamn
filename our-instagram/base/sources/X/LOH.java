package X;

import android.view.View;
import com.instagram.direct.inbox.notes.NotesRepository;

/* loaded from: classes8.dex */
public final class LOH implements View.OnClickListener {
    public final /* synthetic */ C4FJ A00;

    public LOH(C4FJ c4fj) {
        this.A00 = c4fj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1496284314);
        C4FJ c4fj = this.A00;
        AbstractC135966Db.A01(c4fj.A00).A0D(EnumC46303KeZ.A04);
        NotesRepository notesRepository = c4fj.A01;
        C05A c05a = notesRepository.A0b;
        C05A c05a2 = notesRepository.A0T;
        c05a.Egh(c05a2.getValue());
        c05a2.Egh(C16930sl.A00);
        C0f9.A0C(-919385719, A05);
    }
}
