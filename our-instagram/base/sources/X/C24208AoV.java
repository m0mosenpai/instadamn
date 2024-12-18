package X;

import android.os.Handler;

/* renamed from: X.AoV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24208AoV implements InterfaceC58133Ppw {
    public final /* synthetic */ C8YE A00;

    public C24208AoV(C8YE c8ye) {
        this.A00 = c8ye;
    }

    @Override // X.InterfaceC58133Ppw
    public final void D7c(boolean z, String str) {
        this.A00.A0A.E4v();
    }

    @Override // X.InterfaceC58133Ppw
    public final void D7d(String str) {
        C8YE.A03(this.A00, str);
    }

    @Override // X.InterfaceC58133Ppw
    public final void onFinish() {
        C8YE c8ye = this.A00;
        Runnable runnable = c8ye.A02;
        if (runnable != null) {
            Handler handler = c8ye.A05;
            C14360o3.A0A(runnable);
            handler.removeCallbacks(runnable);
            c8ye.A02 = null;
        }
    }
}
