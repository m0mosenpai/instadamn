package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.AuU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24573AuU implements Runnable {
    public final /* synthetic */ C1MS A00;
    public final /* synthetic */ Map.Entry A01;

    public RunnableC24573AuU(C1MS c1ms, Map.Entry entry) {
        this.A00 = c1ms;
        this.A01 = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map.Entry entry = this.A01;
        C1MF c1mf = (C1MF) entry.getValue();
        synchronized (c1mf) {
            this.A00.A03(c1mf, (File) entry.getKey());
        }
    }
}
