package X;

import java.util.List;

/* renamed from: X.CWr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28019CWr {
    public static final void A01(C28365CfP c28365CfP, List list) {
        C14360o3.A0B(c28365CfP, 0);
        int A05 = AbstractC25226BEj.A05(list);
        if (A05 >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                InterfaceC1131559d interfaceC1131559d = (InterfaceC1131559d) list.get(i);
                Object A00 = CBL.A00(interfaceC1131559d);
                if (A00 == null) {
                    C14360o3.A0B(interfaceC1131559d, 0);
                    interfaceC1131559d.BbJ();
                    A00 = new C27487CBi();
                }
                C28879Con A002 = c28365CfP.A00(A00);
                if (A002 != null) {
                    A002.A0a = interfaceC1131559d;
                    C56082hw c56082hw = A002.A0I;
                    if (c56082hw != null) {
                        c56082hw.A0m = interfaceC1131559d;
                    }
                }
                C14360o3.A0B(interfaceC1131559d, 0);
                interfaceC1131559d.BbJ();
                if (i2 <= A05) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public static final C09530e4 A00(C5Tl c5Tl, InterfaceC74953Yl interfaceC74953Yl, CU3 cu3, C28880Coo c28880Coo) {
        AbstractC167027dH.A13(cu3, interfaceC74953Yl, c28880Coo);
        c5Tl.Enp(-441911751);
        Object A0k = AbstractC25235BEs.A0k(c5Tl, -3687241);
        Object obj = C5UI.A00;
        if (A0k == obj) {
            A0k = new C28791CnN(cu3);
            c5Tl.FBy(A0k);
        }
        C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
        C28791CnN c28791CnN = (C28791CnN) A0k;
        c5Tl.Enp(-3686930);
        boolean AH4 = c5Tl.AH4(257);
        Object EEc = c5Tl.EEc();
        if (AH4 || EEc == obj) {
            EEc = AbstractC166987dD.A1L(new C28826Cnw(interfaceC74953Yl, c28791CnN, c28880Coo), new DH1(23, c28791CnN, interfaceC74953Yl));
            c5Tl.FBy(EEc);
        }
        C117505Tk.A0I(A0J);
        C09530e4 c09530e4 = (C09530e4) EEc;
        C117505Tk.A0I(A0J);
        return c09530e4;
    }
}
