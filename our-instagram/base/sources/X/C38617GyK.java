package X;

/* renamed from: X.GyK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38617GyK extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38617GyK) {
                C38617GyK c38617GyK = (C38617GyK) obj;
                if (!C14360o3.A0K(this.A00, c38617GyK.A00) || !C14360o3.A0K(this.A01, c38617GyK.A01) || !C14360o3.A0K(this.A02, c38617GyK.A02) || !C14360o3.A0K(this.A03, c38617GyK.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C38617GyK(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
