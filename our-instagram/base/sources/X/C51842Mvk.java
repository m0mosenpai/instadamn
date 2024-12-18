package X;

/* renamed from: X.Mvk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51842Mvk extends C0T6 implements InterfaceC58254Pry {
    public final C38595Gxy A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51842Mvk) {
                C51842Mvk c51842Mvk = (C51842Mvk) obj;
                if (!C14360o3.A0K(this.A00, c51842Mvk.A00) || !C14360o3.A0K(this.A01, c51842Mvk.A01) || !C14360o3.A0K(this.A02, c51842Mvk.A02) || !C14360o3.A0K(this.A03, c51842Mvk.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C51842Mvk(C38595Gxy c38595Gxy, String str, String str2, String str3) {
        this.A00 = c38595Gxy;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
