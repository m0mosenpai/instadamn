package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class OXb {
    public static final int A00(O6Y o6y, InterfaceC58162PqR interfaceC58162PqR, InterfaceC58162PqR interfaceC58162PqR2, int i) {
        int A01;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC58162PqR, o6y, interfaceC58162PqR2);
        if (o6y.A01) {
            int Bdd = i - interfaceC58162PqR.Bdd();
            int C0r = interfaceC58162PqR.C0r();
            if (Bdd >= 0 && Bdd < C0r) {
                int i2 = 0;
                do {
                    int i3 = i2 / 2;
                    int i4 = 1;
                    if (i2 % 2 == A1b) {
                        i4 = -1;
                    }
                    int i5 = (i3 * i4) + Bdd;
                    if (i5 >= 0 && i5 < interfaceC58162PqR.C0r() && (A01 = o6y.A00.A01(i5)) != -1) {
                        return A01 + interfaceC58162PqR2.Bdd();
                    }
                    i2++;
                } while (i2 < 30);
            }
        }
        return C17s.A05(C17s.A0C(0, interfaceC58162PqR2.getSize()), i);
    }

    public static final O6Y A01(InterfaceC58162PqR interfaceC58162PqR, InterfaceC58162PqR interfaceC58162PqR2, AbstractC65412xd abstractC65412xd) {
        AbstractC167007dF.A1K(interfaceC58162PqR, interfaceC58162PqR2);
        boolean z = true;
        C66582za A00 = AbstractC66552zX.A00(new C51089Mho(interfaceC58162PqR, interfaceC58162PqR2, abstractC65412xd, interfaceC58162PqR.C0r(), interfaceC58162PqR2.C0r()));
        Iterable A0C = C17s.A0C(0, interfaceC58162PqR.C0r());
        if (!(A0C instanceof Collection) || !((Collection) A0C).isEmpty()) {
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                if (A00.A01(((AbstractC16880sg) it).A00()) != -1) {
                    break;
                }
            }
        }
        z = false;
        return new O6Y(A00, z);
    }

    public static final void A02(O6Y o6y, InterfaceC58162PqR interfaceC58162PqR, InterfaceC58162PqR interfaceC58162PqR2, InterfaceC65452xh interfaceC65452xh) {
        AbstractC25233BEq.A0v(0, interfaceC58162PqR, interfaceC58162PqR2, o6y);
        if (o6y.A01) {
            C55585OmO c55585OmO = new C55585OmO(interfaceC58162PqR, interfaceC58162PqR2, interfaceC65452xh);
            o6y.A00.A02(c55585OmO);
            InterfaceC58162PqR interfaceC58162PqR3 = c55585OmO.A06;
            int Bdd = interfaceC58162PqR3.Bdd();
            int i = c55585OmO.A02;
            int min = Math.min(Bdd, i);
            InterfaceC58162PqR interfaceC58162PqR4 = c55585OmO.A05;
            int Bdd2 = interfaceC58162PqR4.Bdd() - i;
            if (Bdd2 > 0) {
                if (min > 0) {
                    c55585OmO.A07.D2j(0, min, EnumC53108NeL.PLACEHOLDER_POSITION_CHANGE);
                }
                c55585OmO.A07.DMJ(0, Bdd2);
            } else if (Bdd2 < 0) {
                InterfaceC65452xh interfaceC65452xh2 = c55585OmO.A07;
                interfaceC65452xh2.DfC(0, -Bdd2);
                int i2 = min + Bdd2;
                if (i2 > 0) {
                    interfaceC65452xh2.D2j(0, i2, EnumC53108NeL.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            int Bdd3 = interfaceC58162PqR4.Bdd();
            c55585OmO.A02 = Bdd3;
            int Bdc = interfaceC58162PqR3.Bdc();
            int i3 = c55585OmO.A00;
            int min2 = Math.min(Bdc, i3);
            int Bdc2 = interfaceC58162PqR4.Bdc() - i3;
            int i4 = Bdd3 + c55585OmO.A04 + i3;
            int i5 = i4 - min2;
            boolean A1S = MSY.A1S(i5, interfaceC58162PqR3.getSize() - min2);
            if (Bdc2 > 0) {
                c55585OmO.A07.DMJ(i4, Bdc2);
            } else if (Bdc2 < 0) {
                c55585OmO.A07.DfC(i4 + Bdc2, -Bdc2);
                min2 += Bdc2;
            }
            if (min2 > 0 && A1S) {
                c55585OmO.A07.D2j(i5, min2, EnumC53108NeL.PLACEHOLDER_POSITION_CHANGE);
            }
            c55585OmO.A00 = interfaceC58162PqR4.Bdc();
            return;
        }
        int Bdd4 = interfaceC58162PqR.Bdd();
        int Bdd5 = interfaceC58162PqR2.Bdd();
        int max = Math.max(Bdd4, Bdd5);
        int min3 = Math.min(Bdd4 + interfaceC58162PqR.C0r(), Bdd5 + interfaceC58162PqR2.C0r());
        int i6 = min3 - max;
        if (i6 > 0) {
            interfaceC65452xh.DfC(max, i6);
            interfaceC65452xh.DMJ(max, i6);
        }
        int min4 = Math.min(max, min3);
        int max2 = Math.max(max, min3);
        int Bdd6 = interfaceC58162PqR.Bdd();
        int size = interfaceC58162PqR2.getSize();
        int i7 = Bdd6;
        if (Bdd6 > size) {
            i7 = size;
        }
        int C0r = Bdd6 + interfaceC58162PqR.C0r();
        if (C0r > size) {
            C0r = size;
        }
        EnumC53108NeL enumC53108NeL = EnumC53108NeL.ITEM_TO_PLACEHOLDER;
        int i8 = min4 - i7;
        if (i8 > 0) {
            interfaceC65452xh.D2j(i7, i8, enumC53108NeL);
        }
        int i9 = C0r - max2;
        if (i9 > 0) {
            interfaceC65452xh.D2j(max2, i9, enumC53108NeL);
        }
        int Bdd7 = interfaceC58162PqR2.Bdd();
        int size2 = interfaceC58162PqR.getSize();
        int i10 = Bdd7;
        if (Bdd7 > size2) {
            i10 = size2;
        }
        int C0r2 = Bdd7 + interfaceC58162PqR2.C0r();
        if (C0r2 > size2) {
            C0r2 = size2;
        }
        EnumC53108NeL enumC53108NeL2 = EnumC53108NeL.PLACEHOLDER_TO_ITEM;
        int i11 = min4 - i10;
        if (i11 > 0) {
            interfaceC65452xh.D2j(i10, i11, enumC53108NeL2);
        }
        int i12 = C0r2 - max2;
        if (i12 > 0) {
            interfaceC65452xh.D2j(max2, i12, enumC53108NeL2);
        }
        int size3 = interfaceC58162PqR2.getSize();
        int size4 = interfaceC58162PqR.getSize();
        int i13 = size3 - size4;
        if (i13 > 0) {
            interfaceC65452xh.DMJ(size4, i13);
        } else {
            if (i13 >= 0) {
                return;
            }
            interfaceC65452xh.DfC(size4 + i13, -i13);
        }
    }
}
