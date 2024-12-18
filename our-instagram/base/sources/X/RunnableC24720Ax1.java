package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Ax1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24720Ax1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AND A01;
    public final /* synthetic */ C8SB A02;

    public RunnableC24720Ax1(AND and, C8SB c8sb, int i) {
        this.A02 = c8sb;
        this.A01 = and;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8SB c8sb = this.A02;
        RecyclerView recyclerView = c8sb.A0I;
        if (recyclerView != null && recyclerView.A0T) {
            AND and = this.A01;
            if (!and.A04) {
                C3OO c3oo = and.A0C;
                if (c3oo.getAbsoluteAdapterPosition() != -1) {
                    C3F1 c3f1 = recyclerView.A0C;
                    if (c3f1 == null || !c3f1.A0L()) {
                        List list = c8sb.A0K;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (((AND) list.get(i)).A05) {
                            }
                        }
                        c8sb.A0F.onSwiped(c3oo, this.A00);
                        return;
                    }
                    c8sb.A0I.post(this);
                }
            }
        }
    }
}
