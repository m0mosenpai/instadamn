package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* loaded from: classes8.dex */
public final class M5Y implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ C106144qU A01;
    public final /* synthetic */ C4FE A02;

    public M5Y(CommentGiphyMediaInfo commentGiphyMediaInfo, C106144qU c106144qU, C4FE c4fe) {
        this.A01 = c106144qU;
        this.A02 = c4fe;
        this.A00 = commentGiphyMediaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C106144qU c106144qU = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        NoteAvatarView noteAvatarView = c106144qU.A08;
        C74P A00 = AbstractC47851LBu.A00(noteAvatarView.A0C, this.A00, this.A02.A02);
        if (A00 != null) {
            noteAvatarView.A0C.setImageDrawable(A00);
        }
    }
}