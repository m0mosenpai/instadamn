package X;

import android.text.Spannable;

/* loaded from: classes8.dex */
public final class M4D implements Runnable {
    public final /* synthetic */ Spannable A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public M4D(Spannable spannable, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = spannable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        Spannable spannable = this.A00;
        C14360o3.A0A(spannable);
        interfaceC16660sJ.invoke(spannable);
    }
}
