package androidx.swiperefreshlayout.widget;

import X.AbstractC170787jV;
import X.AbstractC37304Gc5;
import X.AbstractC63123SdR;
import X.C03H;
import X.C03I;
import X.C03K;
import X.C0f9;
import X.C170777jU;
import X.C170797jW;
import X.C170807jX;
import X.C66348UAv;
import X.C66349UAw;
import X.InterfaceC12520kw;
import X.InterfaceC17990uc;
import X.InterfaceC43398JFn;
import X.InterfaceC60212p4;
import X.Py5;
import X.WOQ;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC17990uc, InterfaceC12520kw, C03H {
    public static final int[] A0c = {R.attr.enabled};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Animation A08;
    public Animation A09;
    public Animation A0A;
    public C170777jU A0B;
    public C170797jW A0C;
    public InterfaceC43398JFn A0D;
    public InterfaceC60212p4 A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public int A0M;
    public int A0N;
    public View A0O;
    public Animation.AnimationListener A0P;
    public Animation A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final Animation A0U;
    public final Animation A0V;
    public final DecelerateInterpolator A0W;
    public final C03I A0X;
    public final C03K A0Y;
    public final int[] A0Z;
    public final int[] A0a;
    public final int[] A0b;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    @Override // X.InterfaceC17990uc
    public final void DVF(View view, int i, int i2, int i3, int i4, int i5) {
        DVG(view, this.A0Z, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.A0L;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.A0L = 0.0f;
                    f = 0.0f;
                } else {
                    f = f2 - f3;
                    this.A0L = f;
                    iArr[1] = i2;
                }
                A03(f);
            }
        }
        if (this.A0H && i2 > 0 && this.A0L == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.A0B.setVisibility(8);
        }
        int[] iArr2 = this.A0b;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        DVG(view, this.A0Z, i, i2, i3, i4, 0);
    }

    public void setDistanceToTriggerSync(int i) {
        this.A0K = i;
    }

    public void setRefreshing(boolean z) {
        if (z && this.A0G != z) {
            this.A0G = z;
            boolean z2 = this.A0H;
            int i = this.A07;
            if (!z2) {
                i += this.A06;
            }
            setTargetOffsetTopAndBottom(i - this.A02);
            this.A0F = false;
            Animation.AnimationListener animationListener = this.A0P;
            C170777jU c170777jU = this.A0B;
            c170777jU.setVisibility(0);
            this.A0C.setAlpha(255);
            C66348UAv c66348UAv = new C66348UAv(this);
            this.A0A = c66348UAv;
            c66348UAv.setDuration(this.A05);
            if (animationListener != null) {
                c170777jU.A01 = animationListener;
            }
            c170777jU.clearAnimation();
            c170777jU.startAnimation(this.A0A);
            return;
        }
        A05(z, false);
    }

    /* loaded from: classes10.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = Py5.A00(65);
        public final boolean A00;

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.A00 = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = AbstractC37304Gc5.A1X(parcel);
        }
    }

    private void A01() {
        if (this.A0O == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.A0B)) {
                    this.A0O = childAt;
                    return;
                }
            }
        }
    }

    private void A02(float f) {
        if (f > this.A0K) {
            A05(true, true);
            return;
        }
        this.A0G = false;
        C170797jW c170797jW = this.A0C;
        C170807jX c170807jX = c170797jW.A05;
        c170807jX.A04 = 0.0f;
        c170807jX.A01 = 0.0f;
        c170797jW.invalidateSelf();
        WOQ woq = new WOQ(this);
        this.A04 = this.A02;
        Animation animation = this.A0V;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.A0W);
        C170777jU c170777jU = this.A0B;
        c170777jU.A01 = woq;
        c170777jU.clearAnimation();
        c170777jU.startAnimation(animation);
        if (c170807jX.A0F) {
            c170807jX.A0F = false;
        }
        c170797jW.invalidateSelf();
    }

    private void A03(float f) {
        Animation animation;
        Animation animation2;
        C170797jW c170797jW = this.A0C;
        C170807jX c170807jX = c170797jW.A05;
        if (!c170807jX.A0F) {
            c170807jX.A0F = true;
        }
        c170797jW.invalidateSelf();
        float f2 = this.A0K;
        float min = Math.min(1.0f, Math.abs(f / f2));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - f2;
        int i = this.A03;
        if (i <= 0) {
            boolean z = this.A0H;
            i = this.A07;
            if (z) {
                i -= this.A06;
            }
        }
        float f3 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.A06 + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        C170777jU c170777jU = this.A0B;
        if (c170777jU.getVisibility() != 0) {
            c170777jU.setVisibility(0);
        }
        c170777jU.setScaleX(1.0f);
        c170777jU.setScaleY(1.0f);
        float f4 = this.A0K;
        int i3 = c170807jX.A09;
        if (f < f4) {
            final int i4 = 76;
            if (i3 > 76 && ((animation2 = this.A09) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                final int i5 = c170807jX.A09;
                Animation animation3 = new Animation() { // from class: X.9QM
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f5, Transformation transformation) {
                        SwipeRefreshLayout.this.A0C.setAlpha((int) (i5 + ((i4 - r2) * f5)));
                    }
                };
                animation3.setDuration(300L);
                c170777jU.A01 = null;
                c170777jU.clearAnimation();
                c170777jU.startAnimation(animation3);
                this.A09 = animation3;
            }
        } else {
            final int i6 = 255;
            if (i3 < 255 && ((animation = this.A08) == null || !animation.hasStarted() || animation.hasEnded())) {
                final int i7 = c170807jX.A09;
                Animation animation4 = new Animation() { // from class: X.9QM
                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f5, Transformation transformation) {
                        SwipeRefreshLayout.this.A0C.setAlpha((int) (i7 + ((i6 - r2) * f5)));
                    }
                };
                animation4.setDuration(300L);
                c170777jU.A01 = null;
                c170777jU.clearAnimation();
                c170777jU.startAnimation(animation4);
                this.A08 = animation4;
            }
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        c170807jX.A04 = 0.0f;
        c170807jX.A01 = min2;
        c170797jW.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        if (min3 != c170807jX.A00) {
            c170807jX.A00 = min3;
        }
        c170797jW.invalidateSelf();
        c170807jX.A03 = (((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f;
        c170797jW.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.A02);
    }

    private void A04(float f) {
        float f2 = this.A0I;
        float f3 = f - f2;
        float f4 = this.A0N;
        if (f3 > f4 && !this.A0S) {
            this.A0J = f2 + f4;
            this.A0S = true;
            this.A0C.setAlpha(76);
        }
    }

    private void A05(boolean z, boolean z2) {
        if (this.A0G != z) {
            this.A0F = z2;
            A01();
            this.A0G = z;
            if (z) {
                int i = this.A02;
                Animation.AnimationListener animationListener = this.A0P;
                this.A04 = i;
                Animation animation = this.A0U;
                animation.reset();
                animation.setDuration(200L);
                animation.setInterpolator(this.A0W);
                if (animationListener != null) {
                    this.A0B.A01 = animationListener;
                }
                C170777jU c170777jU = this.A0B;
                c170777jU.clearAnimation();
                c170777jU.startAnimation(animation);
                return;
            }
            A09(this.A0P);
        }
    }

    private void setColorViewAlpha(int i) {
        this.A0B.getBackground().setAlpha(i);
        this.A0C.setAlpha(i);
    }

    public final void A06() {
        C170777jU c170777jU = this.A0B;
        c170777jU.clearAnimation();
        this.A0C.stop();
        c170777jU.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.A06 - this.A02);
        this.A02 = c170777jU.getTop();
    }

    public final void A07(float f) {
        setTargetOffsetTopAndBottom((this.A04 + ((int) ((this.A06 - r1) * f))) - this.A0B.getTop());
    }

    public final void A08(int i, int i2) {
        this.A06 = i;
        this.A07 = i2;
        this.A0H = true;
        A06();
        this.A0G = false;
    }

    public final void A09(Animation.AnimationListener animationListener) {
        C66349UAw c66349UAw = new C66349UAw(this);
        this.A0Q = c66349UAw;
        c66349UAw.setDuration(150L);
        C170777jU c170777jU = this.A0B;
        c170777jU.A01 = animationListener;
        c170777jU.clearAnimation();
        c170777jU.startAnimation(this.A0Q);
    }

    public boolean A0A() {
        InterfaceC43398JFn interfaceC43398JFn = this.A0D;
        if (interfaceC43398JFn != null) {
            return interfaceC43398JFn.AFV(this.A0O, this);
        }
        View view = this.A0O;
        if (view instanceof ListView) {
            return ((AbsListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // X.InterfaceC17990uc
    public final void DVE(View view, int[] iArr, int i, int i2, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // X.InterfaceC12520kw
    public final void DVG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (i5 == 0) {
            int i7 = iArr[1];
            int[] iArr2 = this.A0a;
            C03I.A00(this.A0X, iArr2, iArr, i, i2, i3, i4, 0);
            int i8 = i4 - (iArr[1] - i7);
            if (i8 == 0) {
                i6 = i4 + iArr2[1];
            } else {
                i6 = i8;
            }
            if (i6 < 0 && !A0A()) {
                float abs = this.A0L + Math.abs(i6);
                this.A0L = abs;
                A03(abs);
                iArr[1] = iArr[1] + i8;
            }
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVH(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.InterfaceC17990uc
    public final boolean Do4(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // X.InterfaceC17990uc
    public final void Dow(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0X.A04(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0X.A03(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0X.A07(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0X.A06(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.A0M;
        if (i3 >= 0) {
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0Y;
        return c03k.A01 | c03k.A00;
    }

    public int getProgressCircleDiameter() {
        return this.A01;
    }

    public int getProgressViewEndOffset() {
        return this.A07;
    }

    public int getProgressViewStartOffset() {
        return this.A06;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.A0X.A01 == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.A0X.A02;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0X.A03(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0Y.A01 = i;
        startNestedScroll(i & 2);
        this.A0L = 0.0f;
        this.A0T = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.A00);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.A0Y.A01 = 0;
        this.A0T = false;
        float f = this.A0L;
        if (f > 0.0f) {
            A02(f);
            this.A0L = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.A0O;
        if (view != null && !view.isNestedScrollingEnabled()) {
            if (!this.A0R && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        C170777jU c170777jU = this.A0B;
        c170777jU.setScaleX(f);
        c170777jU.setScaleY(f);
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.A0R = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.A0X.A02(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC43398JFn interfaceC43398JFn) {
        this.A0D = interfaceC43398JFn;
    }

    public void setOnRefreshListener(InterfaceC60212p4 interfaceC60212p4) {
        this.A0E = interfaceC60212p4;
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.A0B.setBackgroundColor(i);
    }

    public void setSize(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = 40.0f;
        if (i == 0) {
            f = 56.0f;
        }
        this.A01 = (int) (displayMetrics.density * f);
        C170777jU c170777jU = this.A0B;
        c170777jU.setImageDrawable(null);
        C170797jW c170797jW = this.A0C;
        c170797jW.A01(i);
        c170777jU.setImageDrawable(c170797jW);
    }

    public void setSlingshotDistance(int i) {
        this.A03 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C170777jU c170777jU = this.A0B;
        c170777jU.bringToFront();
        c170777jU.offsetTopAndBottom(i);
        this.A02 = c170777jU.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.A0X.A05(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.A0X.A01(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(1403626149);
        super.onDetachedFromWindow();
        A06();
        C0f9.A0D(-928074462, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        A01();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !A0A() && !this.A0G && !this.A0T) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.A00) {
                                    int i = 0;
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    this.A00 = motionEvent.getPointerId(i);
                                }
                            }
                        }
                    } else {
                        int i2 = this.A00;
                        if (i2 == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex >= 0) {
                            A04(motionEvent.getY(findPointerIndex));
                        }
                    }
                    return this.A0S;
                }
                this.A0S = false;
                this.A00 = -1;
                return this.A0S;
            }
            setTargetOffsetTopAndBottom(this.A06 - this.A0B.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.A00 = pointerId;
            this.A0S = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.A0I = motionEvent.getY(findPointerIndex2);
                return this.A0S;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.A0O == null) {
                A01();
            }
            View view = this.A0O;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                C170777jU c170777jU = this.A0B;
                int measuredWidth2 = c170777jU.getMeasuredWidth();
                int measuredHeight2 = c170777jU.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.A02;
                c170777jU.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0O == null) {
            A01();
        }
        View view = this.A0O;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            C170777jU c170777jU = this.A0B;
            c170777jU.measure(View.MeasureSpec.makeMeasureSpec(this.A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(this.A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            this.A0M = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == c170777jU) {
                    this.A0M = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.A0G);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.A0G && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int actionIndex;
        int A05 = C0f9.A05(-1478828141);
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !A0A() && !this.A0G && !this.A0T) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6) {
                                    int actionIndex2 = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex2) == this.A00) {
                                        actionIndex = 0;
                                        if (actionIndex2 == 0) {
                                            actionIndex = 1;
                                        }
                                    }
                                }
                            } else {
                                actionIndex = motionEvent.getActionIndex();
                                if (actionIndex < 0) {
                                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    i = -1429100633;
                                }
                            }
                            this.A00 = motionEvent.getPointerId(actionIndex);
                        } else {
                            i = 1282040054;
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.A00);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            i = 461041156;
                        } else {
                            float y = motionEvent.getY(findPointerIndex);
                            A04(y);
                            if (this.A0S) {
                                float f = (y - this.A0J) * 0.5f;
                                if (f > 0.0f) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                    A03(f);
                                } else {
                                    i = -1901394204;
                                }
                            }
                        }
                    }
                } else {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.A00);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        i = 1834935125;
                    } else {
                        if (this.A0S) {
                            float y2 = (motionEvent.getY(findPointerIndex2) - this.A0J) * 0.5f;
                            this.A0S = false;
                            A02(y2);
                        }
                        this.A00 = -1;
                        i = 586354475;
                    }
                }
            } else {
                this.A00 = motionEvent.getPointerId(0);
                this.A0S = false;
            }
            C0f9.A0C(1011597257, A05);
            return true;
        }
        i = -1211853393;
        C0f9.A0C(i, A05);
        return false;
    }

    public void setColorSchemeColors(int... iArr) {
        A01();
        this.A0C.A05(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            A06();
        }
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, X.03K] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.7jU, android.widget.ImageView, android.view.View] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0G = false;
        this.A0K = -1.0f;
        this.A0b = new int[2];
        this.A0a = new int[2];
        this.A0Z = new int[2];
        this.A00 = -1;
        this.A0M = -1;
        this.A0P = new Animation.AnimationListener() { // from class: X.7jR
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                InterfaceC60212p4 interfaceC60212p4;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (swipeRefreshLayout.A0G) {
                    C170797jW c170797jW = swipeRefreshLayout.A0C;
                    c170797jW.setAlpha(255);
                    c170797jW.start();
                    if (swipeRefreshLayout.A0F && (interfaceC60212p4 = swipeRefreshLayout.A0E) != null) {
                        interfaceC60212p4.DeM();
                    }
                    swipeRefreshLayout.A02 = swipeRefreshLayout.A0B.getTop();
                    return;
                }
                swipeRefreshLayout.A06();
            }
        };
        this.A0U = new Animation() { // from class: X.7jS
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                boolean z = swipeRefreshLayout.A0H;
                int i = swipeRefreshLayout.A07;
                if (!z) {
                    i -= Math.abs(swipeRefreshLayout.A06);
                }
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.A04 + ((int) ((i - r1) * f))) - swipeRefreshLayout.A0B.getTop());
                C170797jW c170797jW = swipeRefreshLayout.A0C;
                float f2 = 1.0f - f;
                C170807jX c170807jX = c170797jW.A05;
                if (f2 != c170807jX.A00) {
                    c170807jX.A00 = f2;
                }
                c170797jW.invalidateSelf();
            }
        };
        this.A0V = new Animation() { // from class: X.7jT
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.A07(f);
            }
        };
        this.A0N = ViewConfiguration.get(context).getScaledTouchSlop();
        Resources resources = getResources();
        this.A05 = resources.getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.A0W = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.A01 = (int) (displayMetrics.density * 40.0f);
        Context context2 = getContext();
        ?? imageView = new ImageView(context2);
        Context context3 = imageView.getContext();
        float f = context3.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(AbstractC170787jV.A00);
        imageView.A00 = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        imageView.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(imageView.A00);
        imageView.setBackground(shapeDrawable);
        this.A0B = imageView;
        C170797jW c170797jW = new C170797jW(context2);
        this.A0C = c170797jW;
        c170797jW.A01(1);
        this.A0B.setImageDrawable(this.A0C);
        this.A0B.setVisibility(8);
        addView(this.A0B);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.A07 = i;
        this.A0K = i;
        this.A0Y = new Object();
        this.A0X = new C03I(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.A01;
        this.A02 = i2;
        this.A06 = i2;
        A07(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, A0c);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }
}
