package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.ReadableMap;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UCw extends ScrollView implements X9K, ViewGroup.OnHierarchyChangeListener, XD4, XC5, XC6, XD6, InterfaceC65658Tqk, View.OnLayoutChangeListener {
    public static Field A0Z;
    public static boolean A0a;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public EnumC61122Rfc A05;
    public InterfaceC65225TgH A06;
    public Runnable A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public long A0J;
    public Rect A0K;
    public Drawable A0L;
    public View A0M;
    public ReadableMap A0N;
    public C70461WWy A0O;
    public Integer A0P;
    public boolean A0Q;
    public boolean A0R;
    public final ValueAnimator A0S;
    public final Rect A0T;
    public final OverScroller A0U;
    public final C69604Vs7 A0V;
    public final C69327VlZ A0W;
    public final Rect A0X;
    public final C69565VrU A0Y;

    private boolean A02() {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getWidth() != 0 && childAt.getHeight() != 0) {
            return true;
        }
        return false;
    }

    private View getContentView() {
        return getChildAt(0);
    }

    @Override // X.XC6
    public final void EMR(int i, int i2) {
        scrollTo(i, i2);
        ValueAnimator valueAnimator = this.A0S;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        OverScroller overScroller = this.A0U;
        if (overScroller != null && !overScroller.isFinished()) {
            int currY = overScroller.getCurrY();
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            overScroller.forceFinished(true);
            if (computeScrollOffset) {
                overScroller.fling(getScrollX(), i2, 0, (int) (overScroller.getCurrVelocity() * Math.signum(overScroller.getFinalY() - overScroller.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
                return;
            }
            scrollTo(getScrollX(), i2 + (overScroller.getCurrX() - currY));
        }
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        int i2 = i;
        if (Build.VERSION.SDK_INT == 28) {
            float signum = Math.signum(this.A0V.A01);
            if (signum == 0.0f) {
                signum = Math.signum(i);
            }
            i2 = (int) (Math.abs(i) * signum);
        }
        if (this.A0D) {
            A01(this, i2);
        } else {
            OverScroller overScroller = this.A0U;
            if (overScroller != null) {
                overScroller.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, 0, Integer.MAX_VALUE, 0, (AbstractC65702TsY.A07(this) - getPaddingTop()) / 2);
                postInvalidateOnAnimation();
            } else {
                super.fling(i2);
            }
        }
        A00(0, i2);
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

    private void A00(int i, int i2) {
        if (this.A07 == null) {
            if (this.A0F) {
                C70196WGa.A07(this, C05F.A0N, i, i2);
            }
            this.A09 = false;
            RunnableC71539Wvo runnableC71539Wvo = new RunnableC71539Wvo(this);
            this.A07 = runnableC71539Wvo;
            postOnAnimationDelayed(runnableC71539Wvo, 20L);
        }
    }

    public static void A01(UCw uCw, int i) {
        int floor;
        int ceil;
        int i2;
        int i3;
        int i4;
        int top;
        int top2;
        int height;
        int i5;
        int i6 = i;
        if (uCw.getChildCount() > 0) {
            if (uCw.A01 == 0 && uCw.A08 == null && uCw.A02 == 0) {
                double snapInterval = uCw.getSnapInterval();
                double A00 = C70196WGa.A00(uCw, uCw.getScrollY(), uCw.A0W.A04.y, i6);
                double d = C70196WGa.A03(uCw, 0, i6, 0, uCw.getMaxScrollY()).y;
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
                    uCw.A09 = true;
                    uCw.E7j(uCw.getScrollX(), (int) d3);
                    return;
                }
                return;
            }
            int i7 = 0;
            int maxScrollY = uCw.getMaxScrollY();
            int i8 = C70196WGa.A03(uCw, 0, i6, 0, uCw.getMaxScrollY()).y;
            if (uCw.A0A) {
                i8 = uCw.getScrollY();
            }
            int A07 = AbstractC65702TsY.A07(uCw) - uCw.getPaddingTop();
            List list = uCw.A08;
            if (list != null) {
                i4 = AbstractC31176DnK.A01(list, 0);
                List list2 = uCw.A08;
                i3 = AbstractC31176DnK.A01(list2, list2.size() - 1);
                i2 = maxScrollY;
                floor = 0;
                for (int i9 = 0; i9 < uCw.A08.size(); i9++) {
                    int A01 = AbstractC31176DnK.A01(uCw.A08, i9);
                    if (A01 <= i8 && i8 - A01 < i8 - floor) {
                        floor = A01;
                    }
                    if (A01 >= i8 && A01 - i8 < i2 - i8) {
                        i2 = A01;
                    }
                }
            } else {
                int i10 = uCw.A02;
                if (i10 != 0) {
                    int i11 = uCw.A01;
                    if (i11 > 0) {
                        double d4 = i11;
                        double d5 = i8 / d4;
                        int floor3 = (int) (Math.floor(d5) * d4);
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    i5 = A07 - i11;
                                } else {
                                    throw AbstractC31175DnJ.A0U("Invalid SnapToAlignment value: ", i10);
                                }
                            } else {
                                i5 = (A07 - i11) / 2;
                            }
                            floor3 -= i5;
                        }
                        floor = Math.max(floor3, 0);
                        ceil = (int) (Math.ceil(d5) * d4);
                        if (i10 != 1) {
                            int i12 = A07 - i11;
                            if (i10 == 2) {
                                i12 /= 2;
                            }
                            ceil -= i12;
                        }
                    } else {
                        ViewGroup viewGroup = (ViewGroup) uCw.getChildAt(0);
                        int i13 = maxScrollY;
                        int i14 = maxScrollY;
                        int i15 = 0;
                        int i16 = 0;
                        for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                            View childAt = viewGroup.getChildAt(i17);
                            int i18 = uCw.A02;
                            if (i18 != 1) {
                                if (i18 != 2) {
                                    if (i18 == 3) {
                                        top2 = childAt.getTop();
                                        height = A07 - childAt.getHeight();
                                    } else {
                                        throw AbstractC31175DnJ.A0U("Invalid SnapToAlignment value: ", i18);
                                    }
                                } else {
                                    top2 = childAt.getTop();
                                    height = (A07 - childAt.getHeight()) / 2;
                                }
                                top = top2 - height;
                            } else {
                                top = childAt.getTop();
                            }
                            if (top <= i8 && i8 - top < i8 - i15) {
                                i15 = top;
                            }
                            if (top >= i8 && top - i8 < i14 - i8) {
                                i14 = top;
                            }
                            i13 = Math.min(i13, top);
                            i16 = Math.max(i16, top);
                        }
                        floor = Math.max(i15, i13);
                        i2 = Math.min(i14, i16);
                        i3 = maxScrollY;
                        i4 = 0;
                    }
                } else {
                    double snapInterval2 = uCw.getSnapInterval();
                    double d6 = i8 / snapInterval2;
                    floor = (int) (Math.floor(d6) * snapInterval2);
                    ceil = (int) (Math.ceil(d6) * snapInterval2);
                }
                i2 = Math.min(ceil, maxScrollY);
                i3 = maxScrollY;
                i4 = 0;
            }
            int i19 = i8 - floor;
            int i20 = i2 - i8;
            int i21 = i2;
            if (Math.abs(i19) < Math.abs(i20)) {
                i21 = floor;
            }
            if (!uCw.A0G && i8 >= i3) {
                if (uCw.getScrollY() < i3) {
                    i8 = i3;
                }
            } else if (!uCw.A0H && i8 <= i4) {
                if (uCw.getScrollY() > i4) {
                    i8 = i4;
                }
            } else if (i > 0) {
                i6 = i + ((int) (i20 * 10.0d));
                i8 = i2;
            } else if (i < 0) {
                i6 = i - ((int) (i19 * 10.0d));
                i8 = floor;
            } else {
                i6 = 0;
                i8 = i21;
            }
            int min = Math.min(Math.max(0, i8), maxScrollY);
            OverScroller overScroller = uCw.A0U;
            if (overScroller == null) {
                uCw.E7j(uCw.getScrollX(), min);
                return;
            }
            uCw.A09 = true;
            int scrollX = uCw.getScrollX();
            int scrollY = uCw.getScrollY();
            if (i6 == 0) {
                i6 = min - uCw.getScrollY();
            }
            if (min == 0 || min == maxScrollY) {
                i7 = A07 / 2;
            }
            overScroller.fling(scrollX, scrollY, 0, i6, 0, 0, min, min, 0, i7);
            uCw.postInvalidateOnAnimation();
        }
    }

    private int getMaxScrollY() {
        int height;
        View view = this.A0M;
        if (view == null) {
            height = 0;
        } else {
            height = view.getHeight();
        }
        return Math.max(0, height - (AbstractC65702TsY.A07(this) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A0a) {
            A0a = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                A0Z = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                C0I2.A04("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = A0Z;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            C0I2.A04("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.A01;
        if (i == 0) {
            return getHeight();
        }
        return i;
    }

    public final boolean A04(View view) {
        Rect rect = this.A0T;
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
        Rect rect2 = this.A0K;
        AbstractC05810Sj.A00(rect2);
        rect.set(rect2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.OverScroller, X.UCl] */
    @Override // X.XC5
    public final void EnL(int i, int i2) {
        ValueAnimator valueAnimator = this.A0S;
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
        if (this.A0R) {
            C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactScrollView.updateClippingRect", 1256216962);
            try {
                AbstractC05810Sj.A00(this.A0K);
                W8K.A00(this, this.A0K);
                KeyEvent.Callback childAt = getChildAt(0);
                if (childAt instanceof XD4) {
                    ((XD4) childAt).FAW();
                }
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1219061588);
            } catch (Throwable th) {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1284963853);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C63234Sfm.A02(this.A05)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // X.XC5
    public ValueAnimator getFlingAnimator() {
        return this.A0S;
    }

    @Override // X.XD6
    public long getLastScrollDispatchTime() {
        return this.A0J;
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
        return this.A05;
    }

    @Override // X.X9K
    public C69327VlZ getReactScrollViewScrollState() {
        return this.A0W;
    }

    @Override // X.XD4
    public boolean getRemoveClippedSubviews() {
        return this.A0R;
    }

    public boolean getScrollEnabled() {
        return this.A0E;
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
        this.A0M = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.A0M;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.A0M = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A0P != C05F.A00) {
            C63403SjY.A03(canvas, this);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0E) {
            if (!C63234Sfm.A02(this.A05)) {
                return true;
            }
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    C14360o3.A0B(motionEvent, 1);
                    XC4 A00 = C69828VwE.A00(this);
                    if (A00 != null) {
                        A00.D35(motionEvent, this);
                    }
                    C70196WGa.A07(this, C05F.A00, 0.0f, 0.0f);
                    this.A0B = true;
                    this.A0S.cancel();
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
        if (this.A0M != null) {
            C70461WWy c70461WWy = this.A0O;
            if (c70461WWy != null) {
                c70461WWy.A02();
            }
            if (isShown() && A02()) {
                int scrollY = getScrollY();
                int maxScrollY = getMaxScrollY();
                if (scrollY > maxScrollY) {
                    scrollTo(getScrollX(), maxScrollY);
                }
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.A0U;
        if (overScroller != null && this.A0M != null && !overScroller.isFinished() && overScroller.getCurrY() != overScroller.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            overScroller.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactScrollView.onScrollChanged", -968357496);
        try {
            super.onScrollChanged(i, i2, i3, i4);
            this.A09 = true;
            C69604Vs7 c69604Vs7 = this.A0V;
            if (c69604Vs7.A00(i, i2)) {
                if (this.A0R) {
                    FAW();
                }
                if (!this.A0Q) {
                    this.A0Q = true;
                    float f = c69604Vs7.A00;
                    float f2 = c69604Vs7.A01;
                    boolean z = C70196WGa.A01;
                    C70196WGa.A06(this, getScrollX(), getScrollY());
                    C70196WGa.A07(this, C05F.A0C, f, f2);
                    this.A0Q = false;
                } else {
                    i5 = -199250657;
                    C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i5);
                }
            }
            i5 = -585604467;
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, i5);
        } catch (Throwable th) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1515390765);
            throw th;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            Rect rect = new Rect();
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
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

    public void setContentOffset(ReadableMap readableMap) {
        double d;
        ReadableMap readableMap2 = this.A0N;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.A0N = readableMap;
            if (readableMap != null) {
                double d2 = 0.0d;
                if (readableMap.hasKey("x")) {
                    d = readableMap.getDouble("x");
                } else {
                    d = 0.0d;
                }
                if (readableMap.hasKey("y")) {
                    d2 = readableMap.getDouble("y");
                }
                scrollTo((int) WF1.A01((float) d), (int) WF1.A01((float) d2));
                return;
            }
            scrollTo(0, 0);
        }
    }

    public void setDecelerationRate(float f) {
        this.A0W.A00 = f;
        OverScroller overScroller = this.A0U;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.A0I) {
            this.A0I = i;
            this.A0L = new ColorDrawable(i);
        }
    }

    public void setMaintainVisibleContentPosition(C68915VeF c68915VeF) {
        C70461WWy c70461WWy = this.A0O;
        if (c68915VeF != null) {
            if (c70461WWy == null) {
                C70461WWy c70461WWy2 = new C70461WWy(this, false);
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
        if (z && this.A0K == null) {
            this.A0K = new Rect();
        }
        this.A0R = z;
        FAW();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.VrU] */
    public UCw(Context context) {
        super(context);
        this.A0V = new C69604Vs7();
        this.A0Y = new Object();
        this.A0T = new Rect();
        this.A0X = new Rect();
        this.A0P = C05F.A0C;
        this.A0D = false;
        this.A0E = true;
        this.A0Q = false;
        this.A0C = false;
        this.A0I = 0;
        this.A0A = false;
        this.A01 = 0;
        this.A0H = true;
        this.A0G = true;
        this.A02 = 0;
        this.A0N = null;
        this.A03 = -1;
        this.A04 = -1;
        this.A06 = null;
        this.A0W = new C69327VlZ(0);
        this.A0S = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.A05 = EnumC61122Rfc.A02;
        this.A0J = 0L;
        this.A00 = 0;
        this.A0O = null;
        this.A0U = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        AbstractC010103p.A0B(this, new C02V());
    }

    public final void A03() {
        awakenScrollBars();
    }

    @Override // X.XC6
    public final void E7j(int i, int i2) {
        C70196WGa.A05(this, i, i2);
        if (A02()) {
            this.A03 = -1;
            this.A04 = -1;
        } else {
            this.A03 = i;
            this.A04 = i2;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(739393162);
        if (this.A0I != 0) {
            View childAt = getChildAt(0);
            if (this.A0L != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.A0L.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.A0L.draw(canvas);
            }
        }
        super.draw(canvas);
        C0f9.A0A(360257451, A03);
    }

    @Override // android.widget.ScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!this.A0E && (keyCode == 19 || keyCode == 20)) {
            return false;
        }
        return super.executeKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(670490985);
        super.onAttachedToWindow();
        if (this.A0R) {
            FAW();
        }
        C70461WWy c70461WWy = this.A0O;
        if (c70461WWy != null) {
            c70461WWy.A00();
        }
        C0f9.A0D(1464318912, A06);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(566405053);
        super.onDetachedFromWindow();
        C70461WWy c70461WWy = this.A0O;
        if (c70461WWy != null) {
            c70461WWy.A01();
        }
        C0f9.A0D(890576182, A06);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (A02()) {
            int i5 = this.A03;
            if (i5 == -1) {
                i5 = getScrollX();
            }
            int i6 = this.A04;
            if (i6 == -1) {
                i6 = getScrollY();
            }
            scrollTo(i5, i6);
        }
        Iterator it = C70196WGa.A02.iterator();
        while (it.hasNext()) {
            ((Reference) it.next()).get();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C69827VwD.A00(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1625298251);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A0R) {
            FAW();
        }
        C0f9.A0D(1270583747, A06);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        int i;
        int A05 = C0f9.A05(1393234498);
        if (!this.A0E) {
            i = 631435889;
        } else if (!C63234Sfm.A01(this.A05)) {
            i = -1648213983;
        } else {
            C69565VrU c69565VrU = this.A0Y;
            c69565VrU.A00(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                if (this.A0B) {
                    C70196WGa.A04(this);
                    float f = c69565VrU.A00;
                    float f2 = c69565VrU.A01;
                    C70196WGa.A07(this, C05F.A01, f, f2);
                    XC4 A00 = C69828VwE.A00(this);
                    if (A00 != null) {
                        A00.D30(motionEvent, this);
                    }
                    this.A0B = false;
                    A00(Math.round(f), Math.round(f2));
                }
            } else if (actionMasked == 0 && (runnable = this.A07) != null) {
                removeCallbacks(runnable);
                this.A07 = null;
                this.A0S.cancel();
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            C0f9.A0C(-247293733, A05);
            return onTouchEvent;
        }
        C0f9.A0C(i, A05);
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        C70196WGa.A04(this);
        if (A02()) {
            this.A03 = -1;
            this.A04 = -1;
        } else {
            this.A03 = i;
            this.A04 = i2;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        C63403SjY.A0B(this, Integer.valueOf(i));
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.A0A = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.A0C = z;
    }

    @Override // X.XD6
    public void setLastScrollDispatchTime(long j) {
        this.A0J = j;
    }

    public void setPagingEnabled(boolean z) {
        this.A0D = z;
    }

    public void setPointerEvents(EnumC61122Rfc enumC61122Rfc) {
        this.A05 = enumC61122Rfc;
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i) {
        int childCount = getChildCount();
        boolean z = true;
        if (childCount > 1) {
            z = false;
        }
        AbstractC05810Sj.A03(z, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            int i2 = 0;
            do {
                getChildAt(i2).setTranslationY(i);
                i2++;
            } while (i2 < childCount);
            setPadding(0, 0, 0, i);
        }
        boolean z2 = C70196WGa.A01;
        if (getReactScrollViewScrollState().A03 == 1) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.getWidth();
            }
            getWidth();
        }
        setRemoveClippedSubviews(this.A0R);
    }

    public void setScrollEnabled(boolean z) {
        this.A0E = z;
    }

    public void setScrollEventThrottle(int i) {
        this.A00 = i;
    }

    public void setScrollPerfTag(String str) {
    }

    public void setSendMomentumEvents(boolean z) {
        this.A0F = z;
    }

    public void setSnapInterval(int i) {
        this.A01 = i;
    }

    public void setSnapOffsets(List list) {
        this.A08 = list;
    }

    public void setSnapToAlignment(int i) {
        this.A02 = i;
    }

    public void setSnapToEnd(boolean z) {
        this.A0G = z;
    }

    public void setSnapToStart(boolean z) {
        this.A0H = z;
    }

    public void setStateWrapper(InterfaceC65225TgH interfaceC65225TgH) {
        this.A06 = interfaceC65225TgH;
    }
}
