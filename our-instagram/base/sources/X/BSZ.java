package X;

/* loaded from: classes5.dex */
public final class BSZ extends C0T6 {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BSZ) {
                BSZ bsz = (BSZ) obj;
                if (this.A02 != bsz.A02 || this.A03 != bsz.A03 || this.A01 != bsz.A01 || this.A00 != bsz.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        return AbstractC25236BEt.A01(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC25230BEn.A0C(num, BS4.A00(num)) * 31)) + this.A00;
    }

    public BSZ(Integer num, int i, long j, boolean z) {
        this.A02 = num;
        this.A03 = z;
        this.A01 = j;
        this.A00 = i;
    }
}
