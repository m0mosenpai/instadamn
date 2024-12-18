package X;

import androidx.paging.PageEvent$Insert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OmJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55581OmJ implements InterfaceC58162PqR {
    public static final C55581OmJ A04;
    public int A00;
    public int A01;
    public int A02;
    public final List A03;

    public C55581OmJ(List list, int i, int i2) {
        C14360o3.A0B(list, 1);
        this.A03 = AbstractC166987dD.A1F(list);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 = AbstractC31172DnG.A02(((C55090Oaw) it.next()).A01, i3);
        }
        this.A02 = i3;
        this.A01 = i;
        this.A00 = i2;
    }

    static {
        PageEvent$Insert pageEvent$Insert = PageEvent$Insert.A06;
        A04 = new C55581OmJ(pageEvent$Insert.A05, pageEvent$Insert.A01, pageEvent$Insert.A00);
    }

    public static final int A00(C55581OmJ c55581OmJ) {
        Integer valueOf;
        int[] iArr = ((C55090Oaw) AbstractC001800i.A0I(c55581OmJ.A03)).A03;
        int length = iArr.length;
        int i = 1;
        if (length == 0) {
            valueOf = null;
        } else {
            int i2 = iArr[0];
            int i3 = length - 1;
            if (1 <= i3) {
                while (true) {
                    int i4 = iArr[i];
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    if (i == i3) {
                        break;
                    }
                    i++;
                }
            }
            valueOf = Integer.valueOf(i2);
        }
        return MSX.A05(valueOf);
    }

    public static final int A01(C55581OmJ c55581OmJ) {
        Integer valueOf;
        int[] iArr = ((C55090Oaw) AbstractC001800i.A0K(c55581OmJ.A03)).A03;
        int length = iArr.length;
        int i = 1;
        if (length == 0) {
            valueOf = null;
        } else {
            int i2 = iArr[0];
            int i3 = length - 1;
            if (1 <= i3) {
                while (true) {
                    int i4 = iArr[i];
                    if (i2 < i4) {
                        i2 = i4;
                    }
                    if (i == i3) {
                        break;
                    }
                    i++;
                }
            }
            valueOf = Integer.valueOf(i2);
        }
        return MSX.A05(valueOf);
    }

    public final C51082Mhh A02(int i) {
        List list;
        int i2 = i - this.A01;
        int i3 = 0;
        while (true) {
            list = this.A03;
            if (i2 < ((C55090Oaw) list.get(i3)).A01.size() || i3 >= AbstractC25226BEj.A05(list)) {
                break;
            }
            i2 -= ((C55090Oaw) list.get(i3)).A01.size();
            i3++;
        }
        C55090Oaw c55090Oaw = (C55090Oaw) list.get(i3);
        int i4 = i - this.A01;
        int size = ((getSize() - i) - this.A00) - 1;
        int A00 = A00(this);
        int A01 = A01(this);
        int i5 = c55090Oaw.A00;
        List list2 = c55090Oaw.A02;
        if (list2 != null && AbstractC16960so.A1S(list2).A01(i2)) {
            i2 = AbstractC31176DnK.A01(list2, i2);
        }
        return new C51082Mhh(i5, i2, i4, size, A00, A01);
    }

    @Override // X.InterfaceC58162PqR
    public final Object B8p(int i) {
        List list = this.A03;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((C55090Oaw) list.get(i2)).A01.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((C55090Oaw) list.get(i2)).A01.get(i);
    }

    @Override // X.InterfaceC58162PqR
    public final int Bdc() {
        return this.A00;
    }

    @Override // X.InterfaceC58162PqR
    public final int Bdd() {
        return this.A01;
    }

    @Override // X.InterfaceC58162PqR
    public final int C0r() {
        return this.A02;
    }

    @Override // X.InterfaceC58162PqR
    public final int getSize() {
        return this.A01 + this.A02 + this.A00;
    }

    public final String toString() {
        int i = this.A02;
        ArrayList A17 = AbstractC25225BEi.A17(i);
        for (int i2 = 0; i2 < i; i2++) {
            A17.add(B8p(i2));
        }
        String A1H = AbstractC25226BEj.A1H(", ", A17, null);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[(");
        A1C.append(this.A01);
        A1C.append(" placeholders), ");
        A1C.append(A1H);
        A1C.append(", (");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(" placeholders)]", A1C);
    }
}
