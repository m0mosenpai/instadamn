package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.WtS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71404WtS implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ UHP A01;

    public RunnableC71404WtS(RecyclerView recyclerView, UHP uhp) {
        this.A01 = uhp;
        this.A00 = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UHP uhp = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        uhp.A00 = ofFloat;
        ofFloat.addUpdateListener(new WH2(this.A00, uhp.A03));
        uhp.A00.setDuration(200L);
        uhp.A00.start();
        uhp.A02 = false;
    }
}
