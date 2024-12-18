package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.AbstractList;

/* renamed from: X.Mjf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51195Mjf extends C1I4 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C51195Mjf(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0N;
        int i3;
        int i4;
        int size;
        if (this.A00 != 0) {
            A0N = C0f9.A03(-1024541469);
            C50868Mdz c50868Mdz = (C50868Mdz) this.A02;
            if (!c50868Mdz.A07 && i != 0) {
                OXZ oxz = (OXZ) this.A03;
                EnumC53170NfR A0B = oxz.A0B();
                if (A0B == EnumC53170NfR.A04 && c50868Mdz.A02 == oxz.A08()) {
                    c50868Mdz.A02 = Integer.MIN_VALUE;
                    i4 = 596102703;
                } else if (A0B == EnumC53170NfR.A02 && c50868Mdz.A00 == oxz.A08()) {
                    c50868Mdz.A00 = Integer.MIN_VALUE;
                    i4 = 1382147758;
                } else if (A0B == EnumC53170NfR.A07 && c50868Mdz.A04 == oxz.A08()) {
                    c50868Mdz.A04 = Integer.MIN_VALUE;
                    i4 = 1692748051;
                } else {
                    EnumC53170NfR enumC53170NfR = EnumC53170NfR.A06;
                    if (A0B == enumC53170NfR && c50868Mdz.A08) {
                        c50868Mdz.A08 = false;
                        i4 = -1087226154;
                    } else {
                        int i5 = oxz.A00 + i;
                        int A06 = AbstractC25230BEn.A06(i5, i5);
                        oxz.A00 = A06;
                        if (A0B == enumC53170NfR) {
                            c50868Mdz.A03 = A06;
                            AbstractC25231BEo.A1H(c50868Mdz, AbstractC141776au.A00(c50868Mdz), 7);
                        }
                        AbstractC166987dD.A1Y(this.A01);
                        i4 = -938371257;
                    }
                }
            } else {
                i4 = 1325144349;
            }
        } else {
            A0N = AbstractC167017dG.A0N(recyclerView, -1865987142);
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                i3 = abstractC70663Fe.A0U();
            } else {
                i3 = 0;
            }
            AbstractList abstractList = (AbstractList) this.A01;
            if (!abstractList.isEmpty() && (size = (i3 / abstractList.size()) - ((KEG) this.A02).A00) != 0) {
                ELG elg = (ELG) this.A03;
                int A01 = AbstractC72193Ls.A01(recyclerView.A0D) / size;
                elg.A00 = A01;
                ELG.A01((EnumC39614HeO) ((C09530e4) abstractList.get(A01)).A01, elg, (String) ((C09530e4) abstractList.get(A01)).A00);
            }
            i4 = 1286430202;
        }
        C0f9.A0A(i4, A0N);
    }
}
