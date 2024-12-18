package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119605bI implements InterfaceC1127857k, C5X1 {
    public final InterfaceC118245Wl A00;
    public final InterfaceC118305Ws A01;

    @Override // X.C5X1
    public final long ALp(int i, int i2, int i3, int i4, boolean z) {
        if (!z) {
            return C5AU.A04(0, i4, i, i3);
        }
        return AbstractC119035aK.A03(0, i4, i, i3);
    }

    @Override // X.C5X1
    public final InterfaceC119205ac E4R(C59Z c59z, int[] iArr, int[] iArr2, C59W[] c59wArr, int i, int i2, int i3, int i4, int i5, int i6) {
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C207249Fd(c59z, iArr, c59wArr, this, i3, i, 1), i3, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C119605bI) {
                C119605bI c119605bI = (C119605bI) obj;
                if (!C14360o3.A0K(this.A01, c119605bI.A01) || !C14360o3.A0K(this.A00, c119605bI.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColumnMeasurePolicy(verticalArrangement=");
        sb.append(this.A01);
        sb.append(", horizontalAlignment=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC1127857k
    public final int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        float f;
        int EL8 = interfaceC1131259a.EL8(this.A01.Byx());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1131659e interfaceC1131659e = (InterfaceC1131659e) list.get(i4);
            C119135aV A00 = AbstractC119125aU.A00(interfaceC1131659e);
            if (A00 != null) {
                f = A00.A00;
            } else {
                f = 0.0f;
            }
            int Cnj = interfaceC1131659e.Cnj(i);
            if (f == 0.0f) {
                i3 += Cnj;
            } else if (f > 0.0f) {
                f2 += f;
                i2 = Math.max(i2, Math.round(Cnj / f));
            }
        }
        return Math.round(i2 * f2) + i3 + ((list.size() - 1) * EL8);
    }

    @Override // X.InterfaceC1127857k
    public final int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        int round;
        int i2;
        int EL8 = interfaceC1131259a.EL8(this.A01.Byx());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * EL8, i);
        int size = list.size();
        float f = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1131659e interfaceC1131659e = (InterfaceC1131659e) list.get(i4);
            C119135aV A00 = AbstractC119125aU.A00(interfaceC1131659e);
            if (A00 != null) {
                float f2 = A00.A00;
                if (f2 != 0.0f) {
                    if (f2 > 0.0f) {
                        f += f2;
                    }
                }
            }
            int i5 = i - min;
            if (i == Integer.MAX_VALUE) {
                i5 = Integer.MAX_VALUE;
            }
            int min2 = Math.min(interfaceC1131659e.Cnj(Integer.MAX_VALUE), i5);
            min += min2;
            i3 = Math.max(i3, interfaceC1131659e.Cnm(min2));
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            InterfaceC1131659e interfaceC1131659e2 = (InterfaceC1131659e) list.get(i6);
            C119135aV A002 = AbstractC119125aU.A00(interfaceC1131659e2);
            if (A002 != null) {
                float f3 = A002.A00;
                if (f3 > 0.0f) {
                    if (round != Integer.MAX_VALUE) {
                        i2 = Math.round(round * f3);
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    i3 = Math.max(i3, interfaceC1131659e2.Cnm(i2));
                }
            }
        }
        return i3;
    }

    @Override // X.InterfaceC1127857k
    public final int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        float f;
        int EL8 = interfaceC1131259a.EL8(this.A01.Byx());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1131659e interfaceC1131659e = (InterfaceC1131659e) list.get(i4);
            C119135aV A00 = AbstractC119125aU.A00(interfaceC1131659e);
            if (A00 != null) {
                f = A00.A00;
            } else {
                f = 0.0f;
            }
            int Cpe = interfaceC1131659e.Cpe(i);
            if (f == 0.0f) {
                i3 += Cpe;
            } else if (f > 0.0f) {
                f2 += f;
                i2 = Math.max(i2, Math.round(Cpe / f));
            }
        }
        return Math.round(i2 * f2) + i3 + ((list.size() - 1) * EL8);
    }

    @Override // X.InterfaceC1127857k
    public final int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        int round;
        int i2;
        int EL8 = interfaceC1131259a.EL8(this.A01.Byx());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * EL8, i);
        int size = list.size();
        float f = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1131659e interfaceC1131659e = (InterfaceC1131659e) list.get(i4);
            C119135aV A00 = AbstractC119125aU.A00(interfaceC1131659e);
            if (A00 != null) {
                float f2 = A00.A00;
                if (f2 != 0.0f) {
                    if (f2 > 0.0f) {
                        f += f2;
                    }
                }
            }
            int i5 = i - min;
            if (i == Integer.MAX_VALUE) {
                i5 = Integer.MAX_VALUE;
            }
            int min2 = Math.min(interfaceC1131659e.Cnj(Integer.MAX_VALUE), i5);
            min += min2;
            i3 = Math.max(i3, interfaceC1131659e.Cph(min2));
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            InterfaceC1131659e interfaceC1131659e2 = (InterfaceC1131659e) list.get(i6);
            C119135aV A002 = AbstractC119125aU.A00(interfaceC1131659e2);
            if (A002 != null) {
                float f3 = A002.A00;
                if (f3 > 0.0f) {
                    if (round != Integer.MAX_VALUE) {
                        i2 = Math.round(round * f3);
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    i3 = Math.max(i3, interfaceC1131659e2.Cph(i2));
                }
            }
        }
        return i3;
    }

    @Override // X.C5X1
    public final void E4i(C59Z c59z, int[] iArr, int[] iArr2, int i) {
        this.A01.ACY(c59z, iArr, iArr2, i);
    }

    public C119605bI(InterfaceC118305Ws interfaceC118305Ws, InterfaceC118245Wl interfaceC118245Wl) {
        this.A01 = interfaceC118305Ws;
        this.A00 = interfaceC118245Wl;
    }

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        return AbstractC119115aT.A00(this, c59z, list, null, new C59W[list.size()], Constraints.A02(j), Constraints.A03(j), Constraints.A00(j), Constraints.A01(j), c59z.EL8(this.A01.Byx()), 0, list.size(), 0);
    }

    @Override // X.C5X1
    public final int ANa(C59W c59w) {
        return c59w.A01;
    }

    @Override // X.C5X1
    public final int Cmc(C59W c59w) {
        return c59w.A00;
    }
}
