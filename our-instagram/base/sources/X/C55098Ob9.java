package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ob9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55098Ob9 {
    public C09530e4 A00;
    public final UserSession A03;
    public final C50868Mdz A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public List A01 = AbstractC166987dD.A1E();
    public final Integer[] A09 = {0, 0};
    public final Integer[] A02 = {0, 0};
    public final Boolean[] A08 = {false, false};

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean A00(java.util.List r11, java.lang.Integer[] r12, float r13, int r14) {
        /*
            r10 = this;
            X.0sZ r0 = r10.A06
            int r6 = X.MSZ.A08(r0)
            java.lang.Boolean[] r5 = r10.A08
            r0 = r5[r14]
            boolean r0 = r0.booleanValue()
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L70
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            java.util.Iterator r9 = r11.iterator()
        L1a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r7 = r9.next()
            int r3 = X.AbstractC166987dD.A0H(r7)
            int r1 = X.MSW.A07(r12, r14)
            java.lang.Integer[] r0 = r10.A09
            int r0 = X.MSW.A07(r0, r14)
            if (r1 <= r0) goto L3a
            if (r3 <= r0) goto L1a
        L36:
            r8.add(r7)
            goto L1a
        L3a:
            if (r1 >= r0) goto L1a
            if (r3 >= r0) goto L1a
            goto L36
        L3f:
            java.util.ArrayList r7 = X.AbstractC167017dG.A0q(r8)
            java.util.Iterator r3 = r8.iterator()
        L47:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L60
            int r1 = X.AbstractC167007dF.A0B(r3)
            java.lang.Integer[] r0 = r10.A09
            int r0 = X.MSW.A07(r0, r14)
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            X.AbstractC166997dE.A1W(r7, r0)
            goto L47
        L60:
            java.lang.Comparable r0 = X.AbstractC001800i.A06(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L9e
            int r0 = r0.intValue()
        L6c:
            int r6 = java.lang.Math.min(r6, r0)
        L70:
            r0 = r5[r14]
            boolean r0 = r0.booleanValue()
            r7 = 0
            if (r0 == 0) goto La1
            int r1 = X.MSW.A07(r12, r14)
            java.lang.Integer[] r0 = r10.A09
            r3 = r0[r14]
            int r0 = r3.intValue()
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 >= r6) goto La1
            int r0 = X.MSW.A07(r12, r4)
            int r1 = X.MSW.A07(r12, r2)
            int r1 = r1 - r0
            r0 = 100
            if (r1 <= r0) goto La1
            java.lang.Integer[] r0 = r10.A02
            r0[r14] = r3
            return r7
        L9e:
            int r0 = r6 + (-1)
            goto L6c
        La1:
            java.util.Iterator r5 = r11.iterator()
        La5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ld8
            int r4 = X.AbstractC167007dF.A0B(r5)
            int r3 = X.MSW.A07(r12, r14)
            int r0 = r3 - r4
            int r0 = java.lang.Math.abs(r0)
            if (r2 > r0) goto La5
            if (r0 >= r6) goto La5
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc4
            if (r4 > r3) goto Lca
        Lc4:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto La5
            if (r4 >= r3) goto La5
        Lca:
            java.lang.Integer[] r0 = r10.A02
            X.AbstractC25235BEs.A1R(r0, r4, r14)
            java.lang.Integer[] r0 = r10.A09
            int r0 = X.MSW.A07(r0, r14)
            if (r0 != r4) goto Ld8
            return r7
        Ld8:
            java.lang.Integer[] r0 = r10.A02
            int r1 = X.MSW.A07(r0, r14)
            int r0 = X.MSW.A07(r12, r14)
            if (r1 != r0) goto Le5
            r2 = 0
        Le5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55098Ob9.A00(java.util.List, java.lang.Integer[], float, int):java.lang.Boolean");
    }

    private final void A01() {
        List list;
        Integer num;
        Boolean[] boolArr = this.A08;
        if (boolArr[0].booleanValue() || boolArr[1].booleanValue()) {
            this.A05.invoke();
        }
        C50868Mdz c50868Mdz = this.A04;
        boolean booleanValue = boolArr[0].booleanValue();
        if (booleanValue && boolArr[1].booleanValue()) {
            Integer[] numArr = this.A02;
            list = AbstractC16960so.A1Q(numArr[0], numArr[1]);
        } else {
            if (boolArr[1].booleanValue()) {
                num = this.A02[1];
            } else if (booleanValue) {
                num = this.A02[0];
            } else {
                list = C16930sl.A00;
            }
            list = AbstractC166987dD.A1J(num);
        }
        c50868Mdz.A0V(list);
    }

    public final void A02() {
        Integer[] numArr = this.A09;
        Integer A0o = AbstractC25227BEk.A0o();
        numArr[0] = A0o;
        numArr[1] = A0o;
        Boolean[] boolArr = this.A08;
        boolArr[0] = false;
        boolArr[1] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(java.lang.Integer r10, X.InterfaceC16820sZ r11, X.InterfaceC16820sZ r12, float r13, int r14, int r15, boolean r16) {
        /*
            r9 = this;
            X.0sZ r0 = r9.A07
            int r2 = X.MSZ.A08(r0)
            X.Mdz r0 = r9.A04
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r0.A0E
            int r6 = X.MSW.A04(r0)
            X.0sZ r0 = r9.A06
            int r1 = X.MSZ.A08(r0)
            r0 = 2
            r3 = 1
            r4 = 0
            if (r16 == 0) goto L43
            int r1 = r1 / r0
            int r6 = r6 - r1
            if (r2 <= r6) goto L43
            java.util.List r1 = r9.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r0 = X.AbstractC001800i.A0T(r0, r1)
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r5 = r0.iterator()
        L2f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r5.next()
            int r0 = X.AbstractC166987dD.A0H(r1)
            if (r0 >= r6) goto L2f
            r2.add(r1)
            goto L2f
        L43:
            java.util.List r1 = r9.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r2 = X.AbstractC001800i.A0T(r0, r1)
        L4d:
            java.lang.Integer[] r6 = r9.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r6[r4] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r6[r3] = r0
            java.lang.Integer[] r5 = new java.lang.Integer[]{r1, r0}
            java.lang.Integer r0 = X.C05F.A00
            if (r10 != r0) goto L85
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            java.util.Iterator r7 = r2.iterator()
        L6b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lea
            java.lang.Object r2 = r7.next()
            int r0 = X.AbstractC166987dD.A0H(r2)
            int r1 = r0 + 100
            int r0 = X.MSW.A07(r5, r3)
            if (r1 > r0) goto L6b
            r8.add(r2)
            goto L6b
        L85:
            java.lang.Integer r0 = X.C05F.A01
            if (r10 != r0) goto Lb1
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            java.util.Iterator r7 = r2.iterator()
        L91:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r2 = r7.next()
            int r1 = X.AbstractC166987dD.A0H(r2)
            r0 = 100
            int r1 = r1 - r0
            int r0 = X.MSW.A07(r5, r4)
            if (r1 < r0) goto L91
            r8.add(r2)
            goto L91
        Lac:
            java.lang.Boolean r0 = r9.A00(r8, r5, r13, r3)
            goto Lee
        Lb1:
            boolean r0 = X.AbstractC25231BEo.A1b(r12)
            if (r0 == 0) goto Lf3
            java.lang.Integer[] r1 = r9.A09
            r0 = r6[r4]
            r1[r4] = r0
            r0 = r6[r3]
            r1[r3] = r0
            java.lang.Boolean[] r2 = r9.A08
            int r1 = X.MSW.A07(r6, r4)
            int r0 = X.MSW.A07(r5, r4)
            boolean r0 = X.MSY.A1S(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2[r4] = r0
            int r1 = X.MSW.A07(r6, r3)
            int r0 = X.MSW.A07(r5, r3)
            if (r1 == r0) goto Le0
            r4 = 1
        Le0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2[r3] = r0
            r9.A01()
            return
        Lea:
            java.lang.Boolean r0 = r9.A00(r8, r5, r13, r4)
        Lee:
            if (r0 != 0) goto Lb1
            r11.invoke()
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55098Ob9.A03(java.lang.Integer, X.0sZ, X.0sZ, float, int, int, boolean):void");
    }

    public final void A04(List list, List list2) {
        this.A01.clear();
        this.A01.addAll(list);
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                List list3 = this.A01;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        if (AbstractC167007dF.A0B(it2) == A0B && (i = i + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                    if (i == 1) {
                        this.A01.remove(Integer.valueOf(A0B));
                    }
                }
            }
        }
        this.A01 = AbstractC001800i.A0U(AbstractC001800i.A0W(this.A01));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.InterfaceC16820sZ r14, X.InterfaceC16820sZ r15, float r16, int r17, int r18) {
        /*
            r13 = this;
            java.util.List r1 = r13.A01
            X.0sZ r0 = r13.A07
            java.lang.Object r0 = r0.invoke()
            java.util.ArrayList r12 = X.AbstractC001800i.A0T(r0, r1)
            java.lang.Integer[] r4 = r13.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r3 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r4[r3] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r2 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r4[r2] = r0
            r5 = 2
            java.lang.Integer[] r10 = new java.lang.Integer[]{r1, r0}
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            java.util.Iterator r11 = r12.iterator()
        L31:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r7 = r11.next()
            int r0 = X.AbstractC166987dD.A0H(r7)
            int r1 = r0 + 100
            int r0 = X.MSW.A07(r10, r2)
            if (r1 > r0) goto L31
            r8.add(r7)
            goto L31
        L4b:
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()
            java.util.Iterator r12 = r12.iterator()
        L53:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r11 = r12.next()
            int r1 = X.AbstractC166987dD.A0H(r11)
            r0 = 100
            int r1 = r1 - r0
            int r0 = X.MSW.A07(r10, r3)
            if (r1 < r0) goto L53
            r7.add(r11)
            goto L53
        L6e:
            r1 = r16
            java.lang.Boolean r0 = r13.A00(r8, r10, r1, r3)
            java.lang.Boolean r1 = r13.A00(r7, r10, r1, r2)
            if (r0 == 0) goto Le0
            if (r1 == 0) goto Le0
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lbb
            int r0 = X.MSW.A07(r4, r3)
            int r0 = r0 + r18
            int r0 = r0 - r17
            X.AbstractC25235BEs.A1R(r4, r0, r2)
            java.lang.Boolean[] r5 = new java.lang.Boolean[r5]
            r5[r3] = r6
            r0 = r4[r2]
            boolean r0 = r7.contains(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L9b:
            r5[r2] = r6
        L9d:
            boolean r0 = X.AbstractC25231BEo.A1b(r15)
            if (r0 == 0) goto Lba
            java.lang.Integer[] r1 = r13.A09
            r0 = r4[r3]
            r1[r3] = r0
            r0 = r4[r2]
            r1[r2] = r0
            java.lang.Boolean[] r1 = r13.A08
            r0 = r5[r3]
            r1[r3] = r0
            r0 = r5[r2]
            r1[r2] = r0
            r13.A01()
        Lba:
            return
        Lbb:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto Ldb
            int r0 = X.MSW.A07(r4, r2)
            int r0 = r0 - r18
            int r0 = r0 + r17
            X.AbstractC25235BEs.A1R(r4, r0, r3)
            java.lang.Boolean[] r5 = new java.lang.Boolean[r5]
            r0 = r4[r3]
            boolean r0 = r8.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5[r3] = r0
            goto L9b
        Ldb:
            java.lang.Boolean[] r5 = new java.lang.Boolean[]{r9, r9}
            goto L9d
        Le0:
            r14.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55098Ob9.A05(X.0sZ, X.0sZ, float, int, int):void");
    }

    public C55098Ob9(UserSession userSession, C50868Mdz c50868Mdz, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        this.A03 = userSession;
        this.A04 = c50868Mdz;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
    }
}
