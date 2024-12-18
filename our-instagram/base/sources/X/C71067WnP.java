package X;

import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.WnP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71067WnP implements InterfaceC1119253e {
    public static final C55942hf A04 = C55942hf.A04(40.0d, 8.0d);
    public boolean A00 = true;
    public final float A01;
    public final TouchInterceptorFrameLayout A02;
    public final XLV A03;

    public C71067WnP(TouchInterceptorFrameLayout touchInterceptorFrameLayout, XLV xlv, float f) {
        this.A03 = xlv;
        this.A02 = touchInterceptorFrameLayout;
        this.A01 = f;
    }

    @Override // X.InterfaceC1119253e
    public final boolean DBd(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        C14360o3.A0B(gestureDetectorOnGestureListenerC148016lX, 0);
        this.A03.DBc(f);
        return gestureDetectorOnGestureListenerC148016lX.A04();
    }

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
        C14360o3.A0B(gestureDetectorOnGestureListenerC148016lX, 0);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A02;
        touchInterceptorFrameLayout.setTranslationY(0.5f * f2);
        float A042 = (float) AbstractC70163Da.A04(Math.min(Math.max(Math.abs(f3), 0.0d), touchInterceptorFrameLayout.getHeight()), 0.0d, touchInterceptorFrameLayout.getHeight(), 1.0d, 0.0d);
        float A03 = (float) AbstractC70163Da.A03(A042, this.A01, 1.0d);
        touchInterceptorFrameLayout.setPivotX(touchInterceptorFrameLayout.getWidth() / 2);
        touchInterceptorFrameLayout.setPivotY(touchInterceptorFrameLayout.getHeight() / 2);
        touchInterceptorFrameLayout.setScaleX(A03);
        touchInterceptorFrameLayout.setScaleY(A03);
        if (z) {
            XLV xlv = this.A03;
            if (f2 <= 0.0f) {
                A042 = 1.0f;
            }
            xlv.DC6(A042);
        }
    }

    @Override // X.InterfaceC1119253e
    public final void DC2(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, float f5) {
        C14360o3.A0B(gestureDetectorOnGestureListenerC148016lX, 0);
        boolean z = true;
        boolean A1O = AbstractC167007dF.A1O((f2 > 400.0f ? 1 : (f2 == 400.0f ? 0 : -1)));
        if (f2 <= 0.0f || f5 <= 1250.0f) {
            z = false;
        }
        if (!A1O && !z) {
            this.A03.DC6(1.0f);
            gestureDetectorOnGestureListenerC148016lX.A02(A04, 0.0f, 0.0f, f4, f5);
        } else {
            this.A03.DRR();
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        if (this.A00 && f2 < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return this.A03.DsQ(this.A02, f, f2);
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
        this.A03.Dwm();
    }
}
