package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UH6 extends AbstractC70653Fc {
    public final int A00;
    public final int A01;

    public UH6(Context context, int i) {
        this.A00 = AbstractC167017dG.A06(context);
        this.A01 = i;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int A02 = RecyclerView.A02(view);
        int i = this.A01;
        int i2 = A02 % i;
        rect.setEmpty();
        if (i2 < i - 1) {
            rect.right = this.A00;
        }
    }
}
