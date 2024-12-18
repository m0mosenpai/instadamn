package X;

/* loaded from: classes10.dex */
public final class QKP extends AbstractC45332K4k implements InterfaceC65651TqQ {
    public final long A00;
    public final long A01;

    @Override // X.AbstractC64100SzH
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof QKP) || !super.equals(obj)) {
                return false;
            }
            QKP qkp = (QKP) obj;
            if (this.A00 != qkp.A00 || this.A01 != qkp.A01) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QKP(SIF sif, SO7 so7) {
        super(so7);
        long j = sif.A00;
        long j2 = sif.A01;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.AbstractC64100SzH
    public final int hashCode() {
        return AbstractC58319PtB.A06(Integer.valueOf(super.hashCode()), Long.valueOf(this.A00), Long.valueOf(this.A01));
    }
}
