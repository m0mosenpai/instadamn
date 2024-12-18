package X;

/* renamed from: X.Bih, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26217Bih extends C0T6 implements InterfaceC30827Dh2 {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public C26217Bih(Integer num, String str, String str2, boolean z) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A02 = z;
        this.A03 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26217Bih) {
                C26217Bih c26217Bih = (C26217Bih) obj;
                if (this.A00 != c26217Bih.A00 || this.A02 != c26217Bih.A02 || !C14360o3.A0K(this.A03, c26217Bih.A03) || !C14360o3.A0K(this.A01, c26217Bih.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC27673CIs.A00(this.A00) * 31)));
    }
}
