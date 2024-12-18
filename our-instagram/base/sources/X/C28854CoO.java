package X;

/* renamed from: X.CoO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28854CoO implements InterfaceC30912DiP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28854CoO) {
                C28854CoO c28854CoO = (C28854CoO) obj;
                if (this.A01 != c28854CoO.A01 || this.A00 != c28854CoO.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30912DiP
    public final void ACF(C28004CWb c28004CWb) {
        if (c28004CWb.A01 != -1) {
            c28004CWb.A01 = -1;
            c28004CWb.A00 = -1;
        }
        int i = this.A01;
        int A00 = c28004CWb.A04.A00();
        int A03 = C17s.A03(i, 0, A00);
        int A032 = C17s.A03(this.A00, 0, A00);
        if (A03 != A032) {
            if (A03 < A032) {
                c28004CWb.A02(A03, A032);
            } else {
                c28004CWb.A02(A032, A03);
            }
        }
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("SetComposingRegionCommand(start=", ", end=", ')', this.A01, this.A00);
    }

    public C28854CoO(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
