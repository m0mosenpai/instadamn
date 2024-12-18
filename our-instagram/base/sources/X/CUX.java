package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes5.dex */
public final class CUX {
    public final C126985oc A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CUX) {
                C126985oc c126985oc = this.A00;
                C5C8 c5c8 = c126985oc.A03;
                C126985oc c126985oc2 = ((CUX) obj).A00;
                if (C14360o3.A0K(c5c8, c126985oc2.A03) && c126985oc.A04.A0E(c126985oc2.A04) && C14360o3.A0K(c126985oc.A08, c126985oc2.A08) && C14360o3.A0K(c126985oc.A06, c126985oc2.A06) && c126985oc.A07 == c126985oc2.A07 && c126985oc.A05 == c126985oc2.A05) {
                    long j = c126985oc.A02;
                    int A01 = Constraints.A01(j);
                    long j2 = c126985oc2.A02;
                    if (A01 != Constraints.A01(j2) || Constraints.A00(j) != Constraints.A00(j2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        C126985oc c126985oc = this.A00;
        int A0G = AbstractC166987dD.A0G(c126985oc.A03);
        C118125Vw c118125Vw = c126985oc.A04;
        C5W3 c5w3 = c118125Vw.A02;
        long j = c5w3.A01;
        long j2 = C118135Vx.A01;
        int A03 = (AbstractC25227BEk.A03(j) + AbstractC25235BEs.A06(c5w3.A08)) * 31;
        C122165gC c122165gC = c5w3.A06;
        if (c122165gC != null) {
            i = c122165gC.A00;
        } else {
            i = 0;
        }
        int i5 = (A03 + i) * 31;
        C122175gD c122175gD = c5w3.A07;
        if (c122175gD != null) {
            i2 = c122175gD.A00;
        } else {
            i2 = 0;
        }
        int A06 = (((i5 + i2) * 31) + AbstractC25235BEs.A06(c5w3.A05)) * 31;
        String str = c5w3.A0E;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int A07 = AbstractC167007dF.A07(c5w3.A02, (A06 + i3) * 31);
        C122185gE c122185gE = c5w3.A0A;
        if (c122185gE != null) {
            i4 = Float.floatToIntBits(c122185gE.A00);
        } else {
            i4 = 0;
        }
        int A062 = (((((A07 + i4) * 31) + AbstractC25235BEs.A06(c5w3.A0D)) * 31) + AbstractC25235BEs.A06(c5w3.A09)) * 31;
        long j3 = c5w3.A00;
        long j4 = C1132359l.A01;
        int A0J = AbstractC166997dE.A0J(c126985oc.A05, AbstractC166997dE.A0J(c126985oc.A07, AbstractC166997dE.A0J(c126985oc.A06, (((((AbstractC166997dE.A0J(c126985oc.A08, (A0G + AbstractC166997dE.A0J(c118125Vw.A00, AbstractC167007dF.A07(j3, A062) * 31) + AbstractC25235BEs.A06(c118125Vw.A01)) * 31) + Integer.MAX_VALUE) * 31) + 1231) * 31) + 1) * 31)));
        long j5 = c126985oc.A02;
        return ((A0J + Constraints.A01(j5)) * 31) + Constraints.A00(j5);
    }

    public CUX(C126985oc c126985oc) {
        this.A00 = c126985oc;
    }
}
