package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.user.model.User;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5SW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SW implements InterfaceC55932he, View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public int A00;
    public Rect A01;
    public Rect A02;
    public Rect A03;
    public TouchInterceptorFrameLayout A04;
    public AbstractC117215Sg A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Runnable A0A;
    public String A0B;
    public int A0C;
    public ViewGroup A0D;
    public final int A0E;
    public final int A0F;
    public final GestureDetector A0G;
    public final ViewGroup A0H;
    public final C55982hj A0I;
    public final InterfaceC116795Qi A0J;
    public final C5SX A0K;
    public final C33I A0L;
    public final EnumC58132lV A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final int A0S;
    public final Context A0T;
    public final GestureDetector A0U;
    public final C55942hf A0V;
    public final InterfaceC58042lK A0W;
    public final C5SV A0X;
    public final C5ST A0Y;

    public final void A06() {
        A07(null);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C33I c33i;
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A01 == 1.0d) {
            Integer num = this.A09;
            Integer num2 = C05F.A01;
            if (num == num2 && (c33i = this.A0L) != null) {
                c33i.Dtt(this);
            } else {
                if (num != C05F.A0C) {
                    return;
                }
                this.A09 = num2;
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        InterfaceC58042lK interfaceC58042lK = this.A0W;
        if (interfaceC58042lK != null) {
            interfaceC58042lK.Dnn(this.A09, f);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A04;
        if (touchInterceptorFrameLayout != null) {
            float f2 = f;
            if (f < 0.0f) {
                f2 = 0.0f;
            }
            touchInterceptorFrameLayout.setScaleX(f2);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A04;
        if (touchInterceptorFrameLayout2 != null) {
            float f3 = f;
            if (f < 0.0f) {
                f3 = 0.0f;
            }
            touchInterceptorFrameLayout2.setScaleY(f3);
        }
        if (f == 0.0f && this.A09 == C05F.A0N) {
            if (C14360o3.A0K(this.A06, true)) {
                this.A06 = false;
                C11T.A03(new Runnable() { // from class: X.9Hm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5SW.A04(C5SW.this);
                    }
                });
            } else {
                A04(this);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C14360o3.A0B(view, 0);
        view.removeOnAttachStateChangeListener(this);
        this.A06 = true;
        A08(true);
    }

    public static final int A00(C5SW c5sw) {
        AbstractC117215Sg abstractC117215Sg = c5sw.A05;
        if (abstractC117215Sg != null) {
            return abstractC117215Sg.A00.getHeight();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(MotionEvent motionEvent, C5SW c5sw) {
        c5sw.A0U.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 1 && actionMasked != 3) || c5sw.A09 != C05F.A0C) {
            return;
        }
        C55982hj c55982hj = c5sw.A0I;
        c55982hj.A06 = false;
        c55982hj.A06(1.0d);
    }

    public static final void A04(C5SW c5sw) {
        c5sw.A09 = C05F.A00;
        View Ad7 = c5sw.A0J.Ad7();
        Ad7.removeOnAttachStateChangeListener(c5sw);
        ViewTreeObserver viewTreeObserver = Ad7.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(c5sw);
        }
        Ad7.setHasTransientState(false);
        c5sw.A0I.A0B(c5sw);
        c5sw.A0H.removeView(c5sw.A0D);
        c5sw.A05 = null;
        c5sw.A04 = null;
        c5sw.A0D = null;
        C33I c33i = c5sw.A0L;
        if (c33i != null) {
            c33i.Dto(c5sw);
        }
    }

    public final void A07(UserSession userSession) {
        User user;
        View view;
        Boolean Cec;
        if (this.A09 == C05F.A00) {
            if (userSession != null) {
                user = C08730cb.A00(userSession).A00();
            } else {
                user = null;
            }
            if (userSession != null && user != null && (Cec = user.A03.Cec()) != null && Cec.booleanValue()) {
                return;
            }
            InterfaceC116795Qi interfaceC116795Qi = this.A0J;
            if (!interfaceC116795Qi.CGi(this.A02, this.A0Q, this.A0P)) {
                C33I c33i = this.A0L;
                if (c33i == null) {
                    return;
                }
                c33i.Dto(this);
                return;
            }
            this.A09 = C05F.A01;
            Context context = this.A0T;
            FrameLayout frameLayout = new FrameLayout(context);
            this.A0D = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ViewGroup viewGroup = this.A0D;
            if (viewGroup != null) {
                viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.5Sc
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        C14360o3.A0B(motionEvent, 1);
                        if (motionEvent.getActionMasked() == 0) {
                            C5SW c5sw = C5SW.this;
                            if (c5sw.A0N) {
                                c5sw.A08(true);
                            }
                        }
                        C5SW c5sw2 = C5SW.this;
                        if (c5sw2.A0N && c5sw2.A0R) {
                            return true;
                        }
                        return false;
                    }
                });
            }
            final TouchInterceptorFrameLayout touchInterceptorFrameLayout = new TouchInterceptorFrameLayout(context, null, 0);
            this.A04 = touchInterceptorFrameLayout;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int i = this.A0S;
            if (i > 0) {
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.rightMargin = i;
            }
            touchInterceptorFrameLayout.setLayoutParams(marginLayoutParams);
            touchInterceptorFrameLayout.setBackground(this.A0K);
            int i2 = this.A0F;
            touchInterceptorFrameLayout.setPadding(i2, i2, i2, i2);
            touchInterceptorFrameLayout.setKeepObservingAfterRequestDisallowTouchEvent(true);
            touchInterceptorFrameLayout.A00(new View.OnTouchListener() { // from class: X.5Sd
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    C14360o3.A0B(motionEvent, 1);
                    C5SW.A03(motionEvent, C5SW.this);
                    return false;
                }
            }, new View.OnTouchListener() { // from class: X.5Se
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    C14360o3.A0B(motionEvent, 1);
                    C5SW c5sw = C5SW.this;
                    C5SW.A03(motionEvent, c5sw);
                    c5sw.A0G.onTouchEvent(motionEvent);
                    return true;
                }
            });
            C5ST c5st = this.A0Y;
            LayoutInflater from = LayoutInflater.from(context);
            C14360o3.A07(from);
            AbstractC117215Sg ANT = c5st.ANT(from, touchInterceptorFrameLayout);
            this.A05 = ANT;
            if (ANT != null) {
                c5st.ADz(this.A0X, ANT);
                if (this.A0B != null) {
                    AbstractC117215Sg abstractC117215Sg = this.A05;
                    if (abstractC117215Sg instanceof C201248v6) {
                        C14360o3.A0C(abstractC117215Sg, "null cannot be cast to non-null type com.instagram.igds.components.tooltip.template.BaseTextViewBinder.Holder");
                        ((C201248v6) abstractC117215Sg).A00.setContentDescription(this.A0B);
                    }
                }
                ViewGroup viewGroup2 = this.A0D;
                if (viewGroup2 != null) {
                    viewGroup2.setImportantForAccessibility(4);
                }
                AbstractC117215Sg abstractC117215Sg2 = this.A05;
                if (abstractC117215Sg2 != null) {
                    view = abstractC117215Sg2.A00;
                } else {
                    view = null;
                }
                touchInterceptorFrameLayout.addView(view);
                ViewGroup viewGroup3 = this.A0D;
                if (viewGroup3 != null) {
                    viewGroup3.addView(touchInterceptorFrameLayout);
                }
                ViewGroup viewGroup4 = this.A0D;
                if (viewGroup4 != null) {
                    viewGroup4.setClipChildren(false);
                }
                this.A0H.addView(this.A0D);
                this.A0I.A0A(this);
                View Ad7 = interfaceC116795Qi.Ad7();
                Ad7.addOnAttachStateChangeListener(this);
                Ad7.setHasTransientState(true);
                AbstractC13880nE.A0t(touchInterceptorFrameLayout, null, new Callable() { // from class: X.5Sh
                    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
                    
                        if (((r12 + r5.A00) + X.C5SW.A00(r5)) <= r13.bottom) goto L58;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final /* bridge */ /* synthetic */ java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 401
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.CallableC117225Sh.call():java.lang.Object");
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
                if (AbstractC56862jK.A00(context)) {
                    AbstractC010103p.A0B(Ad7, new C02V() { // from class: X.9Ts
                        @Override // X.C02V
                        public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            AbstractC167017dG.A1N(view2, accessibilityNodeInfoCompat);
                            super.A0Y(view2, accessibilityNodeInfoCompat);
                            C5SW c5sw = C5SW.this;
                            AbstractC117215Sg abstractC117215Sg3 = c5sw.A05;
                            if (abstractC117215Sg3 instanceof C201248v6) {
                                CharSequence charSequence = c5sw.A0B;
                                if (charSequence == null) {
                                    C14360o3.A0C(abstractC117215Sg3, "null cannot be cast to non-null type com.instagram.igds.components.tooltip.template.BaseTextViewBinder.Holder");
                                    charSequence = ((C201248v6) abstractC117215Sg3).A00.getText();
                                }
                                accessibilityNodeInfoCompat.mInfo.setTooltipText(charSequence);
                            }
                        }
                    });
                }
                C33I c33i2 = this.A0L;
                if (c33i2 == null) {
                    return;
                }
                c33i2.Dtq(this);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A08(boolean z) {
        if (this.A09 != C05F.A00) {
            this.A09 = C05F.A0N;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A04;
            if (touchInterceptorFrameLayout != null) {
                touchInterceptorFrameLayout.removeCallbacks(this.A0A);
            }
            if (z) {
                C55982hj c55982hj = this.A0I;
                if (c55982hj.A09.A00 != 0.0d) {
                    c55982hj.A06 = true;
                    c55982hj.A06(0.0d);
                    return;
                }
            }
            this.A0I.A05(0.0d);
        }
    }

    public final boolean A09() {
        if (this.A09 != C05F.A01) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        InterfaceC116795Qi interfaceC116795Qi = this.A0J;
        if (interfaceC116795Qi.CGi(this.A02, this.A0Q, this.A0P)) {
            if (this.A09 != C05F.A00) {
                Rect rect = this.A01;
                interfaceC116795Qi.Ahp(rect);
                int centerX = rect.centerX();
                int centerY = rect.centerY();
                Integer num = this.A07;
                if (num != null) {
                    int intValue = centerX - num.intValue();
                    Integer num2 = this.A08;
                    if (num2 != null) {
                        int intValue2 = centerY - num2.intValue();
                        if ((intValue != 0 || intValue2 != 0) && (touchInterceptorFrameLayout = this.A04) != null) {
                            touchInterceptorFrameLayout.setX(touchInterceptorFrameLayout.getX() + intValue);
                            touchInterceptorFrameLayout.setY(touchInterceptorFrameLayout.getY() + intValue2);
                        }
                        this.A07 = Integer.valueOf(centerX);
                        this.A08 = Integer.valueOf(centerY);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return true;
        }
        A08(true);
        return true;
    }

    public C5SW(C5SU c5su) {
        C5SV c5sv;
        C55942hf A04 = C55942hf.A04(40.0d, 7.0d);
        this.A0V = A04;
        Context context = c5su.A0H;
        this.A0T = context;
        ViewGroup viewGroup = c5su.A02;
        if (viewGroup != null) {
            this.A0H = viewGroup;
            if (AbstractC72723Nt.A00(context)) {
                c5sv = c5su.A07;
            } else {
                c5sv = c5su.A08;
            }
            this.A0X = c5sv;
            this.A0Y = c5su.A09;
            InterfaceC116795Qi interfaceC116795Qi = c5su.A03;
            if (interfaceC116795Qi != null) {
                this.A0J = interfaceC116795Qi;
                this.A0M = c5su.A05;
                this.A0L = c5su.A04;
                this.A0W = c5su.A06;
                this.A0K = new C5SX(context, c5sv, c5su.A0F, c5su.A0E);
                C55982hj A02 = AbstractC13560mi.A00().A02();
                A02.A09(A04);
                this.A0I = A02;
                GestureDetector gestureDetector = new GestureDetector(context, new C5SZ() { // from class: X.5SY
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onDown(MotionEvent motionEvent) {
                        C5SW c5sw = C5SW.this;
                        if (c5sw.A09 == C05F.A01) {
                            c5sw.A09 = C05F.A0C;
                            C55982hj c55982hj = c5sw.A0I;
                            c55982hj.A06 = true;
                            c55982hj.A06(0.9d);
                            return true;
                        }
                        return true;
                    }

                    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                        C5SW c5sw = C5SW.this;
                        if (c5sw.A09 == C05F.A0C) {
                            C55982hj c55982hj = c5sw.A0I;
                            c55982hj.A06 = false;
                            c55982hj.A03();
                            return true;
                        }
                        return true;
                    }
                });
                this.A0U = gestureDetector;
                GestureDetector gestureDetector2 = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.5Sa
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                    public final boolean onSingleTapUp(MotionEvent motionEvent) {
                        Boolean bool;
                        C5SW c5sw = C5SW.this;
                        C33I c33i = c5sw.A0L;
                        if (c33i != null) {
                            bool = Boolean.valueOf(c33i.Dtk(c5sw));
                        } else {
                            bool = null;
                        }
                        if (C14360o3.A0K(bool, true)) {
                            c5sw.A08(true);
                        }
                        return true;
                    }
                });
                this.A0G = gestureDetector2;
                this.A03 = new Rect();
                this.A01 = new Rect();
                this.A02 = new Rect();
                this.A0A = new Runnable() { // from class: X.5Sb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5SW.this.A08(true);
                    }
                };
                this.A0F = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                Drawable drawable = context.getDrawable(R.drawable.tooltip_nub_bottom);
                if (drawable != null) {
                    this.A00 = drawable.getIntrinsicHeight();
                    Drawable drawable2 = context.getDrawable(R.drawable.tooltip_nub_left);
                    if (drawable2 != null) {
                        this.A0C = drawable2.getIntrinsicWidth();
                        this.A0E = c5su.A00;
                        this.A0O = c5su.A0B;
                        this.A0N = c5su.A0A;
                        this.A0R = c5su.A0G;
                        this.A0Q = c5su.A0D;
                        this.A0P = c5su.A0C;
                        this.A09 = C05F.A00;
                        this.A0S = c5su.A01;
                        if (C14640oc.A0G()) {
                            Drawable drawable3 = context.getDrawable(R.drawable.prism_tooltip_nub_bottom);
                            if (drawable3 != null) {
                                this.A00 = drawable3.getIntrinsicHeight();
                                Drawable drawable4 = context.getDrawable(R.drawable.prism_tooltip_nub_left);
                                if (drawable4 != null) {
                                    this.A0C = drawable4.getIntrinsicWidth();
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        gestureDetector.setIsLongpressEnabled(false);
                        gestureDetector2.setIsLongpressEnabled(false);
                        this.A03.set(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final int A01(C5SW c5sw, EnumC58132lV enumC58132lV) {
        int ordinal = enumC58132lV.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return c5sw.A02.right;
                }
                throw new UnsupportedOperationException("Unknown position value");
            }
            int i = c5sw.A02.left;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = c5sw.A04;
            if (touchInterceptorFrameLayout != null) {
                return i - touchInterceptorFrameLayout.getWidth();
            }
            throw new IllegalStateException("Required value was null.");
        }
        int centerX = c5sw.A02.centerX();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = c5sw.A04;
        if (touchInterceptorFrameLayout2 != null) {
            int width = centerX - (touchInterceptorFrameLayout2.getWidth() / 2);
            int i2 = c5sw.A0S;
            if (width < i2) {
                width = i2;
            }
            int i3 = c5sw.A03.right;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = c5sw.A04;
            if (touchInterceptorFrameLayout3 != null) {
                int width2 = i3 - touchInterceptorFrameLayout3.getWidth();
                if (width <= width2) {
                    return width;
                }
                return width2;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final int A02(C5SW c5sw, EnumC58132lV enumC58132lV) {
        int centerY;
        int ordinal = enumC58132lV.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        throw new UnsupportedOperationException("Unknown position value");
                    }
                    int centerY2 = c5sw.A02.centerY();
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = c5sw.A04;
                    if (touchInterceptorFrameLayout != null) {
                        return centerY2 - (touchInterceptorFrameLayout.getHeight() / 2);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                centerY = c5sw.A02.bottom;
            } else {
                centerY = ((c5sw.A02.top - c5sw.A00) - A00(c5sw)) - c5sw.A0F;
            }
        } else {
            centerY = c5sw.A02.centerY();
        }
        if (centerY < 0) {
            centerY = 0;
        }
        int i = c5sw.A03.bottom;
        if (centerY > i) {
            return i;
        }
        return centerY;
    }

    public static final boolean A05(C5SW c5sw, EnumC58132lV enumC58132lV) {
        int A02;
        int A022;
        int i;
        int ordinal = enumC58132lV.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            int A01 = A01(c5sw, enumC58132lV) + c5sw.A0C;
                            TouchInterceptorFrameLayout touchInterceptorFrameLayout = c5sw.A04;
                            if (touchInterceptorFrameLayout != null) {
                                A022 = A01 + touchInterceptorFrameLayout.getWidth();
                                i = c5sw.A03.right;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new UnsupportedOperationException("Unknown position value");
                        }
                    } else {
                        A02 = A01(c5sw, enumC58132lV);
                    }
                } else {
                    A022 = A02(c5sw, enumC58132lV) + c5sw.A00 + A00(c5sw);
                    i = c5sw.A03.bottom;
                }
                if (A022 > i) {
                    return false;
                }
            } else {
                A02 = A02(c5sw, enumC58132lV);
            }
            if (A02 < 0) {
                return false;
            }
        }
        return true;
    }
}
