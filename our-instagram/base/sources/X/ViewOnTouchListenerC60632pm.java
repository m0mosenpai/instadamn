package X;

import android.content.Context;
import android.os.Handler;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC60632pm extends C1I2 implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public InterfaceC72173Lq A06;
    public List A07;
    public List A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E;
    public float A0F;
    public final float A0G;
    public final Handler A0H;
    public final float A0I;
    public final RunnableC60642pn A0J = new RunnableC60642pn(this);
    public final Float A0K;
    public final boolean A0L;

    public ViewOnTouchListenerC60632pm(Context context, Handler handler, Float f, boolean z) {
        this.A0K = f;
        this.A0L = z;
        this.A0H = handler;
        this.A0I = AbstractC13880nE.A09(context) / 5;
        this.A0G = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()) / 6.0f;
        C16930sl c16930sl = C16930sl.A00;
        this.A07 = c16930sl;
        this.A08 = c16930sl;
        this.A0A = c16930sl;
        this.A09 = c16930sl;
        this.A0B = true;
    }

    public static final void A01(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, boolean z) {
        viewOnTouchListenerC60632pm.A02 = -1;
        viewOnTouchListenerC60632pm.A03 = -1;
        viewOnTouchListenerC60632pm.A04 = -1;
        if (z) {
            A00(viewOnTouchListenerC60632pm, -viewOnTouchListenerC60632pm.A01);
        }
        viewOnTouchListenerC60632pm.A0H.removeCallbacksAndMessages(null);
    }

    public final void A02() {
        A01(this, true);
    }

    public final void A04(View view, InterfaceC72173Lq interfaceC72173Lq, float f) {
        C14360o3.A0B(view, 2);
        C16930sl c16930sl = C16930sl.A00;
        List singletonList = Collections.singletonList(view);
        C14360o3.A07(singletonList);
        A05(interfaceC72173Lq, c16930sl, singletonList, f, true);
    }

    public final void A05(InterfaceC72173Lq interfaceC72173Lq, List list, List list2, float f, boolean z) {
        C14360o3.A0B(list2, 4);
        this.A06 = interfaceC72173Lq;
        this.A08 = list2;
        this.A07 = list;
        A03(f);
        A01(this, z);
    }

    public final void A06(InterfaceC65252xN interfaceC65252xN, C3FQ c3fq, int i) {
        C14360o3.A0B(interfaceC65252xN, 1);
        if (c3fq != null) {
            c3fq.CFj().setOnTouchListener(this);
            interfaceC65252xN.EVk(i);
            if (c3fq.CFj() instanceof RefreshableListView) {
                ViewGroup CFj = c3fq.CFj();
                C14360o3.A0C(CFj, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableListView");
                ((RefreshableListView) CFj).A00 = i;
            }
        }
    }

    public final void A07(InterfaceC65252xN interfaceC65252xN, C3FQ c3fq, int i, int i2) {
        C14360o3.A0B(c3fq, 0);
        C14360o3.A0B(interfaceC65252xN, 1);
        interfaceC65252xN.EVk(i);
        if (c3fq.CFj() instanceof RefreshableListView) {
            ViewGroup CFj = c3fq.CFj();
            C14360o3.A0C(CFj, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableListView");
            ((RefreshableListView) CFj).A00 = i;
        }
        A03(i2);
    }

    public final void A09(C3FQ c3fq) {
        ViewGroup CFj;
        A01(this, true);
        if (c3fq != null && (CFj = c3fq.CFj()) != null) {
            CFj.requestLayout();
        }
        C16930sl c16930sl = C16930sl.A00;
        this.A08 = c16930sl;
        this.A07 = c16930sl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if ((r2 - r7.A01) > (r2 / 2.0f)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.C3FQ r8, boolean r9) {
        /*
            r7 = this;
            r3 = 0
            if (r9 == 0) goto L43
            java.util.List r0 = r7.A08
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L17
            java.util.List r0 = r7.A07
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L43
        L17:
            boolean r0 = r7.A0D
            r5 = 1
            if (r0 != 0) goto L2d
            boolean r0 = r7.A0C
            if (r0 != 0) goto L66
            float r2 = r7.A00
            float r0 = r7.A01
            float r1 = r2 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto L66
        L2d:
            r6 = 1
        L2e:
            r7.A0C = r3
            r7.A0D = r3
            if (r6 == 0) goto L64
            float r4 = r7.A00
        L36:
            float r1 = r7.A00
            float r0 = r7.A01
            float r1 = r1 - r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            float r0 = r7.A0I
            r7.A0F = r0
        L43:
            return
        L44:
            X.3Lq r0 = r7.A06
            if (r0 == 0) goto L43
            boolean r0 = r0.EiW()
            if (r0 != r5) goto L43
            X.2pn r2 = r7.A0J
            r2.A00 = r4
            r2.A03 = r6
            r2.A02 = r3
            r2.A01 = r8
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.A05 = r0
            android.os.Handler r0 = r7.A0H
            r0.post(r2)
            return
        L64:
            r4 = 0
            goto L36
        L66:
            r6 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC60632pm.A0A(X.3FQ, boolean):void");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.A0H.removeCallbacksAndMessages(null);
            return false;
        }
        return false;
    }

    public static final void A00(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, float f) {
        float f2 = viewOnTouchListenerC60632pm.A01;
        viewOnTouchListenerC60632pm.A01 = Math.max(0.0f, Math.min(viewOnTouchListenerC60632pm.A00, f + f2));
        for (View view : viewOnTouchListenerC60632pm.A08) {
            float f3 = viewOnTouchListenerC60632pm.A01;
            if (view.getVisibility() == 0) {
                view.setTranslationY(-f3);
            }
        }
        for (View view2 : viewOnTouchListenerC60632pm.A07) {
            float f4 = -viewOnTouchListenerC60632pm.A01;
            if (view2.getVisibility() == 0) {
                view2.setTranslationY(-f4);
            }
        }
        float f5 = viewOnTouchListenerC60632pm.A00;
        if (f5 != 0.0f) {
            float min = 1.0f - Math.min((viewOnTouchListenerC60632pm.A01 / f5) / 0.7f, 1.0f);
            Iterator it = viewOnTouchListenerC60632pm.A0A.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAlpha(min);
            }
        }
        for (View view3 : viewOnTouchListenerC60632pm.A09) {
            if (viewOnTouchListenerC60632pm.A01 >= viewOnTouchListenerC60632pm.A00) {
                view3.setVisibility(4);
            } else {
                view3.setVisibility(0);
            }
        }
        InterfaceC72173Lq interfaceC72173Lq = viewOnTouchListenerC60632pm.A06;
        if (interfaceC72173Lq != null) {
            float f6 = viewOnTouchListenerC60632pm.A01;
            if (f2 != f6) {
                interfaceC72173Lq.DvV(f6);
            }
        }
    }

    public final void A03(float f) {
        float f2 = this.A00;
        this.A00 = f;
        if (f2 != 0.0f) {
            float f3 = this.A01;
            if (f2 == f3) {
                A00(this, f - f3);
            } else {
                A00(this, 0.0f);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (X.AbstractC60622pl.A02(r5, r0.floatValue()) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(X.C3FQ r5) {
        /*
            r4 = this;
            float r0 = r4.A0E
            X.3Lq r1 = r4.A06
            r3 = 0
            if (r1 == 0) goto L4d
            float r2 = r1.Awi(r5, r0)
            boolean r0 = r4.A0B
            if (r0 == 0) goto L4d
            java.util.List r0 = r4.A08
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L23
            java.util.List r0 = r4.A07
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4d
        L23:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L4d
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L4e
            float r0 = r4.A0F
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L4e
            boolean r0 = r1.Eih(r5)
            if (r0 != 0) goto L4e
            float r1 = r4.A00
            float r0 = r4.A01
            float r1 = r1 - r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = -r2
            float r1 = r4.A0F
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L67
            float r2 = r2 + r1
        L48:
            r4.A0F = r3
        L4a:
            A00(r4, r2)
        L4d:
            return
        L4e:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4a
            boolean r0 = r1.Eig(r5)
            if (r0 != 0) goto L6a
            java.lang.Float r0 = r4.A0K
            if (r0 == 0) goto L4a
            float r0 = r0.floatValue()
            boolean r0 = X.AbstractC60622pl.A02(r5, r0)
            if (r0 != 0) goto L4a
            goto L6a
        L67:
            float r1 = r1 + r2
            r4.A0F = r1
        L6a:
            r2 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC60632pm.A08(X.3FQ):void");
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        float f;
        int A03 = C0f9.A03(-903165419);
        C14360o3.A0B(c3fq, 0);
        if (i2 > 0 && c3fq.AnZ() != 0) {
            if (!c3fq.CXX() && this.A0L) {
                f = i5;
            } else {
                View AnW = c3fq.AnW(c3fq.B6q());
                if (AnW == null) {
                    f = 0.0f;
                } else {
                    int paddingTop = (-AnW.getTop()) + c3fq.CFj().getPaddingTop();
                    int height = AnW.getHeight();
                    int i8 = this.A03;
                    if (i8 == -1) {
                        this.A02 = height;
                        this.A03 = i;
                        i8 = i;
                        this.A04 = paddingTop;
                    }
                    if (i > i8) {
                        i7 = (this.A02 - this.A04) + paddingTop;
                    } else if (i < i8) {
                        f = -((height - paddingTop) + this.A04);
                        this.A02 = height;
                        this.A03 = i;
                        this.A04 = paddingTop;
                    } else {
                        i7 = paddingTop - this.A04;
                    }
                    f = i7;
                    this.A02 = height;
                    this.A03 = i;
                    this.A04 = paddingTop;
                }
            }
            if (this.A0C && f < 0.0f) {
                f = Math.abs(f);
            }
            this.A0E = f;
            A08(c3fq);
            this.A0E = 0.0f;
            i6 = -1510438306;
        } else {
            i6 = -481183226;
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(-1996245223);
        boolean z = false;
        C14360o3.A0B(c3fq, 0);
        if (i == 0) {
            z = true;
        }
        A0A(c3fq, z);
        C0f9.A0A(-1489659014, A03);
    }
}
