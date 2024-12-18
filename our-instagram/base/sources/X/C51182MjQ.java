package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.MjQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51182MjQ extends AbstractC70653Fc {
    public final int A00;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        if (RecyclerView.A02(view) == 0) {
            rect.left = this.A00;
        }
        rect.right = this.A00;
    }

    public C51182MjQ(Context context) {
        this.A00 = (int) (((AbstractC13880nE.A0A(context) - (context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height) * 4.5d)) - (AbstractC167017dG.A05(context) * 2)) / Math.ceil(4.5d));
    }
}
