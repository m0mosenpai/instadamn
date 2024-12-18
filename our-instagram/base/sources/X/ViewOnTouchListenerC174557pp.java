package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC174557pp implements View.OnTouchListener {
    public View A00;
    public float A01;
    public final View A02;
    public final View A03;
    public final int A04;
    public final Runnable A05 = new Runnable() { // from class: X.7pq
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnTouchListenerC174557pp viewOnTouchListenerC174557pp = ViewOnTouchListenerC174557pp.this;
            viewOnTouchListenerC174557pp.A00 = viewOnTouchListenerC174557pp.A03;
            ViewOnTouchListenerC174557pp.A00(viewOnTouchListenerC174557pp);
        }
    };
    public final List A06 = new ArrayList();
    public final /* synthetic */ C174537pn A07;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r6 != 3) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            r3 = 1
            X.C14360o3.A0B(r10, r3)
            X.7pn r0 = r8.A07
            boolean r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L84
            android.view.View r2 = r8.A03
            if (r2 == 0) goto L84
            int r6 = r10.getActionMasked()
            android.view.View r0 = r8.A00
            r5 = 0
            r7 = 3
            if (r0 == 0) goto L21
            r0.dispatchTouchEvent(r10)
            if (r6 == r3) goto L81
            if (r6 == r7) goto L81
        L20:
            return r3
        L21:
            if (r6 != 0) goto L38
            java.util.List r0 = r8.A06
            r0.clear()
            float r0 = r10.getRawX()
            r8.A01 = r0
            java.lang.Runnable r4 = r8.A05
            r2.removeCallbacks(r4)
            r0 = 150(0x96, double:7.4E-322)
            r2.postDelayed(r4, r0)
        L38:
            java.util.List r1 = r8.A06
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            X.C14360o3.A07(r0)
            r1.add(r0)
            if (r6 == r3) goto L71
            r0 = 2
            if (r6 == r0) goto L4c
            if (r6 == r7) goto L71
            return r3
        L4c:
            float r1 = r8.A01
            float r0 = r10.getRawX()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r8.A04
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L20
            android.view.View r1 = r8.A02
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L20
            r8.A00 = r1
            java.lang.Runnable r0 = r8.A05
            r2.removeCallbacks(r0)
            A00(r8)
            return r3
        L71:
            java.lang.Runnable r0 = r8.A05
            r2.removeCallbacks(r0)
            android.view.View r0 = r8.A00
            if (r0 != 0) goto L7c
            r8.A00 = r2
        L7c:
            if (r6 != r3) goto L81
            A00(r8)
        L81:
            r8.A00 = r5
            return r3
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC174557pp.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC174557pp(Context context, View view, View view2, C174537pn c174537pn) {
        this.A07 = c174537pn;
        this.A03 = view;
        this.A02 = view2;
        this.A04 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static final void A00(ViewOnTouchListenerC174557pp viewOnTouchListenerC174557pp) {
        if (viewOnTouchListenerC174557pp.A00 != null) {
            List<MotionEvent> list = viewOnTouchListenerC174557pp.A06;
            for (MotionEvent motionEvent : list) {
                View view = viewOnTouchListenerC174557pp.A00;
                if (view != null) {
                    view.dispatchTouchEvent(motionEvent);
                }
                motionEvent.recycle();
            }
            list.clear();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
