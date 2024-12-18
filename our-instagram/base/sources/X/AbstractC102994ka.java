package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102994ka {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.4lE] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Boolean] */
    public static void A00(InterfaceC102974kY interfaceC102974kY, C102874kO c102874kO, InterfaceC102764kD interfaceC102764kD, String str) {
        Object Ep1;
        int A00 = AbstractC102804kH.A00(str);
        switch (interfaceC102764kD.E3x().intValue()) {
            case 0:
                Ep1 = new ArrayList();
                int i = 0;
                while (interfaceC102764kD.Csy() != C05F.A01) {
                    if (interfaceC102764kD.E3x() == C05F.A0C) {
                        C103004kb c103004kb = new C103004kb(interfaceC102974kY);
                        List list = c103004kb.A00;
                        list.add(Integer.valueOf(A00));
                        list.add(Integer.valueOf(i));
                        Ep1.add(AbstractC102864kN.A00(c103004kb, interfaceC102764kD));
                        i++;
                    } else {
                        Ep1.add(AbstractC102854kM.A00(interfaceC102764kD));
                    }
                }
                break;
            case 1:
            case 3:
            case 4:
            default:
                return;
            case 2:
                C103004kb c103004kb2 = new C103004kb(interfaceC102974kY);
                c103004kb2.A00.add(Integer.valueOf(A00));
                Ep1 = AbstractC102864kN.A00(c103004kb2, interfaceC102764kD);
                break;
            case 5:
                Ep1 = interfaceC102764kD.E3y().Ep1();
                break;
            case 6:
                Ep1 = AbstractC58670Pzi.A00(null, interfaceC102764kD.E3y());
                break;
            case 7:
                Ep1 = interfaceC102764kD.E3y().Ctf();
                break;
            case 8:
                Ep1 = Boolean.valueOf(interfaceC102764kD.E3y().AE8());
                break;
        }
        c102874kO.A0Q(A00, Ep1);
    }
}
