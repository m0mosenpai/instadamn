package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Tzd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66102Tzd {
    public RecyclerView A00;
    public final XG0 A01;

    public C66102Tzd(XG0 xg0) {
        C14360o3.A0B(xg0, 1);
        this.A01 = xg0;
    }

    public final InterfaceC58117Ppg A01(AbstractC127945qN abstractC127945qN) {
        AbstractC70663Fe abstractC70663Fe;
        int A00;
        int A03;
        Object obj;
        JFS jfs;
        C14360o3.A0B(abstractC127945qN, 0);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null && (A00 = A00(abstractC127945qN)) != -1 && (A03 = AbstractC72193Ls.A03(abstractC70663Fe, recyclerView, A00)) != -1) {
            View childAt = recyclerView.getChildAt(A03);
            if (childAt != null) {
                obj = childAt.getTag();
            } else {
                obj = null;
            }
            if ((obj instanceof JFS) && (jfs = (JFS) obj) != null) {
                return (InterfaceC58117Ppg) jfs;
            }
        }
        return null;
    }

    public final U0N A02(AbstractC127945qN abstractC127945qN) {
        int A00;
        C14360o3.A0B(abstractC127945qN, 0);
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || recyclerView.A0D == null || (A00 = A00(abstractC127945qN)) == -1) {
            return null;
        }
        return this.A01.CFF(A00);
    }

    private final int A00(AbstractC127945qN abstractC127945qN) {
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null) {
            int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
            int A02 = AbstractC72193Ls.A02(abstractC70663Fe);
            if (A01 != -1 && A02 != -1) {
                XG0 xg0 = this.A01;
                if (A01 < xg0.getCount() && A02 < xg0.getCount() && A01 <= A02) {
                    while (true) {
                        Object item = ((InterfaceC71917XAb) xg0).getItem(A01);
                        if ((item instanceof AbstractC127945qN) && C14360o3.A0K(((AbstractC127945qN) item).getKey(), abstractC127945qN.getKey())) {
                            return A01;
                        }
                        if (A01 == A02) {
                            break;
                        }
                        A01++;
                    }
                }
            }
        }
        return -1;
    }
}
