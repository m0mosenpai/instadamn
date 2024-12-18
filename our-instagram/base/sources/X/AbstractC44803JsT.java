package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.JsT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44803JsT extends ViewPager {
    public float A00;
    public int A01;

    public float getScrollOffset() {
        return this.A00;
    }

    public int getScrollPosition() {
        return this.A01;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void A0G(int i, float f, int i2) {
        super.A0G(i, f, i2);
        this.A01 = i;
        this.A00 = f;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void A0H(int i, int i2, boolean z, boolean z2) {
        super.A0H(i, i2, z, z2);
        C021608n A0A = A0A(i);
        if (A0A != null) {
            this.A01 = A0A.A02;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
