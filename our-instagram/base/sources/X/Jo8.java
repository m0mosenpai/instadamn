package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class Jo8 extends AbstractC70653Fc {
    public final int A00;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC25233BEq.A0v(1, view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) / 2;
        int measuredWidth = (recyclerView.getMeasuredWidth() - this.A00) / 2;
        int A02 = RecyclerView.A02(view);
        if (A02 <= 0) {
            rect.left = measuredWidth;
        } else {
            C2UU c2uu = recyclerView.A0A;
            if (c2uu != null && A02 == c2uu.getItemCount() - 1) {
                rect.left = dimensionPixelOffset;
                rect.right = measuredWidth;
                return;
            }
            rect.left = dimensionPixelOffset;
        }
        rect.right = dimensionPixelOffset;
    }

    public Jo8(int i) {
        this.A00 = i;
    }
}
