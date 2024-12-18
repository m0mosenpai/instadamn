package X;

/* renamed from: X.N1p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52064N1p extends AbstractC52072N1x {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52064N1p) && this.A00 == ((C52064N1p) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("PartialBattery(batteryPercent=", ')', this.A00);
    }

    public C52064N1p(long j) {
        super(1, C05F.A00);
        this.A00 = j;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }
}
