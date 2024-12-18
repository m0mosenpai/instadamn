package X;

/* renamed from: X.MrF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51622MrF extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51622MrF) {
                C51622MrF c51622MrF = (C51622MrF) obj;
                if (!C14360o3.A0K(this.A01, c51622MrF.A01) || !C14360o3.A0K(this.A03, c51622MrF.A03) || !C14360o3.A0K(this.A02, c51622MrF.A02) || !C14360o3.A0K(this.A05, c51622MrF.A05) || !C14360o3.A0K(this.A00, c51622MrF.A00) || !C14360o3.A0K(this.A04, c51622MrF.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C51622MrF(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A00 = str5;
        this.A04 = str6;
    }
}
