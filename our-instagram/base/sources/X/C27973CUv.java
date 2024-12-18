package X;

/* renamed from: X.CUv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27973CUv {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C27973CUv) || j != ((C27973CUv) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("GridItemSpan(packedValue=", ')', this.A00);
    }
}
