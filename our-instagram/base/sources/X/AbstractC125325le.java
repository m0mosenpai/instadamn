package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.facebook.R;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.5le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125325le {
    public static final ArgbEvaluator A0b = new ArgbEvaluator();
    public static final ArgbEvaluator A0c = new ArgbEvaluator();
    public float A00;
    public int A01;
    public int A02;
    public InterfaceC125355lh A05;
    public InterfaceC150976qx A06;
    public InterfaceC143526dr A07;
    public String A08;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public float A0N;
    public float A0O;
    public float A0P;
    public float A0Q;
    public float A0R;
    public float A0S;
    public float A0T;
    public float A0U;
    public float A0V;
    public float A0W;
    public float A0X;
    public final View A0a;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0Y = false;
    public boolean A0Z = false;
    public boolean A09 = false;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0B = false;
    public boolean A0A = false;
    public int A04 = -1;
    public int A03 = -1;

    public static AbstractC125325le A00(View view) {
        return A01(view, 0);
    }

    public static void A02(final View view, final long j) {
        A04(new InterfaceC125355lh() { // from class: X.Wmv
            @Override // X.InterfaceC125355lh
            public final void onFinish() {
                final View view2 = view;
                long j2 = j;
                ArgbEvaluator argbEvaluator = AbstractC125325le.A0b;
                C11T.A04(new Runnable() { // from class: X.Wsp
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC125325le.A05(new View[]{view2}, true);
                    }
                }, j2);
            }
        }, new View[]{view}, true);
    }

    public static void A03(final View view, final InterfaceC125355lh interfaceC125355lh, final int i, boolean z) {
        if (view.getAlpha() > 0.0f && view.getVisibility() == 0 && z) {
            AbstractC125325le A01 = A01(view, 0);
            A01.A0I(0.0f);
            A01.A05 = new InterfaceC125355lh() { // from class: X.8bt
                @Override // X.InterfaceC125355lh
                public final void onFinish() {
                    View view2 = view;
                    int i2 = i;
                    InterfaceC125355lh interfaceC125355lh2 = interfaceC125355lh;
                    ArgbEvaluator argbEvaluator = AbstractC125325le.A0b;
                    view2.setVisibility(i2);
                    if (interfaceC125355lh2 != null) {
                        interfaceC125355lh2.onFinish();
                    }
                }
            };
            A01.A0H();
            return;
        }
        view.setVisibility(i);
        A01(view, 0).A0G();
        view.setAlpha(0.0f);
        if (interfaceC125355lh == null) {
            return;
        }
        interfaceC125355lh.onFinish();
    }

    public static void A04(final InterfaceC125355lh interfaceC125355lh, View[] viewArr, boolean z) {
        final HashSet hashSet;
        InterfaceC125355lh interfaceC125355lh2;
        if (interfaceC125355lh != null) {
            hashSet = new HashSet(Arrays.asList(viewArr));
        } else {
            hashSet = null;
        }
        for (final View view : viewArr) {
            if ((view.getAlpha() < 1.0f || view.getVisibility() != 0) && z) {
                view.setVisibility(0);
                if (interfaceC125355lh != null) {
                    interfaceC125355lh2 = new InterfaceC125355lh() { // from class: X.9Ih
                        @Override // X.InterfaceC125355lh
                        public final void onFinish() {
                            java.util.Set set = hashSet;
                            View view2 = view;
                            InterfaceC125355lh interfaceC125355lh3 = interfaceC125355lh;
                            ArgbEvaluator argbEvaluator = AbstractC125325le.A0b;
                            set.getClass();
                            set.remove(view2);
                            if (set.isEmpty()) {
                                interfaceC125355lh3.onFinish();
                            }
                        }
                    };
                } else {
                    interfaceC125355lh2 = null;
                }
                AbstractC125325le A01 = A01(view, 0);
                A01.A0I(1.0f);
                A01.A05 = interfaceC125355lh2;
                A01.A0H();
            } else {
                view.setVisibility(0);
                A01(view, 0).A0G();
                view.setAlpha(1.0f);
                if (interfaceC125355lh != null) {
                    interfaceC125355lh.onFinish();
                }
            }
        }
    }

    public static void A06(View[] viewArr, boolean z) {
        A03(viewArr[0], null, 4, z);
    }

    public static void A07(View[] viewArr, boolean z) {
        A04(null, viewArr, z);
    }

    public final AbstractC125325le A0A() {
        return A0F(true);
    }

    public final void A0I(float f) {
        this.A09 = true;
        this.A0G = this.A0a.getAlpha();
        this.A0Q = f;
    }

    public final void A0M(float f, float f2) {
        this.A09 = true;
        this.A0G = f;
        this.A0Q = f2;
    }

    public final void A0N(float f, float f2) {
        this.A0B = true;
        this.A0H = f;
        this.A0R = f2;
    }

    public final void A0O(float f, float f2) {
        this.A0C = true;
        this.A0I = f;
        this.A0S = f2;
    }

    public final void A0R(float f, float f2) {
        this.A0D = true;
        this.A0L = f;
        this.A0V = f2;
    }

    public final void A0S(float f, float f2) {
        this.A0E = true;
        this.A0M = f;
        this.A0W = f2;
    }

    public final void A0T(float f, float f2) {
        this.A0F = true;
        this.A0N = f;
        this.A0X = f2;
    }

    public final void A0U(float f, float f2, float f3) {
        this.A0Y = true;
        this.A0J = f;
        this.A0T = f2;
        this.A0O = f3;
    }

    public final void A0V(float f, float f2, float f3) {
        this.A0Z = true;
        this.A0K = f;
        this.A0U = f2;
        this.A0P = f3;
    }

    public static void A05(View[] viewArr, boolean z) {
        for (View view : viewArr) {
            A03(view, null, 8, z);
        }
    }

    public final AbstractC125325le A0B(float f) {
        if (this instanceof C150956qv) {
            C150956qv c150956qv = (C150956qv) this;
            c150956qv.A00 = Math.abs(f);
            return c150956qv;
        }
        throw new UnsupportedOperationException("InterpolatorViewAnimator does not support spring config");
    }

    public final AbstractC125325le A0C(long j) {
        if (this instanceof C125335lf) {
            C125335lf c125335lf = (C125335lf) this;
            c125335lf.A01.setDuration(j);
            return c125335lf;
        }
        throw new UnsupportedOperationException("SpringViewAnimator does not support interpolator config");
    }

    public final AbstractC125325le A0D(TimeInterpolator timeInterpolator) {
        if (this instanceof C125335lf) {
            C125335lf c125335lf = (C125335lf) this;
            c125335lf.A01.setInterpolator(timeInterpolator);
            return c125335lf;
        }
        throw new UnsupportedOperationException("SpringViewAnimator does not support interpolator config");
    }

    public final AbstractC125325le A0E(C55942hf c55942hf) {
        if (this instanceof C150956qv) {
            C150956qv c150956qv = (C150956qv) this;
            c150956qv.A01.A09(c55942hf);
            return c150956qv;
        }
        throw new UnsupportedOperationException("InterpolatorViewAnimator does not support spring config");
    }

    public final AbstractC125325le A0F(boolean z) {
        if (this instanceof C150956qv) {
            C150956qv c150956qv = (C150956qv) this;
            c150956qv.A01.A06 = z;
            return c150956qv;
        }
        throw new UnsupportedOperationException("InterpolatorViewAnimator does not support spring config");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0G() {
        C125335lf c125335lf;
        if (this instanceof C150956qv) {
            C150956qv c150956qv = (C150956qv) this;
            C55982hj c55982hj = c150956qv.A01;
            c55982hj.A01();
            c55982hj.A09(C150956qv.A02);
            c55982hj.A06 = false;
            c125335lf = c150956qv;
        } else {
            C125335lf c125335lf2 = (C125335lf) this;
            ValueAnimator valueAnimator = c125335lf2.A01;
            valueAnimator.cancel();
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.setDuration(c125335lf2.A00);
            c125335lf = c125335lf2;
        }
        c125335lf.A0E = false;
        c125335lf.A0F = false;
        c125335lf.A09 = false;
        c125335lf.A0C = false;
        c125335lf.A0B = false;
        c125335lf.A0D = false;
        c125335lf.A04 = -1;
        c125335lf.A03 = -1;
        c125335lf.A06 = null;
        c125335lf.A05 = null;
        InterfaceC143526dr interfaceC143526dr = c125335lf.A07;
        if (interfaceC143526dr != null) {
            interfaceC143526dr.DgX();
        }
        c125335lf.A07 = null;
    }

    public final void A0H() {
        if (this instanceof C150956qv) {
            C150956qv c150956qv = (C150956qv) this;
            c150956qv.A0a.setTag(R.id.view_animator, c150956qv);
            C55982hj c55982hj = c150956qv.A01;
            c55982hj.A01();
            c55982hj.A05(((AbstractC125325le) c150956qv).A00);
            c55982hj.A06(1.0d);
            c55982hj.A07(c150956qv.A00);
            ((AbstractC125325le) c150956qv).A00 = 0.0f;
            c150956qv.A00 = 0.0f;
            return;
        }
        C125335lf c125335lf = (C125335lf) this;
        c125335lf.A0a.setTag(R.id.view_animator, c125335lf);
        ValueAnimator valueAnimator = c125335lf.A01;
        valueAnimator.cancel();
        valueAnimator.setFloatValues(((AbstractC125325le) c125335lf).A00, 1.0f);
        valueAnimator.start();
        ((AbstractC125325le) c125335lf).A00 = 0.0f;
    }

    public final void A0J(float f) {
        A0S(this.A0a.getTranslationX(), f);
    }

    public final void A0K(float f) {
        A0T(this.A0a.getTranslationY(), f);
    }

    public final void A0L(float f) {
        if (this.A0A) {
            int intValue = ((Number) A0b.evaluate(f, Integer.valueOf(this.A01), Integer.valueOf(this.A02))).intValue();
            View view = this.A0a;
            if (view.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) view.getBackground()).getPaint().setColor(intValue);
                view.invalidate();
            } else {
                view.setBackgroundColor(intValue);
            }
        }
        if (this.A0E) {
            View view2 = this.A0a;
            float f2 = this.A0M;
            view2.setTranslationX(f2 + ((this.A0W - f2) * f));
        }
        if (this.A0F) {
            View view3 = this.A0a;
            float f3 = this.A0N;
            view3.setTranslationY(f3 + ((this.A0X - f3) * f));
        }
        if (this.A0Y) {
            float f4 = this.A0O;
            if (f4 != -1.0f) {
                this.A0a.setPivotX(f4);
            }
            View view4 = this.A0a;
            float f5 = this.A0J;
            view4.setScaleX(f5 + ((this.A0T - f5) * f));
        }
        if (this.A0Z) {
            float f6 = this.A0P;
            if (f6 != -1.0f) {
                this.A0a.setPivotY(f6);
            }
            View view5 = this.A0a;
            float f7 = this.A0K;
            view5.setScaleY(f7 + ((this.A0U - f7) * f));
        }
        if (this.A09) {
            float f8 = this.A0G;
            this.A0a.setAlpha(Math.max(0.0f, Math.min(f8 + ((this.A0Q - f8) * f), 1.0f)));
        }
        if (this.A0C) {
            float f9 = this.A0I;
            this.A0a.setRotation(f9 + ((this.A0S - f9) * f));
        }
        boolean z = this.A0D;
        boolean z2 = this.A0B;
        if (z) {
            View view6 = this.A0a;
            float f10 = this.A0L;
            int i = (int) (f10 + ((this.A0V - f10) * f));
            if (z2) {
                float f11 = this.A0H;
                AbstractC13880nE.A0h(view6, i, (int) (f11 + ((this.A0R - f11) * f)));
            } else {
                AbstractC13880nE.A0g(view6, i);
            }
        } else if (z2) {
            View view7 = this.A0a;
            float f12 = this.A0H;
            AbstractC13880nE.A0W(view7, (int) (f12 + ((this.A0R - f12) * f)));
        }
        InterfaceC150976qx interfaceC150976qx = this.A06;
        if (interfaceC150976qx != null) {
            interfaceC150976qx.Dbl(this, f);
        }
    }

    public final void A0P(float f, float f2) {
        A0U(this.A0a.getScaleX(), f, f2);
    }

    public final void A0Q(float f, float f2) {
        A0V(this.A0a.getScaleY(), f, f2);
    }

    public final boolean A0W() {
        if (this instanceof C125335lf) {
            return ((C125335lf) this).A01.isRunning();
        }
        return !((C150956qv) this).A01.A0C();
    }

    public AbstractC125325le(View view) {
        this.A0a = view;
    }

    public static AbstractC125325le A01(View view, int i) {
        AbstractC125325le abstractC125325le = (AbstractC125325le) view.getTag(R.id.view_animator);
        if (i == 0) {
            if (!(abstractC125325le instanceof C150956qv)) {
                abstractC125325le = new C150956qv(view);
                view.setTag(R.id.view_animator, abstractC125325le);
            }
        } else if (!(abstractC125325le instanceof C125335lf)) {
            abstractC125325le = new C125335lf(view);
            view.setTag(R.id.view_animator, abstractC125325le);
        }
        return abstractC125325le;
    }
}
