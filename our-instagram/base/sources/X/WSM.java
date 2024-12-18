package X;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class WSM implements InterfaceC71966XCw {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public int A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C69712Vu7 A0A;
    public final AbstractC69657Vsy A0B;

    @Override // X.InterfaceC71966XCw
    public final /* bridge */ /* synthetic */ InterfaceC71878X8l AN9() {
        if (this.A05 == 0) {
            return null;
        }
        return new C70337WRr(this);
    }

    @Override // X.InterfaceC71966XCw
    public final long E7p(XGj xGj) {
        long j;
        long j2;
        long j3;
        int i = this.A06;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return -1L;
                    }
                } else {
                    long j4 = this.A02;
                    long j5 = this.A00;
                    if (j4 != j5) {
                        long BeZ = xGj.BeZ();
                        C69712Vu7 c69712Vu7 = this.A0A;
                        if (!c69712Vu7.A00(xGj, j5)) {
                            j2 = this.A02;
                            if (j2 == BeZ) {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            c69712Vu7.A01(xGj, false);
                            xGj.EJn();
                            long j6 = this.A04;
                            long j7 = c69712Vu7.A04;
                            long j8 = j6 - j7;
                            int i2 = c69712Vu7.A01 + c69712Vu7.A00;
                            if (0 > j8 || j8 >= 72000) {
                                if (j8 < 0) {
                                    this.A00 = BeZ;
                                    this.A01 = j7;
                                } else {
                                    this.A02 = xGj.BeZ() + i2;
                                    this.A03 = j7;
                                }
                                long j9 = this.A00;
                                j2 = this.A02;
                                long j10 = j9 - j2;
                                if (j10 < 100000) {
                                    this.A00 = j2;
                                } else {
                                    long j11 = i2;
                                    if (j8 <= 0) {
                                        j3 = 2;
                                    } else {
                                        j3 = 1;
                                    }
                                    j2 = Math.max(j2, Math.min((xGj.BeZ() - (j11 * j3)) + ((j8 * j10) / (this.A01 - this.A03)), j9 - 1));
                                }
                            }
                        }
                        if (j2 != -1) {
                            return j2;
                        }
                    }
                    this.A06 = 3;
                }
                while (true) {
                    C69712Vu7 c69712Vu72 = this.A0A;
                    c69712Vu72.A00(xGj, -1L);
                    c69712Vu72.A01(xGj, false);
                    if (c69712Vu72.A04 > this.A04) {
                        xGj.EJn();
                        this.A06 = 4;
                        return -(this.A03 + 2);
                    }
                    xGj.Em8(c69712Vu72.A01 + c69712Vu72.A00);
                    this.A02 = xGj.BeZ();
                    this.A03 = c69712Vu72.A04;
                }
            }
        } else {
            long BeZ2 = xGj.BeZ();
            this.A07 = BeZ2;
            this.A06 = 1;
            long j12 = this.A08 - 65307;
            if (j12 > BeZ2) {
                return j12;
            }
        }
        C69712Vu7 c69712Vu73 = this.A0A;
        c69712Vu73.A03 = 0;
        c69712Vu73.A04 = 0L;
        c69712Vu73.A02 = 0;
        c69712Vu73.A01 = 0;
        c69712Vu73.A00 = 0;
        if (c69712Vu73.A00(xGj, -1L)) {
            c69712Vu73.A01(xGj, false);
            xGj.Em8(c69712Vu73.A01 + c69712Vu73.A00);
            while (true) {
                j = c69712Vu73.A04;
                if ((c69712Vu73.A03 & 4) == 4 || !c69712Vu73.A00(xGj, -1L) || xGj.BeZ() >= this.A08 || !c69712Vu73.A01(xGj, true)) {
                    break;
                }
                try {
                    xGj.Em8(c69712Vu73.A01 + c69712Vu73.A00);
                } catch (EOFException unused) {
                }
            }
            this.A05 = j;
            this.A06 = 4;
            return this.A07;
        }
        throw new EOFException();
    }

    @Override // X.InterfaceC71966XCw
    public final void Enx(long j) {
        long j2 = this.A05;
        this.A04 = Math.max(0L, Math.min(j, j2 - 1));
        this.A06 = 2;
        this.A02 = this.A09;
        this.A00 = this.A08;
        this.A03 = 0L;
        this.A01 = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r9 <= r7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WSM(X.AbstractC69657Vsy r6, long r7, long r9, long r11, long r13, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 0
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto Lf
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L10
        Lf:
            r0 = 0
        L10:
            X.WDn.A01(r0)
            r5.A0B = r6
            r5.A09 = r7
            r5.A08 = r9
            long r9 = r9 - r7
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L2a
            if (r15 != 0) goto L2a
            r5.A06 = r2
        L22:
            X.Vu7 r0 = new X.Vu7
            r0.<init>()
            r5.A0A = r0
            return
        L2a:
            r5.A05 = r13
            r0 = 4
            r5.A06 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSM.<init>(X.Vsy, long, long, long, long, boolean):void");
    }
}
