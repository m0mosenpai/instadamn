package X;

/* renamed from: X.9ZR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZR extends C0T6 {
    public final long A00;
    public final String A01;

    public C9ZR(long j, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZR) {
                C9ZR c9zr = (C9ZR) obj;
                if (this.A00 != c9zr.A00 || !C14360o3.A0K(this.A01, c9zr.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ContentFilterDictionaryEntriesEntity(dictionaryId=");
        A1C.append(this.A00);
        A1C.append(", pattern=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
