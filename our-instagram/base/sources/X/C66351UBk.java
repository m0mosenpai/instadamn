package X;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;

/* renamed from: X.UBk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66351UBk extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public InterfaceC71886X8t A05;
    public InterfaceC71887X8u A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public ViewTreeObserverOnGlobalLayoutListenerC66252U5w A0B;
    public C126545np A0C;
    public C6T7 A0D;
    public boolean A0E;
    public final Animator.AnimatorListener A0F;
    public final Animator.AnimatorListener A0G;
    public final GestureDetector.OnGestureListener A0H;
    public final GestureDetector A0I;
    public final Runnable A0J;

    public C66351UBk(Context context, Integer num, boolean z) {
        super(context, null);
        this.A0G = new U5Q(this, 3);
        this.A0F = new U5Q(this, 4);
        this.A0J = new RunnableC71236WqR(this);
        GestureDetector.OnGestureListener wKq = new WKq(this);
        this.A0H = wKq;
        this.A09 = z;
        this.A07 = num;
        this.A0I = new GestureDetector(context, z ? wKq : new UA3(this));
    }

    public final void A02() {
        View activityRootView;
        setAlpha(0.0f);
        if (this.A0A && this.A07.equals(C05F.A01) && (activityRootView = getActivityRootView()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC66252U5w viewTreeObserverOnGlobalLayoutListenerC66252U5w = new ViewTreeObserverOnGlobalLayoutListenerC66252U5w(activityRootView, false);
            this.A0B = viewTreeObserverOnGlobalLayoutListenerC66252U5w;
            viewTreeObserverOnGlobalLayoutListenerC66252U5w.A03.add(new C70372WTa(activityRootView, this));
            this.A0B.onGlobalLayout();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new WOE(this, 4));
    }

    public static void A00(C66351UBk c66351UBk) {
        AccessibilityManager accessibilityManager;
        if (c66351UBk.A00 != 0 && !c66351UBk.A0E) {
            Runnable runnable = c66351UBk.A0J;
            c66351UBk.removeCallbacks(runnable);
            int i = c66351UBk.A00;
            if (Build.VERSION.SDK_INT >= 29 && (accessibilityManager = (AccessibilityManager) c66351UBk.getContext().getSystemService("accessibility")) != null && accessibilityManager.isEnabled()) {
                i = accessibilityManager.getRecommendedTimeoutMillis(i, 3);
            }
            c66351UBk.postDelayed(runnable, i);
        }
    }

    private boolean A01() {
        if (!this.A08) {
            if (getTranslationY() > getHeight() / 2.0f) {
                A03(this.A01);
            } else {
                A04(null, this.A02);
                return true;
            }
        }
        return true;
    }

    public final void A03(int i) {
        ViewPropertyAnimator alpha;
        removeCallbacks(this.A0J);
        this.A0E = true;
        if (getContext() != null && isAttachedToWindow()) {
            clearAnimation();
            if (this.A09) {
                clearAnimation();
                alpha = animate().setDuration(i).setInterpolator(this.A03).alpha(0.0f).scaleX(1.5f).scaleY(1.5f);
            } else {
                clearAnimation();
                boolean equals = this.A07.equals(C05F.A00);
                int height = getHeight();
                if (equals) {
                    height = -height;
                }
                alpha = animate().setDuration(i).translationY(height).setInterpolator(this.A03).alpha(0.0f);
            }
            alpha.setListener(this.A0F);
            ViewTreeObserverOnGlobalLayoutListenerC66252U5w viewTreeObserverOnGlobalLayoutListenerC66252U5w = this.A0B;
            if (viewTreeObserverOnGlobalLayoutListenerC66252U5w != null) {
                viewTreeObserverOnGlobalLayoutListenerC66252U5w.A03.clear();
                ViewTreeObserver viewTreeObserver = viewTreeObserverOnGlobalLayoutListenerC66252U5w.A02.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC66252U5w);
                }
                this.A0B = null;
                return;
            }
            return;
        }
        InterfaceC71886X8t interfaceC71886X8t = this.A05;
        if (interfaceC71886X8t == null) {
            return;
        }
        interfaceC71886X8t.DAk();
    }

    public void setBloksContentViewFromParseResult(C6FG c6fg, C1338462s c1338462s) {
        C6T7 c6t7 = this.A0D;
        if (c6t7 != null) {
            c6t7.A03();
            this.A0D = null;
        }
        C126545np c126545np = this.A0C;
        if (c126545np != null) {
            removeView(c126545np);
        }
        Context context = c6fg.A00;
        if (!context.equals(getContext())) {
            AbstractC25241Le.A02("bk.action.toast.ShowToastV2", "Different Android context for BloksHostingComponent and FoABloksPopoverView");
        }
        this.A0C = new U3u(context);
        C6T7 A00 = C6T7.A00(context, c1338462s, c6fg.A02).A00();
        this.A0D = A00;
        A00.A07(this.A0C);
        setContentView(this.A0D.A00);
    }

    public void setContentView(View view) {
        if (view == null) {
            AbstractC25241Le.A02("bk.action.toast.ShowToastV2", "Cannot add null Bloks content view to PopoverView container.");
        } else {
            addView(view);
        }
    }

    private View getActivityRootView() {
        Window window;
        Activity A00 = C66224U4u.A00(getContext());
        if (A00 == null || (window = A00.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().findViewById(R.id.content);
    }

    public final void A04(Animator.AnimatorListener animatorListener, int i) {
        clearAnimation();
        animate().setDuration(i).translationY(0.0f).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1065279139);
        super.onDetachedFromWindow();
        C6T7 c6t7 = this.A0D;
        if (c6t7 != null) {
            c6t7.A03();
            this.A0D = null;
            this.A0C = null;
        }
        C0f9.A0D(1929518435, A06);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                A00(this);
                A01();
            }
        } else {
            removeCallbacks(this.A0J);
        }
        return this.A0I.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(-538809931);
        boolean onTouchEvent = this.A0I.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        boolean z = false;
        boolean z2 = true;
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                    z = true;
                }
                C0f9.A0C(-759278360, A05);
                return z;
            }
            A00(this);
            z2 = A01();
            i = -688547336;
        } else {
            this.A08 = false;
            i = -1153010405;
        }
        C0f9.A0C(i, A05);
        return z2;
    }

    public void setAutoDismissDurationMs(int i) {
        this.A00 = i;
    }

    public void setDismissAnimationDurationMs(int i) {
        this.A01 = i;
    }

    public void setDismissAnimationEndListener(InterfaceC71886X8t interfaceC71886X8t) {
        this.A05 = interfaceC71886X8t;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z) {
        this.A08 = z;
    }

    public void setShowAboveKeyboard(boolean z) {
        this.A0A = z;
    }

    public void setShowAnimationDurationMs(int i) {
        this.A02 = i;
    }

    public void setShowAnimationEndListener(InterfaceC71887X8u interfaceC71887X8u) {
        this.A06 = interfaceC71887X8u;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }
}
