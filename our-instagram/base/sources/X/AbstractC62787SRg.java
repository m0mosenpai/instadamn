package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.SRg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62787SRg {
    public static final LinkedHashMap A00(List list, List list2) {
        Map A0E;
        Map A0E2;
        C65043TcY c65043TcY = C65043TcY.A00;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((String) obj).length() > 0) {
                    A1E.add(obj);
                }
            }
            A0E = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A1E, 10)));
            for (Object obj2 : A1E) {
                A0E.put(obj2, c65043TcY.invoke(obj2));
            }
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        if (list2 != null) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj3 : list2) {
                if (((String) obj3).length() > 0) {
                    A1E2.add(obj3);
                }
            }
            A0E2 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A1E2, 10)));
            for (Object obj4 : A1E2) {
                A0E2.put(obj4, c65043TcY.invoke(obj4));
            }
        } else {
            A0E2 = AbstractC06930Yk.A0E();
        }
        return AbstractC06930Yk.A04(A0E, A0E2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.SD8] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.SD8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A01(java.util.List r4, java.util.List r5, boolean r6, boolean r7) {
        /*
            java.lang.String r3 = "inapp"
            if (r7 == 0) goto L34
            java.lang.String r1 = "subs"
            if (r5 != 0) goto Lb
        L9:
            X.0sl r5 = X.C16930sl.A00
        Lb:
            java.util.ArrayList r0 = X.AbstractC166987dD.A1F(r5)
            X.SD8 r2 = new X.SD8
            r2.<init>()
            r2.A00 = r1
            r2.A01 = r0
            if (r6 == 0) goto L32
            if (r7 == 0) goto L32
            if (r4 != 0) goto L20
            X.0sl r4 = X.C16930sl.A00
        L20:
            java.util.ArrayList r1 = X.AbstractC166987dD.A1F(r4)
            X.SD8 r0 = new X.SD8
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r1
        L2d:
            X.0e4 r0 = X.AbstractC166987dD.A1L(r2, r0)
            return r0
        L32:
            r0 = 0
            goto L2d
        L34:
            r1 = r3
            if (r4 == 0) goto L9
            r5 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC62787SRg.A01(java.util.List, java.util.List, boolean, boolean):X.0e4");
    }
}
