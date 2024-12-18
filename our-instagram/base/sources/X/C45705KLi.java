package X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.KLi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45705KLi extends AbstractRunnableC14200nk {
    public final /* synthetic */ C46104Kb4 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45705KLi(C46104Kb4 c46104Kb4) {
        super(1978777196, 3, false, false);
        this.A00 = c46104Kb4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C46104Kb4 c46104Kb4 = this.A00;
        RealtimeClientManager.Observer observer = c46104Kb4.A05;
        if (observer != null) {
            RealtimeClientManager.getInstance(c46104Kb4.A04).removeObserver(observer);
        }
        c46104Kb4.A05 = null;
        C41761wQ c41761wQ = c46104Kb4.A02;
        if (c41761wQ != null) {
            c41761wQ.A00.dispose();
        }
        c46104Kb4.A02 = null;
        C41761wQ c41761wQ2 = c46104Kb4.A03;
        if (c41761wQ2 != null) {
            c41761wQ2.A00.dispose();
        }
        c46104Kb4.A03 = null;
        InterfaceC41501vz interfaceC41501vz = c46104Kb4.A00;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(c46104Kb4.A04).A02(interfaceC41501vz, C43686JTv.class);
        }
        c46104Kb4.A00 = null;
        InterfaceC41501vz interfaceC41501vz2 = c46104Kb4.A01;
        if (interfaceC41501vz2 != null) {
            AbstractC25651Mw.A00(c46104Kb4.A04).A02(interfaceC41501vz2, C5EX.class);
        }
        c46104Kb4.A01 = null;
    }
}
