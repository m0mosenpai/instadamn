package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHP extends C1I4 {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final UH9 A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UHP uhp = (UHP) obj;
            if (this.A04 == uhp.A04) {
                return this.A03.equals(uhp.A03);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A03, Boolean.valueOf(this.A04));
    }

    public UHP(UH9 uh9, boolean z) {
        this.A03 = uh9;
        uh9.A01 = this;
        this.A02 = AbstractC167007dF.A1M((uh9.A00 > 0.0f ? 1 : (uh9.A00 == 0.0f ? 0 : -1)));
        this.A04 = z;
        if (z) {
            uh9.A00 = 1.0f;
        }
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int A03 = C0f9.A03(-955028286);
        if (this.A04) {
            i2 = 1978403082;
        } else {
            if (i == 0) {
                RunnableC71404WtS runnableC71404WtS = new RunnableC71404WtS(recyclerView, this);
                this.A01 = runnableC71404WtS;
                recyclerView.postDelayed(runnableC71404WtS, 1500L);
            } else {
                recyclerView.removeCallbacks(this.A01);
                if (!this.A02) {
                    ValueAnimator valueAnimator = this.A00;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        this.A00.cancel();
                    }
                    UH9 uh9 = this.A03;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(uh9.A00, 1.0f);
                    ofFloat.addUpdateListener(new WH2(recyclerView, uh9));
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    this.A02 = true;
                }
            }
            i2 = -125924888;
        }
        C0f9.A0A(i2, A03);
    }
}
