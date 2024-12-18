package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.AuV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24574AuV implements Runnable {
    public final /* synthetic */ C1MS A00;
    public final /* synthetic */ Map.Entry A01;

    public RunnableC24574AuV(C1MS c1ms, Map.Entry entry) {
        this.A00 = c1ms;
        this.A01 = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map.Entry entry = this.A01;
        synchronized (entry.getValue()) {
            C23111Aq c23111Aq = this.A00.A07;
            c23111Aq.A08.A00((File) entry.getKey());
        }
    }
}
