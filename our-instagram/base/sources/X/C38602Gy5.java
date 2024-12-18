package X;

/* renamed from: X.Gy5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38602Gy5 extends C0T6 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38602Gy5) {
                C38602Gy5 c38602Gy5 = (C38602Gy5) obj;
                if (this.A01 != c38602Gy5.A01 || !C14360o3.A0K(this.A00, c38602Gy5.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + AbstractC167017dG.A0O(this.A00);
    }

    public C38602Gy5(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
