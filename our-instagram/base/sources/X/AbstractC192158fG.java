package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.8fG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC192158fG {
    public static final C3R9 A01(List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16510rw interfaceC16510rw) {
        C14360o3.A0B(list, 1);
        if (!interfaceC16510rw.equals(new C0YZ(Collection.class)) && !interfaceC16510rw.equals(new C0YZ(List.class)) && !interfaceC16510rw.equals(new C0YZ(List.class)) && !interfaceC16510rw.equals(new C0YZ(ArrayList.class))) {
            if (interfaceC16510rw.equals(new C0YZ(HashSet.class))) {
                return new X6Q((C3R9) list.get(0));
            }
            if (!interfaceC16510rw.equals(new C0YZ(java.util.Set.class)) && !interfaceC16510rw.equals(new C0YZ(java.util.Set.class)) && !interfaceC16510rw.equals(new C0YZ(LinkedHashSet.class))) {
                if (interfaceC16510rw.equals(new C0YZ(HashMap.class))) {
                    return new C73863Sv((C3R9) list.get(0), (C3R9) list.get(1));
                }
                if (!interfaceC16510rw.equals(new C0YZ(Map.class)) && !interfaceC16510rw.equals(new C0YZ(Map.class)) && !interfaceC16510rw.equals(new C0YZ(LinkedHashMap.class))) {
                    if (interfaceC16510rw.equals(new C0YZ(Map.Entry.class))) {
                        C3R9 c3r9 = (C3R9) list.get(0);
                        C3R9 c3r92 = (C3R9) list.get(1);
                        C14360o3.A0B(c3r9, 0);
                        C14360o3.A0B(c3r92, 1);
                        return new X6S(c3r9, c3r92);
                    }
                    if (interfaceC16510rw.equals(new C0YZ(C09530e4.class))) {
                        C3R9 c3r93 = (C3R9) list.get(0);
                        C3R9 c3r94 = (C3R9) list.get(1);
                        C14360o3.A0B(c3r93, 0);
                        C14360o3.A0B(c3r94, 1);
                        return new X6T(c3r93, c3r94);
                    }
                    if (interfaceC16510rw.equals(new C0YZ(C51u.class))) {
                        C3R9 c3r95 = (C3R9) list.get(0);
                        C3R9 c3r96 = (C3R9) list.get(1);
                        C3R9 c3r97 = (C3R9) list.get(2);
                        C14360o3.A0B(c3r95, 0);
                        C14360o3.A0B(c3r96, 1);
                        C14360o3.A0B(c3r97, 2);
                        return new C71698Wz7(c3r95, c3r96, c3r97);
                    }
                    if (AbstractC53012bi.A00(interfaceC16510rw).isArray()) {
                        Object invoke = interfaceC16820sZ.invoke();
                        C14360o3.A0C(invoke, AbstractC111324zv.A00(4999));
                        InterfaceC16510rw interfaceC16510rw2 = (InterfaceC16510rw) invoke;
                        C3R9 c3r98 = (C3R9) list.get(0);
                        C14360o3.A0B(interfaceC16510rw2, 0);
                        C14360o3.A0B(c3r98, 1);
                        return new C3TZ(interfaceC16510rw2, c3r98);
                    }
                    C3R9[] c3r9Arr = (C3R9[]) list.toArray(new C3R9[0]);
                    return AbstractC192288fT.A01(interfaceC16510rw, (C3R9[]) Arrays.copyOf(c3r9Arr, c3r9Arr.length));
                }
                return new C3RL((C3R9) list.get(0), (C3R9) list.get(1));
            }
            return new X6R((C3R9) list.get(0));
        }
        return new C3SG((C3R9) list.get(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r1 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C3R9 A02(X.InterfaceC16500rv r7, X.C73803Sk r8) {
        /*
            r5 = 0
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            X.0ro r2 = r7.Anj()
            boolean r0 = r2 instanceof X.InterfaceC16510rw
            if (r0 == 0) goto Lda
            X.0rw r2 = (X.InterfaceC16510rw) r2
            boolean r6 = r7.CY0()
            java.util.List r1 = r7.Ace()
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.next()
            X.0v6 r0 = (X.C18210v6) r0
            X.C14360o3.A0B(r0, r5)
            X.0rv r3 = r0.A01
            if (r3 == 0) goto L3d
            r4.add(r3)
            goto L26
        L3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Star projections in type arguments are not allowed, but had "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L54:
            boolean r0 = r4.isEmpty()
            r3 = 0
            if (r0 == 0) goto Lbd
            X.C14360o3.A0B(r2, r5)
            java.lang.Class r0 = X.AbstractC53012bi.A00(r2)
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L6d
            java.util.Map r0 = r8.A00
            r0.get(r2)
        L6d:
            if (r6 != 0) goto Lba
            X.8fL r0 = X.AbstractC192168fH.A02
        L71:
            X.3R9 r1 = r0.AXX(r2)
        L75:
            if (r1 != 0) goto Lab
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lac
            X.3R9[] r0 = new X.C3R9[r5]
            X.3R9 r1 = X.AbstractC192288fT.A01(r2, r0)
            if (r1 != 0) goto L8d
            java.util.Map r0 = X.AbstractC192298fX.A00
            java.lang.Object r1 = r0.get(r2)
            X.3R9 r1 = (X.C3R9) r1
        L8d:
            if (r1 != 0) goto La3
            java.util.Map r0 = r8.A00
            r0.get(r2)
            java.lang.Class r0 = X.AbstractC53012bi.A00(r2)
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto Ld2
            kotlinx.serialization.PolymorphicSerializer r1 = new kotlinx.serialization.PolymorphicSerializer
            r1.<init>(r2)
        La3:
            if (r6 == 0) goto La9
            X.3R9 r1 = X.AbstractC192698gB.A00(r1)
        La9:
            if (r1 == 0) goto Ld2
        Lab:
            return r1
        Lac:
            java.util.List r1 = A00(r4, r8)
            X.B3N r0 = new X.B3N
            r0.<init>()
            X.3R9 r1 = A01(r1, r0, r2)
            goto L8d
        Lba:
            X.8fL r0 = X.AbstractC192168fH.A03
            goto L71
        Lbd:
            X.8fP r0 = X.AbstractC192168fH.A00
            X.C14360o3.A0B(r2, r5)
            if (r6 == 0) goto Lc6
            X.8fP r0 = X.AbstractC192168fH.A01
        Lc6:
            java.lang.Object r1 = r0.AXh(r4, r2)
            boolean r0 = r1 instanceof X.C09540e5
            if (r0 == 0) goto Lcf
            r1 = r3
        Lcf:
            X.3R9 r1 = (X.C3R9) r1
            goto L75
        Ld2:
            X.AbstractC192728gE.A01(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lda:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Only KClass supported as classifier, got "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC192158fG.A02(X.0rv, X.3Sk):X.3R9");
    }

    public static final List A00(List list, C73803Sk c73803Sk) {
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A02((InterfaceC16500rv) it.next(), c73803Sk));
        }
        return arrayList;
    }
}
