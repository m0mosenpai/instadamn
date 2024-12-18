package X;

/* renamed from: X.Gz8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38667Gz8 extends C0T6 {
    public final C69749Vuj A00;
    public final C69749Vuj A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38667Gz8) {
                C38667Gz8 c38667Gz8 = (C38667Gz8) obj;
                if (!C14360o3.A0K(this.A01, c38667Gz8.A01) || !C14360o3.A0K(this.A00, c38667Gz8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0M = ((AbstractC167017dG.A0M(this.A01) * 31 * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        int A00 = AbstractC53644Nnp.A00();
        return ((((((A0M + A00) * 31 * 31 * 31 * 31) + A00) * 31) + A00) * 31) + A00;
    }

    public C38667Gz8(C69749Vuj c69749Vuj, C69749Vuj c69749Vuj2) {
        this.A01 = c69749Vuj;
        this.A00 = c69749Vuj2;
    }

    public C38667Gz8() {
        this(null, null);
    }
}
