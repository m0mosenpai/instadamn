package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.M0s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49873M0s implements Runnable {
    public final /* synthetic */ JR2 A00;

    public RunnableC49873M0s(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.A00.A0F;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.dispatchOnGlobalLayout();
        }
    }
}
