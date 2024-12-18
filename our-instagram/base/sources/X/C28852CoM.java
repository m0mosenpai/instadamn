package X;

/* renamed from: X.CoM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28852CoM implements InterfaceC30912DiP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28852CoM) {
                C28852CoM c28852CoM = (C28852CoM) obj;
                if (this.A01 != c28852CoM.A01 || this.A00 != c28852CoM.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30912DiP
    public final void ACF(C28004CWb c28004CWb) {
        int i = c28004CWb.A02;
        int i2 = this.A00;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = c28004CWb.A04.A00();
        }
        c28004CWb.A01(i, Math.min(i3, c28004CWb.A04.A00()));
        int i4 = c28004CWb.A03;
        int i5 = this.A01;
        int i6 = i4 - i5;
        if (((i4 ^ i6) & (i5 ^ i4)) < 0) {
            i6 = 0;
        }
        c28004CWb.A01(Math.max(0, i6), i4);
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ')', this.A01, this.A00);
    }

    public C28852CoM(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i >= 0 && i2 >= 0) {
        } else {
            throw AbstractC166987dD.A12(AnonymousClass001.A0n("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
