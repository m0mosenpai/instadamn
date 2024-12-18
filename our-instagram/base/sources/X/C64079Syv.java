package X;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Syv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64079Syv implements C0TT {
    public final long A00;
    public final long A01;
    public final C2SJ A02;
    public final ScheduledExecutorService A03;
    public volatile boolean A04;

    @Override // X.C0TT
    public final void DES(C0TM c0tm) {
    }

    @Override // X.C0TT
    public final int BoH() {
        boolean A1O = AbstractC167007dF.A1O((this.A00 > 0L ? 1 : (this.A00 == 0L ? 0 : -1)));
        if (this.A01 > 0) {
            return (A1O ? 1 : 0) | 1024;
        }
        return A1O ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // X.C0TT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DVg(com.facebook.memorytimeline.MemoryTimeline r15, X.C0TS r16) {
        /*
            r14 = this;
            r0 = r16
            java.util.Collection r0 = r0.A00
            java.util.Iterator r11 = r0.iterator()
        L8:
            boolean r0 = r11.hasNext()
            r5 = 0
            if (r0 == 0) goto L97
            java.lang.Object r10 = r11.next()
            X.0TJ r10 = (X.C0TJ) r10
            X.0TP r1 = r10.A02
            X.0TP r0 = X.C0TP.A0G
            java.lang.String r7 = " bigger than "
            r8 = 1024(0x400, double:5.06E-321)
            if (r1 != r0) goto L9b
            long r2 = r14.A01
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L9b
            long r0 = r10.A00
            long r0 = r0 / r8
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L8
            java.lang.StringBuilder r8 = X.AbstractC166987dD.A1C()
            java.lang.String r4 = "Resident anonymous size of "
            r8.append(r4)
            r8.append(r0)
            r8.append(r7)
            r8.append(r2)
        L3f:
            java.lang.String r11 = r8.toString()
            if (r11 == 0) goto L97
            X.2SJ r0 = r14.A02
            long r12 = java.lang.System.currentTimeMillis()
            X.2SH r0 = r0.A00
            X.0xq r8 = r0.A04
            java.lang.String r7 = "last_dump_time"
            long r0 = r8.getLong(r7, r5)
            long r12 = r12 - r0
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 < 0) goto L98
            long r2 = r9 - r12
        L5f:
            r4 = 0
            r14.A04 = r4
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L8b
            X.2S1 r0 = X.C2S1.A00()
            X.2SC r1 = r0.A02()
            java.lang.String r0 = "Daily"
            r1.A09(r0, r11, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r4 + r9
            X.0xo r1 = r8.ARD()
            r1.E7G(r7, r4)
            java.lang.String r0 = "next_dump_time"
            r1.E7G(r0, r2)
            r1.apply()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
        L8b:
            java.util.concurrent.ScheduledExecutorService r4 = r14.A03
            X.TJt r1 = new X.TJt
            r1.<init>()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.schedule(r1, r2, r0)
        L97:
            return
        L98:
            r2 = 0
            goto L5f
        L9b:
            X.0TP r0 = X.C0TP.A0V
            if (r1 != r0) goto L8
            long r3 = r14.A00
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8
            long r1 = r10.A00
            long r1 = r1 / r8
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L8
            java.lang.StringBuilder r8 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Java heap size of "
            r8.append(r0)
            r8.append(r1)
            r8.append(r7)
            r8.append(r3)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64079Syv.DVg(com.facebook.memorytimeline.MemoryTimeline, X.0TS):void");
    }

    @Override // X.C0TT
    public final boolean FDw() {
        return this.A04;
    }

    public C64079Syv(C2SJ c2sj, ScheduledExecutorService scheduledExecutorService, long j, long j2, long j3, long j4) {
        Random random = new Random();
        if (j2 > 0) {
            this.A00 = random.nextInt((int) ((j2 - j) + 1)) + j;
        }
        if (j4 > 0) {
            this.A01 = j3 + random.nextInt((int) ((j4 - j3) + 1));
        }
        this.A02 = c2sj;
        this.A03 = scheduledExecutorService;
        long currentTimeMillis = System.currentTimeMillis() - c2sj.A00.A04.getLong("last_dump_time", 0L);
        if (86400000 >= currentTimeMillis) {
            long j5 = 86400000 - currentTimeMillis;
            if (j5 > 0) {
                this.A04 = false;
                scheduledExecutorService.schedule(new Runnable() { // from class: X.TJs
                    @Override // java.lang.Runnable
                    public final void run() {
                        C64079Syv.this.A04 = true;
                    }
                }, j5, TimeUnit.MILLISECONDS);
                return;
            }
        }
        this.A04 = true;
    }
}
