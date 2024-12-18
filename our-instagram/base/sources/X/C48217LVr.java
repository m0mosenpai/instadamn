package X;

import android.graphics.Matrix;

/* renamed from: X.LVr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48217LVr implements InterfaceC148026lY {
    public final Matrix A00;
    public final C47792L8z A01;
    public final /* synthetic */ AbstractC43828JZr A02;

    private final void A00(C55982hj c55982hj, float f) {
        if (f == 0.0f) {
            C55942hf c55942hf = c55982hj.A05;
            C55942hf c55942hf2 = this.A02.A0D;
            if (c55942hf != c55942hf2) {
                c55982hj.A09(c55942hf2);
                return;
            }
            return;
        }
        c55982hj.A09(this.A02.A0C);
        double d = c55982hj.A09.A00 + f;
        if (d == c55982hj.A01) {
            return;
        }
        c55982hj.A06(d);
    }

    @Override // X.InterfaceC148026lY
    public final void Cw4(C55952hg c55952hg) {
        C14360o3.A0B(c55952hg, 0);
        AbstractC43828JZr abstractC43828JZr = this.A02;
        Matrix matrix = abstractC43828JZr.A08;
        matrix.set(this.A00);
        C47792L8z c47792L8z = abstractC43828JZr.A0F;
        C47792L8z c47792L8z2 = this.A01;
        C14360o3.A0B(c47792L8z2, 0);
        c47792L8z.A02 = c47792L8z2.A02;
        c47792L8z.A03 = c47792L8z2.A03;
        c47792L8z.A04 = c47792L8z2.A04;
        c47792L8z.A00 = c47792L8z2.A00;
        c47792L8z.A01 = c47792L8z2.A01;
        c47792L8z.A00 = (float) abstractC43828JZr.A09.A09.A00;
        c47792L8z.A01 = (float) abstractC43828JZr.A0A.A09.A00;
        c47792L8z.A02 = (float) abstractC43828JZr.A0B.A09.A00;
        c47792L8z.A00(matrix);
        abstractC43828JZr.setImageMatrix(matrix);
        if (c55952hg.A00) {
            abstractC43828JZr.A0M(true);
            abstractC43828JZr.A0E.A04.remove(this);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.L8z, java.lang.Object] */
    public C48217LVr(Matrix matrix, AbstractC43828JZr abstractC43828JZr, C47792L8z c47792L8z, float f, float f2) {
        this.A02 = abstractC43828JZr;
        this.A00 = new Matrix(matrix);
        ?? obj = new Object();
        this.A01 = obj;
        obj.A02 = c47792L8z.A02;
        obj.A03 = c47792L8z.A03;
        obj.A04 = c47792L8z.A04;
        obj.A00 = c47792L8z.A00;
        obj.A01 = c47792L8z.A01;
        abstractC43828JZr.A0E.A04.add(this);
        A01(abstractC43828JZr.A09, f, obj.A00);
        A01(abstractC43828JZr.A0A, f2, obj.A01);
        C55982hj c55982hj = abstractC43828JZr.A0B;
        c55982hj.A02();
        if (obj.A02 != 1.0f) {
            c55982hj.A07(0.0d);
            c55982hj.A06(obj.A02);
        }
    }

    @Override // X.InterfaceC148026lY
    public final void CzD(C55952hg c55952hg) {
        AbstractC43828JZr abstractC43828JZr = this.A02;
        Matrix matrix = abstractC43828JZr.A08;
        C47792L8z c47792L8z = abstractC43828JZr.A0F;
        abstractC43828JZr.A0K(matrix, c47792L8z);
        A00(abstractC43828JZr.A09, c47792L8z.A00);
        A00(abstractC43828JZr.A0A, c47792L8z.A01);
    }

    private final void A01(C55982hj c55982hj, float f, float f2) {
        Number number;
        C55942hf c55942hf;
        if (Math.abs(f) > 100.0f) {
            number = Float.valueOf(f);
        } else {
            number = 0;
        }
        c55982hj.A07(number.doubleValue());
        AbstractC43828JZr abstractC43828JZr = this.A02;
        if (f2 == 0.0f) {
            c55942hf = abstractC43828JZr.A0D;
        } else {
            c55942hf = abstractC43828JZr.A0C;
        }
        c55982hj.A09(c55942hf);
        c55982hj.A08(0.0d, false);
        c55982hj.A06(f2);
    }
}
