package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Mjb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51193Mjb extends AbstractC70653Fc {
    public static final OGJ A01 = new Object();
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

    public C51193Mjb(Context context, Integer num) {
        this.A00 = context.getResources().getDimensionPixelOffset(num == C05F.A01 ? R.dimen.abc_button_padding_horizontal_material : R.dimen.account_discovery_bottom_gap);
    }
}
