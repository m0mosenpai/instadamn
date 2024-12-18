package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.MjO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51180MjO extends AbstractC70653Fc {
    public final /* synthetic */ OyC A00;

    public C51180MjO(OyC oyC) {
        this.A00 = oyC;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        AbstractC167027dH.A12(rect, view, recyclerView);
        int A02 = RecyclerView.A02(view);
        int itemCount = this.A00.A0C.getItemCount();
        if (A02 == 0) {
            rect.left = AbstractC25228BEl.A0M(view).getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        } else {
            if (A02 != itemCount - 1) {
                return;
            }
            rect.right = AbstractC25228BEl.A0M(view).getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        }
    }
}
