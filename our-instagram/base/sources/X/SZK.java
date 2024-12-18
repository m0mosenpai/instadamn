package X;

import android.os.Handler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class SZK {
    public long A02;
    public InterfaceC65618To9 A03;
    public InterfaceC65367Tiz A04;
    public C4N0 A05;
    public InterfaceC65546TmL A06;
    public Runnable A07;
    public Runnable A08;
    public Future A09;
    public boolean A0A;
    public final Handler A0B;
    public final InterfaceC65366Tiy A0C;
    public final ExecutorService A0D;
    public final ScheduledExecutorService A0E;
    public final RealtimeSinceBootClock A0F;
    public final SME A0G;
    public int A01 = 0;
    public int A00 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r8.A0A != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r1.CLP(r6) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A01() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SZK.A01():void");
    }

    public static void A00(SZK szk) {
        Future future = szk.A09;
        if (future != null) {
            future.cancel(false);
            szk.A09 = null;
        }
        C4N1 A00 = szk.A05.A00();
        szk.A06 = new T1W(A00.A04, A00.A07, A00.A05);
        SME sme = szk.A0G;
        sme.A00 = sme.A01;
        szk.A01 = 0;
    }

    public SZK(Handler handler, InterfaceC65618To9 interfaceC65618To9, RealtimeSinceBootClock realtimeSinceBootClock, InterfaceC65366Tiy interfaceC65366Tiy, InterfaceC65367Tiz interfaceC65367Tiz, C4N0 c4n0, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A0F = realtimeSinceBootClock;
        this.A0C = interfaceC65366Tiy;
        this.A0D = executorService;
        this.A0E = scheduledExecutorService;
        this.A0B = handler;
        this.A05 = c4n0;
        this.A04 = interfaceC65367Tiz;
        this.A03 = interfaceC65618To9;
        C4N1 A00 = c4n0.A00();
        this.A0G = new SME(A00.A02, A00.A03);
    }
}
