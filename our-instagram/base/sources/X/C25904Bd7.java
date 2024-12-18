package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Bd7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25904Bd7 extends AbstractC70653Fc {
    public final int A00;
    public final int A01 = 3;

    public C25904Bd7(Context context) {
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        C14360o3.A0B(rect, 0);
        AbstractC25233BEq.A0v(1, view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int A02 = RecyclerView.A02(view);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            i = abstractC70663Fe.A0U();
        } else {
            i = 1;
        }
        int i2 = this.A01;
        if (A02 / i2 < (i - 1) / i2) {
            rect.bottom = this.A00;
        }
    }
}
