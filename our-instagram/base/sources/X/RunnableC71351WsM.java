package X;

import android.view.View;

/* renamed from: X.WsM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71351WsM implements Runnable {
    public final /* synthetic */ WjI A00;

    public RunnableC71351WsM(WjI wjI) {
        this.A00 = wjI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WjI wjI = this.A00;
        C66627UPp c66627UPp = wjI.A00;
        int i = 0;
        AbstractC167007dF.A0L(wjI.A0G).setVisibility(AbstractC167007dF.A05(c66627UPp.A04 ? 1 : 0));
        AbstractC167007dF.A0L(wjI.A0D).setVisibility(AbstractC167007dF.A05(c66627UPp.A02 ? 1 : 0));
        View A0L = AbstractC167007dF.A0L(wjI.A0A);
        if (!c66627UPp.A00) {
            i = 8;
        }
        A0L.setVisibility(i);
    }
}
