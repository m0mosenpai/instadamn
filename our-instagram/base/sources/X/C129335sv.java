package X;

/* renamed from: X.5sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129335sv extends C0T6 {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C129335sv) {
                C129335sv c129335sv = (C129335sv) obj;
                if (this.A01 != c129335sv.A01 || this.A00 != c129335sv.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentFilterDictionaryClientAvailabilityEntity(dictionaryId=");
        sb.append(this.A01);
        sb.append(", clientId=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A00;
    }

    public C129335sv(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
