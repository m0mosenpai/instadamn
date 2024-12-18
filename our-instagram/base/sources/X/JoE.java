package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoE extends AbstractC70653Fc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C66362zD c66362zD;
        int i;
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int A02 = RecyclerView.A02(view);
        C2UU c2uu = recyclerView.A0A;
        if ((c2uu instanceof C66362zD) && (c66362zD = (C66362zD) c2uu) != null && c66362zD.A09(A02, C45214Jzu.class)) {
            if (A02 == 0) {
                i = this.A00;
            } else {
                i = this.A01;
            }
            rect.top = i;
        }
    }

    public JoE(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
