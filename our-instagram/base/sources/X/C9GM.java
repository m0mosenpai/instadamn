package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.ArrayList;

/* renamed from: X.9GM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GM {
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;
    public ArrayList A03 = AbstractC166987dD.A1E();
    public int A01 = Integer.MIN_VALUE;
    public int A00 = Integer.MIN_VALUE;
    public int A02 = 0;

    public final int A00() {
        int i;
        int size;
        if (this.A05.A0D) {
            i = this.A03.size() - 1;
            size = -1;
        } else {
            i = 0;
            size = this.A03.size();
        }
        return A05(i, size, false, false, true);
    }

    public final int A01() {
        int size;
        int i;
        if (this.A05.A0D) {
            size = 0;
            i = this.A03.size();
        } else {
            size = this.A03.size() - 1;
            i = -1;
        }
        return A05(size, i, false, false, true);
    }

    public final int A04(int i, int i2) {
        return A05(i, i2, false, true, false);
    }

    public final View A06(int i, int i2) {
        View view = null;
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        int i3 = size - 1;
        if (i2 == -1) {
            int i4 = 0;
            while (i4 < size) {
                View view2 = (View) arrayList.get(i4);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if ((staggeredGridLayoutManager.A0D && AbstractC70663Fe.A0C(view2) <= i) || ((!staggeredGridLayoutManager.A0D && AbstractC70663Fe.A0C(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i4++;
                view = view2;
            }
        } else {
            while (i3 >= 0) {
                View view3 = (View) arrayList.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if (staggeredGridLayoutManager2.A0D && AbstractC70663Fe.A0C(view3) >= i) {
                    break;
                }
                if (!staggeredGridLayoutManager2.A0D && AbstractC70663Fe.A0C(view3) <= i) {
                    return view;
                }
                if (!view3.hasFocusable()) {
                    break;
                }
                i3--;
                view = view3;
            }
        }
        return view;
    }

    public C9GM(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i;
    }

    public final int A02(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() != 0) {
            A07();
            return this.A00;
        }
        return i;
    }

    public final int A03(int i) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() != 0) {
            A08();
            return this.A01;
        }
        return i;
    }

    public final int A05(int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        AbstractC70763Fo abstractC70763Fo = this.A05.A07;
        int A06 = abstractC70763Fo.A06();
        int A03 = abstractC70763Fo.A03();
        int i3 = -1;
        if (i2 > i) {
            i3 = 1;
        }
        while (i != i2) {
            View view = (View) this.A03.get(i);
            int A0D = abstractC70763Fo.A0D(view);
            int A08 = abstractC70763Fo.A08(view);
            boolean z5 = false;
            if (!z3 ? A0D < A03 : A0D <= A03) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z3 ? A08 > A06 : A08 >= A06) {
                z5 = true;
            }
            if (z4 && z5) {
                if (z) {
                    if (z2) {
                        if (A0D >= A06 && A08 <= A03) {
                            return AbstractC70663Fe.A0C(view);
                        }
                    }
                    if (A0D < A06 && A08 <= A03) {
                    }
                    return AbstractC70663Fe.A0C(view);
                }
                if (z2) {
                    return AbstractC70663Fe.A0C(view);
                }
                if (A0D < A06) {
                }
                return AbstractC70663Fe.A0C(view);
            }
            i += i3;
        }
        return -1;
    }

    public final void A07() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00;
        int i;
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.get(arrayList.size() - 1);
        AnonymousClass807 anonymousClass807 = (AnonymousClass807) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A00 = staggeredGridLayoutManager.A07.A08(view);
        if (anonymousClass807.A01 && (A00 = staggeredGridLayoutManager.A09.A00(anonymousClass807.mViewHolder.getLayoutPosition())) != null && A00.A00 == 1) {
            int i2 = this.A00;
            int i3 = this.A04;
            int[] iArr = A00.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A00 = i2 + i;
        }
    }

    public final void A08() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem A00;
        int i;
        View view = (View) AbstractC166997dE.A0k(this.A03);
        AnonymousClass807 anonymousClass807 = (AnonymousClass807) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A01 = staggeredGridLayoutManager.A07.A0D(view);
        if (anonymousClass807.A01 && (A00 = staggeredGridLayoutManager.A09.A00(anonymousClass807.mViewHolder.getLayoutPosition())) != null && A00.A00 == -1) {
            int i2 = this.A01;
            int i3 = this.A04;
            int[] iArr = A00.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A01 = i2 - i;
        }
    }

    public final void A09() {
        this.A03.clear();
        this.A01 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = 0;
    }

    public final void A0A() {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        AnonymousClass807 anonymousClass807 = (AnonymousClass807) view.getLayoutParams();
        anonymousClass807.A00 = null;
        C3OO c3oo = anonymousClass807.mViewHolder;
        if (c3oo.isRemoved() || c3oo.isUpdated()) {
            this.A02 -= this.A05.A07.A0B(view);
        }
        if (size == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        this.A00 = Integer.MIN_VALUE;
    }

    public final void A0B() {
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.remove(0);
        AnonymousClass807 anonymousClass807 = (AnonymousClass807) view.getLayoutParams();
        anonymousClass807.A00 = null;
        if (arrayList.size() == 0) {
            this.A00 = Integer.MIN_VALUE;
        }
        C3OO c3oo = anonymousClass807.mViewHolder;
        if (c3oo.isRemoved() || c3oo.isUpdated()) {
            this.A02 -= this.A05.A07.A0B(view);
        }
        this.A01 = Integer.MIN_VALUE;
    }

    public final void A0C(View view) {
        AnonymousClass807 anonymousClass807 = (AnonymousClass807) view.getLayoutParams();
        anonymousClass807.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(view);
        this.A00 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        C3OO c3oo = anonymousClass807.mViewHolder;
        if (c3oo.isRemoved() || c3oo.isUpdated()) {
            this.A02 += this.A05.A07.A0B(view);
        }
    }

    public final void A0D(View view) {
        AnonymousClass807 anonymousClass807 = (AnonymousClass807) view.getLayoutParams();
        anonymousClass807.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A00 = Integer.MIN_VALUE;
        }
        C3OO c3oo = anonymousClass807.mViewHolder;
        if (c3oo.isRemoved() || c3oo.isUpdated()) {
            this.A02 += this.A05.A07.A0B(view);
        }
    }
}
