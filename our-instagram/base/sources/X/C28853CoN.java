package X;

/* renamed from: X.CoN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28853CoN implements InterfaceC30912DiP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28853CoN) {
                C28853CoN c28853CoN = (C28853CoN) obj;
                if (this.A01 != c28853CoN.A01 || this.A00 != c28853CoN.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30912DiP
    public final void ACF(C28004CWb c28004CWb) {
        int i = this.A01;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < i) {
                i4++;
                int i5 = c28004CWb.A03;
                if (i5 > i4) {
                    char A00 = c28004CWb.A00((i5 - i4) - 1);
                    char A002 = c28004CWb.A00(c28004CWb.A03 - i4);
                    if (Character.isHighSurrogate(A00) && Character.isLowSurrogate(A002)) {
                        i4++;
                    }
                    i3++;
                } else {
                    i4 = i5;
                    break;
                }
            } else {
                break;
            }
        }
        int i6 = this.A00;
        int i7 = 0;
        while (true) {
            if (i2 >= i6) {
                break;
            }
            i7++;
            int i8 = c28004CWb.A02;
            int i9 = i8 + i7;
            int A003 = c28004CWb.A04.A00();
            if (i9 < A003) {
                char A004 = c28004CWb.A00((i8 + i7) - 1);
                char A005 = c28004CWb.A00(c28004CWb.A02 + i7);
                if (Character.isHighSurrogate(A004) && Character.isLowSurrogate(A005)) {
                    i7++;
                }
                i2++;
            } else {
                i7 = A003 - i8;
                break;
            }
        }
        int i10 = c28004CWb.A02;
        c28004CWb.A01(i10, i10 + i7);
        int i11 = c28004CWb.A03;
        c28004CWb.A01(i11 - i4, i11);
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ')', this.A01, this.A00);
    }

    public C28853CoN(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i >= 0 && i2 >= 0) {
        } else {
            throw AbstractC166987dD.A12(AnonymousClass001.A0n("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
