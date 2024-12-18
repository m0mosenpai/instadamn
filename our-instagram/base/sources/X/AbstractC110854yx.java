package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110854yx {
    public static final void A01(final RecyclerView recyclerView, boolean z) {
        C14360o3.A0B(recyclerView, 0);
        if (recyclerView.getChildCount() != 0 && recyclerView.getHeight() != 0) {
            if (z) {
                recyclerView.A0o(0);
                recyclerView.postDelayed(new Runnable() { // from class: X.9H9
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.A0t(0, 0);
                        recyclerView2.A0n(0);
                    }
                }, 100L);
            } else {
                recyclerView.A0n(0);
            }
        }
    }

    public static final boolean A02(LinearLayoutManager linearLayoutManager) {
        C14360o3.A0B(linearLayoutManager, 0);
        if (linearLayoutManager.A0T() == 0 || linearLayoutManager.A1d() == linearLayoutManager.A0U() - 1) {
            return true;
        }
        return false;
    }

    public static final boolean A03(LinearLayoutManager linearLayoutManager) {
        C14360o3.A0B(linearLayoutManager, 0);
        if (linearLayoutManager.A0T() == 0 || linearLayoutManager.A1c() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean A04(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            return A02((LinearLayoutManager) abstractC70663Fe);
        }
        throw new UnsupportedOperationException(MSV.A00(814));
    }

    public static final boolean A05(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            return A03((LinearLayoutManager) abstractC70663Fe);
        }
        throw new UnsupportedOperationException("Only LinearLayoutManager has a top");
    }

    public static final int A00(View view, AbstractC70663Fe abstractC70663Fe) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        return abstractC70663Fe.A0W(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }
}
