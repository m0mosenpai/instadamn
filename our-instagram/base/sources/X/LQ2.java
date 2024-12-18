package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LQ2 implements View.OnDragListener {
    public static int A07;
    public float A00;
    public float A01;
    public final View A02;
    public final AtomicBoolean A03 = AbstractC166997dE.A17();
    public final float A04;
    public final Context A05;
    public final UserSession A06;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[RETURN] */
    @Override // android.view.View.OnDragListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDrag(android.view.View r12, android.view.DragEvent r13) {
        /*
            r11 = this;
            r8 = 1
            X.C14360o3.A0B(r13, r8)
            int r0 = r13.getAction()
            r2 = 0
            switch(r0) {
                case 1: goto Lc2;
                case 2: goto L42;
                case 3: goto L14;
                case 4: goto Lee;
                case 5: goto Lee;
                case 6: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r2
        Ld:
            X.LQ2.A07 = r2
            r2 = 180(0xb4, double:8.9E-322)
            X.MGZ r4 = X.MGZ.A00
            goto L1d
        L14:
            r2 = 50
            r0 = 31
            X.GUm r4 = new X.GUm
            r4.<init>(r11, r0)
        L1d:
            X.0sZ r4 = (X.InterfaceC16820sZ) r4
            android.view.View r0 = r11.A02
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r0 = r1.translationY(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r1 = r0.setDuration(r2)
            X.M4L r0 = new X.M4L
            r0.<init>(r11, r4)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r0)
            goto Lbe
        L42:
            float r0 = r11.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf0
            float r0 = r11.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf0
            java.util.concurrent.atomic.AtomicBoolean r7 = r11.A03
            boolean r0 = r7.get()
            if (r0 != 0) goto Lee
            float r1 = r13.getX()
            float r0 = r11.A00
            float r10 = X.AbstractC166987dD.A01(r1, r0)
            float r1 = r13.getY()
            float r0 = r11.A01
            float r9 = X.AbstractC166987dD.A01(r1, r0)
            int r0 = X.LQ2.A07
            double r5 = (double) r0
            com.instagram.common.session.UserSession r4 = r11.A06
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 37171004916957730(0x840ed500050222, double:3.5704314128825114E-306)
            double r0 = X.C18U.A00(r3, r4, r0)
            double r5 = r5 * r0
            double r3 = (double) r10
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L86
            double r3 = (double) r9
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lee
        L86:
            boolean r0 = r7.compareAndSet(r2, r8)
            if (r0 == 0) goto Lee
            android.view.View r3 = r11.A02
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L9b
            android.view.ViewGroup r0 = X.AbstractC124845kp.A00(r3)
            X.AbstractC46900Koh.A00(r0)
        L9b:
            r0 = 6
            r3.performHapticFeedback(r0)
            android.view.ViewPropertyAnimator r2 = r3.animate()
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            float r0 = X.AbstractC166987dD.A08(r3)
            float r0 = r0 * r1
            android.view.ViewPropertyAnimator r0 = r2.translationY(r0)
            float r1 = r11.A04
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            android.view.ViewPropertyAnimator r2 = r0.scaleX(r1)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
        Lbe:
            r0.start()
            goto Lee
        Lc2:
            android.content.Context r0 = r11.A05
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            X.LQ2.A07 = r0
            android.content.ClipDescription r1 = r13.getClipDescription()
            java.lang.String r0 = "text/plain"
            boolean r0 = r1.hasMimeType(r0)
            if (r0 == 0) goto Lc
            android.content.ClipDescription r0 = r13.getClipDescription()
            java.lang.CharSequence r1 = r0.getLabel()
            r0 = 4915(0x1333, float:6.887E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc
        Lee:
            r2 = 1
            return r2
        Lf0:
            float r0 = r13.getX()
            r11.A00 = r0
            float r0 = r13.getY()
            r11.A01 = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQ2.onDrag(android.view.View, android.view.DragEvent):boolean");
    }

    public LQ2(Context context, View view, UserSession userSession, float f) {
        this.A06 = userSession;
        this.A05 = context;
        this.A02 = view;
        this.A04 = f;
    }
}
