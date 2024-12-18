package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.MjR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51183MjR extends AbstractC70653Fc {
    public final int A00;

    public C51183MjR(Context context) {
        this.A00 = AMo.A00(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        AbstractC167027dH.A12(rect, view, recyclerView);
        int A02 = RecyclerView.A02(view);
        int i2 = this.A00;
        int i3 = i2;
        if (A02 != 0) {
            i2 /= 2;
        }
        rect.left = i2;
        int A022 = RecyclerView.A02(view);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            i = c2uu.getItemCount();
        } else {
            i = 0;
        }
        if (A022 != i - 1) {
            i3 /= 2;
        }
        rect.right = i3;
    }
}
