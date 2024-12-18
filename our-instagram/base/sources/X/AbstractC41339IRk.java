package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.IRk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41339IRk {
    public static final void A00(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int A1a;
        int A1b;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (!(abstractC70663Fe instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) == null || (A1a = linearLayoutManager.A1a()) > (A1b = linearLayoutManager.A1b())) {
            return;
        }
        while (true) {
            C3OO A0V = recyclerView.A0V(A1a);
            if (A0V != null) {
                A0V.itemView.setSelected(false);
            }
            if (A1a != A1b) {
                A1a++;
            } else {
                return;
            }
        }
    }

    public static final void A01(RecyclerView recyclerView, int i) {
        recyclerView.A0o(i);
        C3OO A0V = recyclerView.A0V(i - 1);
        if (A0V != null) {
            A0V.itemView.setSelected(false);
        }
        C3OO A0V2 = recyclerView.A0V(i + 1);
        if (A0V2 != null) {
            A0V2.itemView.setSelected(false);
        }
        C3OO A0V3 = recyclerView.A0V(i);
        if (A0V3 != null) {
            A0V3.itemView.setSelected(true);
        }
    }
}
