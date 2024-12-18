package X;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.U5m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66242U5m extends ViewGroup {
    public int A00;
    public View A01;
    public C70004VzO A02;
    public VZs A03;
    public InterfaceC51602Yi A04;
    public C66271U6q A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public InterfaceC51602Yi[] A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final List A0H;
    public final C03K A0I;
    public final boolean A0J;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.03K] */
    public C66242U5m(Context context) {
        super(context);
        this.A0I = new Object();
        this.A0A = true;
        this.A0G = true;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.A0H = copyOnWriteArrayList;
        this.A07 = true;
        this.A08 = true;
        this.A00 = -1;
        this.A0B = false;
        this.A0J = true;
        UKP ukp = new UKP(this);
        if (this.A05 == null) {
            this.A05 = new C66271U6q(getContext(), this, ukp);
        }
        copyOnWriteArrayList.add(new C66243U5n(this));
    }

    public final void A03(InterfaceC51602Yi[] interfaceC51602YiArr, boolean z) {
        InterfaceC51602Yi interfaceC51602Yi = null;
        this.A0C = (InterfaceC51602Yi[]) Arrays.copyOf(interfaceC51602YiArr, interfaceC51602YiArr.length);
        InterfaceC51602Yi interfaceC51602Yi2 = this.A04;
        if (interfaceC51602Yi2 != null) {
            if (this.A01 != null) {
                int height = getHeight();
                List emptyList = Collections.emptyList();
                View view = this.A01;
                interfaceC51602Yi = A00(view, this, emptyList, this.A04.BeY(view, height), height);
            }
            this.A04 = interfaceC51602Yi;
            interfaceC51602Yi2 = interfaceC51602Yi;
        }
        if (z) {
            if (interfaceC51602Yi2 == null) {
                List emptyList2 = Collections.emptyList();
                View view2 = this.A01;
                if (view2 != null && view2.isLaidOut()) {
                    int height2 = getHeight();
                    interfaceC51602Yi2 = A00(view2, this, emptyList2, height2 - view2.getTop(), height2);
                    if (interfaceC51602Yi2 == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            A02(interfaceC51602Yi2, this.A00, false);
        }
    }

    public static InterfaceC51602Yi A00(View view, C66242U5m c66242U5m, List list, int i, int i2) {
        int abs;
        InterfaceC51602Yi interfaceC51602Yi = null;
        if (c66242U5m.A0C != null && view != null && view.isLaidOut()) {
            int i3 = Integer.MAX_VALUE;
            for (InterfaceC51602Yi interfaceC51602Yi2 : c66242U5m.A0C) {
                if (!list.contains(interfaceC51602Yi2) && (abs = Math.abs(interfaceC51602Yi2.BeY(view, i2) - i)) < i3) {
                    interfaceC51602Yi = interfaceC51602Yi2;
                    i3 = abs;
                }
            }
        }
        return interfaceC51602Yi;
    }

    private boolean A01(int i, int i2) {
        int i3;
        View view = this.A01;
        if (getNestedScrollAxes() == 1) {
            if (i2 == 0 || Math.abs(i) / Math.abs(i2) > 0.7f) {
                return false;
            }
        } else {
            if (view == null) {
                return false;
            }
            int height = getHeight();
            InterfaceC51602Yi[] interfaceC51602YiArr = this.A0C;
            if (interfaceC51602YiArr != null && interfaceC51602YiArr.length > 0) {
                i3 = height - interfaceC51602YiArr[0].BeY(view, height);
                int length = this.A0C.length;
                for (int i4 = 1; i4 < length; i4++) {
                    i3 = Math.min(i3, height - this.A0C[i4].BeY(view, height));
                }
            } else {
                i3 = 0;
            }
            if (view.getBottom() <= height || view.getTop() <= i3) {
                return false;
            }
        }
        return true;
    }

    public final void A02(InterfaceC51602Yi interfaceC51602Yi, final int i, final boolean z) {
        final View view = this.A01;
        if (view != null) {
            this.A04 = interfaceC51602Yi;
            Runnable runnable = new Runnable() { // from class: X.U74
                @Override // java.lang.Runnable
                public final void run() {
                    C66242U5m c66242U5m = this;
                    View view2 = view;
                    boolean z2 = z;
                    int i2 = i;
                    if (c66242U5m.A04 != null) {
                        int height = c66242U5m.getHeight();
                        int BeY = height - c66242U5m.A04.BeY(view2, height);
                        C66271U6q c66271U6q = c66242U5m.A05;
                        int i3 = c66271U6q.A03;
                        if (z2) {
                            view2.offsetTopAndBottom(BeY - view2.getTop());
                            return;
                        }
                        c66271U6q.A08 = view2;
                        c66271U6q.A02 = -1;
                        if (C66271U6q.A06(c66271U6q, BeY, 0, i2)) {
                            c66242U5m.postInvalidateOnAnimation();
                            return;
                        }
                        List list = c66242U5m.A0H;
                        if (list.isEmpty() || i3 != 0) {
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC71941XBq) it.next()).DZo(view2, c66242U5m.A04);
                        }
                    }
                }
            };
            if (isLaidOut()) {
                runnable.run();
            } else {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC66229U4z(0, this, viewTreeObserver, runnable));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r3.A09.isFinished() == false) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            r6 = this;
            X.U6q r3 = r6.A05
            int r0 = r3.A03
            r2 = 2
            if (r0 != r2) goto L57
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L5e
            android.widget.Scroller r0 = r3.A09
            boolean r5 = r0.computeScrollOffset()
            android.widget.Scroller r0 = r3.A09
            int r4 = r0.getCurrY()
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r0 = r4 - r0
            if (r0 <= 0) goto L5f
            int r0 = r3.A04
            int r4 = java.lang.Math.min(r4, r0)
        L27:
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r1 = r4 - r0
            if (r1 == 0) goto L3d
            android.view.View r0 = r3.A08
            r0.offsetTopAndBottom(r1)
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r1 = r3.A0H
            android.view.View r0 = r3.A08
            r1.A00(r0)
        L3d:
            if (r5 == 0) goto L50
            int r0 = r3.A04
            if (r4 != r0) goto L57
            android.widget.Scroller r0 = r3.A09
            r0.abortAnimation()
            android.widget.Scroller r0 = r3.A09
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L57
        L50:
            android.view.ViewGroup r1 = r3.A0G
            java.lang.Runnable r0 = r3.A0I
            r1.post(r0)
        L57:
            int r0 = r3.A03
            if (r0 != r2) goto L5e
            r6.postInvalidateOnAnimation()
        L5e:
            return
        L5f:
            if (r0 >= 0) goto L27
            int r0 = r3.A04
            int r4 = java.lang.Math.max(r4, r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66242U5m.computeScroll():void");
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0I;
        return c03k.A01 | c03k.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r1 == r2.A08) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        r2.A0B(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ee, code lost:
    
        if (r2.A03 == 2) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66242U5m.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        InterfaceC51602Yi interfaceC51602Yi;
        View view = this.A01;
        if (view != null) {
            if (!this.A0G) {
                height = view.getTop();
            } else {
                height = getHeight();
            }
            int measuredHeight = view.getMeasuredHeight() + height;
            if (this.A0J) {
                measuredHeight = Math.max(getHeight(), measuredHeight);
            }
            view.layout(0, height, getWidth(), measuredHeight);
            boolean A1S = MSY.A1S(view.getMeasuredHeight(), this.A0D);
            this.A0D = view.getMeasuredHeight();
            if ((z || A1S) && (interfaceC51602Yi = this.A04) != null) {
                A02(interfaceC51602Yi, this.A00, this.A0B);
            }
            List list = this.A0H;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC71941XBq) it.next()).DZj(view, getHeight());
                }
            }
            this.A0G = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.A07 && !z) {
            C66271U6q c66271U6q = this.A05;
            View view2 = this.A01;
            c66271U6q.A08 = view2;
            c66271U6q.A0A = true;
            c66271U6q.A0H.A01(view2, -f2);
            c66271U6q.A0A = false;
            if (c66271U6q.A03 == 1) {
                c66271U6q.A0A(0);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (this.A07 && A01((int) f, (int) f2)) {
            C66271U6q c66271U6q = this.A05;
            View view2 = this.A01;
            c66271U6q.A08 = view2;
            c66271U6q.A0A = true;
            c66271U6q.A0H.A01(view2, -f2);
            c66271U6q.A0A = false;
            if (c66271U6q.A03 == 1) {
                c66271U6q.A0A(0);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A07 && A01(i, i2)) {
            C66271U6q c66271U6q = this.A05;
            int i3 = -i;
            int i4 = -i2;
            View view2 = c66271U6q.A08;
            if (view2 != null) {
                int left = view2.getLeft() + i3;
                int top = c66271U6q.A08.getTop() + i4;
                C66271U6q.A05(c66271U6q, i3, i4);
                View view3 = c66271U6q.A08;
                if (view3 != null && iArr != null) {
                    int left2 = left - view3.getLeft();
                    int top2 = top - c66271U6q.A08.getTop();
                    iArr[0] = left2 - i3;
                    iArr[1] = top2 - i4;
                }
            }
            if (getNestedScrollAxes() == 1 && iArr[1] != 0) {
                iArr[0] = i;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A07) {
            C66271U6q c66271U6q = this.A05;
            int i5 = -i3;
            int i6 = -i4;
            View view2 = c66271U6q.A08;
            if (view2 != null) {
                view2.getLeft();
                c66271U6q.A08.getTop();
                C66271U6q.A05(c66271U6q, i5, i6);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0I.A01 = i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z = false;
        if (!this.A0F) {
            z = true;
            this.A0F = true;
            C66271U6q c66271U6q = this.A05;
            View view3 = this.A01;
            if (c66271U6q.A07 == null) {
                c66271U6q.A07 = VelocityTracker.obtain();
            }
            c66271U6q.A0A(1);
            c66271U6q.A08 = view3;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.A0I.A01 = 0;
        this.A0F = false;
        C66271U6q c66271U6q = this.A05;
        c66271U6q.A08 = this.A01;
        if (c66271U6q.A03 != 2) {
            C66271U6q.A02(c66271U6q, 0.0f);
        }
    }

    public void setInteractable(boolean z) {
        this.A0A = z;
        if (!z) {
            this.A05.A08();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            if (this.A0D > 0) {
                view.setTop(getHeight() - this.A0D);
            }
            this.A0D = 0;
            super.addView(view, i, layoutParams);
            this.A01 = view;
            return;
        }
        throw new IllegalStateException("BloksSlidingViewGroup only supports a single child");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        if (this.A09) {
            View view = this.A01;
            if (this.A0C != null && view != null) {
                int measuredHeight = getMeasuredHeight();
                i3 = 0;
                for (InterfaceC51602Yi interfaceC51602Yi : this.A0C) {
                    i3 = Math.max(i3, interfaceC51602Yi.BeY(view, measuredHeight));
                }
            } else {
                i3 = 0;
            }
            measureChildren(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00e2, code lost:
    
        if (r2 > r5.getBottom()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00eb, code lost:
    
        if (r1 != 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if (r4.A02 == (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        r0 = r4.A07;
        r3 = r4.A00;
        r0.computeCurrentVelocity(1000, r3);
        r4.A07.getXVelocity(r4.A02);
        X.C66271U6q.A02(r4, X.C66271U6q.A00(r4.A07.getYVelocity(r4.A02), r4.A01, r3));
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66242U5m.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setSlideToAnchorImmediately(boolean z) {
        this.A0B = z;
    }
}
