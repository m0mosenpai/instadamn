package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CYd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28049CYd {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r8.A06 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if (r4 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C9BW r15, X.EnumC168507fk r16, java.util.List r17) {
        /*
            r9 = r15
            java.lang.Object r14 = r15.A01
            X.7di r14 = (X.C167297di) r14
            java.lang.Integer r0 = r14.A0H
            boolean r0 = X.AbstractC166307bz.A05(r0)
            if (r0 == 0) goto Led
            X.7fk r0 = r14.A05
            r1 = r16
            if (r0 != r1) goto Led
            java.lang.Object r10 = r15.A00
            X.9Bd r10 = (X.C206209Bd) r10
            java.lang.Object r8 = r10.A00
            X.7fp r8 = (X.C168557fp) r8
            boolean r13 = r8.A08
            r16 = 0
            r7 = 1
            if (r13 != 0) goto L2b
            boolean r0 = r8.A07
            if (r0 != 0) goto L2b
            boolean r0 = r8.A06
            r6 = 1
            if (r0 != 0) goto L2c
        L2b:
            r6 = 0
        L2c:
            java.lang.Object r3 = r10.A01
            java.util.List r3 = (java.util.List) r3
            boolean r0 = X.AbstractC166987dD.A1b(r3)
            if (r0 == 0) goto L42
            if (r6 == 0) goto L42
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L72
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L72
        L42:
            r5 = 0
        L43:
            boolean r4 = r8.A07
            if (r5 != 0) goto L4c
            if (r6 != 0) goto L4c
            r15 = 0
            if (r4 == 0) goto L4d
        L4c:
            r15 = 1
        L4d:
            java.lang.Object r12 = r10.A02
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r10 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r3.iterator()
        L59:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.7di r0 = (X.C167297di) r0
            java.lang.Integer r0 = r0.A0H
            boolean r0 = X.AbstractC166307bz.A05(r0)
            if (r0 == 0) goto L59
            r10.add(r1)
            goto L59
        L72:
            java.util.Iterator r2 = r3.iterator()
        L76:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r2.next()
            X.7di r0 = (X.C167297di) r0
            java.lang.Integer r1 = r0.A0H
            java.lang.Integer r0 = X.C05F.A0u
            if (r1 != r0) goto L76
            r5 = 1
            goto L43
        L8a:
            int r3 = r10.size()
            int r3 = r3 + r13
            int r0 = r12.size()
            int r3 = r3 + r0
            int r3 = r3 + r15
            if (r3 <= 0) goto La3
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r0 = 64511(0xfbff, float:9.0399E-41)
            X.7di r14 = X.C167297di.A02(r14, r2, r1, r2, r0)
        La3:
            r11 = r17
            r11.add(r14)
            if (r3 != r7) goto Lac
            r16 = 1
        Lac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            X.7gt r0 = X.AbstractC166307bz.A00(r9, r8, r0, r13)
            if (r0 == 0) goto Lb9
            r11.add(r0)
        Lb9:
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r12, r10)
            java.util.ArrayList r10 = X.AbstractC001800i.A0U(r0)
            java.lang.Object r3 = X.AbstractC001800i.A0L(r10)
            X.7di r3 = (X.C167297di) r3
            if (r3 == 0) goto Le1
            r2 = 0
            boolean r0 = X.AbstractC167007dF.A1N(r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 63487(0xf7ff, float:8.8964E-41)
            X.7di r1 = X.C167297di.A02(r3, r2, r2, r1, r0)
            int r0 = r10.size()
            int r0 = r0 - r7
            r10.set(r0, r1)
        Le1:
            r11.addAll(r10)
            X.7gt r0 = X.AbstractC166307bz.A01(r9, r8, r5, r6, r4)
            if (r0 == 0) goto Led
            r11.add(r0)
        Led:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28049CYd.A00(X.9BW, X.7fk, java.util.List):void");
    }

    public static final void A01(C166137bh c166137bh, List list) {
        Integer num = c166137bh.A03.A00.A03;
        if (num == C05F.A0u) {
            List list2 = c166137bh.A06;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C167297di) ((C9BW) it.next()).A01).A0c) {
                }
            }
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        EnumC27402C7f enumC27402C7f = EnumC27402C7f.A05;
        A1E.add(enumC27402C7f);
        EnumC27402C7f enumC27402C7f2 = EnumC27402C7f.A07;
        A1E.add(enumC27402C7f2);
        if (num.intValue() == 1) {
            enumC27402C7f = enumC27402C7f2;
        }
        list.add(new C169547hU(enumC27402C7f, A1E));
    }
}
