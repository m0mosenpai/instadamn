package X;

import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UGT extends C80V {
    public Scroller A00;

    @Override // X.AbstractC61802rh
    public final void A07(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.A00 = new Scroller(recyclerView.getContext(), new DecelerateInterpolator());
        }
        super.A07(recyclerView);
    }

    @Override // X.AbstractC61802rh
    public final int[] A08(int i, int i2) {
        Scroller scroller = this.A00;
        if (scroller != null) {
            scroller.fling(0, 0, i, i2, -1000, 1000, 0, 0);
            return new int[]{scroller.getFinalX(), scroller.getFinalY()};
        }
        return super.A08(i, i2);
    }
}
