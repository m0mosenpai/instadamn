package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.WqG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71225WqG implements Runnable {
    public final /* synthetic */ UEz A00;

    public RunnableC71225WqG(UEz uEz) {
        this.A00 = uEz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A00.A02;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
