package X;

/* renamed from: X.Jyh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45141Jyh extends C0T6 implements MRZ {
    public final C32049E6b A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45141Jyh) {
                C45141Jyh c45141Jyh = (C45141Jyh) obj;
                if (!C14360o3.A0K(this.A01, c45141Jyh.A01) || !C14360o3.A0K(this.A00, c45141Jyh.A00) || !C14360o3.A0K(this.A02, c45141Jyh.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C45141Jyh(C32049E6b c32049E6b, String str, String str2) {
        this.A01 = str;
        this.A00 = c32049E6b;
        this.A02 = str2;
    }
}