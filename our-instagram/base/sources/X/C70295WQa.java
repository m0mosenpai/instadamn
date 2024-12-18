package X;

import android.os.Handler;

/* renamed from: X.WQa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70295WQa implements InterfaceC09670ek {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AbstractC65952Twx A01;
    public final /* synthetic */ Runnable A02;

    public C70295WQa(Handler handler, AbstractC65952Twx abstractC65952Twx, Runnable runnable) {
        this.A01 = abstractC65952Twx;
        this.A00 = handler;
        this.A02 = runnable;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        if (c07r == C07R.ON_DESTROY) {
            this.A00.removeCallbacks(this.A02);
            c07x.getLifecycle().A0A(this);
        }
    }
}
