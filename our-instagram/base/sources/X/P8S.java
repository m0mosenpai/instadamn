package X;

import android.os.Handler;

/* loaded from: classes9.dex */
public final class P8S implements InterfaceC140616Xp {
    public final Handler A00 = AbstractC167007dF.A0J();
    public final InterfaceC140606Xo A01;

    @Override // X.InterfaceC140616Xp
    public final void DFw(long j) {
        Handler handler = this.A00;
        handler.removeCallbacksAndMessages(null);
        handler.post(new RunnableC57045PSk(this, j, false));
    }

    @Override // X.InterfaceC140616Xp
    public final void DqK(boolean z, long j) {
        Handler handler = this.A00;
        handler.removeCallbacksAndMessages(null);
        handler.post(new RunnableC57045PSk(this, j, true));
    }

    @Override // X.InterfaceC140616Xp
    public final void onStart() {
    }

    @Override // X.InterfaceC140616Xp
    public final void onCancel() {
        this.A00.removeCallbacksAndMessages(null);
    }

    public P8S(InterfaceC140606Xo interfaceC140606Xo) {
        this.A01 = interfaceC140606Xo;
    }
}
