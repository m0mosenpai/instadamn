package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;

/* renamed from: X.Sv2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63870Sv2 implements InterfaceC65479Tkw, C07W {
    public final C07T A00;
    public final java.util.Set A01 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC65479Tkw
    public final void A8y(InterfaceC65538TmA interfaceC65538TmA) {
        this.A01.add(interfaceC65538TmA);
        C07T c07t = this.A00;
        if (c07t.A07() == C07S.DESTROYED) {
            interfaceC65538TmA.onDestroy();
        } else if (c07t.A07().A00(C07S.STARTED)) {
            interfaceC65538TmA.onStart();
        } else {
            interfaceC65538TmA.onStop();
        }
    }

    @Override // X.InterfaceC65479Tkw
    public final void EFW(InterfaceC65538TmA interfaceC65538TmA) {
        this.A01.remove(interfaceC65538TmA);
    }

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public void onDestroy(C07X c07x) {
        Iterator A0y = AbstractC58322PtE.A0y(this.A01);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onDestroy();
        }
        c07x.getLifecycle().A0A(this);
    }

    @OnLifecycleEvent(C07R.ON_START)
    public void onStart(C07X c07x) {
        Iterator A0y = AbstractC58322PtE.A0y(this.A01);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStart();
        }
    }

    @OnLifecycleEvent(C07R.ON_STOP)
    public void onStop(C07X c07x) {
        Iterator A0y = AbstractC58322PtE.A0y(this.A01);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStop();
        }
    }

    public C63870Sv2(C07T c07t) {
        this.A00 = c07t;
        c07t.A09(this);
    }
}
