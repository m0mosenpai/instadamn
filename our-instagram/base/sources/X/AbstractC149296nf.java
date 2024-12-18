package X;

import android.view.TextureView;

/* renamed from: X.6nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC149296nf extends TextureView {
    public InterfaceC73589YMo A00;

    public InterfaceC73589YMo getManagedSurfaceCallback() {
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-611666345);
        super.onAttachedToWindow();
        C0f9.A0D(1227219556, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-191577135);
        super.onDetachedFromWindow();
        C0f9.A0D(-375088802, A06);
    }

    public void setManagedSurfaceCallback(InterfaceC73589YMo interfaceC73589YMo) {
        this.A00 = interfaceC73589YMo;
    }
}
