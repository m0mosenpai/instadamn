package X;

import android.content.Context;
import android.view.MotionEvent;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.ArrayList;

/* renamed from: X.WnD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71058WnD implements InterfaceC149626oF {
    public final C71067WnP A00;
    public final XLV A01;
    public final GestureDetectorOnGestureListenerC71059WnE A02;
    public final GestureDetectorOnGestureListenerC148016lX A03;
    public final TouchInterceptorFrameLayout A04;
    public final C71056WnB A05;

    public C71058WnD(TouchInterceptorFrameLayout touchInterceptorFrameLayout, XLV xlv, float f) {
        C14360o3.A0B(touchInterceptorFrameLayout, 1);
        this.A04 = touchInterceptorFrameLayout;
        this.A01 = xlv;
        C71067WnP c71067WnP = new C71067WnP(touchInterceptorFrameLayout, xlv, f);
        this.A00 = c71067WnP;
        Context A0L = AbstractC166997dE.A0L(touchInterceptorFrameLayout);
        GestureDetectorOnGestureListenerC71059WnE gestureDetectorOnGestureListenerC71059WnE = new GestureDetectorOnGestureListenerC71059WnE(A0L, new C68749VbS(this));
        this.A02 = gestureDetectorOnGestureListenerC71059WnE;
        GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX = new GestureDetectorOnGestureListenerC148016lX(A0L, c71067WnP);
        this.A03 = gestureDetectorOnGestureListenerC148016lX;
        gestureDetectorOnGestureListenerC148016lX.EJW(touchInterceptorFrameLayout.getTranslationX(), touchInterceptorFrameLayout.getTranslationY());
        ArrayList A0z = AbstractC31174DnI.A0z(gestureDetectorOnGestureListenerC71059WnE);
        A0z.add(new C71057WnC(A0L, this, xlv));
        A0z.add(gestureDetectorOnGestureListenerC148016lX);
        this.A05 = new C71056WnB(A0z);
    }

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A05.DMc(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A05.Du7(motionEvent);
    }

    public final void A00() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A04;
        touchInterceptorFrameLayout.setTranslationY(0.0f);
        AbstractC43593JPy.A1A(touchInterceptorFrameLayout);
        this.A05.EJW(touchInterceptorFrameLayout.getTranslationX(), touchInterceptorFrameLayout.getTranslationY());
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
        this.A05.EJW(f, f2);
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
        A00();
        this.A05.destroy();
    }
}
