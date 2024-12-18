package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoA extends AbstractC70653Fc {
    public final Context A00;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        boolean A1b = AbstractC25233BEq.A1b(rect, view, recyclerView);
        Context context = this.A00;
        int A04 = AbstractC167017dG.A04(context);
        int A07 = AbstractC13880nE.A07(context) / 2;
        int A06 = A07 - (AbstractC43594JPz.A06(context) / 2);
        int A02 = RecyclerView.A02(view);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null && c2uu.getItemCount() == A1b) {
            rect.set(A06, 0, A06, 0);
            return;
        }
        if (A02 == 0) {
            rect.set(A07, 0, A04, 0);
            return;
        }
        C2UU c2uu2 = recyclerView.A0A;
        if (c2uu2 != null && A02 == c2uu2.getItemCount() - (A1b ? 1 : 0)) {
            rect.set(A04, 0, A06, 0);
        } else {
            rect.set(A04, 0, A04, 0);
        }
    }

    public JoA(Context context) {
        this.A00 = context;
    }
}
