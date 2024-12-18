package X;

/* renamed from: X.Mw3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51859Mw3 extends C0T6 implements InterfaceC57855PlL {
    public final Integer A00;
    public final boolean A01;

    public C51859Mw3(Integer num, boolean z) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51859Mw3) {
                C51859Mw3 c51859Mw3 = (C51859Mw3) obj;
                if (this.A00 != c51859Mw3.A00 || this.A01 != c51859Mw3.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC166987dD.A0K(this.A01, AbstractC25230BEn.A0C(num, Nx9.A00(num)) * 31);
    }
}
