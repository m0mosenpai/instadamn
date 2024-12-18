package X;

/* renamed from: X.Jz8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45167Jz8 extends C0T6 implements InterfaceC132315yA {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45167Jz8) {
                C45167Jz8 c45167Jz8 = (C45167Jz8) obj;
                if (!C14360o3.A0K(this.A01, c45167Jz8.A01) || !C14360o3.A0K(this.A02, c45167Jz8.A02) || !C14360o3.A0K(this.A00, c45167Jz8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public C45167Jz8(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
