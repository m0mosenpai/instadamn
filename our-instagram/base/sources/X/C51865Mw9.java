package X;

/* renamed from: X.Mw9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51865Mw9 extends C0T6 implements InterfaceC57855PlL {
    public final C51630MrN A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public C51865Mw9(C51630MrN c51630MrN, String str, String str2, boolean z) {
        C14360o3.A0B(str, 2);
        this.A00 = c51630MrN;
        this.A03 = str;
        this.A02 = z;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51865Mw9) {
                C51865Mw9 c51865Mw9 = (C51865Mw9) obj;
                if (!C14360o3.A0K(this.A00, c51865Mw9.A00) || !C14360o3.A0K(this.A03, c51865Mw9.A03) || this.A02 != c51865Mw9.A02 || !C14360o3.A0K(this.A01, c51865Mw9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0M(this.A00) * 31)) + AbstractC25227BEk.A07(this.A01);
    }
}
