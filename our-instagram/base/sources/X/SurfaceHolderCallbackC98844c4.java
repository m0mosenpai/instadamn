package X;

import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.4c4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SurfaceHolderCallbackC98844c4 extends AbstractC97724aA implements SurfaceHolder.Callback {
    public A6H A00;
    public final Surface A01;
    public final SurfaceView A02;
    public final View A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;
    public final Handler A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SurfaceHolderCallbackC98844c4(android.view.SurfaceView r5, com.instagram.common.session.UserSession r6, X.C4QT r7, int r8, boolean r9) {
        /*
            r4 = this;
            r2 = 1
            r0 = 3
            X.C14360o3.A0B(r5, r0)
            r4.<init>(r7, r8)
            r4.A04 = r6
            r4.A02 = r5
            r4.A06 = r9
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36316224820809903(0x81056a000710af, double:3.029865038155447E-306)
            boolean r0 = X.C18U.A06(r3, r6, r0)
            if (r0 == 0) goto L69
            X.0do r0 = X.AbstractC47185KtK.A00
            java.lang.Object r0 = r0.getValue()
            android.os.HandlerThread r0 = (android.os.HandlerThread) r0
            android.os.Looper r1 = r0.getLooper()
            if (r1 != 0) goto L30
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.C14360o3.A07(r1)
        L30:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
        L35:
            r4.A07 = r0
            r0 = 45
            X.9EK r1 = new X.9EK
            r1.<init>(r4, r0)
            java.lang.String r0 = "SurfaceVideoViewController.init()"
            X.AbstractC97734aB.A00(r0, r1)
            r4.A03 = r5
            android.view.SurfaceHolder r0 = r5.getHolder()
            android.view.Surface r0 = r0.getSurface()
            r1 = 1
            if (r0 == 0) goto L67
            boolean r0 = r0.isValid()
            if (r0 != r2) goto L67
        L56:
            r4.A05 = r1
            if (r1 == 0) goto L65
            android.view.SurfaceHolder r0 = r5.getHolder()
            android.view.Surface r0 = r0.getSurface()
        L62:
            r4.A01 = r0
            return
        L65:
            r0 = 0
            goto L62
        L67:
            r1 = 0
            goto L56
        L69:
            r0 = 36316224820744366(0x81056a000610ae, double:3.029865038114001E-306)
            boolean r0 = X.C18U.A06(r3, r6, r0)
            if (r0 == 0) goto L79
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L30
        L79:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolderCallbackC98844c4.<init>(android.view.SurfaceView, com.instagram.common.session.UserSession, X.4QT, int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC97724aA
    public final void A06(InterfaceC74623Ww interfaceC74623Ww) {
        ViewGroup viewGroup;
        super.A06(interfaceC74623Ww);
        A6H a6h = this.A00;
        if (a6h != null && !C14360o3.A0K(a6h.A00, false) && (interfaceC74623Ww instanceof View)) {
            View view = (View) interfaceC74623Ww;
            ViewParent parent = view.getParent();
            Object obj = null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C12500ku c12500ku = new C12500ku(viewGroup);
                while (true) {
                    if (!c12500ku.hasNext()) {
                        break;
                    }
                    Object next = c12500ku.next();
                    if (next instanceof IgImageView) {
                        obj = next;
                        break;
                    }
                }
                View view2 = (View) obj;
                if (view2 != null) {
                    viewGroup.removeView(view2);
                    viewGroup.addView(view2, viewGroup.indexOfChild(view) + 1);
                    a6h.A00 = false;
                    view2.getWidth();
                    view2.getHeight();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        A00(this, new C207099Eo(this, i2, i3, 5));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C14360o3.A0B(surfaceHolder, 0);
        AbstractC97734aB.A00("SurfaceVideoViewController.surfaceCreated()", new C9F7(40, surfaceHolder, this));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C14360o3.A0B(surfaceHolder, 0);
        A00(this, new C9F7(42, surfaceHolder, this));
    }

    public static final void A00(SurfaceHolderCallbackC98844c4 surfaceHolderCallbackC98844c4, InterfaceC16820sZ interfaceC16820sZ) {
        Handler handler = surfaceHolderCallbackC98844c4.A07;
        if (handler != null) {
            handler.post(new RunnableC24500AtJ(interfaceC16820sZ));
        } else {
            interfaceC16820sZ.invoke();
        }
    }
}
