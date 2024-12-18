package X;

import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.7ET, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7ET implements View.OnTouchListener, InterfaceC55932he, InterfaceC676933j, InterfaceC677033k {
    public float A02;
    public int A04;
    public int A05;
    public View A06;
    public ViewGroup.LayoutParams A07;
    public TouchInterceptorFrameLayout A08;
    public InterfaceC56002hn A09;
    public InterfaceC73933Tf A0A;
    public ScaleGestureDetectorOnScaleGestureListenerC81153jk A0B;
    public C7EV A0C;
    public boolean A0E;
    public float A0F;
    public final ViewGroup A0G;
    public final C55982hj A0H;
    public final C55982hj A0I;
    public final C55982hj A0J;
    public final C55982hj A0K;
    public static final C55942hf A0P = C55942hf.A04(90.0d, 0.0d);
    public static final C55942hf A0O = C55942hf.A02;
    public static final C55942hf A0N = C55942hf.A04(40.0d, 5.0d);
    public final PointF A0L = new PointF();
    public float A03 = 1.0f;
    public Integer A0D = C05F.A00;
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public final PointF A0M = new PointF();

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A0E = true;
        ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = this.A0B;
        if (scaleGestureDetectorOnScaleGestureListenerC81153jk != null) {
            scaleGestureDetectorOnScaleGestureListenerC81153jk.A01(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r10 < 0.0f) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r9 < 0.0f) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(float r9, float r10) {
        /*
            r8 = this;
            android.view.View r0 = r8.A06
            if (r0 == 0) goto L5d
            float r7 = r0.getScaleX()
            android.view.View r0 = r8.A06
            int r0 = r0.getMeasuredWidth()
            float r1 = (float) r0
            android.view.View r0 = r8.A06
            int r0 = r0.getMeasuredHeight()
            float r3 = (float) r0
            float r2 = r1 * r7
            float r2 = r2 - r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = r3 * r7
            float r1 = r1 - r3
            float r1 = r1 / r0
            float r6 = r8.A00
            android.view.View r0 = r8.A06
            float r0 = r0.getScaleX()
            float r0 = r0 * r9
            float r6 = r6 + r0
            float r3 = r8.A01
            android.view.View r0 = r8.A06
            float r0 = r0.getScaleY()
            float r0 = r0 * r10
            float r3 = r3 + r0
            r5 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L70
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L70
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L70
        L43:
            r8.A00 = r2
        L45:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5e
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 <= 0) goto L5e
        L51:
            r8.A01 = r1
        L53:
            android.view.View r0 = r8.A06
            if (r0 == 0) goto L5d
            r0.setTranslationX(r2)
            r0.setTranslationY(r1)
        L5d:
            return
        L5e:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L6c
            float r1 = -r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6c
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6c
            goto L51
        L6c:
            r8.A01 = r3
            r1 = r3
            goto L53
        L70:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7e
            float r2 = -r2
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L7e
            goto L43
        L7e:
            r8.A00 = r6
            r2 = r6
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7ET.A01(float, float):void");
    }

    private void A02(float f, float f2) {
        PointF pointF = this.A0M;
        pointF.x = f;
        pointF.y = f2;
        View view = this.A06;
        if (view != null) {
            view.setPivotX(f);
            view.setPivotY(f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04() {
        this.A0D = C05F.A0C;
        C55982hj c55982hj = this.A0I;
        c55982hj.A02();
        c55982hj.A04();
        C55982hj c55982hj2 = this.A0J;
        c55982hj2.A02();
        c55982hj2.A04();
        this.A03 = 1.0f;
        Integer num = this.A0D;
        Integer num2 = C05F.A00;
        if (num != num2) {
            this.A0D = num2;
            ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk = this.A0B;
            if (scaleGestureDetectorOnScaleGestureListenerC81153jk != null) {
                scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.remove(this);
            }
            this.A0K.A0B(this);
            this.A0H.A0B(this);
            c55982hj2.A0D.clear();
            c55982hj.A0D.clear();
            ViewGroup.LayoutParams layoutParams = this.A07;
            InterfaceC73933Tf interfaceC73933Tf = this.A0A;
            View view = this.A06;
            if (view != null && interfaceC73933Tf != 0 && layoutParams != null) {
                A02(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                float f = this.A02;
                View view2 = this.A06;
                if (view2 != null) {
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(f);
                }
                A00(1.0f);
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A08;
                if (touchInterceptorFrameLayout != null) {
                    touchInterceptorFrameLayout.detachViewFromParent(view);
                    touchInterceptorFrameLayout.setVisibility(8);
                }
                interfaceC73933Tf.AD2(view, this.A04, layoutParams);
                AbstractC13880nE.A0W((View) interfaceC73933Tf, layoutParams.height);
                view.requestLayout();
            }
            this.A04 = -1;
            this.A07 = null;
            this.A05 = 0;
            this.A00 = 0.0f;
            this.A01 = 0.0f;
            InterfaceC56002hn interfaceC56002hn = this.A09;
            if (interfaceC56002hn != null) {
                interfaceC56002hn.COs(null);
            }
            View view3 = this.A06;
            C7EV c7ev = this.A0C;
            if (c7ev != null && view3 != null) {
                c7ev.E2D(view3);
            }
            this.A09 = null;
            this.A0B = null;
            this.A0E = false;
            this.A06 = null;
            InterfaceC73933Tf interfaceC73933Tf2 = this.A0A;
            if (interfaceC73933Tf2 != null) {
                interfaceC73933Tf2.requestDisallowInterceptTouchEvent(false);
                interfaceC73933Tf2.setHasTransientState(false);
            }
            this.A0A = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC677033k
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final void EoL(View view, InterfaceC73933Tf interfaceC73933Tf, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A0D = C05F.A01;
        this.A0A = interfaceC73933Tf;
        AbstractC13880nE.A0W((View) interfaceC73933Tf, view.getMeasuredHeight());
        this.A0A.setHasTransientState(true);
        this.A06 = view;
        this.A02 = view.getTranslationY();
        this.A07 = view.getLayoutParams();
        this.A0B = scaleGestureDetectorOnScaleGestureListenerC81153jk;
        scaleGestureDetectorOnScaleGestureListenerC81153jk.A01.add(this);
        InterfaceC56002hn interfaceC56002hn = this.A09;
        if (interfaceC56002hn == null) {
            interfaceC56002hn = C71Q.A00(view);
            this.A09 = interfaceC56002hn;
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A08;
        if (interfaceC56002hn != null && touchInterceptorFrameLayout != null) {
            interfaceC56002hn.requestDisallowInterceptTouchEvent(false);
            interfaceC56002hn.COs(this);
            interfaceC56002hn.getParent().requestDisallowInterceptTouchEvent(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[1];
            interfaceC56002hn.getLocationInWindow(iArr);
            this.A05 = i - iArr[1];
            int indexOfChild = interfaceC73933Tf.indexOfChild(view);
            this.A04 = indexOfChild;
            if (indexOfChild != -1) {
                interfaceC73933Tf.AP8(view);
                interfaceC73933Tf.invalidate();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
            touchInterceptorFrameLayout.setVisibility(0);
            touchInterceptorFrameLayout.attachViewToParent(view, 0, layoutParams);
            touchInterceptorFrameLayout.bringToFront();
            ViewGroup viewGroup = this.A0G;
            viewGroup.requestLayout();
            viewGroup.invalidate();
            ScaleGestureDetector scaleGestureDetector = scaleGestureDetectorOnScaleGestureListenerC81153jk.A00;
            A02(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            C55982hj c55982hj = this.A0K;
            c55982hj.A05(0.0d);
            c55982hj.A0A(this);
            C55982hj c55982hj2 = this.A0I;
            c55982hj2.A05(0.0d);
            c55982hj2.A0A(new C48210LVk(this));
            C55982hj c55982hj3 = this.A0J;
            c55982hj3.A05(0.0d);
            c55982hj3.A0A(new C48211LVl(this));
            C7EV c7ev = this.A0C;
            if (c7ev != null) {
                c7ev.E2E(view);
            }
        }
    }

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        ScaleGestureDetector scaleGestureDetector = scaleGestureDetectorOnScaleGestureListenerC81153jk.A00;
        float focusX = scaleGestureDetector.getFocusX();
        boolean z = this.A0E;
        float focusY = scaleGestureDetector.getFocusY();
        if (z) {
            focusY -= this.A05;
        }
        float f = focusY + this.A02;
        PointF pointF = this.A0M;
        float f2 = focusX - pointF.x;
        float f3 = f - pointF.y;
        if (this.A06 != null) {
            A01(f2, f3);
            A02(focusX, f);
        }
        C55982hj c55982hj = this.A0K;
        C55992hk c55992hk = c55982hj.A09;
        double A00 = c55992hk.A00 * scaleGestureDetectorOnScaleGestureListenerC81153jk.A00();
        if (A00 > 3.0d) {
            double d = c55992hk.A00;
            if (A00 > d) {
                A00 = ((A00 - d) * 0.30000001192092896d) + d;
            }
        }
        c55982hj.A05(Math.min(Math.max(A00, 1.0d), 3.200000047683716d));
        float A002 = this.A03 * scaleGestureDetectorOnScaleGestureListenerC81153jk.A00();
        this.A03 = A002;
        this.A03 = Math.max(1.0f, Math.min(A002, 3.2f));
        return true;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        this.A0D = C05F.A01;
        ScaleGestureDetector scaleGestureDetector = scaleGestureDetectorOnScaleGestureListenerC81153jk.A00;
        float focusX = scaleGestureDetector.getFocusX();
        boolean z = this.A0E;
        float focusY = scaleGestureDetector.getFocusY();
        if (z) {
            focusY -= this.A05;
        }
        float f = focusY + this.A02;
        PointF pointF = this.A0M;
        float f2 = focusX - pointF.x;
        float f3 = f - pointF.y;
        if (this.A06 != null) {
            A01(f2, f3);
            A02(focusX, f);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f = (float) c55982hj.A09.A00;
        this.A0F = f;
        if (this.A0D == C05F.A01) {
            A00(f);
            return;
        }
        C55992hk c55992hk = this.A0K.A09;
        A00((float) AbstractC70163Da.A03(f, 1.0d, c55992hk.A00));
        double d = this.A0F;
        double d2 = this.A00;
        double d3 = c55992hk.A00;
        float A01 = (float) AbstractC70163Da.A01(d, d2 * d3);
        float A012 = (float) AbstractC70163Da.A01(d, this.A01 * d3);
        View view = this.A06;
        if (view == null) {
            return;
        }
        view.setTranslationX(A01);
        view.setTranslationY(A012);
    }

    @Override // X.InterfaceC677033k
    public final boolean isIdle() {
        if (this.A0D != C05F.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC677033k
    public final void start() {
        ViewGroup viewGroup = this.A0G;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zoom, viewGroup, false);
        this.A08 = touchInterceptorFrameLayout;
        if (touchInterceptorFrameLayout.getBackground() != null) {
            this.A08.getBackground().mutate().setAlpha(0);
        }
        this.A08.A00(new ViewOnTouchListenerC42048IkH(this), new ViewOnTouchListenerC42049IkI(this));
        viewGroup.addView(this.A08);
    }

    @Override // X.InterfaceC677033k
    public final void stop() {
        this.A0G.post(new RunnableC37984GnT(this));
    }

    public C7ET(ViewGroup viewGroup) {
        this.A0G = viewGroup;
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        A02.A09(A0P);
        this.A0K = A02;
        C55982hj A022 = A00.A02();
        C55942hf c55942hf = A0O;
        A022.A09(c55942hf);
        this.A0I = A022;
        C55982hj A023 = A00.A02();
        A023.A09(c55942hf);
        this.A0J = A023;
        C55982hj A024 = A00.A02();
        A024.A09(A0N);
        A024.A06 = true;
        this.A0H = A024;
    }

    private void A00(float f) {
        if (Float.isNaN(f)) {
            C0w9.A03("MultiGestureZoomableViewController", "updateScaleFactor() scale value is NaN resetting to default");
            f = 1.0f;
        }
        View view = this.A06;
        if (view != null) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public static void A03(MotionEvent motionEvent, C7ET c7et) {
        Integer num;
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 6) {
                        num = C05F.A00;
                    } else {
                        return;
                    }
                } else {
                    if (c7et.A0D != C05F.A0N || motionEvent.getPointerCount() != 1) {
                        return;
                    }
                    float f = pointF.x;
                    PointF pointF2 = c7et.A0L;
                    float f2 = f - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    float f4 = c7et.A03;
                    c7et.A01(f2 / f4, f3 / f4);
                    pointF2.set(pointF.x, pointF.y);
                    return;
                }
            } else {
                if (c7et.A03 > 1.0f) {
                    return;
                }
                c7et.A04();
                return;
            }
        } else {
            c7et.A0L.set(pointF);
            num = C05F.A0N;
        }
        c7et.A0D = num;
    }
}
