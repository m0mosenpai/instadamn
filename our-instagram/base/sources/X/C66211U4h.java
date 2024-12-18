package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;

/* renamed from: X.U4h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66211U4h extends FrameLayout {
    public static final Interpolator A07 = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
    public X7D A00;
    public boolean A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ObjectAnimator A04;
    public final ObjectAnimator A05;
    public final Animator.AnimatorListener A06;

    private void A00(long j, long j2) {
        ObjectAnimator objectAnimator = this.A04;
        if (objectAnimator != null) {
            objectAnimator.setDuration(j);
        }
        ObjectAnimator objectAnimator2 = this.A05;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(j2);
        }
        ObjectAnimator objectAnimator3 = this.A02;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(j);
        }
        ObjectAnimator objectAnimator4 = this.A03;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(j2);
        }
    }

    public static void A01(View view, C66211U4h c66211U4h) {
        X7D x7d = c66211U4h.A00;
        if (x7d != null) {
            C66204U4a c66204U4a = (C66204U4a) x7d;
            for (C66212U4i c66212U4i : c66204U4a.A0G) {
                if (c66212U4i.A00 == view) {
                    c66212U4i.A03.AP7();
                    c66212U4i.A00 = null;
                }
            }
            Iterator it = c66204U4a.A0H.iterator();
            while (it.hasNext()) {
                C66212U4i c66212U4i2 = (C66212U4i) it.next();
                if (c66212U4i2.A00 == view) {
                    it.remove();
                    InterfaceC72001XEp interfaceC72001XEp = c66212U4i2.A03;
                    interfaceC72001XEp.AP7();
                    c66212U4i2.A00 = null;
                    interfaceC72001XEp.destroy();
                }
            }
        }
        c66211U4h.removeView(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (1 == X.AbstractC58319PtB.A08(r2).getLayoutDirection()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.view.View r9, X.C66211U4h r10, java.lang.Integer r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66211U4h.A02(android.view.View, X.U4h, java.lang.Integer, boolean):void");
    }

    public C66211U4h(Context context) {
        super(context);
        U5Q u5q = new U5Q(this, 2);
        this.A06 = u5q;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        Interpolator interpolator = A07;
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.addListener(u5q);
        this.A04 = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setInterpolator(interpolator);
        this.A05 = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        objectAnimator3.setInterpolator(interpolator);
        objectAnimator3.addListener(u5q);
        this.A02 = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        objectAnimator4.setInterpolator(interpolator);
        this.A03 = objectAnimator4;
    }

    public View getPrimaryChild() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        return getChildAt(childCount - 1);
    }

    public void setOnViewRemovedListener(X7D x7d) {
        this.A00 = x7d;
    }
}
