package X;

import android.os.SystemClock;

/* renamed from: X.AuM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24565AuM implements Runnable {
    public final /* synthetic */ C22862A6i A00;
    public final /* synthetic */ C176137sW A01;

    public RunnableC24565AuM(C22862A6i c22862A6i, C176137sW c176137sW) {
        this.A01 = c176137sW;
        this.A00 = c22862A6i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1808580n.A03("onFirstDataWrittenToFile");
        C22862A6i c22862A6i = this.A00;
        C176097sS c176097sS = c22862A6i.A01;
        c176097sS.A01 = SystemClock.elapsedRealtime();
        C176097sS.A01(c176097sS, C05F.A0Y);
        c176097sS.A08.Ckz(19, "recording_start_finished");
        InterfaceC25203BDb interfaceC25203BDb = c176097sS.A0A;
        if (interfaceC25203BDb != null) {
            c176097sS.A06.post(new RunnableC24732AxG(interfaceC25203BDb, c176097sS, interfaceC25203BDb.now()));
        }
        if (!c176097sS.A07.CUZ(117)) {
            c22862A6i.A00.onFinished();
        }
    }
}
