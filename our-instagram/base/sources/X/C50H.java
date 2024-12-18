package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.50H, reason: invalid class name */
/* loaded from: classes3.dex */
public class C50H extends AbstractC70653Fc {
    public static final int[] A03 = {R.attr.listDivider};
    public int A00;
    public Drawable A01;
    public final Rect A02 = new Rect();

    public final void A01(Drawable drawable) {
        if (drawable != null) {
            this.A01 = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    @Override // X.AbstractC70653Fc
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        Drawable drawable = this.A01;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.A00 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // X.AbstractC70653Fc
    public void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.A0D != null && this.A01 != null) {
            int i3 = this.A00;
            canvas.save();
            boolean z = recyclerView.A0O;
            int i4 = 0;
            if (i3 == 1) {
                if (z) {
                    i2 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i4 < childCount) {
                    View childAt = recyclerView.getChildAt(i4);
                    Rect rect = this.A02;
                    RecyclerView.A0D(childAt, rect);
                    int round = rect.bottom + Math.round(childAt.getTranslationY());
                    this.A01.setBounds(i2, round - this.A01.getIntrinsicHeight(), width, round);
                    this.A01.draw(canvas);
                    i4++;
                }
            } else {
                if (z) {
                    i = recyclerView.getPaddingTop();
                    height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                    canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
                } else {
                    height = recyclerView.getHeight();
                    i = 0;
                }
                int childCount2 = recyclerView.getChildCount();
                while (i4 < childCount2) {
                    View childAt2 = recyclerView.getChildAt(i4);
                    Rect rect2 = this.A02;
                    RecyclerView.A0D(childAt2, rect2);
                    int round2 = rect2.right + Math.round(childAt2.getTranslationX());
                    this.A01.setBounds(round2 - this.A01.getIntrinsicWidth(), i, round2, height);
                    this.A01.draw(canvas);
                    i4++;
                }
            }
            canvas.restore();
        }
    }

    public C50H(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A03);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A01 = drawable;
        if (drawable == null) {
            android.util.Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.A00 = i;
    }
}
