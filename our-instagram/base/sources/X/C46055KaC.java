package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.KaC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46055KaC extends C195638l4 {
    public final int A00;
    public final Resources A01;

    public C46055KaC(Resources resources, int i, int i2, int i3, int i4, int i5) {
        super(false, i2, i3, i4, i5);
        this.A01 = resources;
        this.A00 = i;
    }

    @Override // X.C195638l4, X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        AbstractC167027dH.A12(rect, view, recyclerView);
        C14360o3.A0B(c3f5, 3);
        if (this.A00 != 3) {
            Resources resources = this.A01;
            int A07 = AbstractC166997dE.A07(resources);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            rect.bottom = resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(A07, dimensionPixelSize2, A07, dimensionPixelSize);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, c3f5);
    }
}
