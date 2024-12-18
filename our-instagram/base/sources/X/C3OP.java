package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.3OP, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3OP extends ViewGroup.MarginLayoutParams {
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public C3OO mViewHolder;

    public C3OP(C3OP c3op) {
        super((ViewGroup.LayoutParams) c3op);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C3OP(int i, int i2) {
        super(i, i2);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C3OP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C3OP(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }

    public C3OP(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A02 = new Rect();
        this.A00 = true;
        this.A01 = false;
    }
}
