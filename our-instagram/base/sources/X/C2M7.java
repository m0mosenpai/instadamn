package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2M7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2M7 extends C1RW implements C2MB {
    public final C1RW A02;
    public final Executor A03;
    public final C1RW[] A05;
    public final AtomicInteger A04 = new AtomicInteger(0);
    public boolean A00 = false;
    public final int A01 = 2;

    public C2M7(C1RW c1rw, Executor executor, C1RW[] c1rwArr) {
        this.A05 = c1rwArr;
        this.A03 = executor;
        this.A02 = c1rw;
    }

    @Override // X.C1RW
    public final C58428Pv7 A03(C58621Pyp c58621Pyp) {
        boolean z;
        C1RW c1rw;
        java.util.Set set = c58621Pyp.A02;
        if (!this.A00 && this.A02 != null) {
            z = set.contains("proxyservice");
        } else {
            z = false;
        }
        if (this.A00 || (c1rw = this.A02) == null || !set.contains("proxyservice")) {
            c1rw = this.A05[this.A04.get()];
        }
        C58427Pv6 c58427Pv6 = new C58427Pv6();
        c1rw.A03(c58621Pyp).A05(new C58629Pyx(c58427Pv6, this, c58621Pyp, c1rw, z), this.A03);
        return c58427Pv6.A00;
    }

    @Override // X.C1RW
    public final void AOU(C58621Pyp c58621Pyp) {
        C1RW c1rw;
        java.util.Set set = c58621Pyp.A02;
        if (this.A00 || (c1rw = this.A02) == null || !set.contains("proxyservice")) {
            c1rw = this.A05[this.A04.get()];
        }
        c1rw.AOU(c58621Pyp);
    }

    @Override // X.C1RW
    public final C58428Pv7 Eo5(C58427Pv6 c58427Pv6, C58621Pyp c58621Pyp) {
        for (C1RW c1rw : this.A05) {
            c1rw.Eo5(c58427Pv6, c58621Pyp);
        }
        return c58427Pv6.A00;
    }

    @Override // X.C1RW
    public final String getName() {
        StringBuilder sb = new StringBuilder("Failover");
        for (C1RW c1rw : this.A05) {
            sb.append(":");
            sb.append(c1rw.getName());
        }
        sb.append(":config(");
        sb.append(2);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(false);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(false);
        sb.append(")");
        return sb.toString();
    }
}
