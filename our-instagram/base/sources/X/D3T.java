package X;

import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class D3T extends TimerTask {
    public final /* synthetic */ AbstractC25399BLq A00;

    public D3T(AbstractC25399BLq abstractC25399BLq) {
        this.A00 = abstractC25399BLq;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        AbstractC25399BLq abstractC25399BLq = this.A00;
        C09530e4 c09530e4 = (C09530e4) abstractC25399BLq.A01.get();
        if (c09530e4 != null) {
            AbstractC167007dF.A0J().post(new RunnableC29594D1v(abstractC25399BLq, c09530e4));
        }
        abstractC25399BLq.A00 = null;
    }
}
