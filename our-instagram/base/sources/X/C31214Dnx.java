package X;

/* renamed from: X.Dnx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31214Dnx extends C1I7 {
    public final Object A02;
    public final int A01 = 1;
    public boolean A00 = true;

    public C31214Dnx(JR2 jr2) {
        this.A02 = jr2;
    }

    @Override // X.C1I7, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        C140356Wo c140356Wo;
        C140356Wo c140356Wo2;
        if (this.A01 != 0) {
            A03 = C0f9.A03(-673031960);
            boolean z = true;
            if (i > 1) {
                z = false;
            }
            if (z != this.A00 && (c140356Wo2 = ((C3CX) this.A02).A01) != null) {
                c140356Wo2.A03(z);
            }
            this.A00 = z;
            i6 = -1096673620;
        } else {
            A03 = C0f9.A03(-1046575891);
            boolean z2 = true;
            if (i > 1) {
                z2 = false;
            }
            if (z2 != this.A00 && (c140356Wo = ((JR2) this.A02).A0r) != null) {
                c140356Wo.A03(z2);
            }
            this.A00 = z2;
            i6 = 1345343224;
        }
        C0f9.A0A(i6, A03);
    }

    public C31214Dnx(C3CX c3cx) {
        this.A02 = c3cx;
    }
}
