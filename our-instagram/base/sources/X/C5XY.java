package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5XY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XY implements InterfaceC1127857k {
    public final Alignment A00;
    public final boolean A01;

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A00(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A01(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A02(interfaceC1131259a, this, list, i);
    }

    @Override // X.InterfaceC1127857k
    public final /* synthetic */ int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        return BHV.A03(interfaceC1131259a, this, list, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5XY) {
                C5XY c5xy = (C5XY) obj;
                if (!C14360o3.A0K(this.A00, c5xy.A00) || this.A01 != c5xy.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BoxMeasurePolicy(alignment=");
        sb.append(this.A00);
        sb.append(", propagateMinConstraints=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0pQ, java.lang.Object] */
    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        long A04;
        int i;
        int i2;
        InterfaceC16660sJ c137356Kf;
        C119155aX c119155aX;
        C119155aX c119155aX2;
        InterfaceC16660sJ interfaceC16660sJ;
        C59W CpF;
        C119155aX c119155aX3;
        if (list.isEmpty()) {
            i = Constraints.A03(j);
            i2 = Constraints.A02(j);
            interfaceC16660sJ = C60U.A00;
        } else {
            if (this.A01) {
                A04 = j;
            } else {
                A04 = Constraints.A04(0, Constraints.A01(j), 0, Constraints.A00(j));
            }
            if (list.size() == 1) {
                InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) list.get(0);
                Object BbJ = interfaceC1131559d.BbJ();
                if ((BbJ instanceof C119155aX) && (c119155aX3 = (C119155aX) BbJ) != null && c119155aX3.A01) {
                    i = Constraints.A03(j);
                    i2 = Constraints.A02(j);
                    CpF = interfaceC1131559d.CpF(AbstractC119035aK.A02(i, i2));
                } else {
                    CpF = interfaceC1131559d.CpF(A04);
                    i = Math.max(Constraints.A03(j), CpF.A01);
                    i2 = Math.max(Constraints.A02(j), CpF.A00);
                }
                c137356Kf = new C207249Fd(CpF, interfaceC1131559d, c59z, this, i, i2, 0);
            } else {
                C59W[] c59wArr = new C59W[list.size()];
                ?? obj = new Object();
                obj.A00 = Constraints.A03(j);
                ?? obj2 = new Object();
                obj2.A00 = Constraints.A02(j);
                int size = list.size();
                boolean z = false;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC1131559d interfaceC1131559d2 = (InterfaceC1131559d) list.get(i3);
                    Object BbJ2 = interfaceC1131559d2.BbJ();
                    if ((BbJ2 instanceof C119155aX) && (c119155aX2 = (C119155aX) BbJ2) != null && c119155aX2.A01) {
                        z = true;
                    } else {
                        C59W CpF2 = interfaceC1131559d2.CpF(A04);
                        c59wArr[i3] = CpF2;
                        obj.A00 = Math.max(obj.A00, CpF2.A01);
                        obj2.A00 = Math.max(obj2.A00, CpF2.A00);
                    }
                }
                if (z) {
                    int i4 = obj.A00;
                    if (i4 == Integer.MAX_VALUE) {
                        i4 = 0;
                    }
                    int i5 = obj2.A00;
                    int i6 = 0;
                    if (i5 != Integer.MAX_VALUE) {
                        i6 = i5;
                    }
                    long A042 = C5AU.A04(i4, i4, i6, i5);
                    int size2 = list.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        InterfaceC1131559d interfaceC1131559d3 = (InterfaceC1131559d) list.get(i7);
                        Object BbJ3 = interfaceC1131559d3.BbJ();
                        if ((BbJ3 instanceof C119155aX) && (c119155aX = (C119155aX) BbJ3) != null && c119155aX.A01) {
                            c59wArr[i7] = interfaceC1131559d3.CpF(A042);
                        }
                    }
                }
                i = obj.A00;
                i2 = obj2.A00;
                c137356Kf = new C137356Kf(this, c59z, list, obj, obj2, c59wArr);
            }
            interfaceC16660sJ = c137356Kf;
        }
        return c59z.Cgx(AbstractC06930Yk.A0E(), interfaceC16660sJ, i, i2);
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C5XY(Alignment alignment, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
    }
}
