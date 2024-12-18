package androidx.slidingpanelayout.widget;

import X.AbstractC009003e;
import X.AbstractC010103p;
import X.AbstractC167007dF;
import X.AbstractC23641Du;
import X.AbstractC43593JPy;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.AbstractC68273VKk;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.C011504d;
import X.C02I;
import X.C0f9;
import X.C14360o3;
import X.C19K;
import X.C4PZ;
import X.C65884Tvo;
import X.C66344UAj;
import X.C66378UEm;
import X.C69188VjH;
import X.C70198WGk;
import X.CLZ;
import X.D52;
import X.InterfaceC23621Ds;
import X.InterfaceC94614No;
import X.UBO;
import X.UEQ;
import X.WT6;
import X.X79;
import X.X7A;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes11.dex */
public class SlidingPaneLayout extends ViewGroup {
    public static boolean A0O = AbstractC43593JPy.A1Z(Build.VERSION.SDK_INT, 29);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public C4PZ A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public X79 A0H;
    public C69188VjH A0I;
    public X7A A0J;
    public final C70198WGk A0K;
    public final ArrayList A0L;
    public final List A0M;
    public final Rect A0N;

    public final boolean A04(View view) {
        if (view != null) {
            return this.A08 && ((C66344UAj) view.getLayoutParams()).A01 && this.A00 > 0.0f;
        }
        return false;
    }

