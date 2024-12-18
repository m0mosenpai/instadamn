package X;

import android.widget.OverScroller;

/* loaded from: classes11.dex */
public final class UCl extends OverScroller {
    public int A00;

    public final int A00() {
        super.startScroll(0, 0, 0, 0);
        return this.A00;
    }

    @Override // android.widget.OverScroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
    }
}
