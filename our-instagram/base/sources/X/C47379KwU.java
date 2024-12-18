package X;

import android.view.View;
import com.facebook.R;
import com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView;

/* renamed from: X.KwU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47379KwU {
    public final ThumbnailGridView A00;

    public C47379KwU(View view, boolean z, boolean z2) {
        int A00;
        C14360o3.A0B(view, 1);
        ThumbnailGridView thumbnailGridView = (ThumbnailGridView) AbstractC166997dE.A0R(view, R.id.message_content_thumbnail_grid);
        this.A00 = thumbnailGridView;
        if (z && !z2) {
            A00 = view.getResources().getDimensionPixelSize(R.dimen.direct_standard_xma_grid_view_height);
        } else {
            A00 = C7N9.A00(AbstractC166997dE.A0L(view), false) / 3;
        }
        thumbnailGridView.setThumbnailHeight(A00);
    }
}
