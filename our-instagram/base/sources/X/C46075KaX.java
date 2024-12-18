package X;

import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.KaX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46075KaX extends MediaFrameLayout {
    public int A00;
    public int A01;
    public int A02;

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != this.A00) {
            this.A00 = getChildCount();
            super.measure(this.A02, this.A01);
        }
        if (getChildCount() == 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // com.instagram.ui.widget.framelayout.MediaFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.A00 = getChildCount();
        this.A01 = i2;
        this.A02 = i;
        super.onMeasure(i, i2);
    }
}
