package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class J19 implements InterfaceC1119253e {
    public static final C55942hf A07 = C55942hf.A03(0.0d, 5.0d);
    public final float A00;
    public final View A01;
    public final GestureDetectorOnGestureListenerC148016lX A02;
    public final float A03;
    public final int A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;

    public J19(View view, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A05 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        Context context = view.getContext();
        this.A02 = new GestureDetectorOnGestureListenerC148016lX(context, this);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height) + AbstractC167017dG.A0E(context);
        this.A00 = dimensionPixelSize;
        this.A03 = dimensionPixelSize / 3.0f;
        this.A04 = 5;
        view.setOnTouchListener(new ViewOnTouchListenerC42050IkJ(this, 1));
    }

    @Override // X.InterfaceC1119253e
    public final void DC2(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, float f5) {
        C14360o3.A0B(gestureDetectorOnGestureListenerC148016lX, 0);
        if (Math.abs(f) <= this.A03 && Math.abs(f4) <= this.A04) {
            gestureDetectorOnGestureListenerC148016lX.A02(A07, 0.0f, 0.0f, 5.0f, 0.0f);
        } else {
            A00(f4);
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        return true;
    }

    public final void A00(float f) {
        GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX = this.A02;
        int i = 1;
        if (AbstractC13620mo.A02(this.A01.getContext())) {
            i = -1;
        }
        gestureDetectorOnGestureListenerC148016lX.A02(A07, i * this.A00, 0.0f, f, 0.0f);
        this.A06.invoke();
    }

    @Override // X.InterfaceC1119253e
    public final boolean DBd(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        this.A01.getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
        View view = this.A01;
        int i = 1;
        if (AbstractC13620mo.A02(view.getContext())) {
            i = -1;
        }
        if (i * f >= 0.0f) {
            view.setTranslationX(f);
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        this.A05.invoke();
        return true;
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
        this.A01.getParent().requestDisallowInterceptTouchEvent(false);
    }
}
