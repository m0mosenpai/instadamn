package X;

import com.facebook.blescan.BleScanOperation;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes12.dex */
public final class YIr implements Runnable {
    public final /* synthetic */ BleScanOperation A00;
    public final /* synthetic */ C140286Wg A01;
    public final /* synthetic */ SX8 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C73495YFz A04;
    public final /* synthetic */ C73495YFz A05;
    public final /* synthetic */ C73495YFz A06;

    public YIr(BleScanOperation bleScanOperation, C140286Wg c140286Wg, SX8 sx8, String str, C73495YFz c73495YFz, C73495YFz c73495YFz2, C73495YFz c73495YFz3) {
        this.A01 = c140286Wg;
        this.A04 = c73495YFz;
        this.A00 = bleScanOperation;
        this.A02 = sx8;
        this.A03 = str;
        this.A05 = c73495YFz2;
        this.A06 = c73495YFz3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C73495YFz c73495YFz;
        try {
            c73495YFz = this.A04;
            c73495YFz.A00 = this.A00.get();
        } catch (InterruptedException | CancellationException | ExecutionException unused) {
            c73495YFz = this.A04;
            c73495YFz.A00 = null;
        }
        C140286Wg c140286Wg = this.A01;
        synchronized (c140286Wg) {
            c140286Wg.A00 |= 4;
            C140286Wg.A00(c140286Wg, this.A02, this.A05.A00, this.A06.A00, c73495YFz.A00, this.A03);
        }
    }
}
