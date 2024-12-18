package X;

/* renamed from: X.Gy1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38598Gy1 extends C0T6 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38598Gy1) {
                C38598Gy1 c38598Gy1 = (C38598Gy1) obj;
                if (!C14360o3.A0K(this.A00, c38598Gy1.A00) || this.A01 != c38598Gy1.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }

    public C38598Gy1(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
