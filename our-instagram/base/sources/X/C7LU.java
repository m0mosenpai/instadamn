package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7LU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7LU {
    public RecyclerView A00;
    public ViewTreeObserver.OnDrawListener A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public final C7X9 A03;

    public C7LU(C7X9 c7x9) {
        C14360o3.A0B(c7x9, 1);
        this.A03 = c7x9;
    }

    public final void A02(final LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, final java.util.Set set, boolean z) {
        C14360o3.A0B(set, 2);
        if (recyclerView.isLaidOut() && z && A00(linearLayoutManager, this, set)) {
            return;
        }
        this.A00 = recyclerView;
        this.A02 = new ViewTreeObserver.OnGlobalLayoutListener(linearLayoutManager, this, set) { // from class: X.7LX
            public final LinearLayoutManager A00;
            public final java.util.Set A01;
            public final /* synthetic */ C7LU A02;

            {
                this.A02 = this;
                this.A00 = linearLayoutManager;
                this.A01 = set;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C7LU c7lu = this.A02;
                if (c7lu.A00 != null && C7LU.A00(this.A00, c7lu, this.A01)) {
                    c7lu.A01();
                }
            }
        };
        this.A01 = new ViewTreeObserver.OnDrawListener() { // from class: X.7LY
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
            }
        };
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
        recyclerView.getViewTreeObserver().addOnDrawListener(this.A01);
    }

    public final void A01() {
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A02);
            viewTreeObserver.removeOnDrawListener(this.A01);
            this.A02 = null;
            this.A01 = null;
            this.A00 = null;
        }
    }

    public static final boolean A00(LinearLayoutManager linearLayoutManager, C7LU c7lu, java.util.Set set) {
        C2UU c2uu;
        C7X9 c7x9;
        StringBuilder sb;
        String str;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        RecyclerView recyclerView = c7lu.A00;
        if (recyclerView != null && (c2uu = recyclerView.A0A) != null) {
            int itemCount = c2uu.getItemCount();
            if (A1a >= 0 && A1b >= 0 && A1a < itemCount && A1b < itemCount) {
                itemCount = 0;
                if (A1a <= A1b) {
                    while (true) {
                        if (set.contains(Integer.valueOf(c2uu.getItemViewType(A1a)))) {
                            itemCount++;
                        }
                        if (A1a == A1b) {
                            break;
                        }
                        A1a++;
                    }
                    if (itemCount > 0) {
                        return c7lu.A03.DO0(itemCount);
                    }
                }
                c7x9 = c7lu.A03;
                sb = new StringBuilder();
                str = "visibleItemOfGivenTypeCount : ";
            } else {
                c7x9 = c7lu.A03;
                sb = new StringBuilder();
                sb.append("FirstVisibleItemPosition : ");
                sb.append(A1a);
                sb.append(", LastVisibleItemPosition : ");
                sb.append(A1b);
                str = ", AdapterNumViews : ";
            }
            sb.append(str);
            sb.append(itemCount);
            c7x9.DNn(sb.toString());
        }
        return false;
    }
}
