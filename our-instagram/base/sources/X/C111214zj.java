package X;

/* renamed from: X.4zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111214zj extends C0T6 {
    public long A00 = 0;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C111214zj) && this.A00 == ((C111214zj) obj).A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }
}
