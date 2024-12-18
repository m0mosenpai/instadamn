package X;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes10.dex */
public final class SZM {
    public static final List A0M = Collections.singletonList(EnumC61215RhF.HTTP_1_1);
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public ScheduledExecutorService A05;
    public ScheduledFuture A06;
    public TIU A07;
    public THM A08;
    public C63154Se2 A09;
    public SZF A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final long A0E;
    public final Runnable A0F;
    public final String A0G;
    public final Random A0J;
    public final C62696SMk A0K;
    public final AbstractC61527Rp3 A0L;
    public final ArrayDeque A0I = new ArrayDeque();
    public final ArrayDeque A0H = new ArrayDeque();
    public int A00 = -1;

    public final void A00(Exception exc) {
        synchronized (this) {
            if (this.A0D) {
                return;
            }
            this.A0D = true;
            THM thm = this.A08;
            this.A08 = null;
            ScheduledFuture scheduledFuture = this.A06;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.A05;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                C65140TeF c65140TeF = (C65140TeF) this.A0L;
                c65140TeF.A00.scheduleCallback(new RunnableC64629TNl(c65140TeF, exc), 0L);
            } finally {
                AbstractC63404SjZ.A09(thm);
            }
        }
    }

    public SZM(Random random, C62696SMk c62696SMk, AbstractC61527Rp3 abstractC61527Rp3, long j) {
        String str = c62696SMk.A00;
        if ("GET".equals(str)) {
            this.A0K = c62696SMk;
            this.A0L = abstractC61527Rp3;
            this.A0J = random;
            this.A0E = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.A0G = SUM.A00(C64531TIl.A03(bArr).data);
            this.A0F = new Runnable() { // from class: X.TM4
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
                
                    return;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v8, types: [X.TWX, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r10 = this;
                        X.SZM r4 = X.SZM.this
                    L2:
                        monitor-enter(r4)     // Catch: java.io.IOException -> L9b
                        boolean r0 = r4.A0D     // Catch: java.lang.Throwable -> L93
                        if (r0 != 0) goto L91
                        X.SZF r3 = r4.A0A     // Catch: java.lang.Throwable -> L93
                        java.util.ArrayDeque r0 = r4.A0I     // Catch: java.lang.Throwable -> L93
                        java.lang.Object r8 = r0.poll()     // Catch: java.lang.Throwable -> L93
                        X.TIl r8 = (X.C64531TIl) r8     // Catch: java.lang.Throwable -> L93
                        r1 = -1
                        r7 = 0
                        if (r8 != 0) goto L46
                        java.util.ArrayDeque r0 = r4.A0H     // Catch: java.lang.Throwable -> L93
                        java.lang.Object r9 = r0.poll()     // Catch: java.lang.Throwable -> L93
                        boolean r0 = r9 instanceof X.C62462SCp     // Catch: java.lang.Throwable -> L93
                        if (r0 == 0) goto L40
                        int r0 = r4.A00     // Catch: java.lang.Throwable -> L93
                        if (r0 == r1) goto L2d
                        X.THM r5 = r4.A08     // Catch: java.lang.Throwable -> L93
                        r4.A08 = r7     // Catch: java.lang.Throwable -> L93
                        java.util.concurrent.ScheduledExecutorService r0 = r4.A05     // Catch: java.lang.Throwable -> L93
                        r0.shutdown()     // Catch: java.lang.Throwable -> L93
                        goto L44
                    L2d:
                        java.util.concurrent.ScheduledExecutorService r6 = r4.A05     // Catch: java.lang.Throwable -> L93
                        X.TM5 r5 = new X.TM5     // Catch: java.lang.Throwable -> L93
                        r5.<init>(r4)     // Catch: java.lang.Throwable -> L93
                        r1 = 60000(0xea60, double:2.9644E-319)
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L93
                        java.util.concurrent.ScheduledFuture r0 = r6.schedule(r5, r1, r0)     // Catch: java.lang.Throwable -> L93
                        r4.A06 = r0     // Catch: java.lang.Throwable -> L93
                        goto L43
                    L40:
                        if (r9 != 0) goto L43
                        goto L91
                    L43:
                        r5 = r7
                    L44:
                        r7 = r9
                        goto L47
                    L46:
                        r5 = r7
                    L47:
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L93
                        if (r8 == 0) goto L50
                        r0 = 10
                        X.SZF.A00(r3, r8, r0)     // Catch: java.lang.Throwable -> L96
                        goto L83
                    L50:
                        boolean r0 = r7 instanceof X.C62462SCp     // Catch: java.lang.Throwable -> L96
                        if (r0 == 0) goto L88
                        X.SCp r7 = (X.C62462SCp) r7     // Catch: java.lang.Throwable -> L96
                        r2 = 1000(0x3e8, float:1.401E-42)
                        X.TIl r1 = r7.A00     // Catch: java.lang.Throwable -> L96
                        X.TWX r0 = new X.TWX     // Catch: java.lang.Throwable -> L96
                        r0.<init>()     // Catch: java.lang.Throwable -> L96
                        r0.A0D(r2)     // Catch: java.lang.Throwable -> L96
                        r1.A0A(r0)     // Catch: java.lang.Throwable -> L96
                        X.TIl r2 = r0.A08()     // Catch: java.lang.Throwable -> L96
                        r0 = 8
                        r1 = 1
                        X.SZF.A00(r3, r2, r0)     // Catch: java.lang.Throwable -> L8d
                        r3.A00 = r1     // Catch: java.lang.Throwable -> L96
                        if (r5 == 0) goto L83
                        X.Rp3 r0 = r4.A0L     // Catch: java.lang.Throwable -> L96
                        X.TeF r0 = (X.C65140TeF) r0     // Catch: java.lang.Throwable -> L96
                        com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl r3 = r0.A00     // Catch: java.lang.Throwable -> L96
                        X.TKe r2 = new X.TKe     // Catch: java.lang.Throwable -> L96
                        r2.<init>(r0)     // Catch: java.lang.Throwable -> L96
                        r0 = 0
                        r3.scheduleCallback(r2, r0)     // Catch: java.lang.Throwable -> L96
                    L83:
                        X.AbstractC63404SjZ.A09(r5)     // Catch: java.io.IOException -> L9b
                        goto L2
                    L88:
                        java.lang.AssertionError r0 = X.AbstractC58318PtA.A0V()     // Catch: java.lang.Throwable -> L96
                        goto L90
                    L8d:
                        r0 = move-exception
                        r3.A00 = r1     // Catch: java.lang.Throwable -> L96
                    L90:
                        throw r0     // Catch: java.lang.Throwable -> L96
                    L91:
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L93
                        return
                    L93:
                        r0 = move-exception
                        monitor-exit(r4)     // Catch: java.lang.Throwable -> L93
                        goto L9a
                    L96:
                        r0 = move-exception
                        X.AbstractC63404SjZ.A09(r5)     // Catch: java.io.IOException -> L9b
                    L9a:
                        throw r0     // Catch: java.io.IOException -> L9b
                    L9b:
                        r0 = move-exception
                        r4.A00(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.TM4.run():void");
                }
            };
            return;
        }
        throw AbstractC167007dF.A0c("Request must be GET: ", str);
    }
}
