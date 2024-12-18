package X;

/* renamed from: X.BSr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25579BSr extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final InterfaceC16820sZ A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25579BSr) {
                C25579BSr c25579BSr = (C25579BSr) obj;
                if (!C14360o3.A0K(this.A02, c25579BSr.A02) || !C14360o3.A0K(this.A03, c25579BSr.A03) || !C14360o3.A0K(this.A01, c25579BSr.A01) || !C14360o3.A0K(this.A00, c25579BSr.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public C25579BSr(String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = str;
        this.A03 = interfaceC16820sZ;
        this.A01 = str2;
        this.A00 = str3;
    }
}
