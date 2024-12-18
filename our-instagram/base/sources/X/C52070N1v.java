package X;

/* renamed from: X.N1v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52070N1v extends AbstractC52072N1x {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52070N1v) && this.A00 == ((C52070N1v) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("FullBattery(batteryPercent=", ')', this.A00);
    }

    public C52070N1v(long j) {
        super(1, C05F.A00);
        this.A00 = j;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public C52070N1v() {
        this(100L);
    }
}
