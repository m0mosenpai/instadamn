package X;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110834yv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Interpolator A05;
    public boolean A06;

    public final void A00(Interpolator interpolator, int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
        this.A06 = true;
    }

    public final void A01(RecyclerView recyclerView) {
        int i = this.A04;
        if (i >= 0) {
            this.A04 = -1;
            recyclerView.A0l(i);
        } else if (this.A06) {
            Interpolator interpolator = this.A05;
            if (interpolator != null && this.A01 < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.A01;
            if (i2 >= 1) {
                recyclerView.mViewFlinger.A02(interpolator, this.A02, this.A03, i2);
                int i3 = this.A00 + 1;
                this.A00 = i3;
                if (i3 > 10) {
                    android.util.Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
            } else {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
        } else {
            this.A00 = 0;
            return;
        }
        this.A06 = false;
    }
}
