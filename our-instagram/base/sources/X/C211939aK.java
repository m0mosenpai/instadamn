package X;

/* renamed from: X.9aK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211939aK extends C0T6 implements InterfaceC57817Pkj {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211939aK) {
                C211939aK c211939aK = (C211939aK) obj;
                if (this.A01 != c211939aK.A01 || this.A00 != c211939aK.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C211939aK(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
