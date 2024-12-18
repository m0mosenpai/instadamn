package X;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Sb2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63030Sb2 {
    public static final C63030Sb2 A03 = new C65171Tek();
    public long A00;
    public long A01;
    public boolean A02;

    public final long A00() {
        if (this instanceof C65170Tej) {
            return ((C65170Tej) this).A00.A00();
        }
        if (this.A02) {
            return this.A00;
        }
        throw AbstractC166987dD.A14("No deadline");
    }

    public final long A01() {
        if (this instanceof C65170Tej) {
            return ((C65170Tej) this).A00.A01();
        }
        return this.A01;
    }

    public final C63030Sb2 A02() {
        if (this instanceof C65170Tej) {
            return ((C65170Tej) this).A00.A02();
        }
        this.A02 = false;
        return this;
    }

    public final C63030Sb2 A03() {
        if (this instanceof C65170Tej) {
            return ((C65170Tej) this).A00.A03();
        }
        this.A01 = 0L;
        return this;
    }

    public final C63030Sb2 A04(long j) {
        if (!(this instanceof C65171Tek)) {
            if (this instanceof C65170Tej) {
                return ((C65170Tej) this).A00.A04(j);
            }
            this.A02 = true;
            this.A00 = j;
        }
        return this;
    }

    public final C63030Sb2 A05(TimeUnit timeUnit, long j) {
        if (!(this instanceof C65171Tek)) {
            if (this instanceof C65170Tej) {
                return ((C65170Tej) this).A00.A05(timeUnit, j);
            }
            if (j >= 0) {
                this.A01 = timeUnit.toNanos(j);
                return this;
            }
            throw AbstractC58319PtB.A0h("timeout < 0: ", j);
        }
        return this;
    }

    public final boolean A07() {
        if (this instanceof C65170Tej) {
            return ((C65170Tej) this).A00.A07();
        }
        return this.A02;
    }

    public final void A06() {
        if (!Thread.interrupted()) {
            if (this.A02 && this.A00 - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        AbstractC58318PtA.A18();
        throw new InterruptedIOException("interrupted");
    }
}