    /* loaded from: classes11.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C65884Tvo(3);
        public int A00;
        public boolean A01;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A00);
        }
    }

    public static void A00(SlidingPaneLayout slidingPaneLayout) {
        if (!slidingPaneLayout.A08) {
            slidingPaneLayout.A0B = false;
        }
        if (slidingPaneLayout.A09 || slidingPaneLayout.A03(1.0f)) {
            slidingPaneLayout.A0B = false;
        }
    }

    private C02I getSystemGestureInsets() {
        C011504d A00;
        if (A0O && (A00 = AbstractC009003e.A00(this)) != null) {
            return A00.A00.A02();
        }
        return null;
    }

    private void setFoldingFeatureObserver(C69188VjH c69188VjH) {
        this.A0I = c69188VjH;
        X79 x79 = this.A0H;
        C14360o3.A0B(x79, 0);
        c69188VjH.A00 = x79;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r1 > r7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r20) {
        /*
            r19 = this;
            r14 = r19
            boolean r18 = X.AbstractC65703TsZ.A1a(r14)
            if (r18 == 0) goto L88
            int r17 = X.AbstractC65702TsY.A08(r14)
            int r16 = r14.getPaddingLeft()
        L10:
            int r12 = r14.getPaddingTop()
            int r11 = X.AbstractC65702TsY.A07(r14)
            r13 = r20
            if (r20 == 0) goto L83
            boolean r0 = r13.isOpaque()
            if (r0 == 0) goto L83
            int r10 = r13.getLeft()
            int r9 = r13.getRight()
            int r8 = r13.getTop()
            int r7 = r13.getBottom()
        L32:
            int r6 = r14.getChildCount()
            r5 = 0
        L37:
            if (r5 >= r6) goto L91
            android.view.View r4 = r14.getChildAt(r5)
            if (r4 == r13) goto L91
            int r1 = r4.getVisibility()
            r0 = 8
            if (r1 == r0) goto L80
            r1 = r17
            if (r18 == 0) goto L4d
            r1 = r16
        L4d:
            int r0 = r4.getLeft()
            int r15 = java.lang.Math.max(r1, r0)
            int r0 = r4.getTop()
            int r3 = java.lang.Math.max(r12, r0)
            r1 = r16
            if (r18 == 0) goto L63
            r1 = r17
        L63:
            int r0 = r4.getRight()
            int r2 = java.lang.Math.min(r1, r0)
            int r0 = r4.getBottom()
            int r1 = java.lang.Math.min(r11, r0)
            if (r15 < r10) goto L7c
            if (r3 < r8) goto L7c
            if (r2 > r9) goto L7c
            r0 = 4
            if (r1 <= r7) goto L7d
        L7c:
            r0 = 0
        L7d:
            r4.setVisibility(r0)
        L80:
            int r5 = r5 + 1
            goto L37
        L83:
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            goto L32
        L88:
            int r17 = r14.getPaddingLeft()
            int r16 = X.AbstractC65702TsY.A08(r14)
            goto L10
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.A02(android.view.View):void");
    }

    public final boolean A03(float f) {
        float paddingLeft;
        if (this.A08) {
            boolean A1a = AbstractC65703TsZ.A1a(this);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A06.getLayoutParams();
            if (A1a) {
                paddingLeft = getWidth() - (((getPaddingRight() + marginLayoutParams.rightMargin) + (f * this.A03)) + this.A06.getWidth());
            } else {
                paddingLeft = getPaddingLeft() + marginLayoutParams.leftMargin + (f * this.A03);
            }
            int i = (int) paddingLeft;
            C70198WGk c70198WGk = this.A0K;
            View view = this.A06;
            int top = view.getTop();
            c70198WGk.A08 = view;
            c70198WGk.A02 = -1;
            if (!C70198WGk.A0A(c70198WGk, i, top, 0, 0)) {
                if (c70198WGk.A03 == 0 && c70198WGk.A08 != null) {
                    c70198WGk.A08 = null;
                }
            } else {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C66344UAj) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        C70198WGk c70198WGk = this.A0K;
        if (c70198WGk.A0H()) {
            if (!this.A08) {
                c70198WGk.A0C();
            } else {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C66344UAj();
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.A0F;
    }

    public final int getLockMode() {
        return this.A01;
    }

    public int getParallaxDistance() {
        return this.A02;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.A0G;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        if (savedState.A01) {
            if (!this.A08) {
                this.A0B = true;
            }
            if (this.A09 || A03(0.0f)) {
                this.A0B = true;
            }
        } else {
            A00(this);
        }
        this.A0B = savedState.A01;
        this.A01 = savedState.A00;
    }

    @Deprecated
    public void setPanelSlideListener(X7A x7a) {
        if (x7a != null) {
            this.A0M.add(x7a);
        }
        this.A0J = x7a;
    }

    public void setParallaxDistance(int i) {
        this.A02 = i;
        requestLayout();
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0G = 0;
        this.A00 = 1.0f;
        this.A0M = new CopyOnWriteArrayList();
        this.A09 = true;
        this.A0N = new Rect();
        this.A0L = new ArrayList();
        this.A0H = new WT6(this);
        float A00 = AbstractC65702TsY.A00(context);
        setWillNotDraw(false);
        AbstractC010103p.A0B(this, new UEQ(this));
        setImportantForAccessibility(1);
        C70198WGk c70198WGk = new C70198WGk(getContext(), this, new C66378UEm(this));
        c70198WGk.A06 = (int) (c70198WGk.A06 * (1.0f / 0.5f));
        this.A0K = c70198WGk;
        c70198WGk.A01 = A00 * 400.0f;
        AbstractC68273VKk abstractC68273VKk = AbstractC68273VKk.$redex_init_class;
        setFoldingFeatureObserver(new C69188VjH(InterfaceC94614No.A00.A00(context), context.getMainExecutor()));
    }

    public static void A01(SlidingPaneLayout slidingPaneLayout, float f) {
        boolean A1a = AbstractC65703TsZ.A1a(slidingPaneLayout);
        int childCount = slidingPaneLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = slidingPaneLayout.getChildAt(i);
            if (childAt != slidingPaneLayout.A06) {
                float f2 = 1.0f - slidingPaneLayout.A0E;
                float f3 = slidingPaneLayout.A02;
                slidingPaneLayout.A0E = f;
                int i2 = ((int) (f2 * f3)) - ((int) ((1.0f - f) * f3));
                if (A1a) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.addView(view);
            super.addView(frameLayout, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        View childAt;
        int i2;
        int i3;
        int A03 = C0f9.A03(-1304541287);
        super.draw(canvas);
        if (getLayoutDirection() == 1) {
            drawable = this.A05;
        } else {
            drawable = this.A04;
        }
        if (getChildCount() > 1 && (childAt = getChildAt(1)) != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (getLayoutDirection() == 1) {
                i2 = childAt.getRight();
                i3 = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                i2 = left - intrinsicWidth;
                i3 = left;
            }
            drawable.setBounds(i2, top, i3, bottom);
            drawable.draw(canvas);
            i = 1750185459;
        } else {
            i = -799628688;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r4.A00 == 0.0f) goto L6;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            boolean r3 = X.AbstractC65703TsZ.A1a(r4)
            boolean r0 = r4.A08
            if (r0 == 0) goto L10
            float r1 = r4.A00
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L11
        L10:
            r0 = 1
        L11:
            r3 = r3 ^ r0
            X.WGk r2 = r4.A0K
            if (r3 == 0) goto L73
            r0 = 1
            r2.A07 = r0
            X.02I r0 = r4.getSystemGestureInsets()
            if (r0 == 0) goto L29
            int r1 = r2.A0J
            int r0 = r0.A01
        L23:
            int r0 = java.lang.Math.max(r1, r0)
            r2.A04 = r0
        L29:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            X.UAj r1 = (X.C66344UAj) r1
            int r2 = r5.save()
            boolean r0 = r4.A08
            if (r0 == 0) goto L5c
            boolean r0 = r1.A02
            if (r0 != 0) goto L5c
            android.view.View r0 = r4.A06
            if (r0 == 0) goto L5c
            android.graphics.Rect r3 = r4.A0N
            r5.getClipBounds(r3)
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L64
            int r1 = r3.left
            android.view.View r0 = r4.A06
            int r0 = r0.getRight()
            int r0 = java.lang.Math.max(r1, r0)
            r3.left = r0
        L59:
            r5.clipRect(r3)
        L5c:
            boolean r0 = super.drawChild(r5, r6, r7)
            r5.restoreToCount(r2)
            return r0
        L64:
            int r1 = r3.right
            android.view.View r0 = r4.A06
            int r0 = r0.getLeft()
            int r0 = java.lang.Math.min(r1, r0)
            r3.right = r0
            goto L59
        L73:
            r0 = 2
            r2.A07 = r0
            X.02I r0 = r4.getSystemGestureInsets()
            if (r0 == 0) goto L29
            int r1 = r2.A0J
            int r0 = r0.A02
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.ViewGroup$LayoutParams, X.UAj, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C66344UAj.A03);
        marginLayoutParams.A00 = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-125872570);
        super.onAttachedToWindow();
        this.A09 = true;
        if (this.A0I != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    if (context != null) {
                        C69188VjH c69188VjH = this.A0I;
                        AnonymousClass195 anonymousClass195 = c69188VjH.A01;
                        if (anonymousClass195 != null) {
                            anonymousClass195.AGH(null);
                        }
                        C19K A02 = AnonymousClass194.A02(CLZ.A00(c69188VjH.A03));
                        c69188VjH.A01 = AbstractC23641Du.A04(AnonymousClass191.A00, new D52(c69188VjH, context, (InterfaceC23621Ds) null, 45), A02);
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        C0f9.A0D(1997144091, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnonymousClass195 anonymousClass195;
        int A06 = C0f9.A06(-906024903);
        super.onDetachedFromWindow();
        this.A09 = true;
        C69188VjH c69188VjH = this.A0I;
        if (c69188VjH != null && (anonymousClass195 = c69188VjH.A01) != null) {
            anonymousClass195.AGH(null);
        }
        ArrayList arrayList = this.A0L;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw new NullPointerException("run");
        }
        arrayList.clear();
        C0f9.A0D(1849583139, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (A04(r6.A06) == false) goto L33;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r4 = r7.getActionMasked()
            boolean r0 = r6.A08
            r3 = 1
            if (r0 != 0) goto L27
            if (r4 != 0) goto L27
            int r0 = r6.getChildCount()
            if (r0 <= r3) goto L27
            android.view.View r2 = r6.getChildAt(r3)
            if (r2 == 0) goto L27
            float r0 = r7.getX()
            int r1 = (int) r0
            float r0 = r7.getY()
            int r0 = (int) r0
            boolean r0 = X.C70198WGk.A09(r2, r1, r0)
            r6.A0B = r0
        L27:
            boolean r0 = r6.A08
            if (r0 == 0) goto L31
            boolean r0 = r6.A0A
            if (r0 == 0) goto L3b
            if (r4 == 0) goto L3b
        L31:
            X.WGk r0 = r6.A0K
            r0.A0D()
            boolean r0 = super.onInterceptTouchEvent(r7)
            return r0
        L3b:
            r0 = 3
            r5 = 0
            if (r4 == r0) goto L9d
            if (r4 == r3) goto L9d
            if (r4 == 0) goto L6f
            r0 = 2
            if (r4 != r0) goto L90
            float r2 = r7.getX()
            float r1 = r7.getY()
            float r0 = r6.A0C
            float r2 = r2 - r0
            float r4 = java.lang.Math.abs(r2)
            float r0 = r6.A0D
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            X.WGk r1 = r6.A0K
            int r0 = r1.A06
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L90
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L90
            r1.A0D()
            r6.A0A = r3
            return r5
        L6f:
            r6.A0A = r5
            float r1 = r7.getX()
            float r0 = r7.getY()
            r6.A0C = r1
            r6.A0D = r0
            android.view.View r2 = r6.A06
            int r1 = (int) r1
            int r0 = (int) r0
            boolean r0 = X.C70198WGk.A09(r2, r1, r0)
            if (r0 == 0) goto L90
            android.view.View r0 = r6.A06
            boolean r0 = r6.A04(r0)
            r1 = 1
            if (r0 != 0) goto L91
        L90:
            r1 = 0
        L91:
            X.WGk r0 = r6.A0K
            boolean r0 = r0.A0J(r7)
            if (r0 != 0) goto L9c
            if (r1 != 0) goto L9c
            r3 = 0
        L9c:
            return r3
        L9d:
            X.WGk r0 = r6.A0K
            r0.A0D()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r15.A0B == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0289, code lost:
    
        if (r16 < r15.getMinimumWidth()) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0139 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        if (this.A08) {
            z = AbstractC167007dF.A1N((this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1)));
        } else {
            z = this.A0B;
        }
        absSavedState.A01 = z;
        absSavedState.A00 = this.A01;
        return absSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1971404977);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.A09 = true;
        }
        C0f9.A0D(-1958711379, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A05 = C0f9.A05(-1865059337);
        if (!this.A08) {
            z = super.onTouchEvent(motionEvent);
            i = 122966178;
        } else {
            C70198WGk c70198WGk = this.A0K;
            c70198WGk.A0F(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            z = true;
            if (actionMasked != 0) {
                if (actionMasked == 1 && A04(this.A06)) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f = x - this.A0C;
                    float f2 = y - this.A0D;
                    int i2 = c70198WGk.A06;
                    if ((f * f) + (f2 * f2) < i2 * i2 && C70198WGk.A09(this.A06, (int) x, (int) y)) {
                        A00(this);
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                this.A0C = x2;
                this.A0D = y2;
            }
            i = 1498577546;
        }
        C0f9.A0C(i, A05);
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof UBO) {
            view = (View) view.getParent();
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.A08) {
            this.A0B = AbstractC167007dF.A1X(view, this.A06);
        }
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.A0F = i;
    }

    public final void setLockMode(int i) {
        this.A01 = i;
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        this.A04 = drawable;
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.A04 = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.A05 = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        this.A04 = getResources().getDrawable(i);
    }

    public void setShadowResourceLeft(int i) {
        this.A04 = getContext().getDrawable(i);
    }

    public void setShadowResourceRight(int i) {
        this.A05 = getContext().getDrawable(i);
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.A0G = i;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C66344UAj c66344UAj;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c66344UAj = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c66344UAj = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        c66344UAj.A00 = 0.0f;
        return c66344UAj;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }
}
