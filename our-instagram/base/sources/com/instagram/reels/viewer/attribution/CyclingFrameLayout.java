package com.instagram.reels.viewer.attribution;

import X.AbstractC001800i;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.InterfaceC50401MNd;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class CyclingFrameLayout extends FrameLayout {
    public float A00;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public InterfaceC50401MNd A04;
    public Integer A05;
    public boolean A06;
    public int A07;
    public UserSession A08;
    public Runnable A09;
    public boolean A0A;
    public final List A0B;
    public final Handler A0C;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyclingFrameLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A04() {
        this.A0A = false;
        this.A06 = true;
        this.A07 = 2500;
        this.A05 = null;
        Runnable runnable = this.A09;
        if (runnable != null) {
            this.A0C.removeCallbacks(runnable);
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        List<View> list = this.A0B;
        for (View view : list) {
            view.setAlpha(1.0f);
            view.setVisibility(8);
            view.setY(this.A00);
        }
        list.clear();
    }

    public final void A05(UserSession userSession, List list) {
        this.A08 = userSession;
        List list2 = this.A0B;
        list2.addAll(AbstractC001800i.A0X(list));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        if (!list.isEmpty()) {
            this.A00 = ((View) list2.get(0)).getY();
        }
        this.A02 = 0;
        A01(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            List list = this.A0B;
            if (!list.isEmpty()) {
                View view = (View) list.get(this.A02);
                View view2 = (View) list.get(getNextViewIndex());
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Number) animatedValue).floatValue();
                float f = 1.0f - floatValue;
                view.setAlpha(f);
                view2.setAlpha(floatValue);
                float height = ((View) list.get(this.A02)).getHeight() * this.A01;
                view.setY(this.A00 - (floatValue * height));
                view2.setY(this.A00 + (height * f));
            }
        }
    }

    public static final void A01(final CyclingFrameLayout cyclingFrameLayout) {
        ((View) cyclingFrameLayout.A0B.get(cyclingFrameLayout.A02)).setVisibility(0);
        Runnable runnable = new Runnable() { // from class: X.6P4
            @Override // java.lang.Runnable
            public final void run() {
                CyclingFrameLayout.A02(CyclingFrameLayout.this);
            }
        };
        cyclingFrameLayout.A09 = runnable;
        cyclingFrameLayout.A0C.postDelayed(runnable, cyclingFrameLayout.A07);
    }

    public static final void A02(final CyclingFrameLayout cyclingFrameLayout) {
        if (!cyclingFrameLayout.A0B.isEmpty()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            cyclingFrameLayout.A03 = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6PI
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CyclingFrameLayout.this.invalidate();
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.6PJ
                public boolean A00;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.A00 = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    int nextViewIndex;
                    Integer num;
                    CyclingFrameLayout cyclingFrameLayout2 = CyclingFrameLayout.this;
                    List list = cyclingFrameLayout2.A0B;
                    if (!list.isEmpty()) {
                        cyclingFrameLayout2.setLayerType(0);
                        ((View) list.get(cyclingFrameLayout2.A02)).setVisibility(8);
                        nextViewIndex = cyclingFrameLayout2.getNextViewIndex();
                        cyclingFrameLayout2.A02 = nextViewIndex;
                        if (!this.A00 && cyclingFrameLayout2.A06) {
                            if (cyclingFrameLayout2.A05 != null) {
                                num = Integer.valueOf(r0.intValue() - 1);
                            } else {
                                num = null;
                            }
                            cyclingFrameLayout2.A05 = num;
                            if (num != null && num.intValue() <= 0) {
                                cyclingFrameLayout2.A06 = false;
                                InterfaceC50401MNd interfaceC50401MNd = cyclingFrameLayout2.A04;
                                if (interfaceC50401MNd != null) {
                                    C49578LvX c49578LvX = (C49578LvX) interfaceC50401MNd;
                                    C160847Is c160847Is = c49578LvX.A01;
                                    if (c160847Is.A0q) {
                                        C7KL c7kl = c49578LvX.A00;
                                        InterfaceC83733oI interfaceC83733oI = c160847Is.A0C;
                                        if (interfaceC83733oI != null) {
                                            AbstractC23021Ah.A00(c7kl.A0Q).A0v(AbstractC1345466e.A07(interfaceC83733oI));
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            CyclingFrameLayout.A01(cyclingFrameLayout2);
                        }
                        this.A00 = false;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    int nextViewIndex;
                    CyclingFrameLayout cyclingFrameLayout2 = CyclingFrameLayout.this;
                    nextViewIndex = cyclingFrameLayout2.getNextViewIndex();
                    List list = cyclingFrameLayout2.A0B;
                    ((View) list.get(nextViewIndex)).setAlpha(0.0f);
                    ((View) list.get(nextViewIndex)).setVisibility(0);
                }
            });
            cyclingFrameLayout.setLayerType(2);
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNextViewIndex() {
        return (this.A02 + 1) % this.A0B.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLayerType(int i) {
        List list = this.A0B;
        if (!list.isEmpty()) {
            ((View) list.get(this.A02)).setLayerType(i, null);
            ((View) list.get(getNextViewIndex())).setLayerType(i, null);
        }
    }

    public final View getCurrentVisibleView() {
        return (View) this.A0B.get(this.A02);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.A0B.isEmpty();
    }

    public final void setTimeToShowEachAttributionMs(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2500;
        }
        this.A07 = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(444490429);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
        A04();
        setOnClickListener(null);
        this.A04 = null;
        C0f9.A0D(-1511526921, A06);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        ValueAnimator valueAnimator;
        int A06 = C0f9.A06(-77578033);
        super.onWindowFocusChanged(z);
        UserSession userSession = this.A08;
        if (userSession != null && Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36326442547689346L)).booleanValue()) {
            if (!z) {
                if (!this.A0B.isEmpty()) {
                    this.A06 = false;
                    this.A0A = true;
                    Runnable runnable = this.A09;
                    if (runnable != null) {
                        this.A0C.removeCallbacks(runnable);
                    }
                }
            } else {
                this.A06 = true;
                if (this.A0A && (valueAnimator = this.A03) != null && !valueAnimator.isRunning()) {
                    ((View) this.A0B.get(this.A02)).setVisibility(0);
                    A02(this);
                }
                this.A0A = false;
            }
        }
        C0f9.A0D(-1863272788, A06);
    }

    public final void setDelegate(InterfaceC50401MNd interfaceC50401MNd) {
        this.A04 = interfaceC50401MNd;
    }

    public final void setHeightFactor(float f) {
        this.A01 = f;
    }

    public final void setRepeatCount(Integer num) {
        this.A05 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyclingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0B = new ArrayList();
        this.A06 = true;
        this.A07 = 2500;
        this.A01 = 1.0f;
        setWillNotDraw(false);
        this.A0C = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ CyclingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyclingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
