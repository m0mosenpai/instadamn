package com.instagram.common.ui.widget.reboundhorizontalscrollview;

import X.AbstractC13560mi;
import X.AbstractC13620mo;
import X.AbstractC70163Da;
import X.AnonymousClass652;
import X.C0f9;
import X.C14360o3;
import X.C206139Av;
import X.C55942hf;
import X.C55982hj;
import X.C55992hk;
import X.EnumC131525wo;
import X.InterfaceC55932he;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ReboundHorizontalScrollView extends LinearLayout implements InterfaceC55932he, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public C55942hf A04;
    public C55942hf A05;
    public C55942hf A06;
    public EnumC131525wo A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final C55982hj A0I;
    public final List A0J;
    public final boolean A0K;
    public final float A0L;
    public final int A0M;
    public final int A0N;
    public final GestureDetector A0O;
    public static final C55942hf A0Q = C55942hf.A04(50.0d, 10.2d);
    public static final C55942hf A0P = C55942hf.A04(0.0d, 5.0d);
    public static final C55942hf A0R = C55942hf.A04(20.0d, 10.0d);

    /* loaded from: classes4.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C206139Av(62);
        public int A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReboundHorizontalScrollView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A07(float f) {
        this.A0H = false;
        float abs = Math.abs(f);
        float f2 = this.A0N;
        C55982hj c55982hj = this.A0I;
        if (abs < f2) {
            C55942hf c55942hf = this.A06;
            c55982hj.A09(c55942hf);
            if (this.A03 == -1) {
                c55982hj.A09(c55942hf);
                c55982hj.A06(getNearestRestPoint());
                c55982hj.A07(0.0d);
            }
        } else {
            c55982hj.A09(this.A05);
            c55982hj.A07(-f);
            A00(getScrollX());
            List list = this.A0J;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
            }
        }
        List list2 = this.A0J;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((AnonymousClass652) list2.get(i2)).Du6(this);
        }
        setScrollState(EnumC131525wo.A04);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (this.A07 == EnumC131525wo.A04) {
            c55982hj.A05(c55982hj.A01);
            setScrollX((int) Math.round(this.A0I.A09.A00));
            setScrollState(EnumC131525wo.A03);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.view.ViewGroup
    public final void addView(final View view, int i, ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(layoutParams, 2);
        super.addView(view, i, layoutParams);
        view.setClickable(true);
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.86y
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                ReboundHorizontalScrollView.A04(view, this);
                return false;
            }
        }, new Handler(Looper.getMainLooper()));
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.86z
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                for (AnonymousClass652 anonymousClass652 : this.A0J) {
                    C14360o3.A0A(view2);
                    C14360o3.A0A(motionEvent);
                    anonymousClass652.D38(motionEvent, view2);
                }
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        C14360o3.A0B(view, 0);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r1 != 3) goto L11;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            boolean r0 = r4.isEnabled()
            r2 = 1
            if (r0 == 0) goto L1a
            int r1 = r5.getActionMasked()
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L26
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L26
        L19:
            r2 = 0
        L1a:
            return r2
        L1b:
            r4.A03(r5)
            boolean r0 = r4.A0E
            if (r0 == 0) goto L19
            r4.A02()
            return r2
        L26:
            float r0 = r4.A0D
            r4.A07(r0)
            goto L19
        L2c:
            r4.A0E = r3
            r4.A0G = r3
            r0 = 0
            r4.A0D = r0
            float r0 = r5.getRawX()
            r4.A0B = r0
            float r0 = r5.getRawY()
            r4.A0C = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(accessibilityEvent, 1);
        if (accessibilityEvent.getEventType() == 32768 && this.A0F) {
            scrollTo(A01(indexOfChild(view)), 0);
        } else if (accessibilityEvent.getEventType() == 1) {
            A04(view, this);
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setPagingSpringConfig(C55942hf c55942hf) {
        C14360o3.A0B(c55942hf, 0);
        this.A04 = c55942hf;
    }

    public final void setScrollingSpringConfig(C55942hf c55942hf) {
        C14360o3.A0B(c55942hf, 0);
        this.A05 = c55942hf;
    }

    public final void setSnappingSpringConfig(C55942hf c55942hf) {
        C14360o3.A0B(c55942hf, 0);
        this.A06 = c55942hf;
    }

    private final void A02() {
        if (!this.A0H) {
            this.A0H = true;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            setSeekingIndex(-1);
            List list = this.A0J;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass652) list.get(i)).DuG(this);
            }
            setScrollState(EnumC131525wo.A03);
            this.A08 = false;
            this.A01 = 0.0f;
            this.A0I.A01();
        }
    }

    private final void A03(MotionEvent motionEvent) {
        if (!this.A0E) {
            float rawX = this.A0B - motionEvent.getRawX();
            float rawY = this.A0C - motionEvent.getRawY();
            boolean z = false;
            if (Math.sqrt((rawX * rawX) + (rawY * rawY)) > this.A0L) {
                z = true;
            }
            double degrees = Math.toDegrees(Math.atan(Math.abs(rawY / rawX)));
            if (z && degrees < 45.0d) {
                this.A0E = true;
            }
        }
    }

    private final void setScrollState(EnumC131525wo enumC131525wo) {
        EnumC131525wo enumC131525wo2 = this.A07;
        if (enumC131525wo2 != enumC131525wo) {
            this.A07 = enumC131525wo;
            Iterator it = this.A0J.iterator();
            while (it.hasNext()) {
                ((AnonymousClass652) it.next()).Dj2(enumC131525wo2, this.A07, this);
            }
        }
    }

    private final void setSeekingIndex(int i) {
        View childAt = getChildAt(this.A03);
        if (childAt != null) {
            childAt.setSelected(false);
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            childAt2.setSelected(true);
        }
        this.A03 = i;
    }

    public final void A08(int i) {
        this.A0I.A05(A01(i));
    }

    public final void A0A(AnonymousClass652 anonymousClass652) {
        List list = this.A0J;
        if (!list.contains(anonymousClass652)) {
            list.add(anonymousClass652);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        int endScrollBound;
        int scrollX = getScrollX();
        int A00 = A00(getScrollX());
        C55982hj c55982hj2 = this.A0I;
        C55992hk c55992hk = c55982hj2.A09;
        setScrollX((int) Math.round(c55992hk.A00));
        int scrollX2 = getScrollX();
        int A002 = A00(getScrollX());
        List list = this.A0J;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass652 anonymousClass652 = (AnonymousClass652) list.get(i);
            if (scrollX2 != scrollX) {
                float progress = getProgress();
                double d = progress;
                int floor = (int) Math.floor(d);
                anonymousClass652.Dio(this, progress - floor, floor, (int) Math.ceil(d));
            }
            if (A002 != A00) {
                anonymousClass652.DLs(this, A002, A00);
            }
        }
        if (this.A07 == EnumC131525wo.A04) {
            if (this.A03 == -1) {
                if (getChildCount() != 0) {
                    boolean z = this.A0K;
                    int scrollX3 = getScrollX();
                    int startScrollBound = getStartScrollBound();
                    if (!z ? scrollX3 < startScrollBound : scrollX3 > startScrollBound) {
                        c55982hj2.A09(this.A04);
                        endScrollBound = getStartScrollBound();
                        c55982hj2.A06(endScrollBound);
                    }
                }
                if (getChildCount() != 0) {
                    boolean z2 = this.A0K;
                    int endScrollBound2 = getEndScrollBound();
                    int scrollX4 = getScrollX();
                    if (!z2 ? endScrollBound2 < scrollX4 : endScrollBound2 > scrollX4) {
                        c55982hj2.A09(this.A04);
                        endScrollBound = getEndScrollBound();
                        c55982hj2.A06(endScrollBound);
                    }
                }
            }
            double d2 = c55992hk.A01;
            float abs = (float) Math.abs(d2);
            if (!this.A08 && abs < this.A01 && c55982hj2.A05 == this.A05 && abs < this.A00) {
                this.A08 = true;
                float f = (float) d2;
                C55942hf c55942hf = this.A06;
                c55982hj2.A09(c55942hf);
                if (this.A03 == -1) {
                    c55982hj2.A09(c55942hf);
                    c55982hj2.A06(getNearestRestPoint());
                    c55982hj2.A07(f);
                }
            }
            this.A01 = abs;
        }
    }

    public final EnumC131525wo getScrollState() {
        return this.A07;
    }

    public final int getSeekingIndex() {
        return this.A03;
    }

    public final float getVelocity() {
        return (float) this.A0I.A09.A01;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A09) {
            return false;
        }
        float f3 = this.A0M;
        this.A0D = Math.min(Math.max(f, -f3), f3);
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null && C14360o3.A0K(parcelable.getClass(), SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.A02 = savedState.A00;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            boolean r0 = r6.A0G
            r4 = 1
            if (r0 != 0) goto L8
            r6.A0G = r4
        L7:
            return r4
        L8:
            boolean r0 = r6.A09
            if (r0 == 0) goto L7
            r6.A02()
            X.5wo r0 = X.EnumC131525wo.A02
            r6.setScrollState(r0)
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L5e
            boolean r3 = r6.A0K
            int r2 = r6.getScrollX()
            int r1 = r6.getStartScrollBound()
            r0 = 1
            if (r3 == 0) goto L5b
            if (r2 <= r1) goto L5e
        L29:
            r5 = 1048576000(0x3e800000, float:0.25)
            r3 = 0
            if (r0 == 0) goto L33
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L33
            float r9 = r9 * r5
        L33:
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L4c
            boolean r2 = r6.A0K
            int r1 = r6.getEndScrollBound()
            int r0 = r6.getScrollX()
            if (r2 == 0) goto L58
            if (r1 <= r0) goto L4c
        L47:
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4c
            float r9 = r9 * r5
        L4c:
            X.2hj r5 = r6.A0I
            X.2hk r0 = r5.A09
            double r2 = r0.A00
            double r0 = (double) r9
            double r2 = r2 + r0
            r5.A05(r2)
            return r4
        L58:
            if (r1 >= r0) goto L4c
            goto L47
        L5b:
            if (r2 >= r1) goto L5e
            goto L29
        L5e:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void setSpringConfig(C55942hf c55942hf) {
        this.A0I.A09(c55942hf);
    }

    private final int A00(int i) {
        int childCount = getChildCount();
        int i2 = 0;
        if (childCount <= 1) {
            return 0;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        do {
            getChildAt(i2);
            int abs = Math.abs(i - A01(i2));
            if (i2 == 0 || abs < i3) {
                i4 = i2;
                i3 = abs;
            }
            i2++;
        } while (i2 < childCount);
        return i4;
    }

    private final int A01(int i) {
        View childAt;
        int childCount = getChildCount() - 1;
        if (i > childCount || (i == 0 && this.A0A)) {
            return 0;
        }
        if (i == childCount && this.A0A) {
            View childAt2 = getChildAt(i);
            if (this.A0K) {
                return childAt2.getLeft();
            }
            return childAt2.getRight() - getWidth();
        }
        int i2 = 0;
        if (i <= getChildCount() - 1 && (childAt = getChildAt(i)) != null) {
            i2 = Math.round(childAt.getRight() - (childAt.getMeasuredWidth() / 2.0f));
        }
        int round = Math.round(i2 - getSelectionPoint());
        if (!this.A0A) {
            return round;
        }
        if (round < getStartScrollBound()) {
            return getStartScrollBound();
        }
        if (round <= getEndScrollBound()) {
            return round;
        }
        return getEndScrollBound();
    }

    public static final void A04(View view, ReboundHorizontalScrollView reboundHorizontalScrollView) {
        int indexOfChild = reboundHorizontalScrollView.indexOfChild(view);
        reboundHorizontalScrollView.A09(indexOfChild, 0.0f);
        for (AnonymousClass652 anonymousClass652 : reboundHorizontalScrollView.A0J) {
            anonymousClass652.DuG(reboundHorizontalScrollView);
            anonymousClass652.DsC(view, indexOfChild);
        }
    }

    private final int getNearestRestPoint() {
        return A01(A00(getScrollX()));
    }

    private final int getNextRestPoint() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            int A01 = A01(i);
            if (A01 > getScrollX()) {
                return A01;
            }
        }
        return A01(0);
    }

    private final int getPriorRestPoint() {
        int A01;
        int childCount = getChildCount();
        do {
            childCount--;
            if (-1 < childCount) {
                A01 = A01(childCount);
            } else {
                return A01(getChildCount() - 1);
            }
        } while (A01 >= getScrollX());
        return A01;
    }

    private final float getProgress() {
        int i;
        int A00 = A00(getScrollX());
        int A01 = A01(A00);
        int scrollX = getScrollX();
        if (!this.A0K ? A01 < scrollX : A01 > scrollX) {
            i = Math.min(A00 + 1, getChildCount() - 1);
        } else {
            i = A00;
            A00 = Math.max(A00 - 1, 0);
        }
        int A012 = A01(A00);
        int A013 = A01(i);
        if (A00 == i) {
            return A00;
        }
        return A00 + ((float) AbstractC70163Da.A04(scrollX, A012, A013, 0.0d, 1.0d));
    }

    private final int getSelectionPoint() {
        return Math.round(getWidth() / 2.0f);
    }

    public final void A05(float f) {
        int nextRestPoint = getNextRestPoint();
        setSeekingIndex(A00(nextRestPoint));
        C55982hj c55982hj = this.A0I;
        c55982hj.A09(this.A04);
        c55982hj.A06(nextRestPoint);
        c55982hj.A07(f);
    }

    public final void A06(float f) {
        int priorRestPoint = getPriorRestPoint();
        setSeekingIndex(A00(priorRestPoint));
        C55982hj c55982hj = this.A0I;
        c55982hj.A09(this.A04);
        c55982hj.A06(priorRestPoint);
        c55982hj.A07(f);
    }

    public final void A09(int i, float f) {
        setSeekingIndex(i);
        C55982hj c55982hj = this.A0I;
        c55982hj.A09(this.A04);
        c55982hj.A06(A01(i));
        c55982hj.A07(f);
        setScrollState(EnumC131525wo.A04);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return isEnabled();
    }

    public final int getCurrentChildIndex() {
        return A00(getScrollX());
    }

    public final int getEndScrollBound() {
        if (getChildCount() == 0) {
            return 0;
        }
        return A01(getChildCount() - 1);
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (getChildCount() != 0) {
            return 1.0f;
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (getChildCount() != 0) {
            return 1.0f;
        }
        return 0.0f;
    }

    public final int getStartScrollBound() {
        if (getChildCount() == 0) {
            return 0;
        }
        return A01(0);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(138461262);
        C14360o3.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        C0f9.A0D(2110364612, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-242426367);
        super.onAttachedToWindow();
        this.A0I.A0A(this);
        setScrollState(EnumC131525wo.A03);
        C0f9.A0D(981107593, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1386624774);
        super.onDetachedFromWindow();
        this.A0I.A0B(this);
        C0f9.A0D(805118939, A06);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A02 != -1) {
            this.A0I.A05(A01(A00(r0)));
            this.A02 = -1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            ?? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
            baseSavedState.A00 = getScrollX();
            return baseSavedState;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r1 != 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5.A0E != false) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = -1012567740(0xffffffffc3a57144, float:-330.8849)
            int r4 = X.C0f9.A05(r0)
            r1 = 0
            X.C14360o3.A0B(r6, r1)
            boolean r0 = r5.isEnabled()
            r3 = 0
            if (r0 != 0) goto L19
            r0 = -1917522511(0xffffffff8db4edb1, float:-1.1150579E-30)
            X.C0f9.A0C(r0, r4)
            return r1
        L19:
            boolean r0 = super.onTouchEvent(r6)
            r2 = 1
            if (r0 != 0) goto L28
            android.view.GestureDetector r0 = r5.A0O
            boolean r0 = r0.onTouchEvent(r6)
            if (r0 == 0) goto L29
        L28:
            r3 = 1
        L29:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L4d
            if (r1 == r2) goto L47
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 3
            if (r1 == r0) goto L47
        L37:
            r2 = r3
        L38:
            r0 = -1227879531(0xffffffffb6d00b95, float:-6.2002314E-6)
            X.C0f9.A0C(r0, r4)
            return r2
        L3f:
            r5.A03(r6)
            boolean r0 = r5.A0E
            if (r0 == 0) goto L37
            goto L38
        L47:
            float r0 = r5.A0D
            r5.A07(r0)
            goto L37
        L4d:
            r5.A02()
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDeceleratingVelocity(float f) {
        this.A00 = f;
    }

    public final void setExplorableByAccessibility(boolean z) {
        this.A0F = z;
    }

    public final void setSnapToEdges(boolean z) {
        this.A0A = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0F = true;
        this.A07 = EnumC131525wo.A03;
        this.A02 = -1;
        this.A09 = true;
        setClipChildren(false);
        setSaveEnabled(false);
        this.A04 = A0Q;
        this.A06 = A0R;
        this.A05 = A0P;
        this.A0K = AbstractC13620mo.A02(getContext());
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(this.A05);
        A02.A00 = 0.001d;
        A02.A02 = 1.0d;
        this.A0I = A02;
        this.A0O = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
        this.A0J = new CopyOnWriteArrayList();
        this.A0L = TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.A0N = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.A00 = r0 * 3;
        this.A0M = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public /* synthetic */ ReboundHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
