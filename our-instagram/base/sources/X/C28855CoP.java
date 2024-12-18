package X;

/* renamed from: X.CoP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28855CoP implements InterfaceC30912DiP {
    public final int A00;
    public final C5C8 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28855CoP) {
                C28855CoP c28855CoP = (C28855CoP) obj;
                if (!C14360o3.A0K(this.A01.A00, c28855CoP.A01.A00) || this.A00 != c28855CoP.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C28855CoP(String str, int i) {
        C16930sl c16930sl = C16930sl.A00;
        this.A01 = new C5C8(c16930sl, c16930sl, str);
        this.A00 = i;
    }

    @Override // X.InterfaceC30912DiP
    public final void ACF(C28004CWb c28004CWb) {
        int i;
        int i2 = c28004CWb.A01;
        boolean z = false;
        if (i2 != -1) {
            z = true;
        }
        int i3 = 1;
        if (z) {
            i = c28004CWb.A00;
        } else {
            i2 = c28004CWb.A03;
            i = c28004CWb.A02;
        }
        String str = this.A01.A00;
        c28004CWb.A04(i2, i, str);
        int length = str.length();
        if (length > 0) {
            c28004CWb.A02(i2, length + i2);
        }
        int i4 = c28004CWb.A03;
        int i5 = c28004CWb.A02;
        if (i4 != i5) {
            i5 = -1;
        }
        int i6 = this.A00;
        int i7 = i5 + i6;
        if (i6 <= 0) {
            i3 = length;
        }
        int A03 = C17s.A03(i7 - i3, 0, c28004CWb.A04.A00());
        c28004CWb.A03(A03, A03);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01.A00) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0l("SetComposingTextCommand(text='", this.A01.A00, "', newCursorPosition=", ')', this.A00);
    }
}
