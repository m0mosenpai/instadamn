package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3FI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FI {
    public View A01;
    public final C3FH A03;
    public int A00 = 0;
    public final C3FJ A02 = new C3FJ();
    public final List A04 = new ArrayList();

    private int A00(int i) {
        if (i >= 0) {
            int childCount = ((C3FG) this.A03).A00.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                C3FJ c3fj = this.A02;
                int A01 = i - (i2 - c3fj.A01(i2));
                if (A01 != 0) {
                    i2 += A01;
                } else {
                    while (c3fj.A06(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void A01(View view, C3FI c3fi) {
        c3fi.A04.add(view);
        C3FG c3fg = (C3FG) c3fi.A03;
        C3OO A05 = RecyclerView.A05(view);
        if (A05 != null) {
            A05.onEnteredHiddenState(c3fg.A00);
        }
    }

    public static void A02(View view, C3FI c3fi) {
        if (c3fi.A04.remove(view)) {
            C3FG c3fg = (C3FG) c3fi.A03;
            C3OO A05 = RecyclerView.A05(view);
            if (A05 != null) {
                A05.onLeftHiddenState(c3fg.A00);
            }
        }
    }

    public final int A03() {
        return ((C3FG) this.A03).A00.getChildCount() - this.A04.size();
    }

    public final int A04() {
        return ((C3FG) this.A03).A00.getChildCount();
    }

    public final int A05(View view) {
        int indexOfChild = ((C3FG) this.A03).A00.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        C3FJ c3fj = this.A02;
        if (c3fj.A06(indexOfChild)) {
            return -1;
        }
        return indexOfChild - c3fj.A01(indexOfChild);
    }

    public final View A07(int i) {
        return ((C3FG) this.A03).A00.getChildAt(i);
    }

    public final void A09(int i) {
        int i2 = this.A00;
        if (i2 != 1) {
            if (i2 != 2) {
                try {
                    int A00 = A00(i);
                    RecyclerView recyclerView = ((C3FG) this.A03).A00;
                    View childAt = recyclerView.getChildAt(A00);
                    if (childAt != null) {
                        this.A00 = 1;
                        this.A01 = childAt;
                        if (this.A02.A07(A00)) {
                            A02(childAt, this);
                        }
                        View childAt2 = recyclerView.getChildAt(A00);
                        if (childAt2 != null) {
                            recyclerView.A0x(childAt2);
                            childAt2.clearAnimation();
                        }
                        recyclerView.removeViewAt(A00);
                    }
                    return;
                } finally {
                    this.A00 = 0;
                    this.A01 = null;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void A0A(View view, int i, boolean z) {
        int A00;
        if (i < 0) {
            A00 = ((C3FG) this.A03).A00.getChildCount();
        } else {
            A00 = A00(i);
        }
        this.A02.A05(A00, z);
        if (z) {
            A01(view, this);
        }
        RecyclerView recyclerView = ((C3FG) this.A03).A00;
        recyclerView.addView(view, A00);
        C3OO A05 = RecyclerView.A05(view);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null && A05 != null) {
            c2uu.onViewAttachedToWindow(A05);
        }
        List list = recyclerView.A0L;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((InterfaceC69563Aq) recyclerView.A0L.get(size)).D36(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A0B(View view, ViewGroup.LayoutParams layoutParams, int i, boolean z) {
        int A00;
        if (i < 0) {
            A00 = ((C3FG) this.A03).A00.getChildCount();
        } else {
            A00 = A00(i);
        }
        this.A02.A05(A00, z);
        if (z) {
            A01(view, this);
        }
        C3FG c3fg = (C3FG) this.A03;
        C3OO A05 = RecyclerView.A05(view);
        if (A05 != null) {
            if (!A05.isTmpDetached() && !A05.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(A05);
                sb.append(c3fg.A00.A0Z());
                throw new IllegalArgumentException(sb.toString());
            }
            A05.clearTmpDetachFlag();
        } else if (RecyclerView.A1C) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(A00);
            sb2.append(c3fg.A00.A0Z());
            throw new IllegalArgumentException(sb2.toString());
        }
        RecyclerView.A0F(view, layoutParams, c3fg.A00, A00);
    }

    public final String toString() {
        return AnonymousClass001.A0b(this.A02.toString(), ", hidden list:", this.A04.size());
    }

    public C3FI(C3FH c3fh) {
        this.A03 = c3fh;
    }

    public final View A06(int i) {
        return ((C3FG) this.A03).A00.getChildAt(A00(i));
    }

    public final void A08(int i) {
        int A00 = A00(i);
        this.A02.A07(A00);
        RecyclerView recyclerView = ((C3FG) this.A03).A00;
        View childAt = recyclerView.getChildAt(A00);
        if (childAt != null) {
            C3OO A05 = RecyclerView.A05(childAt);
            if (A05 != null) {
                if (A05.isTmpDetached() && !A05.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(A05);
                    sb.append(recyclerView.A0Z());
                    throw new IllegalArgumentException(sb.toString());
                }
                A05.addFlags(256);
            }
        } else if (RecyclerView.A1C) {
            throw new IllegalArgumentException(AnonymousClass001.A0c("No view at offset ", recyclerView.A0Z(), A00));
        }
        RecyclerView.A0K(recyclerView, A00);
    }
}
