package X;

/* renamed from: X.CUy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27976CUy {
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C27976CUy) || j != ((C27976CUy) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        if (j != 9205357640488583168L) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append((Object) C119145aW.A00(AbstractC25231BEo.A00(j)));
            A1C.append(" x ");
            return AbstractC166997dE.A0v(C119145aW.A00(AbstractC25232BEp.A00(j)), A1C);
        }
        return "DpSize.Unspecified";
    }

    public /* synthetic */ C27976CUy(long j) {
        this.A00 = j;
    }
}
