package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13880nE {
    public static Point A00;
    public static final int[] A02 = new int[2];
    public static final RectF A01 = new RectF();

    public static final float A00(Context context, float f) {
        C14360o3.A0B(context, 0);
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final float A01(Context context, float f) {
        C14360o3.A0B(context, 0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        C14360o3.A07(displayMetrics);
        return f / displayMetrics.density;
    }

    public static final float A02(Context context, float f) {
        C14360o3.A0B(context, 0);
        return f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static final float A03(Context context, float f) {
        C14360o3.A0B(context, 0);
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static final float A04(Context context, int i) {
        C14360o3.A0B(context, 0);
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final int A06(Context context) {
        C14360o3.A0B(context, 0);
        Point point = A00;
        if (point == null) {
            point = A0F(context);
            A00 = point;
        }
        C14360o3.A0A(point);
        return point.y;
    }

    public static final int A07(Context context) {
        C14360o3.A0B(context, 0);
        Point point = A00;
        if (point == null) {
            point = A0F(context);
            A00 = point;
        }
        C14360o3.A0A(point);
        return point.x;
    }

    public static final int A09(Context context) {
        C14360o3.A0B(context, 0);
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int A0A(Context context) {
        C14360o3.A0B(context, 0);
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final int A0C(View view) {
        C14360o3.A0B(view, 0);
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
    }

    public static final int A0D(View view) {
        C14360o3.A0B(view, 0);
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    public static final RectF A0G(View view) {
        C14360o3.A0B(view, 0);
        RectF rectF = new RectF();
        A0M(rectF, view);
        return rectF;
    }

    public static final SpannableString A0H(String str) {
        StyleSpan styleSpan = new StyleSpan(1);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(styleSpan, 0, str.length(), 0);
        return spannableString;
    }

    public static final DisplayMetrics A0I(Context context) {
        C14360o3.A0B(context, 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final String A0J(TextView textView) {
        C14360o3.A0B(textView, 0);
        return textView.getText().toString();
    }

    public static final void A0K(Activity activity) {
        IBinder windowToken;
        InputMethodManager inputMethodManager;
        C14360o3.A0B(activity, 0);
        Window window = activity.getWindow();
        if (window != null && (windowToken = window.getDecorView().getWindowToken()) != null) {
            Object systemService = activity.getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    public static final void A0L(Context context, View view, int i) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(view, 1);
        Drawable background = view.getBackground();
        if (background != null) {
            background.setColorFilter(context.getColor(i), PorterDuff.Mode.SRC_OVER);
        }
    }

    public static final void A0M(RectF rectF, View view) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(rectF, 1);
        int[] iArr = A02;
        view.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        rectF.set(f, f2, (view.getWidth() * view.getScaleX()) + f, (view.getHeight() * view.getScaleY()) + f2);
    }

    public static final void A0N(View view) {
        C14360o3.A0B(view, 0);
        Object systemService = view.getContext().getSystemService("input_method");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).toggleSoftInput(2, 1);
    }

    public static final void A0Q(View view) {
        C14360o3.A0B(view, 0);
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 0.0f;
            view.setLayoutParams(layoutParams2);
        }
    }

    public static final void A0R(View view) {
        C14360o3.A0B(view, 0);
        Object systemService = view.getContext().getSystemService("input_method");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 0);
    }

    public static final void A0S(final View view) {
        C14360o3.A0B(view, 0);
        view.postDelayed(new Runnable() { // from class: X.0nC
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13880nE.A0R(view);
            }
        }, 60L);
    }

    public static final void A0T(View view) {
        C14360o3.A0B(view, 0);
        A0w(view, false);
    }

    public static final void A0U(View view, int i) {
        C14360o3.A0B(view, 0);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void A0V(View view, int i) {
        C14360o3.A0B(view, 0);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void A0W(View view, int i) {
        C14360o3.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0X(View view, int i) {
        LinearLayout.LayoutParams layoutParams;
        C14360o3.A0B(view, 0);
        boolean z = view.getLayoutParams() instanceof FrameLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (z) {
            C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.gravity = i;
            layoutParams = layoutParams3;
        } else {
            if (!(layoutParams2 instanceof LinearLayout.LayoutParams)) {
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            C14360o3.A0C(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
            layoutParams5.gravity = i;
            layoutParams = layoutParams5;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void A0Y(View view, int i) {
        C14360o3.A0B(view, 0);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void A0Z(View view, int i) {
        C14360o3.A0B(view, 0);
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void A0a(View view, int i) {
        C14360o3.A0B(view, 0);
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void A0b(View view, int i) {
        C14360o3.A0B(view, 0);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void A0c(View view, int i) {
        C14360o3.A0B(view, 0);
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void A0d(View view, int i) {
        C14360o3.A0B(view, 0);
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void A0e(View view, int i) {
        C14360o3.A0B(view, 0);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void A0f(View view, int i) {
        C14360o3.A0B(view, 0);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void A0g(View view, int i) {
        C14360o3.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void A0h(View view, int i, int i2) {
        C14360o3.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final void A0i(View view, int i, int i2) {
        C14360o3.A0B(view, 0);
        view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static final void A0j(View view, int i, int i2) {
        C14360o3.A0B(view, 0);
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
    }

    public static final void A0k(View view, int i, int i2, int i3, int i4) {
        C14360o3.A0B(view, 0);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(i, i2, i3, i4);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void A0l(View view, int i, int i2, int i3, int i4) {
        C14360o3.A0B(view, 0);
        Context context = view.getContext();
        C14360o3.A0A(context);
        view.setPadding((int) A04(context, i), (int) A04(context, i2), (int) A04(context, i3), (int) A04(context, i4));
    }

    public static final void A0m(View view, int i, int i2, int i3, int i4) {
        C14360o3.A0B(view, 0);
        Resources resources = view.getResources();
        view.setPadding(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2), resources.getDimensionPixelSize(i3), resources.getDimensionPixelSize(i4));
    }

    public static final void A0n(final View view, final View view2) {
        C14360o3.A0B(view, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0n9
                public final Rect A00;
                public final List A01;

                {
                    Rect rect = new Rect();
                    this.A00 = rect;
                    List singletonList = Collections.singletonList(rect);
                    C14360o3.A07(singletonList);
                    this.A01 = singletonList;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Display display = view.getDisplay();
                    Rect rect = this.A00;
                    display.getRectSize(rect);
                    rect.set(rect.left, i2, rect.right, i4);
                    View view4 = view2;
                    C14360o3.A0A(view4);
                    AbstractC010103p.A0H(view4, this.A01);
                }
            });
        }
    }

    public static final void A0o(final View view, final View view2, final int i) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(view2, 1);
        A0q(view, new Runnable() { // from class: X.0mx
            @Override // java.lang.Runnable
            public final void run() {
                View view3 = view;
                int dimensionPixelSize = view3.getResources().getDimensionPixelSize(i);
                Rect rect = new Rect();
                view3.getHitRect(rect);
                int i2 = -dimensionPixelSize;
                rect.inset(i2, i2);
                view2.setTouchDelegate(new TouchDelegate(rect, view3));
            }
        });
    }

    public static final void A0p(final View view, final C1N8 c1n8, final Runnable runnable) {
        C14360o3.A0B(view, 0);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0n2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (((Boolean) c1n8.apply(null)).booleanValue()) {
                    runnable.run();
                    view.removeOnLayoutChangeListener(this);
                }
            }
        });
    }

    public static final void A0q(final View view, final Runnable runnable) {
        C14360o3.A0B(view, 0);
        if (view.isLaidOut()) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0mz
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    runnable.run();
                }
            });
        }
    }

    public static final void A0r(View view, final Runnable runnable) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(runnable, 1);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0n1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C14360o3.A0B(view2, 0);
                view2.removeOnLayoutChangeListener(this);
                runnable.run();
            }
        });
    }

    public static final void A0s(View view, Runnable runnable) {
        C14360o3.A0B(view, 0);
        ViewOnAttachStateChangeListenerC13700mw viewOnAttachStateChangeListenerC13700mw = new ViewOnAttachStateChangeListenerC13700mw(runnable);
        view.addOnLayoutChangeListener(viewOnAttachStateChangeListenerC13700mw);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC13700mw);
    }

    public static final void A0u(final View view, final Callable callable) {
        C14360o3.A0B(view, 0);
        if (((Boolean) AbstractC15930qn.A02.A0P.invoke()).booleanValue()) {
            C03O.A00(view, new Runnable() { // from class: X.0n3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        callable.call();
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.0n4
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                    if (!viewTreeObserver2.isAlive()) {
                        viewTreeObserver2 = view.getViewTreeObserver();
                    }
                    viewTreeObserver2.removeOnPreDrawListener(this);
                    try {
                        return ((Boolean) callable.call()).booleanValue();
                    } catch (Exception unused) {
                        return true;
                    }
                }
            });
        }
    }

    public static final void A0w(final View view, final boolean z) {
        C14360o3.A0B(view, 0);
        if (view.hasWindowFocus()) {
            if (z) {
                view.post(new RunnableC13850nB(view));
                return;
            } else {
                A0R(view);
                return;
            }
        }
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0nD
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z2) {
                if (z2) {
                    View view2 = view;
                    boolean z3 = z;
                    RectF rectF = AbstractC13880nE.A01;
                    if (z3) {
                        view2.post(new RunnableC13850nB(view2));
                    } else {
                        AbstractC13880nE.A0R(view2);
                    }
                    view2.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                }
            }
        });
    }

    public static final void A0x(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver) {
        C14360o3.A0B(viewTreeObserver, 0);
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            return;
        }
        throw new IllegalArgumentException("Given null or dead view tree observer.");
    }

    public static final boolean A0y(Activity activity) {
        C14360o3.A0B(activity, 0);
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        if ((systemUiVisibility & 2) == 0 && (systemUiVisibility & 512) == 0 && (systemUiVisibility & 4) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A10(TextView textView) {
        C14360o3.A0B(textView, 0);
        if (textView.getText().length() != 0) {
            return false;
        }
        return true;
    }

    public static final View[] A11(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C14360o3.A07(childAt);
            arrayList.add(childAt);
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    public static final float A05(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels / displayMetrics.heightPixels;
    }

    public static final Point A0E(Context context) {
        Point point = A00;
        if (point == null) {
            point = A0F(context);
            A00 = point;
        }
        C14360o3.A0A(point);
        return point;
    }

    public static final void A0O(View view) {
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void A0P(View view) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener(null);
        }
    }

    public static final void A0v(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    A0v(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static final boolean A0z(View view, float f, float f2) {
        C14360o3.A0B(view, 0);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        RectF rectF = new RectF(iArr[0], iArr[1], r2 + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
        if (Float.compare(view.getRotation(), 0.0f) == 0) {
            return rectF.contains(f, f2);
        }
        float f3 = rectF.left;
        float f4 = rectF.top;
        float pivotX = view.getPivotX();
        float pivotY = view.getPivotY();
        double radians = Math.toRadians(-view.getRotation());
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = f3 - pivotX;
        double d2 = f4 - pivotY;
        PointF pointF = new PointF((float) (((d * cos) - (d2 * sin)) + pivotX), (float) ((d * sin) + (d2 * cos) + pivotY));
        float pivotX2 = view.getPivotX();
        float pivotY2 = view.getPivotY();
        double radians2 = Math.toRadians(-view.getRotation());
        double cos2 = Math.cos(radians2);
        double sin2 = Math.sin(radians2);
        double d3 = f - pivotX2;
        double d4 = f2 - pivotY2;
        PointF pointF2 = new PointF((float) (((d3 * cos2) - (d4 * sin2)) + pivotX2), (float) ((d3 * sin2) + (d4 * cos2) + pivotY2));
        float f5 = pointF.x;
        return new RectF(f5, pointF.y, f5 + view.getWidth(), pointF.y + view.getHeight()).contains(pointF2.x, pointF2.y);
    }

    public static final int A08(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        int identifier2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier > 0 && identifier2 > 0 && resources.getBoolean(identifier2)) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final int A0B(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final Point A0F(Context context) {
        Object systemService = context.getSystemService("window");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static final void A0t(final View view, final Runnable runnable, final Callable callable, long j) {
        final Handler handler = new Handler(Looper.getMainLooper());
        if (((Boolean) AbstractC15930qn.A02.A0Q.invoke()).booleanValue()) {
            final Object obj = new Object();
            final C03O A002 = C03O.A00(view, new Runnable() { // from class: X.0n5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        handler.removeCallbacksAndMessages(obj);
                        callable.call();
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "<empty>";
                        }
                        C0w9.A06("ViewUtil#runOnNextPreDrawWithTimeout", message, e);
                    }
                }
            });
            handler.postAtTime(new Runnable() { // from class: X.0n6
                @Override // java.lang.Runnable
                public final void run() {
                    C03O.this.A01();
                    try {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "<empty>";
                        }
                        C0w9.A06("ViewUtil#runOnNextPreDrawWithTimeout", message, e);
                    }
                }
            }, obj, SystemClock.uptimeMillis() + j);
            return;
        }
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0n8
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                handler.removeCallbacksAndMessages(null);
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                if (!viewTreeObserver2.isAlive()) {
                    viewTreeObserver2 = view.getViewTreeObserver();
                }
                viewTreeObserver2.removeOnPreDrawListener(this);
                try {
                    return ((Boolean) callable.call()).booleanValue();
                } catch (Exception e) {
                    String message = e.getMessage();
                    C14360o3.A0A(message);
                    C0w9.A06("ViewUtil#runOnNextPreDrawWithTimeout", message, e);
                    return true;
                }
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        handler.postDelayed(new Runnable() { // from class: X.0n7
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                if (!viewTreeObserver2.isAlive()) {
                    viewTreeObserver2 = view.getViewTreeObserver();
                }
                viewTreeObserver2.removeOnPreDrawListener(onPreDrawListener);
                try {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    C14360o3.A0A(message);
                    C0w9.A06("ViewUtil#runOnNextPreDrawWithTimeout", message, e);
                }
            }
        }, j);
    }
}
