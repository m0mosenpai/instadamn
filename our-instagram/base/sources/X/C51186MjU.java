package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MjU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51186MjU extends AbstractC70653Fc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69473Ah A01;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167017dG.A1P(view, recyclerView);
        if (RecyclerView.A02(view) == 0 && this.A01.A0C.A08 == C05F.A00) {
            rect.set(-this.A00, 0, 0, 0);
        }
    }

    public C51186MjU(C69473Ah c69473Ah, int i) {
        this.A01 = c69473Ah;
        this.A00 = i;
    }
}
