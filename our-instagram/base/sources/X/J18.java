package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class J18 implements InterfaceC1119253e {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C55942hf A02;
    public final /* synthetic */ HCJ A03;

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
        View view = this.A01;
        if (f2 < 0.0f) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(f2);
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
    }

    public J18(View view, C55942hf c55942hf, HCJ hcj, float f) {
        this.A03 = hcj;
        this.A01 = view;
        this.A00 = f;
        this.A02 = c55942hf;
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        InterfaceC08430c6 interfaceC08430c6 = this.A03.A02;
        if ((interfaceC08430c6 instanceof InterfaceC72783Nz) && ((InterfaceC72783Nz) interfaceC08430c6).isScrolledToTop() && f2 < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1119253e
    public final boolean DBd(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return gestureDetectorOnGestureListenerC148016lX.A04();
    }

    @Override // X.InterfaceC1119253e
    public final void DC2(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, float f5) {
        if (Math.abs(f2) < this.A00) {
            gestureDetectorOnGestureListenerC148016lX.A02(this.A02, 0.0f, 0.0f, f4, f5);
        } else {
            AbstractC25226BEj.A1Q(this.A03);
        }
    }
}
