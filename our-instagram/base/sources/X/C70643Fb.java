package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70643Fb extends AbstractC70653Fc {
    public final /* synthetic */ int A00;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(recyclerView, 2);
        if (RecyclerView.A02(view) == 0) {
            rect.set(this.A00, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public C70643Fb(int i) {
        this.A00 = i;
    }
}
