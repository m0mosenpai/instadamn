package X;

/* renamed from: X.MxY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51951MxY extends C0T6 implements InterfaceC57890Plu {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51951MxY) {
                C51951MxY c51951MxY = (C51951MxY) obj;
                if (this.A00 != c51951MxY.A00 || !C14360o3.A0K(this.A01, c51951MxY.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public C51951MxY(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
