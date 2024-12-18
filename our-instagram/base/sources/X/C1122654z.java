package X;

/* renamed from: X.54z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1122654z extends C54y {
    public final long A00;

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof C1122654z) && ((C1122654z) obj).A00 == this.A00;
        }
        return true;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        long j = this.A00;
        String[] strArr = AnonymousClass188.A04;
        if (j <= 2147483647L && j >= -2147483648L) {
            return AnonymousClass188.A08((int) j);
        }
        return Long.toString(j);
    }

    @Override // X.C54u
    public final int hashCode() {
        long j = this.A00;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public C1122654z(long j) {
        this.A00 = j;
    }
}
