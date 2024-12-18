package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class M1D implements Runnable {
    public final /* synthetic */ C49165Loi A00;

    public M1D(C49165Loi c49165Loi) {
        this.A00 = c49165Loi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC56392iX interfaceC56392iX = this.A00.A05;
        if (interfaceC56392iX.CGb() != 8) {
            View view = interfaceC56392iX.getView();
            AbstractC166997dE.A1L(view, view.isAttachedToWindow());
        }
    }
}
