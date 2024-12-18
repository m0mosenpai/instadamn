package X;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class CU4 {
    public boolean A00;
    public final Handler A01 = AbstractC167007dF.A0J();
    public final RunnableC29571D0y A02 = new RunnableC29571D0y(this);
    public final InterfaceC16820sZ A03;

    public final void A00() {
        if (this.A00) {
            this.A00 = false;
            this.A01.removeCallbacks(this.A02);
        }
    }

    public CU4(InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = interfaceC16820sZ;
    }
}
