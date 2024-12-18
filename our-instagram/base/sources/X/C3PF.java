package X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* renamed from: X.3PF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PF implements View.OnClickListener, View.OnTouchListener, InterfaceC55932he {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final View A06;
    public final C55982hj A07;
    public final C3PE A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final float A0C;
    public final Rect A0D;
    public final GestureDetector A0E;
    public final View.OnAttachStateChangeListener A0F;
    public final C3PH A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public C3PF(final C3P9 c3p9) {
        this.A08 = c3p9.A04;
        View view = c3p9.A0E;
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.3PG
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C3PF c3pf = C3PF.this;
                c3pf.A02 = true;
                View view2 = c3p9.A0E;
                if (!view2.isAttachedToWindow()) {
                    C0w9.A03("BouncyPressStateOnTouchListener", "Long press action detected but touch handling view is no longer attached to the window.");
                    return;
                }
                C3PE c3pe = c3pf.A08;
                if (c3pe == null) {
                    return;
                }
                c3pe.DQY(view2);
            }
        }, new Handler(Looper.getMainLooper()));
        this.A0E = gestureDetector;
        gestureDetector.setIsLongpressEnabled(c3p9.A06);
        this.A04 = c3p9.A02;
        this.A06 = view;
        this.A05 = view.getLayerType();
        this.A09 = c3p9.A0F;
        this.A0B = true;
        this.A0L = c3p9.A0D;
        this.A0D = new Rect();
        this.A0G = new C3PH(this);
        this.A0H = c3p9.A07;
        this.A0A = c3p9.A08;
        this.A0J = c3p9.A0B;
        this.A0K = c3p9.A0C;
        this.A0I = c3p9.A09;
        this.A0C = 0.7f;
        boolean z = c3p9.A0A;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(c3p9.A03);
        A02.A02 = c3p9.A01;
        A02.A00 = c3p9.A00;
        A02.A08(1.0d, true);
        A02.A01();
        A02.A0A(this);
        this.A07 = A02;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: X.3PI
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                C3PF c3pf = C3PF.this;
                c3pf.A07.A0A(c3pf);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                C3PF c3pf = C3PF.this;
                c3pf.A07.A0B(c3pf);
            }
        };
        this.A0F = onAttachStateChangeListener;
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        view.setOnTouchListener(this);
        view.setClickable(false);
        view.setFocusable(true);
        AbstractC010103p.A0B(view, new C02V() { // from class: X.3PJ
            @Override // X.C02V
            public final void A0Y(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                C14360o3.A0B(view2, 0);
                C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                super.A0Y(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClickable(true);
                Integer num = C3P9.this.A05;
                if (num != null) {
                    accessibilityNodeInfoCompat.setClassName(AbstractC58462m5.A00(num));
                }
            }
        });
        if (z) {
            view.setClickable(true);
            C0fQ.A00(this, view);
        }
    }

    public final void A02() {
        this.A00 = false;
        this.A03 = false;
        this.A07.A08(1.0d, true);
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C3PB) list.get(i)).DgY(this);
        }
    }

    public final void A03() {
        View view = this.A06;
        view.setAccessibilityDelegate(null);
        view.removeOnAttachStateChangeListener(this.A0F);
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
        view.setClickable(false);
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r2 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r6.A0G.A01 != false) goto L31;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            r4 = 1
            X.C14360o3.A0B(r8, r4)
            boolean r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto Le
            return r5
        Le:
            X.3PE r1 = r6.A08
            boolean r0 = r1 instanceof X.InterfaceC30935Dip
            if (r0 == 0) goto L1b
            X.Dip r1 = (X.InterfaceC30935Dip) r1
            if (r1 == 0) goto L1b
            r1.Dty(r8, r7)
        L1b:
            int r0 = r8.getAction()
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L5d
            if (r2 == r4) goto L2c
            r0 = 2
            if (r2 == r0) goto L52
            r0 = 3
            if (r2 == r0) goto L2c
        L2b:
            return r3
        L2c:
            android.view.View r0 = r6.A06
            X.3PH r1 = r6.A0G
            r0.removeCallbacks(r1)
            boolean r0 = r6.A0L
            if (r0 == 0) goto L45
            boolean r0 = r1.A01
            if (r0 != 0) goto L45
            if (r2 != r4) goto L42
            r6.A00 = r4
            r6.A01()
        L42:
            r1.run()
        L45:
            r1.A01 = r5
            android.view.MotionEvent r0 = r1.A00
            if (r0 == 0) goto L4e
            r0.recycle()
        L4e:
            r0 = 0
            r1.A00 = r0
            goto L58
        L52:
            X.3PH r0 = r6.A0G
            boolean r0 = r0.A01
            if (r0 == 0) goto L2b
        L58:
            boolean r3 = A00(r8, r6)
            return r3
        L5d:
            X.3PH r3 = r6.A0G
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            android.view.MotionEvent r0 = r3.A00
            if (r0 == 0) goto L6a
            r0.recycle()
        L6a:
            r3.A00 = r1
            android.view.View r2 = r6.A06
            r2.removeCallbacks(r3)
            boolean r0 = r6.A0L
            if (r0 == 0) goto L7c
            r0 = 150(0x96, double:7.4E-322)
            r2.postOnAnimationDelayed(r3, r0)
        L7a:
            r3 = 1
            return r3
        L7c:
            r3.run()
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3PF.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r7.A0A != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.view.MotionEvent r6, X.C3PF r7) {
        /*
            android.graphics.Rect r5 = r7.A0D
            float r0 = r6.getX()
            int r1 = (int) r0
            float r0 = r6.getY()
            int r0 = (int) r0
            boolean r4 = r5.contains(r1, r0)
            int r1 = r6.getAction()
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L8e
            if (r1 == r3) goto L29
            r0 = 2
            if (r1 == r0) goto L87
            r0 = 3
            if (r1 != r0) goto L28
            r7.A04()
            android.view.GestureDetector r0 = r7.A0E
            r0.onTouchEvent(r6)
        L28:
            return r2
        L29:
            if (r4 == 0) goto L28
            android.view.GestureDetector r0 = r7.A0E
            r0.onTouchEvent(r6)
            boolean r0 = r7.A02
            if (r0 != 0) goto L56
            boolean r0 = r7.A0H
            if (r0 == 0) goto L5a
            r7.A03 = r3
            X.2hj r0 = r7.A07
            X.2hk r0 = r0.A09
            double r4 = r0.A00
            float r1 = (float) r4
            float r0 = r7.A04
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L75
            X.3PE r1 = r7.A08
            if (r1 == 0) goto L59
            android.view.View r0 = r7.A06
            r1.DsE(r0)
            r7.A03 = r2
            boolean r0 = r7.A0A
            if (r0 == 0) goto L59
        L56:
            r7.A04()
        L59:
            return r3
        L5a:
            boolean r0 = r7.A0J
            if (r0 == 0) goto L61
            r7.A03 = r3
            goto L56
        L61:
            boolean r0 = r7.A0K
            if (r0 == 0) goto L79
            r7.A00 = r3
            r7.A01()
            X.3PE r1 = r7.A08
            if (r1 == 0) goto L28
            android.view.View r0 = r7.A06
            boolean r2 = r1.DsE(r0)
            return r2
        L75:
            r7.A01()
            return r3
        L79:
            r7.A04()
            X.3PE r1 = r7.A08
            if (r1 == 0) goto L8c
            android.view.View r0 = r7.A06
            boolean r3 = r1.DsE(r0)
            return r3
        L87:
            if (r4 != 0) goto La1
            r7.A04()
        L8c:
            r3 = 0
            return r3
        L8e:
            android.view.View r0 = r7.A06
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r5.set(r2, r2, r1, r0)
            r7.A00 = r2
            r7.A03 = r2
            r7.A02 = r2
        La1:
            r7.A01()
            android.view.GestureDetector r0 = r7.A0E
            r0.onTouchEvent(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3PF.A00(android.view.MotionEvent, X.3PF):boolean");
    }

    public final void A01() {
        C55982hj c55982hj = this.A07;
        c55982hj.A06 = true;
        c55982hj.A06(this.A04);
        if (this.A0I) {
            this.A06.setAlpha(this.A0C);
        }
    }

    public final void A04() {
        C55982hj c55982hj = this.A07;
        c55982hj.A06 = false;
        c55982hj.A06(1.0d);
        if (this.A0I) {
            this.A06.setAlpha(1.0f);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C3PB) list.get(i)).D0H(this);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        boolean z;
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C3PB) list.get(i)).D0I(this);
        }
        if (this.A03) {
            C3PE c3pe = this.A08;
            if (c3pe != null) {
                c3pe.DsE(this.A06);
                this.A03 = false;
                z = this.A0A;
            } else {
                return;
            }
        } else if (!this.A00) {
            return;
        } else {
            z = this.A0K;
        }
        if (z) {
            A04();
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C3PB) list.get(i)).D0J(this);
        }
        C55982hj c55982hj2 = this.A07;
        float f = (float) c55982hj2.A09.A00;
        if (this.A00 && f <= this.A04) {
            c55982hj2.A06(1.0d);
            this.A00 = false;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3PE c3pe;
        int A05 = C0f9.A05(955481908);
        if (!this.A03 && (c3pe = this.A08) != null) {
            c3pe.DsE(this.A06);
        }
        C0f9.A0C(240544357, A05);
    }
}
