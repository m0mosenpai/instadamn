package X;

/* renamed from: X.8fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192358fd implements Comparable {
    public final long A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C14360o3.A01(this.A00 ^ Long.MIN_VALUE, ((C192358fd) obj).A00 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C192358fd) || j != ((C192358fd) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC122695h4.A03(this.A00);
    }
}
