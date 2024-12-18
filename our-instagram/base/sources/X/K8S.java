package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class K8S extends C40781ul implements InterfaceC168867gL {
    public EnumC143286dT A00;
    public Boolean A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;

    public final List A00() {
        EnumC150226pU enumC150226pU;
        List list = this.A08;
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C148286ly A0Y = AbstractC43592JPx.A0Y(it);
                C148276lx c148276lx = C148276lx.A1d;
                String str = A0Y.A0S;
                C14360o3.A07(str);
                EnumC143286dT enumC143286dT = this.A00;
                if (enumC143286dT != EnumC143286dT.A07 && enumC143286dT != EnumC143286dT.A05) {
                    A0Y.A0S = A0Y.A0a;
                    A0Y.A0Z = this.A07;
                }
                List A1J = AbstractC166987dD.A1J(A0Y);
                if (A0Y.A04() == C05F.A0N) {
                    enumC150226pU = EnumC150226pU.A0A;
                } else {
                    enumC150226pU = EnumC150226pU.A0C;
                }
                C148276lx c148276lx2 = new C148276lx(enumC150226pU, str, A1J);
                List A12 = AbstractC43594JPz.A12(A0Y.A0j);
                C14360o3.A0B(A12, 0);
                c148276lx2.A0P = A12;
                A0q.add(c148276lx2);
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final Integer BmK() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List Bri() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final /* bridge */ /* synthetic */ boolean CLI() {
        return false;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List getItems() {
        return A00();
    }
}
