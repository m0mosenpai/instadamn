package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5xE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131785xE extends RecyclerView implements InterfaceC12520kw {
    public static final int[] A07 = {0, 0};
    public C02V A00;
    public C131855xL A01;
    public ArrayList A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C03K A06;

    private void A01(int[] iArr, int i, int i2, int i3) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        RecyclerView.A0C(null, this, i, i2);
        this.A05 = true;
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1I4) it.next()).onScrollStateChanged(this, 1);
            }
        }
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
            iArr[1] = iArr[1] + scrollY2;
        }
        A1A(A07, iArr, 0, scrollX2, 0, scrollY2, i3);
    }

    @Override // X.InterfaceC17990uc
    public final void DVF(View view, int i, int i2, int i3, int i4, int i5) {
        A01(null, i3, i4, i5);
    }

    @Override // X.InterfaceC17990uc
    public final void Dow(View view, int i) {
        setIsScrollEnabled(true);
        C03K c03k = this.A06;
        if (i == 1) {
            c03k.A00 = 0;
        } else {
            c03k.A01 = 0;
        }
        if (getScrollState() == 1) {
            this.A05 = false;
            ArrayList arrayList = this.A02;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1I4) it.next()).onScrollStateChanged(this, 0);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C131855xL A00(ViewParent viewParent) {
        if (viewParent instanceof View) {
            Object tag = ((View) viewParent).getTag();
            if (tag instanceof C131855xL) {
                return (C131855xL) tag;
            }
        }
        if (viewParent != 0) {
            return A00(viewParent.getParent());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void A14(C1I4 c1i4) {
        ArrayList arrayList = this.A02;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A02 = arrayList;
        }
        arrayList.add(c1i4);
        super.A14(c1i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void A15(C1I4 c1i4) {
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            arrayList.remove(c1i4);
        }
        super.A15(c1i4);
    }

    @Override // X.InterfaceC17990uc
    public final void DVE(View view, int[] iArr, int i, int i2, int i3) {
        A1G(iArr, A07, i, i2, i3);
    }

    @Override // X.InterfaceC17990uc
    public final void DVH(View view, View view2, int i, int i2) {
        C03K c03k = this.A06;
        if (i2 == 1) {
            c03k.A00 = i;
        } else {
            c03k.A01 = i;
        }
    }

    @Override // X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        if (!(view2 instanceof InterfaceC71846X7e)) {
            return false;
        }
        setIsScrollEnabled(false);
        return true;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A06;
        return c03k.A01 | c03k.A00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getScrollState() {
        if (this.A05) {
            return 1;
        }
        return super.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001b, code lost:
    
        if (r1 != null) goto L14;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isNestedScrollingEnabled() {
        /*
            r4 = this;
            X.5xL r1 = r4.A01
            r3 = 0
            if (r1 == 0) goto L1b
            X.3Fe r2 = r4.A0D
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L1b
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            r1 = 1
            int r0 = r2.A01
            if (r1 != r0) goto L1a
            boolean r0 = r4.A03
            if (r0 == 0) goto L1a
            boolean r0 = r4.A04
            if (r0 != 0) goto L1d
        L1a:
            return r3
        L1b:
            if (r1 == 0) goto L2b
        L1d:
            X.3Fe r2 = r4.A0D
            boolean r0 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L2b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            r1 = 1
            int r0 = r2.A02
            if (r1 == r0) goto L2b
            return r3
        L2b:
            boolean r3 = super.isNestedScrollingEnabled()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131785xE.isNestedScrollingEnabled():boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A04 && this.A03 && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setIsScrollEnabled(boolean z) {
        boolean z2 = this.A03;
        if (z2 != z) {
            this.A03 = z;
            if (z2) {
                this.A00 = AbstractC010103p.A01(this);
            }
            if (this.A03) {
                AbstractC010103p.A0B(this, this.A00);
                this.A00 = null;
            } else {
                AbstractC010103p.A0B(this, new C66491UJv(this, this));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.03K] */
    public C131785xE(Context context) {
        super(context);
        this.A01 = null;
        this.A04 = true;
        this.A03 = true;
        this.A06 = new Object();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A01 = A00(getParent());
        boolean z2 = true;
        if (!canScrollVertically(1) && !canScrollVertically(-1) && !canScrollHorizontally(1) && !canScrollHorizontally(-1)) {
            z2 = false;
        }
        this.A04 = z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        dispatchNestedFling(f, f2, z);
        if (!A1E((int) (-f), (int) (-f2))) {
            return false;
        }
        this.A05 = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (super.onTouchEvent(r4) == false) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 2042593405(0x79bf807d, float:1.2429184E35)
            int r2 = X.C0f9.A05(r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L16
            boolean r0 = r3.A03
            if (r0 == 0) goto L16
            boolean r0 = super.onTouchEvent(r4)
            r1 = 1
            if (r0 != 0) goto L17
        L16:
            r1 = 0
        L17:
            r0 = 235934794(0xe10144a, float:1.775914E-30)
            X.C0f9.A0C(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131785xE.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC12520kw
    public final void DVG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A01(iArr, i3, i4, i5);
    }
}
