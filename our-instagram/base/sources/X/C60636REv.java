package X;

/* renamed from: X.REv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60636REv extends AbstractC61291RlB {
    public final long A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof AbstractC61291RlB) && this.A00 == ((C60636REv) ((AbstractC61291RlB) obj)).A00;
        }
        return true;
    }

    public final int hashCode() {
        return 1000003 ^ AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0e("LogResponse{nextRequestWaitMillis=", "}", this.A00);
    }

    public C60636REv(long j) {
        this.A00 = j;
    }
}
