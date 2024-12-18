package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AHb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23112AHb {
    /* JADX WARN: Type inference failed for: r5v4, types: [X.0pQ, java.lang.Object] */
    public static final void A01(C189328a9 c189328a9, List list) {
        float f;
        float f2;
        C14360o3.A0B(list, 1);
        List list2 = AKI.A01;
        Iterator it = list.iterator();
        while (true) {
            f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            AKS aks = (AKS) it.next();
            if (C14360o3.A0K(aks.A01, AKI.A01.get(7))) {
                Float f3 = aks.A00;
                if (f3 != null) {
                    f = f3.floatValue();
                }
            }
        }
        c189328a9.A01 = Float.valueOf(f);
        Iterator it2 = list.iterator();
        float f4 = 0.0f;
        loop1: while (true) {
            f2 = 0.0f;
            while (it2.hasNext()) {
                AKS aks2 = (AKS) it2.next();
                String str = aks2.A01;
                List list3 = AKI.A09;
                if (C14360o3.A0K(str, list3.get(0))) {
                    Float f5 = aks2.A00;
                    if (f5 != null) {
                        f2 = f5.floatValue();
                    }
                } else if (C14360o3.A0K(str, list3.get(1))) {
                    f4 = AKS.A00(aks2);
                }
            }
        }
        Float valueOf = Float.valueOf(f4);
        Float valueOf2 = Float.valueOf(f2);
        c189328a9.A08 = valueOf;
        c189328a9.A0F = valueOf2;
        ?? obj = new Object();
        double d = 0.0d;
        while (AbstractC224517h.A09(new DHH(new C65075Td4(obj, 30), 4), AbstractC224517h.A04(C25099B8v.A00, new C0eN(list))).iterator().hasNext()) {
            d += AKS.A00((AKS) r4.next());
        }
        float f6 = (float) d;
        int i = obj.A00;
        if (i > 0) {
            f6 /= i;
        }
        c189328a9.A02 = Float.valueOf(f6);
    }

    public static final void A02(C189328a9 c189328a9, List list) {
        List list2 = AKH.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            String str = ((AKS) obj).A01;
            if (str != null && C14360o3.A0K(AbstractC62358S8f.A01.get(str), "people")) {
                A1E.add(obj);
            }
        }
        Iterator it = A1E.iterator();
        float f = 0.0f;
        if (it.hasNext()) {
            float A00 = AKS.A00((AKS) it.next());
            while (it.hasNext()) {
                A00 = Math.max(A00, AKS.A00((AKS) it.next()));
            }
            Float valueOf = Float.valueOf(A00);
            if (valueOf != null) {
                f = valueOf.floatValue();
            }
        }
        c189328a9.A0A = Float.valueOf(f);
        c189328a9.A03 = A00(AKI.A04, list);
        c189328a9.A07 = A00(AKI.A08, list);
        c189328a9.A05 = A00(AKI.A06, list);
        c189328a9.A0B = A00(AKI.A02, list);
        c189328a9.A0C = A00(AKI.A0D, list);
        c189328a9.A0D = A00(AKI.A0E, list);
        c189328a9.A0E = A00(AKI.A0F, list);
        c189328a9.A0G = A00(AKI.A0G, list);
        c189328a9.A09 = A00(AKI.A0B, list);
        c189328a9.A06 = A00(AKI.A07, list);
        c189328a9.A04 = A00(AKI.A05, list);
    }

    public static Float A00(List list, List list2) {
        return Float.valueOf(AKI.A00(list, list2));
    }
}
