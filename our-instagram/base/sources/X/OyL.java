package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OyL implements InterfaceC58032PoI {
    public final /* synthetic */ C51051Mh5 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.US9] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC58032PoI
    public final void Dv7(JWd jWd, String str) {
        Object obj;
        ?? r8;
        Object c218409lC;
        List<US9> list;
        int i;
        Iterator A1J = AbstractC25226BEj.A1J(jWd.A00);
        do {
            obj = null;
            if (!A1J.hasNext()) {
                break;
            } else {
                obj = A1J.next();
            }
        } while (!AbstractC25228BEl.A1X(((C25547BRj) obj).A01));
        C25547BRj c25547BRj = (C25547BRj) obj;
        C51051Mh5 c51051Mh5 = this.A00;
        if (c25547BRj != null && (list = (List) c25547BRj.A01) != null) {
            r8 = AbstractC167017dG.A0q(list);
            for (US9 us9 : list) {
                boolean z = us9.A07;
                String str2 = us9.A06;
                if (z) {
                    if (str2 != null) {
                        i = str2.length();
                    } else {
                        i = 0;
                    }
                    str2 = AJp.A00(i);
                }
                float f = us9.A00;
                int i2 = us9.A04;
                int i3 = us9.A02;
                boolean z2 = us9.A07;
                int i4 = us9.A03;
                float f2 = us9.A01;
                String str3 = us9.A05;
                AbstractC167007dF.A1H(str2, 0, str3);
                ?? obj2 = new Object();
                obj2.A06 = str2;
                obj2.A00 = f;
                obj2.A04 = i2;
                obj2.A02 = i3;
                obj2.A07 = z2;
                obj2.A03 = i4;
                obj2.A01 = f2;
                obj2.A05 = str3;
                r8.add(obj2);
            }
        } else {
            r8 = C16930sl.A00;
        }
        C22993ABs c22993ABs = c51051Mh5.A01;
        if (c22993ABs != null) {
            C14360o3.A0B(r8, 0);
            c22993ABs.A07 = r8;
        }
        C006802i.A0p.markerEnd(18946359, (short) 2);
        C2GS c2gs = c51051Mh5.A06;
        if (c25547BRj == null) {
            c218409lC = C218419lD.A00;
        } else {
            c218409lC = new C218409lC(r8);
        }
        c2gs.A0A(c218409lC);
    }

    public OyL(C51051Mh5 c51051Mh5) {
        this.A00 = c51051Mh5;
    }

    @Override // X.InterfaceC58032PoI
    public final void Dv6() {
        C51051Mh5 c51051Mh5 = this.A00;
        C006802i.A0p.markerEnd(18946359, (short) 3);
        C22993ABs c22993ABs = c51051Mh5.A01;
        if (c22993ABs != null) {
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 0);
            c22993ABs.A07 = c16930sl;
        }
        c51051Mh5.A06.A0A(C218429lE.A00);
    }
}
