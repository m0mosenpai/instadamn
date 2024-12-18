package X;

import android.app.Activity;

/* loaded from: classes5.dex */
public final class D2I implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C26025BfE A01;
    public final /* synthetic */ AbstractC25595BTi A02;
    public final /* synthetic */ C189448aO A03;

    public D2I(Activity activity, C26025BfE c26025BfE, AbstractC25595BTi abstractC25595BTi, C189448aO c189448aO) {
        this.A00 = activity;
        this.A03 = c189448aO;
        this.A02 = abstractC25595BTi;
        this.A01 = c26025BfE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        C3DO c3do = C3DN.A00;
        Activity activity = this.A00;
        C189478aR A0x = AbstractC25228BEl.A0x(activity, c3do);
        C3DN A00 = c3do.A00(activity);
        if (A00 != null) {
            bool = Boolean.valueOf(((C3DP) A00).A0n);
        } else {
            bool = null;
        }
        if (A0x != null && AbstractC166997dE.A1Z(bool, false)) {
            A0x.A0G(this.A02, this.A03, this.A01.A0c, false);
        } else {
            this.A03.A00().A02(activity, this.A02);
        }
    }
}
