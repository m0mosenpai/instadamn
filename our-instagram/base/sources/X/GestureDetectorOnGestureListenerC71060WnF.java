package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WnF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class GestureDetectorOnGestureListenerC71060WnF implements InterfaceC149626oF, InterfaceC55932he, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public C55982hj A03;
    public Float A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final double A0A;
    public final View A0B;
    public final C70569Wd3 A0C;
    public final float A0D;
    public final GestureDetector A0E;
    public final ViewGroup A0F;
    public final C8SW A0G;

    public GestureDetectorOnGestureListenerC71060WnF(Context context, View view, ViewGroup viewGroup, C8SW c8sw, C70569Wd3 c70569Wd3) {
        C14360o3.A0B(view, 3);
        this.A0F = viewGroup;
        this.A0B = view;
        this.A0G = c8sw;
        this.A0C = c70569Wd3;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0E = gestureDetector;
        this.A08 = true;
        gestureDetector.setIsLongpressEnabled(false);
        C14360o3.A0A(context);
        this.A0A = AbstractC13880nE.A04(context, 16);
        this.A0D = AbstractC13880nE.A04(context, 1000);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(C55942hf.A04(33.0d, 8.0d));
        A0R.A00 = 0.001d;
        A0R.A02 = 0.001d;
        A0R.A08(0.0d, true);
        A0R.A0A(this);
        this.A03 = A0R;
    }

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return A00(motionEvent, this, true);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        C55992hk c55992hk = c55982hj.A09;
        double d = c55992hk.A00;
        C70569Wd3 c70569Wd3 = this.A0C;
        if (d == 0.0d) {
            c70569Wd3.A06(false);
        }
        if (c55992hk.A00 == c70569Wd3.A01) {
            c70569Wd3.A0H.DCN();
        }
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return A00(motionEvent, this, false);
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C70569Wd3 c70569Wd3 = this.A0C;
        if (!c70569Wd3.A0H.DmT(motionEvent)) {
            if (motionEvent.getRawY() <= c70569Wd3.A0B.getTranslationY() + 0.0f) {
                c70569Wd3.A0G.A03(true, 0.0f);
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r8.A0I != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.view.MotionEvent r11, X.GestureDetectorOnGestureListenerC71060WnF r12, boolean r13) {
        /*
            X.Wd3 r8 = r12.A0C
            X.2oq r7 = r8.A0H
            boolean r0 = r7.EiT()
            r3 = 1
            if (r0 != 0) goto Lbd
            boolean r0 = r12.A08
            r2 = 0
            if (r0 != 0) goto L11
            return r2
        L11:
            boolean r0 = r7.CWB()
            if (r0 == 0) goto L25
            X.8SW r0 = r12.A0G
            if (r0 == 0) goto L25
            X.BEF r1 = r0.A00()
            android.view.View r0 = r12.A0B
            r1.DuA(r11, r0)
            return r3
        L25:
            int r1 = r11.getActionMasked()
            if (r1 == 0) goto La1
            if (r1 == r3) goto L94
            r0 = 2
            if (r1 == r0) goto L3b
            r0 = 3
            if (r1 == r0) goto L94
        L33:
            if (r13 == 0) goto Lbd
            boolean r0 = r12.A06
            if (r0 != 0) goto Lbd
            r3 = 0
            return r3
        L3b:
            android.view.GestureDetector r0 = r12.A0E
            r0.onTouchEvent(r11)
            boolean r6 = r12.A06
            if (r6 != 0) goto L82
            boolean r0 = r12.A05
            if (r0 != 0) goto L82
            float r10 = r12.A00
            float r0 = r11.getRawX()
            float r10 = r10 - r0
            float r9 = r12.A01
            float r0 = r11.getRawY()
            float r9 = r9 - r0
            double r4 = X.AbstractC43594JPz.A00(r10, r9)
            double r0 = r12.A0A
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1O(r2)
            double r4 = X.AbstractC43594JPz.A01(r9, r10)
            if (r0 == 0) goto L82
            r1 = 4630474473122824192(0x4042c00000000000, double:37.5)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
            r11.getRawY()
            boolean r0 = r7.ABG()
            if (r0 == 0) goto L7f
            boolean r1 = r8.A0I
            r0 = 1
            if (r1 == 0) goto L80
        L7f:
            r0 = 0
        L80:
            r12.A06 = r0
        L82:
            boolean r0 = r12.A06
            if (r0 == 0) goto L33
            if (r6 != 0) goto L33
            android.view.ViewGroup r0 = r12.A0F
            r0.requestDisallowInterceptTouchEvent(r3)
            r7.DBx()
            goto L33
        L91:
            r12.A05 = r3
            goto L82
        L94:
            android.view.GestureDetector r0 = r12.A0E
            r0.onTouchEvent(r11)
            boolean r0 = r12.A06
            if (r0 == 0) goto L33
            r12.A01()
            goto L33
        La1:
            android.view.GestureDetector r0 = r12.A0E
            r0.onTouchEvent(r11)
            r12.A05 = r2
            r12.A06 = r2
            r12.A09 = r2
            r0 = 0
            r12.A02 = r0
            float r0 = r11.getRawX()
            r12.A00 = r0
            float r0 = r11.getRawY()
            r12.A01 = r0
            goto L33
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC71060WnF.A00(android.view.MotionEvent, X.WnF, boolean):boolean");
    }

    public final void A01() {
        float f;
        if (this.A03 != null) {
            double d = this.A02;
            double d2 = this.A0D;
            float min = (float) Math.min(Math.max(d, -d2), d2);
            C70569Wd3 c70569Wd3 = this.A0C;
            C55982hj c55982hj = this.A03;
            C14360o3.A0A(c55982hj);
            c55982hj.A07(-(min / c70569Wd3.A0C.getHeight()));
            float f2 = c70569Wd3.A0G.A02;
            C55982hj c55982hj2 = this.A03;
            if (c55982hj2 == null) {
                f = 0.0f;
            } else {
                f = (float) c55982hj2.A09.A00;
            }
            float f3 = 0.0f;
            if (f2 != 0.0f ? f2 <= 0.0f : f >= c70569Wd3.A01 / 2.0f) {
                f3 = c70569Wd3.A01;
            }
            A03(true, f3);
            c70569Wd3.A0H.DBz();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r4 <= 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(float r7) {
        /*
            r6 = this;
            X.2hj r1 = r6.A03
            if (r1 == 0) goto L3d
            X.Wd3 r5 = r6.A0C
            int r0 = (int) r7
            int r4 = java.lang.Integer.signum(r0)
            X.2hk r0 = r1.A09
            double r2 = r0.A00
            float r1 = (float) r2
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            r0 = 1041865114(0x3e19999a, float:0.15)
            if (r4 > 0) goto L1d
        L1b:
            r0 = 1065353216(0x3f800000, float:1.0)
        L1d:
            float r7 = r7 * r0
            android.view.ViewGroup r0 = r5.A0C
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            X.2hj r0 = r6.A03
            X.C14360o3.A0A(r0)
            X.2hk r0 = r0.A09
            double r2 = r0.A00
            float r1 = (float) r2
            float r1 = r1 + r7
            java.lang.Float r0 = r6.A04
            if (r0 == 0) goto L3e
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L3e
        L3d:
            return
        L3e:
            X.2hj r3 = r6.A03
            X.C14360o3.A0A(r3)
            double r1 = (double) r1
            r0 = 1
            r3.A08(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC71060WnF.A02(float):void");
    }

    public final void A03(boolean z, float f) {
        C55982hj c55982hj = this.A03;
        if (c55982hj != null) {
            if (z) {
                boolean z2 = false;
                if (this.A07 || f == 0.0f) {
                    z2 = true;
                }
                c55982hj.A06 = z2;
                c55982hj.A06(f);
                return;
            }
            c55982hj.A08(f, true);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        int width;
        C55982hj c55982hj2;
        boolean z;
        C55982hj c55982hj3 = this.A03;
        if (c55982hj3 != null) {
            float f2 = (float) c55982hj3.A09.A00;
            View view = this.A0B;
            int i = 0;
            if (f2 == 0.0f) {
                i = 4;
            }
            view.setVisibility(i);
            C70569Wd3 c70569Wd3 = this.A0C;
            ViewGroup viewGroup = c70569Wd3.A0C;
            view.setTranslationY((float) AbstractC70163Da.A02(f2, viewGroup.getHeight()));
            if (f2 == 0.0f) {
                viewGroup.setVisibility(4);
                if (c70569Wd3.A0H.EjE()) {
                    c70569Wd3.A01();
                }
            } else if (f2 == c70569Wd3.A01) {
                viewGroup.setVisibility(0);
            }
            c70569Wd3.A0H.DCP(c70569Wd3, c70569Wd3.A02, f2, c70569Wd3.A01);
            float f3 = c70569Wd3.A01;
            View view2 = c70569Wd3.A0A;
            if (view2 != null && view2.getHeight() != 0 && viewGroup.getHeight() != 0) {
                float f4 = 0.0f;
                if (c70569Wd3.A07.intValue() != 1) {
                    f = c70569Wd3.A05;
                } else {
                    if (f2 > f3) {
                        f4 = Math.round(c70569Wd3.A0B.getTranslationY()) - Math.round(viewGroup.getHeight() * (1.0f - f3));
                    }
                    f = f4 + ((f2 / f3) * c70569Wd3.A05);
                }
                float round = Math.round(c70569Wd3.A0B.getTranslationY());
                Integer num = c70569Wd3.A07;
                if (num.intValue() == 1) {
                    round -= (f2 / f3) * c70569Wd3.A04;
                }
                float f5 = round - f;
                float f6 = c70569Wd3.A09;
                if (f6 <= 0.0f) {
                    width = view2.getHeight();
                } else if (num == C05F.A00 && (c55982hj2 = c70569Wd3.A0G.A03) != null && ((float) c55982hj2.A01) != 0.0f) {
                    width = (int) (view2.getWidth() * f6);
                } else {
                    float f7 = f2 / c70569Wd3.A01;
                    width = (int) ((((int) (view2.getWidth() * f6)) * f7) + (view2.getHeight() * (1.0f - f7)));
                }
                float f8 = f5 / width;
                if (c70569Wd3.A07 == C05F.A00) {
                    f8 = Math.min(1.0f, f8);
                }
                if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
                    view2.setPivotX(view2.getWidth() / 2.0f);
                    view2.setPivotY(0.0f);
                    view2.setScaleX(f8);
                    view2.setScaleY(f8);
                    view2.setTranslationY(f);
                    if (c70569Wd3.A03 > 0.0f) {
                        float f9 = c70569Wd3.A02;
                        if (f9 != 0.0f && f2 == 0.0f) {
                            view2.setOutlineProvider(c70569Wd3.A06);
                            z = c70569Wd3.A08;
                        } else if (f9 == 0.0f && f2 > 0.0f) {
                            view2.setOutlineProvider(new C66347UAt(c70569Wd3, 3));
                            z = true;
                        }
                        view2.setClipToOutline(z);
                    }
                }
            }
            c70569Wd3.A02 = f2;
            C70569Wd3.A00(c70569Wd3, f2);
        }
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
        C55982hj c55982hj = this.A03;
        if (c55982hj != null) {
            c55982hj.A00();
            this.A03 = null;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A06) {
            this.A02 = f2;
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A09 && this.A06) {
            A02(f2);
            return false;
        }
        this.A09 = true;
        return false;
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }
}
