package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GuI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38381GuI extends C1I4 {
    public final HH1 A00;

    public C38381GuI(HH1 hh1) {
        this.A00 = hh1;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        HH1 hh1;
        Integer num;
        LinearLayoutManager linearLayoutManager;
        int A1a;
        int A1b;
        Object obj;
        int A0N = AbstractC167017dG.A0N(recyclerView, 627008314);
        super.onScrolled(recyclerView, i, i2);
        if (i2 > 0) {
            hh1 = this.A00;
            num = C05F.A01;
        } else {
            if (i2 < 0) {
                hh1 = this.A00;
                num = C05F.A00;
            }
            C0f9.A0A(-2086262674, A0N);
        }
        hh1.A01 = num;
        Integer num2 = hh1.A00;
        if (num2 == C05F.A00 || num2 == C05F.A01) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null && (A1a = linearLayoutManager.A1a()) <= (A1b = linearLayoutManager.A1b())) {
                while (true) {
                    View A0e = linearLayoutManager.A0e(A1a);
                    if (A0e != null) {
                        obj = A0e.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj instanceof C38473Gvu) {
                        A0e.getTop();
                    }
                    if (A1a == A1b) {
                        break;
                    } else {
                        A1a++;
                    }
                }
            }
        }
        C0f9.A0A(-2086262674, A0N);
    }
}
