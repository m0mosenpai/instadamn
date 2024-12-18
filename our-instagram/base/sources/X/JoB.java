package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoB extends AbstractC70653Fc {
    public final float A00;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int i = (int) this.A00;
        rect.set(0, i, 0, i);
    }

    public JoB(float f) {
        this.A00 = f;
    }
}
