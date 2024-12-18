package X;

/* renamed from: X.1pA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37731pA extends C0T6 {
    public long A00;
    public C37771pE A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37731pA) {
                C37731pA c37731pA = (C37731pA) obj;
                if (!C14360o3.A0K(this.A01, c37731pA.A01) || this.A00 != c37731pA.A00 || !C14360o3.A0K(this.A02, c37731pA.A02) || !C14360o3.A0K(this.A03, c37731pA.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StoriesItem(story=");
        sb.append(this.A01);
        sb.append(", deliveredAt=");
        sb.append(this.A00);
        sb.append(", requestId=");
        sb.append(this.A02);
        sb.append(", requestUUID=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C37731pA() {
        C37771pE c37771pE = AbstractC37741pB.A00;
        C14360o3.A0B(c37771pE, 1);
        this.A01 = c37771pE;
        this.A00 = 0L;
        this.A02 = "";
        this.A03 = "";
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        long j = this.A00;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }
}
