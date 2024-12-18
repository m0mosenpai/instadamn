package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UH5 extends AbstractC70653Fc {
    public final int A00;
    public final Drawable A01;

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        C2UU c2uu = recyclerView.A0A;
        c2uu.getClass();
        int itemCount = c2uu.getItemCount();
        int i = this.A00;
        int i2 = itemCount / i;
        int paddingLeft = recyclerView.getPaddingLeft();
        int A08 = AbstractC65702TsY.A08(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (RecyclerView.A02(childAt) / i != i2 - 1) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                Drawable drawable = this.A01;
                drawable.setBounds(paddingLeft, bottom, A08, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
        }
    }

    public UH5(Context context, int i) {
        this.A01 = context.getDrawable(AbstractC53242c7.A0H(context, R.attr.horizontalDivider1px));
        this.A00 = i;
    }
}
