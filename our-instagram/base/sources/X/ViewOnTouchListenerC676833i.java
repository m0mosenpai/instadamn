package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.user.model.User;

/* renamed from: X.33i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC676833i implements View.OnTouchListener, InterfaceC55932he, InterfaceC676933j, InterfaceC677033k {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public View A0C;
    public ViewGroup.LayoutParams A0D;
    public TouchInterceptorFrameLayout A0E;
    public InterfaceC56002hn A0F;
    public InterfaceC73933Tf A0G;
    public ScaleGestureDetectorOnScaleGestureListenerC81153jk A0H;
    public C676633g A0I;
    public Integer A0J;
    public boolean A0K;
    public boolean A0L;
    public final ViewGroup A0M;
    public final C55982hj A0N;
    public final C55982hj A0O;
    public final PointF A0P;
    public final boolean A0Q;
    public static final C55942hf A0S = C55942hf.A04(90.0d, 0.0d);
    public static final C55942hf A0R = C55942hf.A04(40.0d, 5.0d);

    public ViewOnTouchListenerC676833i(ViewGroup viewGroup, boolean z) {
        C14360o3.A0B(viewGroup, 1);
        this.A0M = viewGroup;
        this.A0P = new PointF();
        this.A0Q = z;
        this.A0J = C05F.A00;
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        A02.A09(A0S);
        this.A0O = A02;
        C55982hj A022 = A00.A02();
        A022.A09(A0R);
        A022.A06 = true;
        this.A0N = A022;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4 < r2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r4 <= r2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        r4 = ((r4 - r2) * 0.30000001192092896d) + r2;
     */
    @Override // X.InterfaceC676933j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DiJ(X.ScaleGestureDetectorOnScaleGestureListenerC81153jk r9) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            android.view.ScaleGestureDetector r0 = r9.A00
            float r1 = r0.getFocusX()
            float r0 = r0.getFocusY()
            r8.A02(r1, r0)
            X.2hj r6 = r8.A0O
            X.2hk r7 = r6.A09
            double r4 = r7.A00
            float r0 = r9.A00()
            double r0 = (double) r0
            double r4 = r4 * r0
            r1 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L29
            double r2 = r7.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L35
        L29:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3d
            double r2 = r7.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3d
        L35:
            double r4 = r4 - r2
            r0 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            double r4 = r4 * r0
            double r4 = r4 + r2
        L3d:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2 = 4614388178311184384(0x40099999a0000000, double:3.200000047683716)
            double r0 = java.lang.Math.max(r4, r0)
            double r1 = java.lang.Math.min(r0, r2)
            r0 = 1
            r6.A08(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC676833i.DiJ(X.3jk):boolean");
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        ScaleGestureDetector scaleGestureDetector = scaleGestureDetectorOnScaleGestureListenerC81153jk.A00;
        float focusX = scaleGestureDetector.getFocusX();
        boolean z = this.A0L;
        float focusY = scaleGestureDetector.getFocusY();
        if (z) {
            focusY -= this.A0A;
        }
        A03(focusX, focusY + this.A04);
        return true;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        if (this.A0J == C05F.A01) {
            A01(f);
            return;
        }
        if (this.A0K) {
            View view = this.A0C;
            if (view != null) {
                view.setAlpha(f);
                A00((float) AbstractC70163Da.A01(f, this.A01));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        double d = f;
        C55992hk c55992hk = this.A0O.A09;
        A01((float) AbstractC70163Da.A04(d, 0.0d, 1.0d, 1.0d, c55992hk.A00));
        double d2 = this.A02;
        double d3 = c55992hk.A00;
        A04((float) AbstractC70163Da.A04(d, 0.0d, 1.0d, 0.0d, d3 * d2), (float) AbstractC70163Da.A04(d, 0.0d, 1.0d, 0.0d, d3 * this.A03));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC677033k
    public final void EoL(View view, InterfaceC73933Tf interfaceC73933Tf, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 2);
        this.A0J = C05F.A01;
        this.A0G = interfaceC73933Tf;
        View view2 = (View) interfaceC73933Tf;
        AbstractC13880nE.A0W(view2, view.getMeasuredHeight());
        view2.setHasTransientState(true);
        this.A0C = view;
        this.A04 = view.getTranslationY();
        this.A0D = view.getLayoutParams();
        this.A0H = scaleGestureDetectorOnScaleGestureListenerC81153jk;
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(this);
        InterfaceC56002hn interfaceC56002hn = this.A0F;
        if (interfaceC56002hn == null) {
            interfaceC56002hn = C71Q.A00(view);
            this.A0F = interfaceC56002hn;
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0E;
        if (interfaceC56002hn != null && touchInterceptorFrameLayout != null) {
            interfaceC56002hn.requestDisallowInterceptTouchEvent(false);
            interfaceC56002hn.COs(this);
            interfaceC56002hn.getParent().requestDisallowInterceptTouchEvent(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[1];
            interfaceC56002hn.getLocationInWindow(iArr);
            this.A0A = i - iArr[1];
            this.A09 = interfaceC73933Tf.indexOfChild(view);
            interfaceC73933Tf.AP8(view);
            view2.invalidate();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
            A00(0.0f);
            touchInterceptorFrameLayout.setVisibility(0);
            touchInterceptorFrameLayout.attachViewToParent(view, 0, layoutParams);
            touchInterceptorFrameLayout.bringToFront();
            ViewGroup viewGroup = this.A0M;
            viewGroup.requestLayout();
            viewGroup.invalidate();
            ScaleGestureDetector scaleGestureDetector = scaleGestureDetectorOnScaleGestureListenerC81153jk.A00;
            A03(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            C55982hj c55982hj = this.A0O;
            c55982hj.A08(1.0d, true);
            c55982hj.A0A(this);
            C676633g c676633g = this.A0I;
            if (c676633g != null) {
                C676533f.A00(c676633g.A00, false);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C38321qM c38321qM;
        User A2E;
        Long l;
        float focusY;
        C14360o3.A0B(motionEvent, 1);
        this.A0L = true;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = this.A0H;
        if (scaleGestureDetectorOnScaleGestureListenerC81153jk != null) {
            scaleGestureDetectorOnScaleGestureListenerC81153jk.A01(motionEvent);
            C676633g c676633g = this.A0I;
            if (c676633g != null && motionEvent.getAction() != 6 && motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                C676533f.A00(c676633g.A00, false);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            if (this.A0Q) {
                                this.A0J = C05F.A0N;
                                if (motionEvent.getPointerCount() == 2) {
                                    int pointerCount = (motionEvent.getPointerCount() - motionEvent.getActionIndex()) - 1;
                                    this.A07 = motionEvent.getX(pointerCount) - this.A05;
                                    focusY = motionEvent.getY(pointerCount);
                                } else {
                                    ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk2 = this.A0H;
                                    if (scaleGestureDetectorOnScaleGestureListenerC81153jk2 != null) {
                                        this.A07 = scaleGestureDetectorOnScaleGestureListenerC81153jk2.A00.getFocusX() - this.A05;
                                        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk3 = this.A0H;
                                        if (scaleGestureDetectorOnScaleGestureListenerC81153jk3 != null) {
                                            focusY = scaleGestureDetectorOnScaleGestureListenerC81153jk3.A00.getFocusY();
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                this.A08 = focusY - this.A06;
                            }
                        }
                    }
                } else if (this.A0Q) {
                    Integer num = this.A0J;
                    Integer num2 = C05F.A0N;
                    ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk4 = this.A0H;
                    if (num == num2) {
                        if (scaleGestureDetectorOnScaleGestureListenerC81153jk4 != null) {
                            float focusX = scaleGestureDetectorOnScaleGestureListenerC81153jk4.A00.getFocusX() - this.A07;
                            ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk5 = this.A0H;
                            if (scaleGestureDetectorOnScaleGestureListenerC81153jk5 != null) {
                                A02(focusX, scaleGestureDetectorOnScaleGestureListenerC81153jk5.A00.getFocusY() - this.A08);
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (scaleGestureDetectorOnScaleGestureListenerC81153jk4 != null) {
                        this.A05 = scaleGestureDetectorOnScaleGestureListenerC81153jk4.A00.getFocusX();
                        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk6 = this.A0H;
                        if (scaleGestureDetectorOnScaleGestureListenerC81153jk6 != null) {
                            this.A06 = scaleGestureDetectorOnScaleGestureListenerC81153jk6.A00.getFocusY();
                            return true;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return true;
            }
            Integer num3 = this.A0J;
            if (num3 == C05F.A01 || num3 == C05F.A0N) {
                this.A05 = 0.0f;
                this.A06 = 0.0f;
                this.A07 = 0.0f;
                this.A08 = 0.0f;
                this.A0J = C05F.A0C;
                this.A01 = this.A00;
                C55982hj c55982hj = this.A0N;
                c55982hj.A08(1.0d, true);
                c55982hj.A0A(this);
                c55982hj.A06(0.0d);
                C676633g c676633g2 = this.A0I;
                if (c676633g2 != null) {
                    C676533f c676533f = c676633g2.A00;
                    C676533f.A00(c676533f, true);
                    C38321qM c38321qM2 = c676533f.A04;
                    if (c38321qM2 != null) {
                        UserSession userSession = c676533f.A06;
                        if (C18U.A06(C06090Tz.A05, userSession, 36314390869379616L)) {
                            InterfaceC60442pS interfaceC60442pS = c676533f.A07;
                            C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(interfaceC60442pS.getModuleName()), userSession);
                            c676533f.A03 = A01;
                            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_organic_zoom_duration");
                            if (A00.isSampled() && (c38321qM = c676533f.A04) != null && (A2E = c38321qM.A2E(userSession)) != null) {
                                A00.A9K("a_pk", Long.valueOf(Long.parseLong(A2E.getId())));
                                String id = c38321qM.getId();
                                if (id != null) {
                                    A00.AAP("m_pk", id);
                                    A00.AAP("source_of_action", interfaceC60442pS.getModuleName());
                                    String CAR = c38321qM.CAR();
                                    if (CAR == null) {
                                        CAR = "";
                                    }
                                    A00.AAP("tracking_token", CAR);
                                    A00.AAP("inventory_source", c38321qM.A0C.BJN());
                                    String A38 = c38321qM.A38();
                                    if (A38 != null) {
                                        l = AbstractC003100w.A0k(10, A38);
                                    } else {
                                        l = null;
                                    }
                                    A00.A9K("media_id", l);
                                    A00.A9K("media_author_id", AbstractC003100w.A0k(10, A2E.getId()));
                                    A00.AAP("module_name", interfaceC60442pS.getModuleName());
                                    A00.AAP("delivery_flags", AbstractC77343dK.A00(c38321qM.A0e));
                                    A00.A7v("production_build", true);
                                    A00.A8I("duration", Double.valueOf((System.currentTimeMillis() - c676533f.A02) / 1000.0d));
                                    A00.Cht();
                                    return true;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            InterfaceC60442pS interfaceC60442pS2 = c676533f.A07;
                            C82713mZ A04 = AbstractC82703mY.A04(c38321qM2, interfaceC60442pS2, "zoom_duration");
                            A04.A0G(userSession, c38321qM2);
                            A04.A09(c676533f.A01);
                            A04.A01 = (System.currentTimeMillis() - c676533f.A02) / 1000.0d;
                            C32U.A0E(userSession, A04, c38321qM2, interfaceC60442pS2, c676533f.A00);
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A00(float f) {
        this.A00 = f;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            drawable.setAlpha(Math.round(f * 255.0f));
        }
    }

    private final void A02(float f, float f2) {
        if (this.A0L) {
            f2 -= this.A0A;
        }
        float f3 = f2 + this.A04;
        PointF pointF = this.A0P;
        float f4 = f - pointF.x;
        float f5 = f3 - pointF.y;
        float f6 = this.A02 + f4;
        this.A02 = f6;
        this.A03 += f5;
        View view = this.A0C;
        if (view != null) {
            float scaleX = f6 * view.getScaleX();
            float f7 = this.A03;
            View view2 = this.A0C;
            if (view2 != null) {
                A04(scaleX, f7 * view2.getScaleY());
                A03(f, f3);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A03(float f, float f2) {
        PointF pointF = this.A0P;
        pointF.x = f;
        pointF.y = f2;
        View view = this.A0C;
        if (view != null) {
            view.setPivotX(f);
            View view2 = this.A0C;
            if (view2 != null) {
                view2.setPivotY(f2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A04(float f, float f2) {
        View view = this.A0C;
        if (view != null) {
            view.setTranslationX(f);
            View view2 = this.A0C;
            if (view2 != null) {
                view2.setTranslationY(f2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        if (this.A0J == C05F.A0C) {
            ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = this.A0H;
            if (scaleGestureDetectorOnScaleGestureListenerC81153jk != null) {
                scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.remove(this);
                this.A0O.A0B(this);
                this.A0N.A0B(this);
                View view = this.A0C;
                if (view != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0E;
                    if (touchInterceptorFrameLayout != null) {
                        if (view.getParent() == touchInterceptorFrameLayout) {
                            View view2 = this.A0C;
                            if (view2 != null) {
                                touchInterceptorFrameLayout.detachViewFromParent(view2);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        touchInterceptorFrameLayout.setVisibility(8);
                    }
                    if (this.A0C != null) {
                        float width = r0.getWidth() / 2.0f;
                        if (this.A0C != null) {
                            A03(width, r0.getHeight() / 2.0f);
                            A04(0.0f, this.A04);
                            A01(1.0f);
                            if (this.A0K) {
                                View view3 = this.A0C;
                                if (view3 != null) {
                                    view3.setAlpha(1.0f);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            InterfaceC73933Tf interfaceC73933Tf = this.A0G;
                            if (interfaceC73933Tf != null) {
                                interfaceC73933Tf.AD2(this.A0C, this.A09, this.A0D);
                                ViewGroup.LayoutParams layoutParams = this.A0D;
                                if (layoutParams != null) {
                                    Object obj = this.A0G;
                                    if (obj != null) {
                                        AbstractC13880nE.A0W((View) obj, layoutParams.height);
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                View view4 = this.A0C;
                                if (view4 != null) {
                                    view4.requestLayout();
                                    this.A09 = -1;
                                    this.A0D = null;
                                    this.A0A = 0;
                                    this.A02 = 0.0f;
                                    this.A03 = 0.0f;
                                    InterfaceC56002hn interfaceC56002hn = this.A0F;
                                    if (interfaceC56002hn != null) {
                                        interfaceC56002hn.COs(null);
                                        this.A0F = null;
                                        this.A0H = null;
                                        this.A0L = false;
                                        this.A0K = false;
                                        this.A0C = null;
                                        InterfaceC73933Tf interfaceC73933Tf2 = this.A0G;
                                        if (interfaceC73933Tf2 != null) {
                                            interfaceC73933Tf2.requestDisallowInterceptTouchEvent(false);
                                            InterfaceC73933Tf interfaceC73933Tf3 = this.A0G;
                                            if (interfaceC73933Tf3 != null) {
                                                interfaceC73933Tf3.setHasTransientState(false);
                                                this.A0G = null;
                                                this.A0J = C05F.A00;
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
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC677033k
    public final boolean isIdle() {
        if (this.A0J != C05F.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC677033k
    public final void start() {
        ViewGroup viewGroup = this.A0M;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zoom, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout");
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) inflate;
        this.A0E = touchInterceptorFrameLayout;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.COs(C3FT.A00);
            TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A0E;
            if (touchInterceptorFrameLayout2 != null) {
                this.A0B = touchInterceptorFrameLayout2.getBackground().mutate();
                viewGroup.addView(this.A0E);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC677033k
    public final void stop() {
        this.A0M.post(new Runnable() { // from class: X.6Xm
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = ViewOnTouchListenerC676833i.this;
                viewOnTouchListenerC676833i.A0M.removeView(viewOnTouchListenerC676833i.A0E);
                viewOnTouchListenerC676833i.A0B = null;
                viewOnTouchListenerC676833i.A0E = null;
                viewOnTouchListenerC676833i.A0I = null;
            }
        });
    }

    private final void A01(float f) {
        if (Float.isNaN(f)) {
            C0w9.A03("SimpleZoomableViewController", AbstractC111324zv.A00(5540));
            f = 1.0f;
        }
        View view = this.A0C;
        if (view != null) {
            view.setScaleX(f);
            View view2 = this.A0C;
            if (view2 != null) {
                view2.setScaleY(f);
                A00((float) AbstractC70163Da.A04(f, 0.5d, 3.200000047683716d, 0.0d, 1.0d));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
