package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GNd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36882GNd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32350EMx A01;

    public RunnableC36882GNd(C32350EMx c32350EMx, int i) {
        this.A01 = c32350EMx;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32350EMx c32350EMx = this.A01;
        RecyclerView recyclerView = c32350EMx.A00;
        if (recyclerView != null) {
            recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
            int i = this.A00;
            RecyclerView recyclerView2 = c32350EMx.A00;
            if (recyclerView2 != null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i, recyclerView2.getMeasuredHeight());
                ofInt.addUpdateListener(new C35292FhR(c32350EMx, 1));
                ofInt.start();
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }
}
