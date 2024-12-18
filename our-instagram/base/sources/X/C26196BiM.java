package X;

/* renamed from: X.BiM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26196BiM extends C0T6 implements InterfaceC30817Dgs {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    public C26196BiM(Integer num, String str, int i, boolean z) {
        C14360o3.A0B(num, 2);
        this.A02 = str;
        this.A01 = num;
        this.A00 = i;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26196BiM) {
                C26196BiM c26196BiM = (C26196BiM) obj;
                if (!C14360o3.A0K(this.A02, c26196BiM.A02) || this.A01 != c26196BiM.A01 || this.A00 != c26196BiM.A00 || this.A03 != c26196BiM.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, ((((AbstractC167017dG.A0O(this.A02) * 31) + CHU.A00(this.A01)) * 31) + this.A00) * 31);
    }
}
