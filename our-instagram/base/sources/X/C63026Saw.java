package X;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Saw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63026Saw {
    public Object A00;
    public C62696SMk A01;
    public SO5 A02;
    public SOD A03;
    public C65158TeX A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final SUL A0A;
    public final TIY A0B;
    public final TIU A0C;
    public final SZ7 A0D;
    public final C65172Tel A0E;

    public final Socket A03() {
        int i = 0;
        int size = this.A04.A0D.size();
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Reference) this.A04.A0D.get(i)).get() == this) {
                if (i != -1) {
                    C65158TeX c65158TeX = this.A04;
                    c65158TeX.A0D.remove(i);
                    this.A04 = null;
                    if (c65158TeX.A0D.isEmpty()) {
                        c65158TeX.A04 = System.nanoTime();
                        SZ7 sz7 = this.A0D;
                        if (!c65158TeX.A0C && sz7.A01 != 0) {
                            sz7.notifyAll();
                        } else {
                            sz7.A04.remove(c65158TeX);
                            return c65158TeX.A06;
                        }
                    }
                    return null;
                }
            } else {
                i++;
            }
        }
        throw AbstractC58318PtA.A0Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r5.A02 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.IOException A00(java.io.IOException r4, X.C63026Saw r5, boolean r6) {
        /*
            X.SZ7 r3 = r5.A0D
            monitor-enter(r3)
            if (r6 == 0) goto L10
            X.SO5 r0 = r5.A02     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L10
            java.lang.String r0 = "cannot release connection while it is in use"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L10:
            X.TeX r0 = r5.A04     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            if (r0 == 0) goto L23
            X.SO5 r0 = r5.A02     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L23
            if (r6 != 0) goto L1f
            boolean r0 = r5.A07     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L23
        L1f:
            java.net.Socket r2 = r5.A03()     // Catch: java.lang.Throwable -> L4e
        L23:
            boolean r0 = r5.A07     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L2c
            X.SO5 r1 = r5.A02     // Catch: java.lang.Throwable -> L4e
            r0 = 1
            if (r1 == 0) goto L2d
        L2c:
            r0 = 0
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            X.AbstractC63404SjZ.A0A(r2)
            if (r0 == 0) goto L4d
            boolean r0 = r5.A08
            if (r0 != 0) goto L4d
            X.Tel r0 = r5.A0E
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L4d
            java.lang.String r1 = "timeout"
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>(r1)
            if (r4 == 0) goto L4c
            r0.initCause(r4)
        L4c:
            return r0
        L4d:
            return r4
        L4e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63026Saw.A00(java.io.IOException, X.Saw, boolean):java.io.IOException");
    }

    public final IOException A01(IOException iOException) {
        synchronized (this.A0D) {
            this.A07 = true;
        }
        return A00(iOException, this, false);
    }

    public final IOException A02(IOException iOException, SO5 so5, boolean z, boolean z2) {
        boolean z3;
        synchronized (this.A0D) {
            SO5 so52 = this.A02;
            if (so5 != so52) {
                return iOException;
            }
            boolean z4 = true;
            if (z) {
                z3 = !this.A05;
                this.A05 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.A06) {
                    z3 = true;
                }
                this.A06 = true;
            }
            if (!this.A05 || !this.A06 || !z3) {
                z4 = false;
            } else {
                so52.A04.AJU().A03++;
                this.A02 = null;
            }
            if (z4) {
                return A00(iOException, this, false);
            }
            return iOException;
        }
    }

    public final void A04() {
        SO5 so5;
        C65158TeX c65158TeX;
        synchronized (this.A0D) {
            this.A09 = true;
            so5 = this.A02;
            SOD sod = this.A03;
            if (sod == null || (c65158TeX = sod.A01) == null) {
                c65158TeX = this.A04;
            }
        }
        if (so5 != null) {
            so5.A04.cancel();
        } else {
            if (c65158TeX == null) {
                return;
            }
            AbstractC63404SjZ.A0A(c65158TeX.A05);
        }
    }

    public final void A05() {
        synchronized (this.A0D) {
            if (!this.A07) {
                this.A02 = null;
            } else {
                throw AbstractC58318PtA.A0Z();
            }
        }
    }

    public final boolean A06() {
        boolean z;
        synchronized (this.A0D) {
            z = this.A09;
        }
        return z;
    }

    public C63026Saw(TIY tiy, TIU tiu) {
        C65166Tef c65166Tef = new C65166Tef(this);
        this.A0E = c65166Tef;
        this.A0B = tiy;
        this.A0D = tiy.A0H.A00;
        this.A0C = tiu;
        this.A0A = tiy.A0L.A00;
        c65166Tef.A05(TimeUnit.MILLISECONDS, tiy.A00);
    }
}
