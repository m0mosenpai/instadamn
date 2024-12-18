package X;

/* loaded from: classes5.dex */
public final class CVO {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVO) {
                CVO cvo = (CVO) obj;
                if (this.A01 != cvo.A01 || this.A00 != cvo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public CVO(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BorderData(widthDp=");
        A1C.append(0);
        A1C.append(", cornerRadiusDp=");
        A1C.append(this.A01);
        A1C.append(MSV.A00(128));
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
