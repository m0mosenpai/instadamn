package X;

import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.creation.NotesCreationPogView;

/* renamed from: X.M0u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49875M0u implements Runnable {
    public final /* synthetic */ C45466KBb A00;

    public RunnableC49875M0u(C45466KBb c45466KBb) {
        this.A00 = c45466KBb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C45466KBb c45466KBb = this.A00;
        NotesCreationPogView notesCreationPogView = c45466KBb.A0d;
        if (notesCreationPogView == null) {
            str = "pogViewContainer";
        } else {
            notesCreationPogView.setAlpha(0.6f);
            IgImageView igImageView = c45466KBb.A0V;
            str = "selectedNoteXButton";
            if (igImageView != null) {
                igImageView.setAlpha(0.6f);
                IgImageView igImageView2 = c45466KBb.A0V;
                if (igImageView2 != null) {
                    igImageView2.setEnabled(false);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
