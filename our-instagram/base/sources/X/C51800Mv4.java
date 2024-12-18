package X;

/* renamed from: X.Mv4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51800Mv4 extends C0T6 implements InterfaceC58244Pro {
    public final String A00;
    public final String A01;
    public final String A02;

    public C51800Mv4(String str, String str2, String str3) {
        C14360o3.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51800Mv4) {
                C51800Mv4 c51800Mv4 = (C51800Mv4) obj;
                if (!C14360o3.A0K(this.A00, c51800Mv4.A00) || !C14360o3.A0K(this.A01, c51800Mv4.A01) || !C14360o3.A0K(this.A02, c51800Mv4.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01)) * 31);
    }
}
