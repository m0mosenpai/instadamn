package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PSP implements Runnable {
    public int A00;
    public final View A01;
    public final InterfaceC16660sJ A02;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC43592JPx.A19(this.A00, this.A02);
    }

    public PSP(View view, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = view;
        this.A02 = interfaceC16660sJ;
    }
}
