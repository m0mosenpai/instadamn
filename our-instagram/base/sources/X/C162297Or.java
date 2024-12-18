package X;

/* renamed from: X.7Or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162297Or extends C0T6 implements Comparable {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162297Or) {
                C162297Or c162297Or = (C162297Or) obj;
                if (this.A00 != c162297Or.A00 || this.A01 != c162297Or.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0Y("ThreadRowTimestamp(primaryTimestamp=", ", secondaryTimestamp=", ')', this.A00, this.A01);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C162297Or c162297Or = (C162297Or) obj;
        C14360o3.A0B(c162297Or, 0);
        long j = this.A00;
        long j2 = c162297Or.A00;
        if (j == j2) {
            j = this.A01;
            j2 = c162297Or.A01;
        }
        return C14360o3.A01(j, j2);
    }

    public final int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A01;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C162297Or(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
