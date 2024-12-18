package X;

/* loaded from: classes9.dex */
public final class N1T extends AbstractC52071N1w {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N1T) && this.A00 == ((N1T) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("LowBattery(batteryPercent=", ')', this.A00);
    }

    public N1T(long j) {
        super(1, C05F.A01);
        this.A00 = j;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }
}
