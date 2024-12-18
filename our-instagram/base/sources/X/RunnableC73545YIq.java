package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.YIq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73545YIq implements Runnable {
    public final /* synthetic */ C140286Wg A00;
    public final /* synthetic */ SX8 A01;
    public final /* synthetic */ QFS A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C73495YFz A04;
    public final /* synthetic */ C73495YFz A05;
    public final /* synthetic */ C73495YFz A06;

    public RunnableC73545YIq(C140286Wg c140286Wg, SX8 sx8, QFS qfs, String str, C73495YFz c73495YFz, C73495YFz c73495YFz2, C73495YFz c73495YFz3) {
        this.A00 = c140286Wg;
        this.A06 = c73495YFz;
        this.A02 = qfs;
        this.A01 = sx8;
        this.A03 = str;
        this.A05 = c73495YFz2;
        this.A04 = c73495YFz3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C73495YFz c73495YFz;
        try {
            c73495YFz = this.A06;
            c73495YFz.A00 = this.A02.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            c73495YFz = this.A06;
            c73495YFz.A00 = null;
        }
        C140286Wg c140286Wg = this.A00;
        synchronized (c140286Wg) {
            c140286Wg.A00 |= 2;
            C140286Wg.A00(c140286Wg, this.A01, this.A05.A00, c73495YFz.A00, this.A04.A00, this.A03);
        }
    }
}
