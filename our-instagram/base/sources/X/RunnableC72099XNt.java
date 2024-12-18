package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XNt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC72099XNt extends AtomicReference implements Runnable, C6DH {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final C72092XNm A03;

    @Override // X.C6DH
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        InterfaceC41801wU interfaceC41801wU = (InterfaceC41801wU) obj;
        C6KP.A00(interfaceC41801wU, this);
        C72092XNm c72092XNm = this.A03;
        synchronized (c72092XNm) {
            if (this.A02) {
                C1EM.A00(interfaceC41801wU, null, ((C6D9) c72092XNm.A03).A03);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A04(this);
    }

    public RunnableC72099XNt(C72092XNm c72092XNm) {
        this.A03 = c72092XNm;
    }
}
