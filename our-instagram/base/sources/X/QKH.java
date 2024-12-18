package X;

/* loaded from: classes10.dex */
public class QKH extends AbstractC64100SzH implements InterfaceC65652TqR {
    public final int A00;
    public final long A01;
    public final String A02;

    @Override // X.AbstractC64100SzH
    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InterfaceC65652TqR) || !super.equals(obj)) {
                return false;
            }
            QKH qkh = (QKH) ((InterfaceC65652TqR) obj);
            if (this.A01 != qkh.A01 || this.A00 != qkh.A00 || !this.A02.equals(qkh.A02)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QKH(C62539SFq c62539SFq, SO7 so7) {
        super(so7);
        int i = c62539SFq.A00;
        String str = c62539SFq.A02;
        long j = c62539SFq.A01;
        this.A01 = j;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // X.AbstractC64100SzH
    public int hashCode() {
        return AbstractC58321PtD.A0C(Integer.valueOf(super.hashCode()), Long.valueOf(this.A01), Integer.valueOf(this.A00), this.A02);
    }
}
