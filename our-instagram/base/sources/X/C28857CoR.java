package X;

/* renamed from: X.CoR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28857CoR implements InterfaceC30912DiP {
    public final int A00;
    public final C5C8 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28857CoR) {
                C28857CoR c28857CoR = (C28857CoR) obj;
                if (!C14360o3.A0K(this.A01.A00, c28857CoR.A01.A00) || this.A00 != c28857CoR.A00) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C28857CoR(java.lang.String r3, int r4) {
        /*
            r2 = this;
            X.0sl r1 = X.C16930sl.A00
            X.5C8 r0 = new X.5C8
            r0.<init>(r1, r1, r3)
            r2.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28857CoR.<init>(java.lang.String, int):void");
    }

    @Override // X.InterfaceC30912DiP
    public final void ACF(C28004CWb c28004CWb) {
        int i;
        int length;
        int i2 = c28004CWb.A01;
        if (i2 != -1) {
            i = c28004CWb.A00;
        } else {
            i2 = c28004CWb.A03;
            i = c28004CWb.A02;
        }
        String str = this.A01.A00;
        c28004CWb.A04(i2, i, str);
        int i3 = c28004CWb.A03;
        int i4 = c28004CWb.A02;
        if (i3 != i4) {
            i4 = -1;
        }
        int i5 = this.A00;
        int i6 = i4 + i5;
        if (i5 > 0) {
            length = i6 - 1;
        } else {
            length = i6 - str.length();
        }
        int A03 = C17s.A03(length, 0, c28004CWb.A04.A00());
        c28004CWb.A03(A03, A03);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01.A00) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0l("CommitTextCommand(text='", this.A01.A00, "', newCursorPosition=", ')', this.A00);
    }

    public C28857CoR(C5C8 c5c8, int i) {
        this.A01 = c5c8;
        this.A00 = i;
    }
}
