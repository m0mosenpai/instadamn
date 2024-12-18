package com.instagram.debug.devoptions.eventvisualizer;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC65702TsY;
import X.AbstractC70653Fc;
import X.C14360o3;
import X.C3F5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class EventItemDecoration extends AbstractC70653Fc {
    public final int dividerHeight;
    public final int leftOffset;
    public final Paint paint;
    public final int rightOffset;

    public EventItemDecoration(Context context) {
        C14360o3.A0B(context, 1);
        this.dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        this.leftOffset = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.rightOffset = AbstractC166997dE.A04(context, R.dimen.abc_edit_text_inset_top_material);
        Paint paint = new Paint();
        this.paint = paint;
        AbstractC166987dD.A1N(context, paint, R.color.fds_white_alpha60);
    }

    @Override // X.AbstractC70653Fc
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        rect.left = this.leftOffset;
        rect.right = this.rightOffset;
    }

    @Override // X.AbstractC70653Fc
    public void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        AbstractC167017dG.A1N(canvas, recyclerView);
        int paddingLeft = recyclerView.getPaddingLeft();
        int A08 = AbstractC65702TsY.A08(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                canvas.drawRect(paddingLeft, childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, A08, this.dividerHeight + r1, this.paint);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
