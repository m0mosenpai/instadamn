package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UC8 extends HorizontalScrollView implements X9K, ViewGroup.OnHierarchyChangeListener, XD4, XC5, XC6, XD6, InterfaceC65658Tqk, View.OnLayoutChangeListener {
    public static Field A0a;
    public static boolean A0b;
    public int A00;
    public int A01;
    public int A02;
    public EnumC61122Rfc A03;
    public InterfaceC65225TgH A04;
    public Runnable A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public long A0K;
    public Rect A0L;
    public Drawable A0M;
    public View A0N;
    public C70461WWy A0O;
    public Integer A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final ValueAnimator A0T;
    public final Rect A0U;
    public final OverScroller A0V;
    public final C69327VlZ A0W;
    public final Rect A0X;
    public final C69604Vs7 A0Y;
    public final C69565VrU A0Z;

    private int A00(int i, int i2, int i3, int i4) {
        int i5;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    i5 = i4 - i3;
                } else {
                    throw AbstractC31175DnJ.A0U("Invalid SnapToAlignment value: ", this.A02);
                }
            } else {
                i5 = (i4 - i3) / 2;
            }
            return i2 - i5;
        }
        return i2;
    }

    public static HorizontalScrollView A01(MotionEvent motionEvent, View view, boolean z) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z && (view instanceof HorizontalScrollView) && view.isNestedScrollingEnabled() && (view instanceof UC8) && ((UC8) view).A0C) {
            return (HorizontalScrollView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            HorizontalScrollView A01 = A01(motionEvent, viewGroup.getChildAt(i), false);
            if (A01 != null) {
                return A01;
            }
            i++;
        }
    }

    private void A04(int i, int i2) {
        ValueAnimator valueAnimator = this.A0T;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        OverScroller overScroller = this.A0V;
        if (overScroller != null && !overScroller.isFinished()) {
            int currX = overScroller.getCurrX();
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            overScroller.forceFinished(true);
            if (computeScrollOffset) {
                overScroller.fling(i, getScrollY(), (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalX() - overScroller.getStartX())), 0, 0, i2, 0, 0);
                return;
            }
            scrollTo(i + (overScroller.getCurrX() - currX), getScrollY());
        }
    }

    private void A05(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getWidth() != 0 && childAt.getHeight() != 0) {
            this.A0I = -1;
            this.A0J = -1;
        } else {
            this.A0I = i;
            this.A0J = i2;
        }
    }

    private View getContentView() {
        return getChildAt(0);
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        int i2 = i;
        if (Build.VERSION.SDK_INT == 28) {
            i2 = (int) (Math.abs(i) * Math.signum(this.A0Y.A00));
        }
        if (this.A0B) {
            A06(this, i2);
        } else {
            OverScroller overScroller = this.A0V;
            if (overScroller != null) {
                overScroller.fling(getScrollX(), getScrollY(), i2, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - getPaddingStart()) - getPaddingEnd()) / 2, 0);
                postInvalidateOnAnimation();
            } else {
                super.fling(i2);
            }
        }
        A03(i2, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OverScroller overScroller;
        int i5 = this.A0H;
        if (i5 != Integer.MIN_VALUE && (overScroller = this.A0V) != null && i5 != overScroller.getFinalX() && !overScroller.isFinished()) {
            overScroller.startScroll(this.A0H, overScroller.getFinalY(), 0, 0);
            overScroller.forceFinished(true);
            this.A0H = Integer.MIN_VALUE;
        }
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getWidth() != 0 && childAt.getHeight() != 0) {
            int i6 = this.A0I;
            if (i6 == -1) {
                i6 = getScrollX();
            }
            int i7 = this.A0J;
            if (i7 == -1) {
                i7 = getScrollY();
            }
            scrollTo(i6, i7);
        }
        Iterator it = C70196WGa.A02.iterator();
        while (it.hasNext()) {
            ((Reference) it.next()).get();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int max;
        OverScroller overScroller = this.A0V;
        if (overScroller != null && !overScroller.isFinished() && overScroller.getCurrX() != overScroller.getFinalX() && i >= (max = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            overScroller.abortAnimation();
            i = max;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactHorizontalScrollView.onScrollChanged", 1254891160);
        try {
            super.onScrollChanged(i, i2, i3, i4);
            this.A07 = true;
            C69604Vs7 c69604Vs7 = this.A0Y;
            if (c69604Vs7.A00(i, i2)) {
                if (this.A0S) {
                    FAW();
                }
                if (this.A0R) {
                    i5 = -452198833;
                    C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i5);
                }
                this.A0R = true;
                float f = c69604Vs7.A00;
                float f2 = c69604Vs7.A01;
                boolean z = C70196WGa.A01;
                C70196WGa.A06(this, getScrollX(), getScrollY());
                C70196WGa.A07(this, C05F.A0C, f, f2);
                this.A0R = false;
            }
            i5 = -1815570570;
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i5);
        } catch (Throwable th) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 592338599);
            throw th;
        }
    }

    public void setBorderRadius(float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, WF1.A00(f));
        }
        C63403SjY.A08(this, c63011Saa, VDC.values()[0]);
    }

    private void A03(int i, int i2) {
        if (this.A05 == null) {
            if (this.A0D) {
                C70196WGa.A07(this, C05F.A0N, i, i2);
            }
            this.A07 = false;
            RunnableC71538Wvn runnableC71538Wvn = new RunnableC71538Wvn(this);
            this.A05 = runnableC71538Wvn;
            postOnAnimationDelayed(runnableC71538Wvn, 20L);
        }
    }

    public static void A06(UC8 uc8, int i) {
        int i2;
        int floor;
        int ceil;
        int i3;
        int i4;
        int i5;
        int min;
        int i6;
        int i7 = i;
        if (uc8.getChildCount() > 0) {
            if (uc8.A01 == 0 && uc8.A06 == null && uc8.A02 == 0) {
                double snapInterval = uc8.getSnapInterval();
                double A00 = C70196WGa.A00(uc8, uc8.getScrollX(), uc8.A0W.A04.x, i7);
                double d = C70196WGa.A03(uc8, i7, 0, Math.max(0, uc8.computeHorizontalScrollRange() - uc8.getWidth()), 0).x;
                double d2 = A00 / snapInterval;
                int floor2 = (int) Math.floor(d2);
                int ceil2 = (int) Math.ceil(d2);
                int round = (int) Math.round(d2);
                int round2 = (int) Math.round(d / snapInterval);
                if (i > 0) {
                    if (ceil2 == floor2) {
                        ceil2++;
                    }
                    if (round < ceil2 && round2 > floor2) {
                        round = ceil2;
                    }
                } else if (i < 0) {
                    if (floor2 == ceil2) {
                        floor2--;
                    }
                    if (round > floor2 && round2 < ceil2) {
                        round = floor2;
                    }
                }
                double d3 = round * snapInterval;
                if (d3 != A00) {
                    uc8.A07 = true;
                    min = (int) d3;
                } else {
                    return;
                }
            } else {
                int max = Math.max(0, uc8.computeHorizontalScrollRange() - uc8.getWidth());
                int i8 = C70196WGa.A03(uc8, i7, 0, Math.max(0, uc8.computeHorizontalScrollRange() - uc8.getWidth()), 0).x;
                if (uc8.A08) {
                    i8 = uc8.getScrollX();
                }
                int width = (uc8.getWidth() - uc8.getPaddingStart()) - uc8.getPaddingEnd();
                if (C62856SUd.A00.setAndroidLayoutDirection()) {
                    i2 = uc8.getLayoutDirection();
                } else {
                    i2 = uc8.A0W.A03;
                }
                if (i2 == 1) {
                    i8 = max - i8;
                    i7 = -i7;
                }
                List list = uc8.A06;
                if (list != null && !list.isEmpty()) {
                    i5 = AbstractC31176DnK.A01(uc8.A06, 0);
                    List list2 = uc8.A06;
                    i4 = AbstractC31176DnK.A01(list2, list2.size() - 1);
                    i3 = max;
                    floor = 0;
                    for (int i9 = 0; i9 < uc8.A06.size(); i9++) {
                        int A01 = AbstractC31176DnK.A01(uc8.A06, i9);
                        if (A01 <= i8 && i8 - A01 < i8 - floor) {
                            floor = A01;
                        }
                        if (A01 >= i8 && A01 - i8 < i3 - i8) {
                            i3 = A01;
                        }
                    }
                } else {
                    int i10 = uc8.A02;
                    if (i10 != 0) {
                        int i11 = uc8.A01;
                        if (i11 > 0) {
                            double d4 = i11;
                            double d5 = i8 / d4;
                            floor = Math.max(uc8.A00(i10, (int) (Math.floor(d5) * d4), i11, width), 0);
                            ceil = uc8.A00(i10, (int) (Math.ceil(d5) * d4), i11, width);
                        } else {
                            ViewGroup viewGroup = (ViewGroup) uc8.getChildAt(0);
                            int i12 = max;
                            int i13 = max;
                            int i14 = 0;
                            int i15 = 0;
                            for (int i16 = 0; i16 < viewGroup.getChildCount(); i16++) {
                                View childAt = viewGroup.getChildAt(i16);
                                int A002 = uc8.A00(uc8.A02, childAt.getLeft(), childAt.getWidth(), width);
                                if (A002 <= i8 && i8 - A002 < i8 - i14) {
                                    i14 = A002;
                                }
                                if (A002 >= i8 && A002 - i8 < i13 - i8) {
                                    i13 = A002;
                                }
                                i12 = Math.min(i12, A002);
                                i15 = Math.max(i15, A002);
                            }
                            floor = Math.max(i14, i12);
                            i3 = Math.min(i13, i15);
                            i4 = max;
                            i5 = 0;
                        }
                    } else {
                        double snapInterval2 = uc8.getSnapInterval();
                        double d6 = i8 / snapInterval2;
                        floor = (int) (Math.floor(d6) * snapInterval2);
                        ceil = (int) (Math.ceil(d6) * snapInterval2);
                    }
                    i3 = Math.min(ceil, max);
                    i4 = max;
                    i5 = 0;
                }
                int i17 = i8 - floor;
                int i18 = i3 - i8;
                int i19 = i3;
                if (Math.abs(i17) < Math.abs(i18)) {
                    i19 = floor;
                }
                int scrollX = uc8.getScrollX();
                if (i2 == 1) {
                    scrollX = max - scrollX;
                }
                if (!uc8.A0E && i8 >= i4) {
                    if (scrollX < i4) {
                        i8 = i4;
                    }
                } else if (!uc8.A0F && i8 <= i5) {
                    if (scrollX > i5) {
                        i8 = i5;
                    }
                } else if (i7 > 0) {
                    i7 += (int) (i18 * 10.0d);
                    i8 = i3;
                } else if (i7 < 0) {
                    i7 -= (int) (i17 * 10.0d);
                    i8 = floor;
                } else {
                    i8 = i19;
                }
                min = Math.min(Math.max(0, i8), max);
                if (i2 == 1) {
                    min = max - min;
                    i7 = -i7;
                }
                OverScroller overScroller = uc8.A0V;
                if (overScroller != null) {
                    uc8.A07 = true;
                    int scrollX2 = uc8.getScrollX();
                    int scrollY = uc8.getScrollY();
                    if (i7 == 0) {
                        i7 = min - uc8.getScrollX();
                    }
                    if (min != 0 && min != max) {
                        i6 = 0;
                    } else {
                        i6 = width / 2;
                    }
                    overScroller.fling(scrollX2, scrollY, i7, 0, min, min, 0, 0, i6, 0);
                    uc8.postInvalidateOnAnimation();
                    return;
                }
            }
            uc8.E7j(min, uc8.getScrollY());
        }
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A0b) {
            A0b = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                A0a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                C0I2.A04("ReactHorizontalScrollView", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = A0a;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            C0I2.A04("ReactHorizontalScrollView", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.A01;
        if (i == 0) {
            return getWidth();
        }
        return i;
    }

    public final boolean A08(View view) {
        Rect rect = this.A0U;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        view.getDrawingRect(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0 && Math.abs(computeScrollDeltaToGetChildRectOnScreen) < rect.width()) {
            return true;
        }
        return false;
    }

    @Override // X.XD4
    public final void AoA(Rect rect) {
        Rect rect2 = this.A0L;
        AbstractC05810Sj.A00(rect2);
        rect.set(rect2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.OverScroller, X.UCl] */
    @Override // X.XC5
    public final void EnL(int i, int i2) {
        ValueAnimator valueAnimator = this.A0T;
        valueAnimator.cancel();
        Context context = getContext();
        if (!C70196WGa.A01) {
            C70196WGa.A01 = true;
            try {
                ?? overScroller = new OverScroller(context);
                overScroller.A00 = C8S8.DEFAULT_SWIPE_ANIMATION_DURATION;
                C70196WGa.A00 = overScroller.A00();
            } catch (Throwable unused) {
            }
        }
        valueAnimator.setDuration(C70196WGa.A00).setIntValues(i, i2);
        valueAnimator.start();
    }

    @Override // X.XD4
    public final void FAW() {
        if (this.A0S) {
            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactHorizontalScrollView.updateClippingRect", -578481312);
            try {
                AbstractC05810Sj.A00(this.A0L);
                W8K.A00(this, this.A0L);
                KeyEvent.Callback childAt = getChildAt(0);
                if (childAt instanceof XD4) {
                    ((XD4) childAt).FAW();
                }
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1195835993);
            } catch (Throwable th) {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 623418389);
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (this.A0B && !this.A0Q) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            super.addFocusables(arrayList2, i, i2);
            Iterator<View> it = arrayList2.iterator();
            while (it.hasNext()) {
                View next = it.next();
                Rect rect = this.A0U;
                next.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(next, rect);
                if (computeScrollDeltaToGetChildRectOnScreen(rect) == 0 || A08(next) || next.isFocused()) {
                    arrayList.add(next);
                }
            }
            return;
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean arrowScroll(int i) {
        if (this.A0B) {
            boolean z = true;
            this.A0Q = true;
            if (getChildCount() > 0) {
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
                View childAt = getChildAt(0);
                if (childAt != null && findNextFocus != null && findNextFocus.getParent() == childAt) {
                    Rect rect = this.A0U;
                    findNextFocus.getDrawingRect(rect);
                    offsetDescendantRectToMyCoords(findNextFocus, rect);
                    if (computeScrollDeltaToGetChildRectOnScreen(rect) != 0) {
                        findNextFocus.getDrawingRect(rect);
                        offsetDescendantRectToMyCoords(findNextFocus, rect);
                        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
                        findNextFocus.getDrawingRect(rect);
                        if (computeScrollDeltaToGetChildRectOnScreen == 0 || Math.abs(computeScrollDeltaToGetChildRectOnScreen) >= rect.width() / 2) {
                            A02(i);
                        }
                    }
                    findNextFocus.requestFocus();
                } else {
                    A02(i);
                }
            } else {
                z = false;
            }
            this.A0Q = false;
            return z;
        }
        return super.arrowScroll(i);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A0C && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C63234Sfm.A02(this.A03)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // X.XC5
    public ValueAnimator getFlingAnimator() {
        return this.A0T;
    }

    @Override // X.XD6
    public long getLastScrollDispatchTime() {
        return this.A0K;
    }

    @Override // X.InterfaceC65360Tio
    public String getOverflow() {
        int intValue = this.A0P.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 0) {
                    return null;
                }
                return "visible";
            }
            return "scroll";
        }
        return "hidden";
    }

    @Override // X.InterfaceC65658Tqk
    public Rect getOverflowInset() {
        return this.A0X;
    }

    public EnumC61122Rfc getPointerEvents() {
        return this.A03;
    }

    @Override // X.X9K
    public C69327VlZ getReactScrollViewScrollState() {
        return this.A0W;
    }

    @Override // X.XD4
    public boolean getRemoveClippedSubviews() {
        return this.A0S;
    }

    public boolean getScrollEnabled() {
        return this.A0C;
    }

    @Override // X.XD6
    public int getScrollEventThrottle() {
        return this.A00;
    }

    public InterfaceC65225TgH getStateWrapper() {
        return null;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.A0N = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.A0N;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.A0N = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A0P != C05F.A00) {
            C63403SjY.A03(canvas, this);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0C && (motionEvent.getAction() != 0 || A01(motionEvent, this, true) == null)) {
            if (!C63234Sfm.A02(this.A03)) {
                return true;
            }
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    XC4 A00 = C69828VwE.A00(this);
                    if (A00 != null) {
                        A00.D35(motionEvent, this);
                    }
                    C70196WGa.A07(this, C05F.A00, 0.0f, 0.0f);
                    this.A09 = true;
                    this.A0T.cancel();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                C0I2.A06("ReactNative", "Error intercepting touch event.", e);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (this.A0N != null) {
            if (C62856SUd.A00.setAndroidLayoutDirection()) {
                i9 = view.getLayoutDirection();
            } else {
                i9 = this.A0W.A03;
            }
            if (i9 == 1) {
                ValueAnimator valueAnimator = this.A0T;
                if (valueAnimator.isRunning()) {
                    valueAnimator.end();
                }
                int i10 = i3 - i;
                int scrollX = i10 - (i7 - getScrollX());
                scrollTo(scrollX, getScrollY());
                A04(scrollX, i10 - getWidth());
                return;
            }
            C70461WWy c70461WWy = this.A0O;
            if (c70461WWy == null) {
                return;
            }
            c70461WWy.A02();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.A0B) {
            Rect rect = this.A0U;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(computeScrollDeltaToGetChildRectOnScreen, 0);
            }
        }
        super.requestChildFocus(view, view2);
    }

    public void setBorderStyle(String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(this, A00);
    }

    public void setDecelerationRate(float f) {
        this.A0W.A00 = f;
        OverScroller overScroller = this.A0V;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.A0G) {
            this.A0G = i;
            this.A0M = new ColorDrawable(i);
        }
    }

    public void setMaintainVisibleContentPosition(C68915VeF c68915VeF) {
        C70461WWy c70461WWy = this.A0O;
        if (c68915VeF != null) {
            if (c70461WWy == null) {
                C70461WWy c70461WWy2 = new C70461WWy(this, true);
                this.A0O = c70461WWy2;
                c70461WWy2.A00();
            }
        } else if (c70461WWy != null) {
            c70461WWy.A01();
            this.A0O = null;
        }
        C70461WWy c70461WWy3 = this.A0O;
        if (c70461WWy3 != null) {
            c70461WWy3.A01 = c68915VeF;
        }
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C69830VwG.A00(str)) == null) {
            num = C05F.A0C;
        }
        this.A0P = num;
        invalidate();
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.A0L == null) {
            this.A0L = new Rect();
        }
        this.A0S = z;
        FAW();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VrU] */
    public UC8(Context context) {
        super(context);
        this.A0H = Integer.MIN_VALUE;
        this.A0Y = new C69604Vs7();
        this.A0Z = new Object();
        this.A0X = new Rect();
        this.A0P = C05F.A0C;
        this.A0B = false;
        this.A0C = true;
        this.A0R = false;
        this.A0A = false;
        this.A0G = 0;
        this.A08 = false;
        this.A01 = 0;
        this.A0F = true;
        this.A0E = true;
        this.A02 = 0;
        this.A0Q = false;
        this.A0I = -1;
        this.A0J = -1;
        this.A04 = null;
        this.A0T = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.A03 = EnumC61122Rfc.A02;
        this.A0K = 0L;
        this.A00 = 0;
        this.A0U = new Rect();
        AbstractC010103p.A0B(this, new C02V());
        this.A0V = getOverScrollerFromParent();
        this.A0W = new C69327VlZ(I18nUtil.A00.A01(context) ? 1 : 0);
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
    }

    private void A02(int i) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i2 + 1;
        if (i == 17) {
            i3 = i2 - 1;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        E7j(i3 * width, getScrollY());
        A03(0, 0);
    }

    public final void A07() {
        awakenScrollBars();
    }

    @Override // X.XC6
    public final void E7j(int i, int i2) {
        C70196WGa.A05(this, i, i2);
        A05(i, i2);
    }

    @Override // X.XC6
    public final void EMR(int i, int i2) {
        scrollTo(i, i2);
        A04(i, Integer.MAX_VALUE);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-1650577479);
        if (this.A0G != 0) {
            View childAt = getChildAt(0);
            if (this.A0M != null && childAt != null && childAt.getRight() < getWidth()) {
                this.A0M.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.A0M.draw(canvas);
            }
        }
        super.draw(canvas);
        C0f9.A0A(237597778, A03);
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!this.A0C && (keyCode == 21 || keyCode == 22)) {
            return false;
        }
        return super.executeKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-818833530);
        super.onAttachedToWindow();
        if (this.A0S) {
            FAW();
        }
        C70461WWy c70461WWy = this.A0O;
        if (c70461WWy != null) {
            c70461WWy.A00();
        }
        C0f9.A0D(-1295617610, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(478189445);
        super.onDetachedFromWindow();
        C70461WWy c70461WWy = this.A0O;
        if (c70461WWy != null) {
            c70461WWy.A01();
        }
        C0f9.A0D(-725173107, A06);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OverScroller overScroller;
        C69827VwD.A00(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean A1S = MSY.A1S(getMeasuredHeight(), size2);
        setMeasuredDimension(size, size2);
        if (A1S && (overScroller = this.A0V) != null) {
            this.A0H = overScroller.getCurrX();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(40050644);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A0S) {
            FAW();
        }
        C0f9.A0D(-2071627398, A06);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        int i;
        int A05 = C0f9.A05(-1057741643);
        if (!this.A0C) {
            i = 1008481836;
        } else if (!C63234Sfm.A01(this.A03)) {
            i = 380229871;
        } else {
            C69565VrU c69565VrU = this.A0Z;
            c69565VrU.A00(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                if (this.A09) {
                    C70196WGa.A04(this);
                    float f = c69565VrU.A00;
                    float f2 = c69565VrU.A01;
                    C70196WGa.A07(this, C05F.A01, f, f2);
                    XC4 A00 = C69828VwE.A00(this);
                    if (A00 != null) {
                        A00.D30(motionEvent, this);
                    }
                    this.A09 = false;
                    A03(Math.round(f), Math.round(f2));
                }
            } else if (actionMasked == 0 && (runnable = this.A05) != null) {
                removeCallbacks(runnable);
                this.A05 = null;
                this.A0T.cancel();
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            C0f9.A0C(2083609279, A05);
            return onTouchEvent;
        }
        C0f9.A0C(i, A05);
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean pageScroll(int i) {
        boolean pageScroll = super.pageScroll(i);
        if (this.A0B && pageScroll) {
            A03(0, 0);
        }
        return pageScroll;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        C70196WGa.A04(this);
        A05(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        C63403SjY.A0B(this, Integer.valueOf(i));
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.A08 = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.A0A = z;
    }

    @Override // X.XD6
    public void setLastScrollDispatchTime(long j) {
        this.A0K = j;
    }

    public void setPagingEnabled(boolean z) {
        this.A0B = z;
    }

    public void setPointerEvents(EnumC61122Rfc enumC61122Rfc) {
        this.A03 = enumC61122Rfc;
    }

    public void setScrollEnabled(boolean z) {
        this.A0C = z;
    }

    public void setScrollEventThrottle(int i) {
        this.A00 = i;
    }

    public void setScrollPerfTag(String str) {
    }

    public void setSendMomentumEvents(boolean z) {
        this.A0D = z;
    }

    public void setSnapInterval(int i) {
        this.A01 = i;
    }

    public void setSnapOffsets(List list) {
        this.A06 = list;
    }

    public void setSnapToAlignment(int i) {
        this.A02 = i;
    }

    public void setSnapToEnd(boolean z) {
        this.A0E = z;
    }

    public void setSnapToStart(boolean z) {
        this.A0F = z;
    }

    public void setStateWrapper(InterfaceC65225TgH interfaceC65225TgH) {
        this.A04 = interfaceC65225TgH;
    }
}
