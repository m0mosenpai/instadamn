package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.DxZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31776DxZ extends FrameLayout {
    public int A00;
    public int A01;
    public Drawable A02;
    public C55982hj A03;
    public C55982hj A04;
    public boolean A05;
    public static final C55942hf A07 = C55942hf.A04(250.0d, 16.0d);
    public static final C55942hf A08 = C55942hf.A04(40.0d, 9.0d);
    public static final C55942hf A06 = C55942hf.A04(60.0d, 5.0d);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31776DxZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        A02.A00 = 0.01d;
        A02.A0A(new C32114E9m(this));
        this.A04 = A02;
        C55982hj A022 = A00.A02();
        A022.A06 = true;
        A022.A09(A06);
        A022.A0A(new C32115E9n(this));
        this.A03 = A022;
        Drawable strokeDrawable = getStrokeDrawable();
        this.A02 = strokeDrawable;
        strokeDrawable.setAlpha(0);
        this.A01 = AbstractC167017dG.A04(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public abstract Drawable getStrokeDrawable();

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.A01;
        setPadding(i3, i3, i3, i3);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        C55982hj c55982hj;
        double d;
        Drawable drawable = this.A02;
        if (z) {
            if (drawable != null) {
                drawable.setAlpha(255);
            }
            c55982hj = this.A03;
            if (c55982hj != null) {
                d = 255.0d;
                c55982hj.A06(d);
                c55982hj.A05(d);
            }
        } else {
            if (drawable != null) {
                drawable.setAlpha(0);
            }
            c55982hj = this.A03;
            if (c55982hj != null) {
                d = 0.0d;
                c55982hj.A06(d);
                c55982hj.A05(d);
            }
        }
        invalidate();
        requestLayout();
    }

    public final int getDisabledAlpha() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = C0f9.A06(-20356303);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        C0f9.A0D(130997185, A062);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        double d;
        super.setPressed(z);
        if (this.A05) {
            C55982hj c55982hj = this.A04;
            if (z) {
                if (c55982hj != null) {
                    c55982hj.A09(A07);
                    d = 1.0d;
                } else {
                    return;
                }
            } else {
                if (c55982hj == null) {
                    return;
                }
                c55982hj.A09(A08);
                d = 0.0d;
            }
            c55982hj.A06(d);
        }
    }

    public final void setAnimatePress(boolean z) {
        this.A05 = z;
    }

    public final void setDisabledAlpha(int i) {
        this.A00 = i;
    }
}
