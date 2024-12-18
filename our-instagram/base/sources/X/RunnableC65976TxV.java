package X;

/* renamed from: X.TxV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65976TxV implements Runnable {
    public final /* synthetic */ ViewOnTouchListenerC65896Tw0 A00;

    public RunnableC65976TxV(ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0) {
        this.A00 = viewOnTouchListenerC65896Tw0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55982hj c55982hj;
        double A02;
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = this.A00;
        double d = ViewOnTouchListenerC65896Tw0.A0e;
        int i = viewOnTouchListenerC65896Tw0.A09;
        if (i == 3) {
            int min = (int) Math.min(ViewOnTouchListenerC65896Tw0.A00(viewOnTouchListenerC65896Tw0) + viewOnTouchListenerC65896Tw0.A07, ViewOnTouchListenerC65896Tw0.A02(viewOnTouchListenerC65896Tw0));
            c55982hj = viewOnTouchListenerC65896Tw0.A0V;
            A02 = min;
            c55982hj.A08(A02, true);
        } else {
            if (i != 2) {
                return;
            }
            c55982hj = viewOnTouchListenerC65896Tw0.A0V;
            c55982hj.A08(ViewOnTouchListenerC65896Tw0.A02(viewOnTouchListenerC65896Tw0), true);
            A02 = ViewOnTouchListenerC65896Tw0.A02(viewOnTouchListenerC65896Tw0);
        }
        c55982hj.A06(A02);
    }
}
