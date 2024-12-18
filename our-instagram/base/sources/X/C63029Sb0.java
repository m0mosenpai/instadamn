package X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.Sb0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63029Sb0 {
    public long A00;
    public long A01 = 0;
    public IOException A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final Deque A06;
    public final THU A07;
    public final C64837TWd A08;
    public final C64843TWj A09;
    public final C65168Teh A0A;
    public final C65168Teh A0B;

    private boolean A00(IOException iOException, Integer num) {
        synchronized (this) {
            if (this.A03 != null || (this.A09.A02 && this.A08.A01)) {
                return false;
            }
            this.A03 = num;
            this.A02 = iOException;
            notifyAll();
            this.A07.A02(this.A05);
            return true;
        }
    }

    public final C64837TWd A01() {
        synchronized (this) {
            if (!this.A04 && (this.A05 & 1) != 1) {
                throw AbstractC166987dD.A14("reply before requesting the sink");
            }
        }
        return this.A08;
    }

    public final void A02() {
        boolean z;
        boolean A07;
        synchronized (this) {
            C64843TWj c64843TWj = this.A09;
            if (!c64843TWj.A02 && c64843TWj.A01) {
                C64837TWd c64837TWd = this.A08;
                if (c64837TWd.A01 || c64837TWd.A00) {
                    z = true;
                    A07 = A07();
                }
            }
            z = false;
            A07 = A07();
        }
        if (z) {
            A04(null, C05F.A0j);
        } else {
            if (A07) {
                return;
            }
            this.A07.A02(this.A05);
        }
    }

    public final void A05(Integer num) {
        if (A00(null, num)) {
            this.A07.A03(this.A05, num);
        }
    }

    public final void A06(C63365SiO c63365SiO, boolean z) {
        boolean A07;
        synchronized (this) {
            if (!this.A04 || !z) {
                this.A04 = true;
                this.A06.add(c63365SiO);
                if (z) {
                }
                A07 = A07();
                notifyAll();
            } else {
                this.A09.A00 = c63365SiO;
            }
            this.A09.A02 = true;
            A07 = A07();
            notifyAll();
        }
        if (!A07) {
            this.A07.A02(this.A05);
        }
    }

    public final synchronized boolean A07() {
        boolean z;
        z = false;
        if (this.A03 == null) {
            C64843TWj c64843TWj = this.A09;
            if (c64843TWj.A02 || c64843TWj.A01) {
                C64837TWd c64837TWd = this.A08;
                if (c64837TWd.A01 || c64837TWd.A00) {
                    if (this.A04) {
                    }
                }
            }
            z = true;
        }
        return z;
    }

    public final void A03() {
        C64837TWd c64837TWd = this.A08;
        if (!c64837TWd.A00) {
            if (!c64837TWd.A01) {
                Integer num = this.A03;
                if (num != null) {
                    IOException iOException = this.A02;
                    if (iOException == null) {
                        throw new C61031Rdz(num);
                    }
                    throw iOException;
                }
                return;
            }
            throw MSW.A0y("stream finished");
        }
        throw MSW.A0y("stream closed");
    }

    public C63029Sb0(C63365SiO c63365SiO, THU thu, int i, boolean z, boolean z2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.A06 = arrayDeque;
        this.A0A = new C65168Teh(this);
        this.A0B = new C65168Teh(this);
        this.A05 = i;
        this.A07 = thu;
        this.A00 = thu.A0L.A00();
        C64843TWj c64843TWj = new C64843TWj(this, thu.A0A.A00());
        this.A09 = c64843TWj;
        C64837TWd c64837TWd = new C64837TWd(this);
        this.A08 = c64837TWd;
        c64843TWj.A02 = z2;
        c64837TWd.A01 = z;
        if (c63365SiO != null) {
            arrayDeque.add(c63365SiO);
        }
        if ((this.A05 & 1) == 1) {
            if (c63365SiO != null) {
                throw AbstractC166987dD.A14("locally-initiated streams shouldn't have headers yet");
            }
        } else if (c63365SiO == null) {
            throw AbstractC166987dD.A14("remotely-initiated streams should have headers");
        }
    }

    public final void A04(IOException iOException, Integer num) {
        if (A00(iOException, num)) {
            THU thu = this.A07;
            thu.A0J.A03(this.A05, num);
        }
    }
}
