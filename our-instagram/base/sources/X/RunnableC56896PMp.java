package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.PMp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56896PMp implements Runnable {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public RunnableC56896PMp(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A00.A06;
        if (recyclerView != null) {
            recyclerView.A0o(0);
        }
    }
}
