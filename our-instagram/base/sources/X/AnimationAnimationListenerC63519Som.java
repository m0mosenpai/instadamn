package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.Som, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AnimationAnimationListenerC63519Som implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnimationAnimationListenerC63519Som(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static int A00(View view, Animation animation, Object obj, int i) {
        animation.setAnimationListener(new AnimationAnimationListenerC63519Som(i, view, obj));
        view.startAnimation(animation);
        return view.getHeight();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 != false) goto L6;
     */
    @Override // android.view.animation.Animation.AnimationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationEnd(android.view.animation.Animation r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L31;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A02
            X.SwM r0 = (X.C63947SwM) r0
            boolean r1 = r0.A05
            java.lang.Object r2 = r3.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 8
            if (r1 == 0) goto L14
        L13:
            r0 = 0
        L14:
            r2.setVisibility(r0)
        L17:
            return
        L18:
            java.lang.Object r1 = r3.A02
            X.SwL r1 = (X.C63946SwL) r1
            boolean r0 = r1.A03
            java.lang.Object r2 = r3.A01
            android.view.View r2 = (android.view.View) r2
            if (r0 != 0) goto L13
            r0 = 8
            r2.setVisibility(r0)
            X.Tn9 r0 = r1.A01
            if (r0 == 0) goto L17
            r0.DKZ()
            return
        L31:
            java.lang.Object r0 = r3.A02
            X.SMf r0 = (X.C62691SMf) r0
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnimationAnimationListenerC63519Som.onAnimationEnd(android.view.animation.Animation):void");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
