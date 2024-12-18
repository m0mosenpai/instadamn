package X;

/* loaded from: classes10.dex */
public final class RPC extends AbstractC61518Rot {
    public final long A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof AbstractC61518Rot) && this.A00 == ((RPC) ((AbstractC61518Rot) obj)).A00);
    }

    public final int hashCode() {
        return (-724379968) ^ AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0e("EventRecord{eventType=3, eventTimestamp=", "}", this.A00);
    }

    public RPC(long j) {
        this.A00 = j;
    }
}
