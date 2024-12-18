package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.WYk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70479WYk implements XD7 {
    public boolean A00;
    public final Object A01 = new Object();
    public volatile C70193WFw A02;

    @Override // X.XD7
    public final void cancel() {
        AGG(null);
    }

    @Override // X.XD7
    public final void AGG(String str) {
        C70193WFw c70193WFw = this.A02;
        if (c70193WFw != null) {
            synchronized (c70193WFw) {
            }
            ExecutorService executorService = c70193WFw.A0P;
            if (executorService != null) {
                executorService.execute(new RunnableC71269Wqy(c70193WFw));
            }
            this.A02 = null;
        }
    }

    @Override // X.XD7
    public final void FDu() {
        Object obj = this.A01;
        synchronized (obj) {
            if (!this.A00) {
                obj.wait();
            }
        }
    }

    public C70479WYk(C70193WFw c70193WFw) {
        this.A02 = c70193WFw;
    }
}
