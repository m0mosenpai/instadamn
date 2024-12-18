package X;

/* loaded from: classes10.dex */
public final class RMQ extends AbstractC64527TId {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((RMQ) obj).A00);
    }

    public static AbstractC64527TId A00(AbstractC64771TTf abstractC64771TTf, long j) {
        return (AbstractC64527TId) abstractC64771TTf.get(new RMQ(j));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC64527TId abstractC64527TId = (AbstractC64527TId) obj;
        int A02 = A02();
        int A022 = abstractC64527TId.A02();
        if (A02 != A022) {
            return A02 - A022;
        }
        long abs = Math.abs(this.A00);
        long abs2 = Math.abs(((RMQ) abstractC64527TId).A00);
        if (abs < abs2) {
            return -1;
        }
        return AbstractC167007dF.A1O((abs > abs2 ? 1 : (abs == abs2 ? 0 : -1))) ? 1 : 0;
    }

    public final String toString() {
        return Long.toString(this.A00);
    }

    public RMQ(long j) {
        this.A00 = j;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(Integer.valueOf(A02()), Long.valueOf(this.A00));
    }
}
