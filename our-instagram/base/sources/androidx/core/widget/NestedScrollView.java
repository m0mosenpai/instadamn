package androidx.core.widget;

import X.AbstractC010103p;
import X.AbstractC167007dF;
import X.AbstractC58322PtE;
import X.AbstractC63123SdR;
import X.AbstractC65702TsY;
import X.AbstractC65767Tti;
import X.AnonymousClass001;
import X.C006602g;
import X.C02V;
import X.C03H;
import X.C03I;
import X.C03K;
import X.C0f9;
import X.C65807TuQ;
import X.C8S8;
import X.InterfaceC12520kw;
import X.InterfaceC71872X8f;
import X.Py5;
import X.UEO;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes11.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC12520kw, C03H {
    public static final float A0T = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final UEO A0U = new C02V();
    public static final int[] A0V = {R.attr.fillViewport};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public OverScroller A09;
    public C006602g A0A;
    public InterfaceC71872X8f A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E;
    public int A0F;
    public long A0G;
    public View A0H;
    public SavedState A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final float A0M;
    public final Rect A0N;
    public final C03I A0O;
    public final C65807TuQ A0P;
    public final C03K A0Q;
    public final int[] A0R;
    public final int[] A0S;

    /* loaded from: classes10.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(15);
        public int A00;

        public final String toString() {
            return AnonymousClass001.A09(this.A00, "HorizontalScrollView.SavedState{", AbstractC58322PtE.A0q(this), " scrollPosition=", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public static boolean A08(View view, View view2) {
        if (view != view2) {
            Object parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A08((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    private boolean A09(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float A00 = AbstractC65767Tti.A00(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.A0M * 0.015f;
        double log = Math.log(abs / f);
        double d = A0T;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * log))) < A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r0 < 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(int r6) {
        /*
            r5 = this;
            r4 = 1
            r1 = 0
            r0 = 130(0x82, float:1.82E-43)
            boolean r0 = X.AbstractC167007dF.A1P(r6, r0)
            int r3 = r5.getHeight()
            if (r0 == 0) goto L46
            android.graphics.Rect r2 = r5.A0N
            int r0 = r5.getScrollY()
            int r0 = r0 + r3
            r2.top = r0
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L3c
            int r0 = r0 - r4
            android.view.View r1 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r1.getBottom()
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r0 = r5.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r2.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L3c
            int r1 = r1 - r3
        L3a:
            r2.top = r1
        L3c:
            int r1 = r2.top
            int r0 = r1 + r3
            r2.bottom = r0
            r5.A05(r6, r1, r0)
            return
        L46:
            android.graphics.Rect r2 = r5.A0N
            int r0 = r5.getScrollY()
            int r0 = r0 - r3
            r2.top = r0
            if (r0 >= 0) goto L3c
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0C(int):void");
    }

    public final void A0D(int i) {
        A04(this, 0, i, false);
    }

    public final boolean A0F(int i) {
        int childCount;
        boolean A1P = AbstractC167007dF.A1P(i, 130);
        int height = getHeight();
        Rect rect = this.A0N;
        rect.top = 0;
        rect.bottom = height;
        if (A1P && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            rect.bottom = bottom;
            rect.top = bottom - height;
        }
        return A05(i, rect.top, rect.bottom);
    }

    public final boolean A0G(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        int i5 = i2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i6 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i6 > i4) {
            i6 = i4;
        } else if (i6 < 0) {
            i6 = 0;
        } else {
            z2 = false;
            onOverScrolled(i5, i6, z, z2);
            if (z && !z2) {
                return false;
            }
            return true;
        }
        z2 = true;
        if (this.A0O.A00 == null) {
            this.A09.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i6, z, z2);
        if (z) {
        }
        return true;
    }

    @Override // X.InterfaceC17990uc
    public final void DVE(View view, int[] iArr, int i, int i2, int i3) {
        this.A0O.A07(iArr, null, i, i2, i3);
    }

    @Override // X.InterfaceC17990uc
    public final void DVF(View view, int i, int i2, int i3, int i4, int i5) {
        A02(i4, null, i5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0O.A07(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A0B((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        DVE(view, iArr, i, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A02(i4, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        DVH(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (!A07(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        Dow(view, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.A0L = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.A0O.A05(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.A0O.A01(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0044, code lost:
    
        if (r25 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(int r22, int r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A01(int, int, int, boolean):int");
    }

    public static void A04(NestedScrollView nestedScrollView, int i, int i2, boolean z) {
        if (nestedScrollView.getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - nestedScrollView.A0G > 250) {
                View childAt = nestedScrollView.getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int A0A = AbstractC65702TsY.A0A(nestedScrollView, nestedScrollView.getHeight());
                int scrollY = nestedScrollView.getScrollY();
                nestedScrollView.A09.startScroll(nestedScrollView.getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - A0A))) - scrollY, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                if (z) {
                    nestedScrollView.A0O.A05(2, 1);
                } else {
                    nestedScrollView.A0O.A01(1);
                }
                nestedScrollView.A02 = nestedScrollView.getScrollY();
                nestedScrollView.postInvalidateOnAnimation();
            } else {
                OverScroller overScroller = nestedScrollView.A09;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                    nestedScrollView.A0O.A01(1);
                }
                nestedScrollView.scrollBy(i, i2);
            }
            nestedScrollView.A0G = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r14 >= r21) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A05(int r19, int r20, int r21) {
        /*
            r18 = this;
            r11 = r21
            r13 = r18
            int r10 = r13.getHeight()
            int r9 = r13.getScrollY()
            int r10 = r10 + r9
            r8 = 0
            r7 = 1
            r0 = 33
            r12 = r19
            boolean r17 = X.AbstractC167007dF.A1P(r12, r0)
            r0 = 2
            java.util.ArrayList r6 = r13.getFocusables(r0)
            int r5 = r6.size()
            r4 = 0
            r3 = 0
            r16 = 0
        L24:
            r0 = r20
            if (r3 >= r5) goto L67
            java.lang.Object r2 = r6.get(r3)
            android.view.View r2 = (android.view.View) r2
            int r15 = r2.getTop()
            int r14 = r2.getBottom()
            if (r0 >= r14) goto L45
            if (r15 >= r11) goto L45
            if (r0 >= r15) goto L3f
            r1 = 1
            if (r14 < r11) goto L40
        L3f:
            r1 = 0
        L40:
            if (r4 != 0) goto L48
            r4 = r2
            r16 = r1
        L45:
            int r3 = r3 + 1
            goto L24
        L48:
            if (r17 == 0) goto L5f
            int r0 = r4.getTop()
            if (r15 < r0) goto L65
        L50:
            r0 = 0
        L51:
            if (r16 == 0) goto L59
            if (r1 == 0) goto L45
        L55:
            if (r0 == 0) goto L45
            r4 = r2
            goto L45
        L59:
            if (r1 == 0) goto L55
            r4 = r2
            r16 = 1
            goto L45
        L5f:
            int r0 = r4.getBottom()
            if (r14 <= r0) goto L50
        L65:
            r0 = 1
            goto L51
        L67:
            if (r4 != 0) goto L6a
            r4 = r13
        L6a:
            if (r0 < r9) goto L78
            if (r11 > r10) goto L78
        L6e:
            android.view.View r0 = r13.findFocus()
            if (r4 == r0) goto L77
            r4.requestFocus(r12)
        L77:
            return r8
        L78:
            int r11 = r21 - r10
            if (r17 == 0) goto L7e
            int r11 = r20 - r9
        L7e:
            r13.A01(r11, r8, r7, r7)
            r8 = 1
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A05(int, int, int):boolean");
    }

    private boolean A06(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A08;
        if (AbstractC65767Tti.A00(edgeEffect) != 0.0f) {
            AbstractC65767Tti.A01(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (AbstractC65767Tti.A00(edgeEffect2) != 0.0f) {
            AbstractC65767Tti.A01(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    private boolean A07(View view, int i, int i2) {
        Rect rect = this.A0N;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    public final boolean A0H(KeyEvent keyEvent) {
        this.A0N.setEmpty();
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin > AbstractC65702TsY.A0A(this, getHeight())) {
                z = true;
            }
        }
        int i = 130;
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    if (keyCode != 92) {
                        if (keyCode != 93) {
                            if (keyCode != 122) {
                                if (keyCode != 123) {
                                    return false;
                                }
                            } else {
                                A0C(33);
                                return false;
                            }
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                A0C(i);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return A0E(130);
            }
            return A0F(130);
        }
        if (!keyEvent.isAltPressed()) {
            return A0E(33);
        }
        return A0F(33);
    }

    @Override // X.InterfaceC17990uc
    public final void DVH(View view, View view2, int i, int i2) {
        C03K c03k = this.A0Q;
        if (i2 == 1) {
            c03k.A00 = i;
        } else {
            c03k.A01 = i;
        }
        this.A0O.A05(2, i2);
    }

    @Override // X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        return AbstractC167007dF.A1M(i & 2);
    }

    @Override // X.InterfaceC17990uc
    public final void Dow(View view, int i) {
        C03K c03k = this.A0Q;
        if (i == 1) {
            c03k.A00 = 0;
        } else {
            c03k.A01 = 0;
        }
        this.A0O.A01(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            r19 = this;
            r1 = r19
            android.widget.OverScroller r2 = r1.A09
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto La9
            r2.computeScrollOffset()
            int r5 = r2.getCurrY()
            int r0 = r1.A02
            int r11 = r5 - r0
            int r8 = r1.getHeight()
            r7 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r6 = 1082130432(0x40800000, float:4.0)
            if (r11 <= 0) goto Lad
            android.widget.EdgeEffect r4 = r1.A08
            float r0 = X.AbstractC65767Tti.A00(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L41
            int r0 = -r11
            float r0 = (float) r0
            float r0 = r0 * r6
            float r3 = (float) r8
            float r0 = r0 / r3
            int r3 = -r8
            float r3 = (float) r3
        L31:
            float r3 = r3 / r6
            float r0 = X.AbstractC65767Tti.A01(r4, r0, r7)
            float r3 = r3 * r0
            int r0 = java.lang.Math.round(r3)
            if (r0 == r11) goto L40
            r4.finish()
        L40:
            int r11 = r11 - r0
        L41:
            r1.A02 = r5
            int[] r7 = r1.A0R
            r12 = 1
            r8 = 0
            r7[r12] = r8
            r15 = 0
            X.03I r5 = r1.A0O
            r13 = r5
            r14 = r7
            r16 = r8
            r17 = r11
            r18 = r12
            r13.A07(r14, r15, r16, r17, r18)
            r0 = r7[r12]
            int r11 = r11 - r0
            int r4 = r1.getScrollRange()
            if (r11 == 0) goto La0
            int r3 = r1.getScrollY()
            int r0 = r1.getScrollX()
            r1.A0G(r11, r0, r3, r4)
            int r9 = r1.getScrollY()
            int r9 = r9 - r3
            int r11 = r11 - r9
            r7[r12] = r8
            int[] r6 = r1.A0S
            r10 = r8
            X.C03I.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r7[r12]
            int r11 = r11 - r0
            if (r11 == 0) goto La0
            int r0 = r1.getOverScrollMode()
            if (r0 == 0) goto L88
            if (r0 != r12) goto L9a
            if (r4 <= 0) goto L9a
        L88:
            if (r11 >= 0) goto Laa
            android.widget.EdgeEffect r3 = r1.A08
        L8c:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L9a
            float r0 = r2.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L9a:
            r2.abortAnimation()
            r5.A01(r12)
        La0:
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto Lbf
            r1.postInvalidateOnAnimation()
        La9:
            return
        Laa:
            android.widget.EdgeEffect r3 = r1.A07
            goto L8c
        Lad:
            if (r11 >= 0) goto L41
            android.widget.EdgeEffect r4 = r1.A07
            float r0 = X.AbstractC65767Tti.A00(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L41
            float r0 = (float) r11
            float r0 = r0 * r6
            float r3 = (float) r8
            float r0 = r0 / r3
            goto L31
        Lbf:
            r5.A01(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0O.A04(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0O.A03(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0O.A06(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0Q;
        return c03k.A01 | c03k.A00;
    }

    public float getVerticalScrollFactorCompat() {
        float f = this.A0E;
        if (f == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                float dimension = typedValue.getDimension(AbstractC167007dF.A0K(context));
                this.A0E = dimension;
                return dimension;
            }
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        return f;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return AbstractC167007dF.A1W(this.A0O.A01);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A0O.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0130  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0O.A03(f, f2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0I = savedState;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return AbstractC167007dF.A1M(i & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A0L) {
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0A = A0A(rect);
            if (A0A != 0) {
                scrollBy(0, A0A);
            }
        } else {
            this.A0H = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A06) != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0J) {
            this.A0J = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A0O.A02(z);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.03K] */
    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0N = new Rect();
        this.A0L = true;
        this.A0K = false;
        this.A0H = null;
        this.A0C = false;
        this.A0D = true;
        this.A00 = -1;
        this.A0S = new int[2];
        this.A0R = new int[2];
        C65807TuQ c65807TuQ = new C65807TuQ(this);
        this.A0P = c65807TuQ;
        Context context2 = getContext();
        this.A0A = new C006602g(context2, c65807TuQ);
        this.A08 = AbstractC65767Tti.A02(context, attributeSet);
        this.A07 = AbstractC65767Tti.A02(context, attributeSet);
        this.A0M = AbstractC65702TsY.A00(context) * 160.0f * 386.0878f * 0.84f;
        this.A09 = new OverScroller(context2);
        setFocusable(true);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A04 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A03 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0V, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0Q = new Object();
        this.A0O = new C03I(this);
        setNestedScrollingEnabled(true);
        AbstractC010103p.A0B(this, A0U);
    }

    private void A02(int i, int[] iArr, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        C03I.A00(this.A0O, null, iArr, 0, scrollY2, 0, i - scrollY2, i2);
    }

    private void A03(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A00) {
            boolean A1N = AbstractC167007dF.A1N(actionIndex);
            this.A01 = (int) motionEvent.getY(A1N ? 1 : 0);
            this.A00 = motionEvent.getPointerId(A1N ? 1 : 0);
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final int A0A(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int i4 = i3;
        if (rect.bottom < childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin) {
            i4 = i3 - verticalFadingEdgeLength;
        }
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + marginLayoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i = i4 - rect.bottom;
        } else {
            i = scrollY - rect.top;
        }
        return Math.max(-i, -getScrollY());
    }

    public void A0B(int i) {
        if (getChildCount() > 0) {
            this.A09.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.A0O.A05(2, 1);
            this.A02 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean A0E(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && A07(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.A0N;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A01(A0A(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A01(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!A07(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int A07 = AbstractC65702TsY.A07(this) - getPaddingTop();
        if (childCount == 0) {
            return A07;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - A07);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY <= max) {
            return bottom;
        }
        return bottom + (scrollY - max);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !A0H(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int A03 = C0f9.A03(-1846447066);
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A08;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= AbstractC65702TsY.A06(this);
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= AbstractC65702TsY.A09(this);
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= AbstractC65702TsY.A06(this);
                i2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= AbstractC65702TsY.A09(this);
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
        C0f9.A0A(367097215, A03);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + marginLayoutParams.bottomMargin) - getScrollY()) - AbstractC65702TsY.A07(this);
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) - AbstractC65702TsY.A0A(this, getHeight()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, AbstractC65702TsY.A06(this), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1177636964);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        AbstractC65702TsY.A12(view, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0, ViewGroup.getChildMeasureSpec(i, AbstractC65702TsY.A06(this) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width));
        C0f9.A0D(-494415307, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-435033462);
        super.onAttachedToWindow();
        this.A0K = false;
        C0f9.A0D(-1278200131, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.A0C) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            A03(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.A00;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", AnonymousClass001.A0c("Invalid pointerId=", " in onInterceptTouchEvent", i2));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.A01) > this.A05 && (getNestedScrollAxes() & 2) == 0) {
                                this.A0C = true;
                                this.A01 = y;
                                VelocityTracker velocityTracker = this.A06;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A06 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A0F = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.A0C = false;
            this.A00 = -1;
            VelocityTracker velocityTracker2 = this.A06;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A06 = null;
            }
            if (this.A09.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            this.A0O.A01(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A01 = y2;
                    this.A00 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A06;
                    if (velocityTracker3 == null) {
                        this.A06 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A06.addMovement(motionEvent);
                    OverScroller overScroller = this.A09;
                    overScroller.computeScrollOffset();
                    if (!A06(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.A0C = z;
                    this.A0O.A05(2, 0);
                }
            }
            if (!A06(motionEvent) && this.A09.isFinished()) {
                z = false;
            }
            this.A0C = z;
            VelocityTracker velocityTracker4 = this.A06;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A06 = null;
            }
        }
        return this.A0C;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.A0L = false;
        View view = this.A0H;
        if (view != null && A08(view, this)) {
            View view2 = this.A0H;
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0A = A0A(rect);
            if (A0A != 0) {
                scrollBy(0, A0A);
            }
        }
        this.A0H = null;
        if (!this.A0K) {
            if (this.A0I != null) {
                scrollTo(getScrollX(), this.A0I.A00);
                this.A0I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            int A0A2 = AbstractC65702TsY.A0A(this, i4 - i2);
            int scrollY = getScrollY();
            int i6 = scrollY;
            if (A0A2 < i5 && scrollY >= 0) {
                if (A0A2 + scrollY > i5) {
                    i6 = i5 - A0A2;
                }
            } else {
                i6 = 0;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0K = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0J && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int A0A = (AbstractC65702TsY.A0A(this, getMeasuredHeight()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
            if (measuredHeight < A0A) {
                AbstractC65702TsY.A12(childAt, A0A, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, ViewGroup.getChildMeasureSpec(i, AbstractC65702TsY.A06(this) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, ((ViewGroup.LayoutParams) marginLayoutParams).width));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, androidx.core.widget.NestedScrollView$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC71872X8f interfaceC71872X8f = this.A0B;
        if (interfaceC71872X8f != null) {
            interfaceC71872X8f.Dis(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A06 = C0f9.A06(-901040595);
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus) {
            if (A07(findFocus, 0, i4)) {
                Rect rect = this.A0N;
                findFocus.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(findFocus, rect);
                int A0A = A0A(rect);
                if (A0A != 0) {
                    if (this.A0D) {
                        A0D(A0A);
                    } else {
                        scrollBy(0, A0A);
                    }
                }
            }
            i5 = 485153778;
        } else {
            i5 = -1691735934;
        }
        C0f9.A0D(i5, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0183, code lost:
    
        if (getChildCount() > 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
    
        if (A09(r1, r6) != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A0A = A0A(rect);
        boolean z2 = false;
        if (A0A != 0) {
            z2 = true;
            if (z) {
                scrollBy(0, A0A);
            } else {
                A0D(A0A);
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (width < width2 && i >= 0) {
                if (width + i > width2) {
                    i = width2 - width;
                }
            } else {
                i = 0;
            }
            if (height < height2 && i2 >= 0) {
                if (height + i2 > height2) {
                    i2 = height2 - height;
                }
            } else {
                i2 = 0;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setOnScrollChangeListener(InterfaceC71872X8f interfaceC71872X8f) {
        this.A0B = interfaceC71872X8f;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0D = z;
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // X.InterfaceC12520kw
    public final void DVG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A02(i4, iArr, i5);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.nestedScrollViewStyle);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
