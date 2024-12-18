package X;

import android.graphics.Bitmap;

/* loaded from: classes8.dex */
public final class LS3 implements BCS {
    public final InterfaceC16660sJ A00;

    @Override // X.BCS
    public final void Czc(Bitmap bitmap) {
        this.A00.invoke(new C44911JuP(bitmap));
    }

    @Override // X.BCS
    public final void D2I(Exception exc) {
        this.A00.invoke(new C44912JuQ(exc, C05F.A00));
    }

    public LS3(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
