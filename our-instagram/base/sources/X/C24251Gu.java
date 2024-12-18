package X;

import android.os.AsyncTask;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1Gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24251Gu {
    public InterfaceC14020nS A02;
    public InterfaceC08830cm A04;
    public File A03 = C24261Gv.A0G;
    public int A00 = 1000;
    public long A01 = 31457280;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C24251Gu A00(int r7) {
        /*
            X.1Gu r6 = new X.1Gu
            r6.<init>()
            X.1B4 r1 = X.AbstractC23881Ey.A00()
            r0 = 0
            java.io.File r0 = r1.CHo(r0, r7)
            r6.A03 = r0
            r0 = 31457280(0x1e00000, double:1.55419614E-316)
            switch(r7) {
                case 26195652: goto L17;
                case 257799610: goto L17;
                case 274028206: goto L17;
                case 528374993: goto L17;
                case 607242469: goto L17;
                case 630639402: goto L17;
                case 789611494: goto L17;
                case 841047303: goto L22;
                case 914945323: goto L17;
                case 1000143069: goto L17;
                case 1048132585: goto L17;
                case 1162909345: goto L17;
                case 1353049725: goto L17;
                case 1427466249: goto L17;
                case 1474091397: goto L17;
                case 1557477396: goto L22;
                case 1640735657: goto L17;
                case 1648037800: goto L28;
                case 1762211433: goto L17;
                case 1791411823: goto L17;
                case 1861410123: goto L17;
                case 1863054121: goto L17;
                case 1931339941: goto L17;
                default: goto L16;
            }
        L16:
            return r6
        L17:
            X.1Gy r2 = new X.1Gy
            r2.<init>()
            r0 = 5242880(0x500000, double:2.590327E-317)
            r2.A01 = r0
            goto L36
        L22:
            X.1Gy r2 = new X.1Gy
            r2.<init>()
            goto L30
        L28:
            X.1Gy r2 = new X.1Gy
            r2.<init>()
            r0 = 52428800(0x3200000, double:2.5903269E-316)
        L30:
            r2.A01 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A00 = r0
        L36:
            r0 = 1
            r2.A05 = r0
            X.1FB r5 = r2.A00()
            long r1 = r5.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L47
            r6.A01 = r1
        L47:
            long r1 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L16
            int r0 = (int) r1
            r6.A00 = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24251Gu.A00(int):X.1Gu");
    }

    public final C24261Gv A01() {
        C1NR c1nr;
        ThreadPoolExecutor threadPoolExecutor = C24261Gv.A0H;
        File file = this.A03;
        long j = this.A01;
        int i = this.A00;
        InterfaceC14020nS interfaceC14020nS = this.A02;
        InterfaceC08830cm interfaceC08830cm = this.A04;
        if (interfaceC08830cm != null) {
            c1nr = (C1NR) interfaceC08830cm.get();
        } else {
            c1nr = null;
        }
        return new C24261Gv(c1nr, interfaceC14020nS, file, i, j);
    }

    public C24251Gu() {
        final Executor executor = AsyncTask.SERIAL_EXECUTOR;
        executor.getClass();
        this.A02 = new InterfaceC14020nS(executor) { // from class: X.0vT
            public final Executor A00;

            @Override // X.InterfaceC14020nS
            public final void ATN(C14160ng c14160ng) {
                this.A00.execute(c14160ng);
            }

            @Override // X.InterfaceC14020nS
            public final void ATO(AbstractRunnableC14200nk abstractRunnableC14200nk) {
                this.A00.execute(abstractRunnableC14200nk);
            }

            {
                this.A00 = executor;
            }
        };
        this.A04 = null;
    }
}
