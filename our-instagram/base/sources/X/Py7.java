package X;

import android.text.Editable;
import android.util.DisplayMetrics;
import java.util.List;

/* loaded from: classes10.dex */
public final class Py7 implements InterfaceC65377TjA {
    public final int A00;
    public final Object A01;

    public Py7(Py8 py8, int i) {
        this.A00 = i;
        this.A01 = py8;
    }

    @Override // X.InterfaceC65377TjA
    public final List ANE(C62577SHc c62577SHc) {
        Integer num;
        Object r8j;
        Integer num2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c62577SHc, 0);
                int A00 = AbstractC62833STf.A00(c62577SHc.A02, c62577SHc.A01, c62577SHc.A00);
                Py8 py8 = (Py8) this.A01;
                C51608Mr0 c51608Mr0 = py8.A04;
                if (c51608Mr0 != null && c51608Mr0.A04) {
                    if (A00 != 0) {
                        if (A00 != 1) {
                            num2 = C05F.A0N;
                        } else {
                            num2 = C05F.A0C;
                        }
                    } else {
                        num2 = C05F.A00;
                    }
                    int i = c51608Mr0.A01;
                    int i2 = py8.A01;
                    DisplayMetrics A0K = AbstractC167007dF.A0K(py8.A02);
                    C14360o3.A07(A0K);
                    r8j = new R8O(A0K, num2, A00, i, i2);
                } else {
                    if (A00 == 0) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    int i3 = py8.A01;
                    DisplayMetrics A0K2 = AbstractC167007dF.A0K(py8.A02);
                    C14360o3.A07(A0K2);
                    r8j = new R8J(A0K2, num, A00, i3);
                }
                return AbstractC166987dD.A1J(r8j);
            case 1:
                C14360o3.A0B(c62577SHc, 0);
                Editable editable = c62577SHc.A02;
                int i4 = c62577SHc.A01;
                int i5 = c62577SHc.A00;
                int A002 = AbstractC62833STf.A00(editable, i4, i5);
                Py8 py82 = (Py8) this.A01;
                int i6 = py82.A01;
                DisplayMetrics A0K3 = AbstractC167007dF.A0K(py82.A02);
                C14360o3.A07(A0K3);
                C51608Mr0 c51608Mr02 = py82.A04;
                return AbstractC166987dD.A1J(new R8M(editable, A0K3, A002, i4, i5, i6, c51608Mr02.A01, c51608Mr02.A03));
            default:
                C14360o3.A0B(c62577SHc, 0);
                Editable editable2 = c62577SHc.A02;
                int i7 = c62577SHc.A01;
                int i8 = c62577SHc.A00;
                Py8 py83 = (Py8) this.A01;
                int i9 = py83.A01;
                DisplayMetrics A0K4 = AbstractC167007dF.A0K(py83.A02);
                C14360o3.A07(A0K4);
                return AbstractC166987dD.A1J(new R8N(editable2, A0K4, 0, i7, i8, i9));
        }
    }
}
