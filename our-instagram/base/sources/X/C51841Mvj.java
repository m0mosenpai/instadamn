package X;

/* renamed from: X.Mvj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51841Mvj extends C0T6 implements InterfaceC58253Prx {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51841Mvj) {
                C51841Mvj c51841Mvj = (C51841Mvj) obj;
                if (!C14360o3.A0K(this.A00, c51841Mvj.A00) || !C14360o3.A0K(this.A01, c51841Mvj.A01) || !C14360o3.A0K(this.A02, c51841Mvj.A02) || !C14360o3.A0K(this.A03, c51841Mvj.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C51841Mvj(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
