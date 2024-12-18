package X;

/* loaded from: classes5.dex */
public final class BGh {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof BGh) || j != ((BGh) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("FirstVisibleItemState(packedValue=", ')', this.A00);
    }

    public /* synthetic */ BGh(long j) {
        this.A00 = j;
    }
}
