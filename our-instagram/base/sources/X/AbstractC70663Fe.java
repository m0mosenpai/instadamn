package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.video.live.mvvm.view.comments.adapter.IgLiveCommentsLinearLayoutManager;
import java.util.ArrayList;

/* renamed from: X.3Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC70663Fe {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C3FI A05;
    public AbstractC110824yu A06;
    public RecyclerView A07;
    public C70723Fk A08;
    public C70723Fk A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final InterfaceC70703Fi A0G;
    public final InterfaceC70703Fi A0H;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r5 == 1073741824) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == 1073741824) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0A(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1f
            if (r7 >= 0) goto L2f
            if (r7 != r2) goto L18
            if (r5 == r0) goto L2d
            if (r5 == 0) goto L18
            if (r5 == r1) goto L2d
        L18:
            r5 = 0
            r7 = 0
        L1a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L1f:
            if (r7 >= 0) goto L2f
            if (r7 == r2) goto L2d
            if (r7 != r3) goto L18
            if (r5 == r0) goto L2b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L2d
        L2b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L2d:
            r7 = r4
            goto L1a
        L2f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70663Fe.A0A(int, int, int, int, boolean):int");
    }

    public View A0f(View view, int i) {
        return null;
    }

    public final void A0o(View view, int i) {
        A0G(view, this, i, false);
    }

    public void A0q(View view, int i, int i2) {
        C3OP c3op = (C3OP) view.getLayoutParams();
        Rect A0S = this.A07.A0S(view);
        int i3 = 0 + A0S.left + A0S.right;
        int i4 = 0 + A0S.top + A0S.bottom;
        int A0A = A0A(this.A03, this.A04, Bau() + Baw() + ((ViewGroup.MarginLayoutParams) c3op).leftMargin + ((ViewGroup.MarginLayoutParams) c3op).rightMargin + i3, ((ViewGroup.LayoutParams) c3op).width, A1X());
        int A0A2 = A0A(this.A00, this.A01, Bax() + Bat() + ((ViewGroup.MarginLayoutParams) c3op).topMargin + ((ViewGroup.MarginLayoutParams) c3op).bottomMargin + i4, ((ViewGroup.LayoutParams) c3op).height, A1Y());
        if (A18(view, c3op, A0A, A0A2)) {
            view.measure(A0A, A0A2);
        }
    }

    @Deprecated
    public void A11(RecyclerView recyclerView) {
    }

    @Deprecated
    public void A12(boolean z) {
        this.A0A = true;
    }

    public boolean A15() {
        return false;
    }

    public View A1E(View view, C70593Ew c70593Ew, C3F5 c3f5, int i) {
        return null;
    }

    public void A1I(RecyclerView recyclerView) {
    }

    public boolean A1J() {
        return false;
    }

    public int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        return 0;
    }

    public int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        return 0;
    }

    public Parcelable A1M() {
        return null;
    }

    public void A1P(Parcelable parcelable) {
    }

    public void A1Q(C2UU c2uu, C2UU c2uu2) {
    }

    public abstract void A1R(C70593Ew c70593Ew, C3F5 c3f5);

    public void A1S(C3F5 c3f5) {
    }

    public void A1U(RecyclerView recyclerView) {
    }

    public void A1V(RecyclerView recyclerView, int i, int i2) {
    }

    public void A1W(RecyclerView recyclerView, int i, int i2) {
    }

    public boolean A1X() {
        return false;
    }

    public abstract boolean A1Y();

    public boolean A1Z(C3OP c3op) {
        return c3op != null;
    }

    public final int A0T() {
        C3FI c3fi = this.A05;
        if (c3fi != null) {
            return c3fi.A03();
        }
        return 0;
    }

    public final int A0U() {
        C2UU c2uu;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && (c2uu = recyclerView.A0A) != null) {
            return c2uu.getItemCount();
        }
        return 0;
    }

    public final int A0X(C3F5 c3f5) {
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            if (linearLayoutManager instanceof StickyHeadersLinearLayoutManager) {
                StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
                C14360o3.A0B(c3f5, 0);
                StickyHeadersLinearLayoutManager.A0L(stickyHeadersLinearLayoutManager);
                int A00 = LinearLayoutManager.A00(stickyHeadersLinearLayoutManager, c3f5);
                StickyHeadersLinearLayoutManager.A0K(stickyHeadersLinearLayoutManager);
                return A00;
            }
            return LinearLayoutManager.A00(linearLayoutManager, c3f5);
        }
        if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A05(c3f5, (FlexboxLayoutManager) this);
        }
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0T() != 0) {
                AbstractC70763Fo abstractC70763Fo = staggeredGridLayoutManager.A07;
                boolean z = staggeredGridLayoutManager.A0F;
                boolean z2 = !z;
                return C4iv.A00(staggeredGridLayoutManager.A1f(z2), staggeredGridLayoutManager.A1e(z2), abstractC70763Fo, staggeredGridLayoutManager, c3f5, z);
            }
            return 0;
        }
        return 0;
    }

    public final int A0Y(C3F5 c3f5) {
        LinearLayoutManager linearLayoutManager;
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this;
            if (linearLayoutManager2 instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager2;
                boolean z = gridLayoutManager.A03;
                linearLayoutManager = gridLayoutManager;
                if (z) {
                    return GridLayoutManager.A04(gridLayoutManager, c3f5);
                }
            } else {
                boolean z2 = linearLayoutManager2 instanceof StickyHeadersLinearLayoutManager;
                linearLayoutManager = linearLayoutManager2;
                if (z2) {
                    StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager2;
                    C14360o3.A0B(c3f5, 0);
                    StickyHeadersLinearLayoutManager.A0L(stickyHeadersLinearLayoutManager);
                    int A01 = LinearLayoutManager.A01(stickyHeadersLinearLayoutManager, c3f5);
                    StickyHeadersLinearLayoutManager.A0K(stickyHeadersLinearLayoutManager);
                    return A01;
                }
            }
            return LinearLayoutManager.A01(linearLayoutManager, c3f5);
        }
        if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A06(c3f5, (FlexboxLayoutManager) this);
        }
        if (this instanceof StaggeredGridLayoutManager) {
            return StaggeredGridLayoutManager.A04(c3f5, (StaggeredGridLayoutManager) this);
        }
        return 0;
    }

    public final int A0Z(C3F5 c3f5) {
        LinearLayoutManager linearLayoutManager;
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this;
            if (linearLayoutManager2 instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager2;
                boolean z = gridLayoutManager.A03;
                linearLayoutManager = gridLayoutManager;
                if (z) {
                    return GridLayoutManager.A05(gridLayoutManager, c3f5);
                }
            } else {
                boolean z2 = linearLayoutManager2 instanceof StickyHeadersLinearLayoutManager;
                linearLayoutManager = linearLayoutManager2;
                if (z2) {
                    StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager2;
                    C14360o3.A0B(c3f5, 0);
                    StickyHeadersLinearLayoutManager.A0L(stickyHeadersLinearLayoutManager);
                    int A02 = LinearLayoutManager.A02(stickyHeadersLinearLayoutManager, c3f5);
                    StickyHeadersLinearLayoutManager.A0K(stickyHeadersLinearLayoutManager);
                    return A02;
                }
            }
            return LinearLayoutManager.A02(linearLayoutManager, c3f5);
        }
        if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A07(c3f5, (FlexboxLayoutManager) this);
        }
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0T() != 0) {
                AbstractC70763Fo abstractC70763Fo = staggeredGridLayoutManager.A07;
                boolean z3 = staggeredGridLayoutManager.A0F;
                boolean z4 = !z3;
                return C4iv.A01(staggeredGridLayoutManager.A1f(z4), staggeredGridLayoutManager.A1e(z4), abstractC70763Fo, staggeredGridLayoutManager, c3f5, z3);
            }
            return 0;
        }
        return 0;
    }

    public final int A0a(C3F5 c3f5) {
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            if (linearLayoutManager instanceof StickyHeadersLinearLayoutManager) {
                StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager;
                C14360o3.A0B(c3f5, 0);
                StickyHeadersLinearLayoutManager.A0L(stickyHeadersLinearLayoutManager);
                int A00 = LinearLayoutManager.A00(stickyHeadersLinearLayoutManager, c3f5);
                StickyHeadersLinearLayoutManager.A0K(stickyHeadersLinearLayoutManager);
                return A00;
            }
            return LinearLayoutManager.A00(linearLayoutManager, c3f5);
        }
        if (this instanceof FlowingGridLayoutManager) {
            if (c3f5.A00() != 0) {
                return this.A00;
            }
            return 0;
        }
        if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A05(c3f5, (FlexboxLayoutManager) this);
        }
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0T() != 0) {
                AbstractC70763Fo abstractC70763Fo = staggeredGridLayoutManager.A07;
                boolean z = staggeredGridLayoutManager.A0F;
                boolean z2 = !z;
                return C4iv.A00(staggeredGridLayoutManager.A1f(z2), staggeredGridLayoutManager.A1e(z2), abstractC70763Fo, staggeredGridLayoutManager, c3f5, z);
            }
            return 0;
        }
        return 0;
    }

    public final int A0b(C3F5 c3f5) {
        LinearLayoutManager linearLayoutManager;
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this;
            if (linearLayoutManager2 instanceof IgLiveCommentsLinearLayoutManager) {
                C14360o3.A0B(c3f5, 0);
                return Math.max(LinearLayoutManager.A01(linearLayoutManager2, c3f5), 0);
            }
            if (linearLayoutManager2 instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager2;
                boolean z = gridLayoutManager.A03;
                linearLayoutManager = gridLayoutManager;
                if (z) {
                    return GridLayoutManager.A04(gridLayoutManager, c3f5);
                }
            } else {
                boolean z2 = linearLayoutManager2 instanceof StickyHeadersLinearLayoutManager;
                linearLayoutManager = linearLayoutManager2;
                if (z2) {
                    StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager2;
                    C14360o3.A0B(c3f5, 0);
                    StickyHeadersLinearLayoutManager.A0L(stickyHeadersLinearLayoutManager);
                    int A01 = LinearLayoutManager.A01(stickyHeadersLinearLayoutManager, c3f5);
                    StickyHeadersLinearLayoutManager.A0K(stickyHeadersLinearLayoutManager);
                    return A01;
                }
            }
            return LinearLayoutManager.A01(linearLayoutManager, c3f5);
        }
        if (this instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) this;
            if (c3f5.A00() != 0) {
                return flowingGridLayoutManager.A04;
            }
            return 0;
        }
        if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A06(c3f5, (FlexboxLayoutManager) this);
        }
        if (this instanceof StaggeredGridLayoutManager) {
            return StaggeredGridLayoutManager.A04(c3f5, (StaggeredGridLayoutManager) this);
        }
        return 0;
    }

    public final int A0c(C3F5 c3f5) {
        Rect A00;
        LinearLayoutManager linearLayoutManager;
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) this;
            if (linearLayoutManager2 instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager2;
                boolean z = gridLayoutManager.A03;
                linearLayoutManager = gridLayoutManager;
                if (z) {
                    return GridLayoutManager.A05(gridLayoutManager, c3f5);
                }
            } else {
                boolean z2 = linearLayoutManager2 instanceof StickyHeadersLinearLayoutManager;
                linearLayoutManager = linearLayoutManager2;
                if (z2) {
                    StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) linearLayoutManager2;
                    C14360o3.A0B(c3f5, 0);
                    StickyHeadersLinearLayoutManager.A0L(stickyHeadersLinearLayoutManager);
                    int A02 = LinearLayoutManager.A02(stickyHeadersLinearLayoutManager, c3f5);
                    StickyHeadersLinearLayoutManager.A0K(stickyHeadersLinearLayoutManager);
                    return A02;
                }
            }
            return LinearLayoutManager.A02(linearLayoutManager, c3f5);
        }
        if (this instanceof FlowingGridLayoutManager) {
            FlowingGridLayoutManager flowingGridLayoutManager = (FlowingGridLayoutManager) this;
            if (c3f5.A00() == 0) {
                return 0;
            }
            C66120Tzy c66120Tzy = flowingGridLayoutManager.A06;
            int size = c66120Tzy.A07.size();
            int A002 = c3f5.A00();
            if (size < A002 || (A00 = c66120Tzy.A00(A002 - 1)) == null) {
                return 0;
            }
            return A00.top;
        }
        if (this instanceof FlexboxLayoutManager) {
            return FlexboxLayoutManager.A07(c3f5, (FlexboxLayoutManager) this);
        }
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0T() != 0) {
                AbstractC70763Fo abstractC70763Fo = staggeredGridLayoutManager.A07;
                boolean z3 = staggeredGridLayoutManager.A0F;
                boolean z4 = !z3;
                return C4iv.A01(staggeredGridLayoutManager.A1f(z4), staggeredGridLayoutManager.A1e(z4), abstractC70763Fo, staggeredGridLayoutManager, c3f5, z3);
            }
            return 0;
        }
        return 0;
    }

    public final View A0e(int i) {
        C3FI c3fi = this.A05;
        if (c3fi != null) {
            return c3fi.A06(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.3OP, com.google.android.flexbox.FlexboxLayoutManager$LayoutParams] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.3OP, X.6wz] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public C3OP A0g() {
        int i;
        ?? r2;
        if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            if (linearLayoutManager instanceof LinearLayoutManagerCompat) {
                return new C3OP(-1, -2);
            }
            if (linearLayoutManager instanceof GridLayoutManager) {
                if (linearLayoutManager.A01 == 0) {
                    i = -1;
                    r2 = new C3OP(-2, -1);
                } else {
                    i = -1;
                    r2 = new C3OP(-1, -2);
                }
                r2.A00 = i;
                r2.A01 = 0;
                return r2;
            }
        } else if (!(this instanceof FlowingGridLayoutManager)) {
            if (this instanceof FlexboxLayoutManager) {
                ?? c3op = new C3OP(-2, -2);
                c3op.A01 = 0.0f;
                c3op.A02 = 1.0f;
                c3op.A03 = -1;
                c3op.A00 = -1.0f;
                c3op.A05 = 16777215;
                c3op.A04 = 16777215;
                return c3op;
            }
            int i2 = -1;
            int i3 = -2;
            if (((StaggeredGridLayoutManager) this).A02 == 0) {
                i2 = -2;
                i3 = -1;
            }
            return new C3OP(i2, i3);
        }
        return new C3OP(-2, -2);
    }

    public final void A0i() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0j(int i) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (i == 0) {
                staggeredGridLayoutManager.A1i();
            }
        }
    }

    public final void A0n(View view) {
        C3FI c3fi = this.A05;
        int i = c3fi.A00;
        if (i != 1) {
            if (i != 2) {
                try {
                    c3fi.A00 = 1;
                    c3fi.A01 = view;
                    RecyclerView recyclerView = ((C3FG) c3fi.A03).A00;
                    int indexOfChild = recyclerView.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (c3fi.A02.A07(indexOfChild)) {
                            C3FI.A02(view, c3fi);
                        }
                        View childAt = recyclerView.getChildAt(indexOfChild);
                        if (childAt != null) {
                            recyclerView.A0x(childAt);
                            childAt.clearAnimation();
                        }
                        recyclerView.removeViewAt(indexOfChild);
                    }
                    return;
                } finally {
                    c3fi.A00 = 0;
                    c3fi.A01 = null;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void A0r(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0S(view));
        }
    }

    public void A0t(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C70593Ew c70593Ew, C3F5 c3f5) {
        AccessibilityNodeInfo.CollectionItemInfo obtain;
        if (this instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof C154496wz)) {
                gridLayoutManager.A0s(view, accessibilityNodeInfoCompat);
                return;
            }
            C154496wz c154496wz = (C154496wz) layoutParams;
            int A03 = GridLayoutManager.A03(gridLayoutManager, c70593Ew, c3f5, c154496wz.mViewHolder.getLayoutPosition());
            int i = ((LinearLayoutManager) gridLayoutManager).A01;
            int i2 = c154496wz.A00;
            int i3 = c154496wz.A01;
            if (i == 0) {
                obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, A03, 1, false, false);
            } else {
                obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(A03, 1, i2, i3, false, false);
            }
            accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(obtain);
        }
    }

    public final void A0w(C70593Ew c70593Ew) {
        ArrayList arrayList = c70593Ew.A05;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C3OO) arrayList.get(i)).itemView;
            C3OO A05 = RecyclerView.A05(view);
            if (!A05.shouldIgnore()) {
                A05.setIsRecyclable(false);
                if (A05.isTmpDetached()) {
                    this.A07.removeDetachedView(view, false);
                }
                C3F1 c3f1 = this.A07.A0C;
                if (c3f1 != null) {
                    c3f1.A0K(A05);
                }
                A05.setIsRecyclable(true);
                C3OO A052 = RecyclerView.A05(view);
                A052.mScrapContainer = null;
                A052.mInChangeScrap = false;
                A052.clearReturnedFromScrapFlag();
                c70593Ew.A0C(A052);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c70593Ew.A04;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0y(C70593Ew c70593Ew, C3F5 c3f5, int i, int i2) {
        this.A07.A0r(i, i2);
    }

    public void A0z(C70593Ew c70593Ew, RecyclerView recyclerView) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            staggeredGridLayoutManager.A11(recyclerView);
            Runnable runnable = staggeredGridLayoutManager.A0M;
            RecyclerView recyclerView2 = ((AbstractC70663Fe) staggeredGridLayoutManager).A07;
            if (recyclerView2 != null) {
                recyclerView2.removeCallbacks(runnable);
            }
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                staggeredGridLayoutManager.A0H[i].A09();
            }
            recyclerView.requestLayout();
            return;
        }
        A11(recyclerView);
    }

    public final void A10(AbstractC110824yu abstractC110824yu) {
        C69046Vgn c69046Vgn;
        AbstractC110824yu abstractC110824yu2 = this.A06;
        if (abstractC110824yu2 != null && abstractC110824yu != abstractC110824yu2 && abstractC110824yu2.A05) {
            abstractC110824yu2.A01();
        }
        this.A06 = abstractC110824yu;
        RecyclerView recyclerView = this.A07;
        C3F2 c3f2 = recyclerView.mViewFlinger;
        c3f2.A06.removeCallbacks(c3f2);
        c3f2.A01.abortAnimation();
        if (abstractC110824yu.A06) {
            String simpleName = abstractC110824yu.getClass().getSimpleName();
            android.util.Log.w("RecyclerView", AnonymousClass001.A11("An instance of ", simpleName, " was started more than once. Each instance of", simpleName, " is intended to only be used once. You should create a new instance for each use."));
        }
        abstractC110824yu.A03 = recyclerView;
        abstractC110824yu.A02 = this;
        int i = abstractC110824yu.A00;
        if (i != -1) {
            recyclerView.mState.A06 = i;
            abstractC110824yu.A05 = true;
            abstractC110824yu.A04 = true;
            abstractC110824yu.A01 = recyclerView.A0D.A0d(i);
            C110814yt c110814yt = (C110814yt) abstractC110824yu;
            if ((c110814yt instanceof C110844yw) && (c69046Vgn = ((C110844yw) c110814yt).A02) != null) {
                c69046Vgn.A01.A07(null);
            }
            abstractC110824yu.A03.mViewFlinger.A00();
            abstractC110824yu.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void A13(boolean z) {
        if (z != this.A0C) {
            this.A0C = z;
            this.A02 = 0;
            RecyclerView recyclerView = this.A07;
            if (recyclerView != null) {
                recyclerView.A0y.A08();
            }
        }
    }

    public boolean A14() {
        if (this instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) this).A01 == 0) {
                return false;
            }
            return true;
        }
        return this.A0A;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A17(android.os.Bundle r8, X.C70593Ew r9, X.C3F5 r10, int r11) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            r2 = 0
            if (r0 == 0) goto L5e
            int r4 = r7.A00
            int r3 = r7.A03
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            android.graphics.Matrix r0 = r0.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L2a
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            boolean r0 = r0.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L2a
            int r4 = r1.height()
            int r3 = r1.width()
        L2a:
            r0 = 4096(0x1000, float:5.74E-42)
            r6 = 1
            if (r11 == r0) goto L61
            r0 = 8192(0x2000, float:1.148E-41)
            if (r11 != r0) goto L5e
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 == 0) goto L5f
            int r0 = r7.Bax()
            int r4 = r4 - r0
            int r0 = r7.Bat()
            int r4 = r4 - r0
            int r4 = -r4
        L47:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            boolean r0 = r0.canScrollHorizontally(r1)
            if (r0 == 0) goto L88
            int r0 = r7.Bau()
            int r3 = r3 - r0
            int r0 = r7.Baw()
            int r3 = r3 - r0
            int r3 = -r3
        L5a:
            if (r4 != 0) goto L8a
            if (r3 != 0) goto L8a
        L5e:
            return r2
        L5f:
            r4 = 0
            goto L47
        L61:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            boolean r0 = r0.canScrollVertically(r6)
            if (r0 == 0) goto L86
            int r0 = r7.Bax()
            int r4 = r4 - r0
            int r0 = r7.Bat()
            int r4 = r4 - r0
        L73:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            boolean r0 = r0.canScrollHorizontally(r6)
            if (r0 == 0) goto L88
            int r0 = r7.Bau()
            int r3 = r3 - r0
            int r0 = r7.Baw()
            int r3 = r3 - r0
            goto L5a
        L86:
            r4 = 0
            goto L73
        L88:
            r3 = 0
            goto L5a
        L8a:
            androidx.recyclerview.widget.RecyclerView r1 = r7.A07
            r2 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.A0y(r2, r3, r4, r5, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70663Fe.A17(android.os.Bundle, X.3Ew, X.3F5, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2.A09.A01(r3) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(android.view.View r3, boolean r4) {
        /*
            r2 = this;
            X.3Fk r0 = r2.A08
            boolean r0 = r0.A01(r3)
            if (r0 == 0) goto L11
            X.3Fk r0 = r2.A09
            boolean r1 = r0.A01(r3)
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            if (r4 != 0) goto L16
            r0 = r0 ^ 1
        L16:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70663Fe.A19(android.view.View, boolean):boolean");
    }

    public void A1A(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A03 = recyclerView.A08.A03();
            for (int i2 = 0; i2 < A03; i2++) {
                recyclerView.A08.A06(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A1B(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A03 = recyclerView.A08.A03();
            for (int i2 = 0; i2 < A03; i2++) {
                recyclerView.A08.A06(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A1C(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            C2UU c2uu = this.A07.A0A;
            if (c2uu != null) {
                accessibilityEvent.setItemCount(c2uu.getItemCount());
            }
        }
    }

    public void A1D(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A16(str);
        }
    }

    public C3OP A1F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C3OP) {
            return new C3OP((C3OP) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C3OP((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C3OP(layoutParams);
    }

    public void A1H(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C70593Ew c70593Ew, C3F5 c3f5) {
        int i;
        int i2;
        if (this.A07.canScrollVertically(-1) || this.A07.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.addAction(8192);
            accessibilityNodeInfoCompat.mInfo.setScrollable(true);
        }
        if (this.A07.canScrollVertically(1) || this.A07.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.addAction(4096);
            accessibilityNodeInfoCompat.mInfo.setScrollable(true);
        }
        boolean z = this instanceof GridLayoutManager;
        if (z) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
            if (((LinearLayoutManager) gridLayoutManager).A01 == 0) {
                i = gridLayoutManager.A00;
            } else {
                int A00 = c3f5.A00();
                if (A00 < 1) {
                    i = 0;
                } else {
                    i = GridLayoutManager.A03(gridLayoutManager, c70593Ew, c3f5, A00 - 1) + 1;
                }
            }
        } else {
            i = -1;
        }
        if (z) {
            GridLayoutManager gridLayoutManager2 = (GridLayoutManager) this;
            if (((LinearLayoutManager) gridLayoutManager2).A01 == 1) {
                i2 = gridLayoutManager2.A00;
            } else {
                int A002 = c3f5.A00();
                if (A002 < 1) {
                    i2 = 0;
                } else {
                    i2 = GridLayoutManager.A03(gridLayoutManager2, c70593Ew, c3f5, A002 - 1) + 1;
                }
            }
        } else {
            i2 = -1;
        }
        accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0));
    }

    public C3OP A1N(Context context, AttributeSet attributeSet) {
        return new C3OP(context, attributeSet);
    }

    public void A1O(int i) {
        if (RecyclerView.A1D) {
            android.util.Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }

    public void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        android.util.Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final int Bat() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int Bau() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int Baw() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int Bax() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public AbstractC70663Fe() {
        InterfaceC70703Fi interfaceC70703Fi = new InterfaceC70703Fi() { // from class: X.3Fh
            @Override // X.InterfaceC70703Fi
            public final View AnU(int i) {
                return AbstractC70663Fe.this.A0e(i);
            }

            @Override // X.InterfaceC70703Fi
            public final int BbL() {
                AbstractC70663Fe abstractC70663Fe = AbstractC70663Fe.this;
                return abstractC70663Fe.A03 - abstractC70663Fe.Baw();
            }

            @Override // X.InterfaceC70703Fi
            public final int BbR() {
                return AbstractC70663Fe.this.Bau();
            }

            @Override // X.InterfaceC70703Fi
            public final int Ana(View view) {
                return view.getRight() + AbstractC70663Fe.A0D(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
            }

            @Override // X.InterfaceC70703Fi
            public final int Anc(View view) {
                return (view.getLeft() - AbstractC70663Fe.A0B(view)) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
            }
        };
        this.A0G = interfaceC70703Fi;
        InterfaceC70703Fi interfaceC70703Fi2 = new InterfaceC70703Fi() { // from class: X.3Fj
            @Override // X.InterfaceC70703Fi
            public final View AnU(int i) {
                return AbstractC70663Fe.this.A0e(i);
            }

            @Override // X.InterfaceC70703Fi
            public final int BbL() {
                AbstractC70663Fe abstractC70663Fe = AbstractC70663Fe.this;
                return abstractC70663Fe.A00 - abstractC70663Fe.Bat();
            }

            @Override // X.InterfaceC70703Fi
            public final int BbR() {
                return AbstractC70663Fe.this.Bax();
            }

            @Override // X.InterfaceC70703Fi
            public final int Ana(View view) {
                return AbstractC70663Fe.this.A0V(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
            }

            @Override // X.InterfaceC70703Fi
            public final int Anc(View view) {
                return AbstractC70663Fe.this.A0W(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
            }
        };
        this.A0H = interfaceC70703Fi2;
        this.A08 = new C70723Fk(interfaceC70703Fi);
        this.A09 = new C70723Fk(interfaceC70703Fi2);
        this.A0F = false;
        this.A0B = false;
        this.A0A = false;
        this.A0D = true;
        this.A0C = true;
    }

    public static int A09(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public static final int A0B(View view) {
        return ((C3OP) view.getLayoutParams()).A02.left;
    }

    public static final int A0C(View view) {
        return ((C3OP) view.getLayoutParams()).mViewHolder.getLayoutPosition();
    }

    public static final int A0D(View view) {
        return ((C3OP) view.getLayoutParams()).A02.right;
    }

    public static final void A0E(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((C3OP) view.getLayoutParams()).A02;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public static final void A0F(View view, int i, int i2, int i3, int i4) {
        C3OP c3op = (C3OP) view.getLayoutParams();
        Rect rect = c3op.A02;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c3op).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c3op).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c3op).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c3op).bottomMargin);
    }

    public static void A0G(View view, AbstractC70663Fe abstractC70663Fe, int i, boolean z) {
        C3OO A05 = RecyclerView.A05(view);
        if (!z && !A05.isRemoved()) {
            abstractC70663Fe.A07.A10.A03(A05);
        } else {
            abstractC70663Fe.A07.A10.A02(A05);
        }
        C3OP c3op = (C3OP) view.getLayoutParams();
        if (!A05.wasReturnedFromScrap() && A05.mScrapContainer == null) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = abstractC70663Fe.A07;
            C3FI c3fi = abstractC70663Fe.A05;
            if (parent == recyclerView) {
                int A052 = c3fi.A05(view);
                if (i == -1) {
                    i = abstractC70663Fe.A05.A03();
                }
                if (A052 != -1) {
                    if (A052 != i) {
                        AbstractC70663Fe abstractC70663Fe2 = abstractC70663Fe.A07.A0D;
                        View A0e = abstractC70663Fe2.A0e(A052);
                        if (A0e != null) {
                            abstractC70663Fe2.A0e(A052);
                            abstractC70663Fe2.A05.A08(A052);
                            abstractC70663Fe2.A0p(A0e, i);
                        } else {
                            throw new IllegalArgumentException(AnonymousClass001.A0c("Cannot move a child from non-existing index:", abstractC70663Fe2.A07.toString(), A052));
                        }
                    }
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0c("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:", abstractC70663Fe.A07.A0Z(), abstractC70663Fe.A07.indexOfChild(view)));
                }
            } else {
                c3fi.A0A(view, i, false);
                c3op.A00 = true;
                AbstractC110824yu abstractC110824yu = abstractC70663Fe.A06;
                if (abstractC110824yu != null && abstractC110824yu.A05 && RecyclerView.A03(view) == abstractC110824yu.A00) {
                    abstractC110824yu.A01 = view;
                }
            }
        } else {
            if (A05.mScrapContainer != null) {
                A05.unScrap();
            } else {
                A05.clearReturnedFromScrapFlag();
            }
            abstractC70663Fe.A05.A0B(view, view.getLayoutParams(), i, false);
        }
        if (c3op.A01) {
            A05.itemView.invalidate();
            c3op.A01 = false;
        }
    }

    public static boolean A0H(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
            } else if (size >= i) {
                return true;
            }
        }
        return false;
    }

    public final int A0V(View view) {
        return view.getBottom() + ((C3OP) view.getLayoutParams()).A02.bottom;
    }

    public final int A0W(View view) {
        return view.getTop() - ((C3OP) view.getLayoutParams()).A02.top;
    }

    public View A0d(int i) {
        int A0T = A0T();
        for (int i2 = 0; i2 < A0T; i2++) {
            View A0e = A0e(i2);
            C3OO A05 = RecyclerView.A05(A0e);
            if (A05 != null && A05.getLayoutPosition() == i && !A05.shouldIgnore() && (this.A07.mState.A08 || !A05.isRemoved())) {
                return A0e;
            }
        }
        return null;
    }

    public final void A0h() {
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T >= 0) {
                this.A05.A09(A0T);
            } else {
                return;
            }
        }
    }

    public final void A0k(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0) {
            float f = RecyclerView.A1E;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 == 0) {
            float f2 = RecyclerView.A1E;
        }
    }

    public final void A0l(int i, int i2) {
        int A0T = A0T();
        if (A0T == 0) {
            this.A07.A0r(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < A0T; i7++) {
            View A0e = A0e(i7);
            Rect rect = this.A07.A0u;
            RecyclerView.A0D(A0e, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0u.set(i5, i6, i3, i4);
        A1G(this.A07.A0u, i, i2);
    }

    public final void A0m(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C3OP) view.getLayoutParams()).A02;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.A07 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A07.A0w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A0p(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C3OO A05 = RecyclerView.A05(view);
        boolean isRemoved = A05.isRemoved();
        C70603Ex c70603Ex = this.A07.A10;
        if (isRemoved) {
            c70603Ex.A02(A05);
        } else {
            c70603Ex.A03(A05);
        }
        this.A05.A0B(view, layoutParams, i, A05.isRemoved());
    }

    public final void A0s(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C3OO A05 = RecyclerView.A05(view);
        if (A05 != null && !A05.isRemoved()) {
            C3FI c3fi = this.A05;
            if (!c3fi.A04.contains(A05.itemView)) {
                RecyclerView recyclerView = this.A07;
                A0t(view, accessibilityNodeInfoCompat, recyclerView.A0y, recyclerView.mState);
            }
        }
    }

    public final void A0u(C70593Ew c70593Ew) {
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T >= 0) {
                View A0e = A0e(A0T);
                C3OO A05 = RecyclerView.A05(A0e);
                if (!A05.shouldIgnore()) {
                    if (A05.isInvalid() && !A05.isRemoved() && !this.A07.A0A.hasStableIds()) {
                        if (A0e(A0T) != null) {
                            this.A05.A09(A0T);
                        }
                        c70593Ew.A0C(A05);
                    } else {
                        A0e(A0T);
                        this.A05.A08(A0T);
                        c70593Ew.A0B(A0e);
                        this.A07.A10.A03(A05);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void A0v(C70593Ew c70593Ew) {
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T >= 0) {
                if (!RecyclerView.A05(A0e(A0T)).shouldIgnore()) {
                    A0x(c70593Ew, A0T);
                }
            } else {
                return;
            }
        }
    }

    public final void A0x(C70593Ew c70593Ew, int i) {
        View A0e = A0e(i);
        if (A0e(i) != null) {
            this.A05.A09(i);
        }
        c70593Ew.A0A(A0e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if ((r1.bottom - r5) > r7) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A16(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            int r3 = r11.Bau()
            int r4 = r11.Bax()
            int r2 = r11.A03
            int r0 = r11.Baw()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.Bat()
            int r1 = r1 - r0
            int r9 = r13.getLeft()
            int r0 = r12.left
            int r9 = r9 + r0
            int r0 = r13.getScrollX()
            int r9 = r9 - r0
            int r8 = r13.getTop()
            int r0 = r12.top
            int r8 = r8 + r0
            int r0 = r13.getScrollY()
            int r8 = r8 - r0
            int r7 = r12.width()
            int r7 = r7 + r9
            int r0 = r12.height()
            int r0 = r0 + r8
            int r9 = r9 - r3
            r6 = 0
            int r3 = java.lang.Math.min(r6, r9)
            int r8 = r8 - r4
            int r5 = java.lang.Math.min(r6, r8)
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r6, r7)
            int r0 = r0 - r1
            int r1 = java.lang.Math.max(r6, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = r0.getLayoutDirection()
            r4 = 1
            if (r0 != r4) goto Lac
            if (r2 != 0) goto L5c
            int r2 = java.lang.Math.max(r3, r7)
        L5c:
            if (r5 != 0) goto L62
            int r5 = java.lang.Math.min(r8, r1)
        L62:
            int[] r0 = new int[]{r2, r5}
            r3 = r0[r6]
            if (r16 == 0) goto La2
            android.view.View r10 = r14.getFocusedChild()
            if (r10 == 0) goto La1
            int r8 = r11.Bau()
            int r7 = r11.Bax()
            int r9 = r11.A03
            int r0 = r11.Baw()
            int r9 = r9 - r0
            int r2 = r11.A00
            int r0 = r11.Bat()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0u
            androidx.recyclerview.widget.RecyclerView.A0D(r10, r1)
            int r0 = r1.left
            int r0 = r0 - r3
            if (r0 >= r9) goto La1
            int r0 = r1.right
            int r0 = r0 - r3
            if (r0 <= r8) goto La1
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto La1
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r7) goto La2
        La1:
            return r6
        La2:
            if (r3 != 0) goto La6
            if (r5 == 0) goto La1
        La6:
            if (r15 == 0) goto Lb4
            r14.scrollBy(r3, r5)
            return r4
        Lac:
            if (r3 != 0) goto Lb2
            int r3 = java.lang.Math.min(r9, r2)
        Lb2:
            r2 = r3
            goto L5c
        Lb4:
            r14.A0t(r3, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70663Fe.A16(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, boolean, boolean):boolean");
    }

    public final boolean A18(View view, C3OP c3op, int i, int i2) {
        if (!view.isLayoutRequested() && this.A0D && A0H(view.getWidth(), i, ((ViewGroup.LayoutParams) c3op).width) && A0H(view.getHeight(), i2, ((ViewGroup.LayoutParams) c3op).height)) {
            return false;
        }
        return true;
    }

    public void A1G(Rect rect, int i, int i2) {
        int width = rect.width() + Bau() + Baw();
        int height = rect.height() + Bax() + Bat();
        RecyclerView.A0L(this.A07, A09(i, width, this.A07.getMinimumWidth()), A09(i2, height, this.A07.getMinimumHeight()));
    }
}
