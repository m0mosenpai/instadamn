package X;

/* renamed from: X.CoQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28856CoQ implements InterfaceC30912DiP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28856CoQ) {
                C28856CoQ c28856CoQ = (C28856CoQ) obj;
                if (this.A01 != c28856CoQ.A01 || this.A00 != c28856CoQ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30912DiP
    public final void ACF(C28004CWb c28004CWb) {
        int i = this.A01;
        int A00 = c28004CWb.A04.A00();
        int A03 = C17s.A03(i, 0, A00);
        int A032 = C17s.A03(this.A00, 0, A00);
        if (A03 < A032) {
            c28004CWb.A03(A03, A032);
        } else {
            c28004CWb.A03(A032, A03);
        }
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("SetSelectionCommand(start=", ", end=", ')', this.A01, this.A00);
    }

    public C28856CoQ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
