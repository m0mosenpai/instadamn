package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.ui.widget.tooltippopup.MaskingFrameLayout;

/* loaded from: classes8.dex */
public final class JXE extends LinearLayout {
    public Rect A00;
    public Drawable A01;
    public MaskingFrameLayout A02;
    public MaskingFrameLayout A03;
    public MaskingFrameLayout A04;

    public final void A00() {
        this.A02.invalidate();
        this.A03.invalidate();
        this.A04.invalidate();
    }

    public View getLowerNub() {
        return this.A03;
    }

    public View getUpperNub() {
        return this.A04;
    }

    public View getContent() {
        return requireViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setBounds(this.A02.getLeft() - this.A00.left, this.A02.getTop() - this.A00.top, this.A02.getRight() + this.A00.right, this.A02.getBottom() + this.A00.bottom);
        }
    }
}
