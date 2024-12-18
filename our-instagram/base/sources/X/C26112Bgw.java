package X;

import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.Bgw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26112Bgw extends C0T6 implements InterfaceC30927Die {
    public static final C26112Bgw A07 = new C26112Bgw(C16930sl.A00, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final List A06;

    public C26112Bgw(List list, float f, float f2, float f3, float f4, float f5, float f6) {
        C14360o3.A0B(list, 7);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = list;
    }

    @Override // X.InterfaceC30927Die
    public final void ACD(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        matrix2.getValues(r2);
        float[] fArr = {this.A00, this.A02, this.A04, this.A01, this.A03, this.A05};
        matrix2.setValues(fArr);
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC30927Die) list.get(i)).ACD(matrix2);
        }
        matrix.postConcat(matrix2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26112Bgw) {
                C26112Bgw c26112Bgw = (C26112Bgw) obj;
                if (Float.compare(this.A00, c26112Bgw.A00) != 0 || Float.compare(this.A01, c26112Bgw.A01) != 0 || Float.compare(this.A02, c26112Bgw.A02) != 0 || Float.compare(this.A03, c26112Bgw.A03) != 0 || Float.compare(this.A04, c26112Bgw.A04) != 0 || Float.compare(this.A05, c26112Bgw.A05) != 0 || !C14360o3.A0K(this.A06, c26112Bgw.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01), this.A02), this.A03), this.A04), this.A05));
    }
}
