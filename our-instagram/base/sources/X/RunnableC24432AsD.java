package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AsD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24432AsD implements Runnable {
    public final /* synthetic */ C187318Ry A00;

    public RunnableC24432AsD(C187318Ry c187318Ry) {
        this.A00 = c187318Ry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int computeHorizontalScrollRange;
        C187318Ry c187318Ry = this.A00;
        RecyclerView recyclerView = c187318Ry.A0L;
        if (recyclerView.computeHorizontalScrollRange() > recyclerView.computeHorizontalScrollExtent()) {
            if (c187318Ry.A0Z) {
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                computeHorizontalScrollRange = 0;
                if (computeHorizontalScrollOffset > 0) {
                    computeHorizontalScrollRange = -computeHorizontalScrollOffset;
                }
            } else {
                computeHorizontalScrollRange = (recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent()) - recyclerView.computeHorizontalScrollOffset();
            }
            recyclerView.A0t(computeHorizontalScrollRange, 0);
            return;
        }
        c187318Ry.A0B = false;
    }
}
