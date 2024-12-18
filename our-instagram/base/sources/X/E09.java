package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E09 extends AbstractC70653Fc {
    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        rect.right = view.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }
}
