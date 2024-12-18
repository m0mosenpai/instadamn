package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

/* renamed from: X.Ocj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55141Ocj {
    public AbstractC52072N1x A00;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;
    public final LinkedHashSet A02 = AbstractC31171DnF.A0l();
    public final java.util.Set A06 = AbstractC43592JPx.A16(7);
    public final InterfaceC57912PmI A01 = new C55794Oq4(this);

    private final void A00(int i, int i2) {
        Iterator A13 = AbstractC166997dE.A13(this.A02);
        while (A13.hasNext()) {
            AbstractC54520O6x abstractC54520O6x = (AbstractC54520O6x) AbstractC166997dE.A0l(A13);
            if (abstractC54520O6x.A00 == i2 && AbstractC50522MSa.A03(abstractC54520O6x.A01.intValue()) > i) {
                A13.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r1.contains(X.N1V.A00) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C55141Ocj r6, X.AbstractC54520O6x r7, X.AbstractC54520O6x r8) {
        /*
            java.lang.Integer r5 = r7.A01
            int r0 = r5.intValue()
            r2 = 0
            r4 = 3
            if (r0 == r2) goto L80
            r1 = 1
            if (r0 == r1) goto L45
            java.util.LinkedHashSet r2 = r6.A02
            boolean r0 = r2.contains(r7)
            if (r0 != 0) goto L2b
            X.0sZ r0 = r6.A07
            boolean r0 = X.AbstractC25231BEo.A1b(r0)
            if (r0 != 0) goto L2c
            java.util.Set r1 = r6.A06
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2c
        L2b:
            return
        L2c:
            boolean r0 = r7 instanceof X.N1W
            if (r0 == 0) goto L37
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L37
            return
        L37:
            X.0sJ r0 = r6.A08
            r0.invoke(r7)
            r2.add(r7)
            X.0sZ r0 = r6.A04
            r0.invoke()
            return
        L45:
            java.lang.Integer r0 = r8.A01
            int r0 = r0.intValue()
            if (r0 == r2) goto L75
            if (r0 == r1) goto L65
            int r0 = r5.intValue()
            int r1 = X.AbstractC50522MSa.A03(r0)
            int r0 = r7.A00
            r6.A00(r1, r0)
            r6.A02(r7, r8)
        L5f:
            java.util.LinkedHashSet r0 = r6.A02
            r0.add(r7)
            return
        L65:
            java.util.LinkedHashSet r1 = r6.A02
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L5f
            X.N1V r0 = X.N1V.A00
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5f
        L75:
            X.0sJ r0 = r6.A08
            r0.invoke(r7)
            X.0sZ r0 = r6.A04
            r0.invoke()
            goto L5f
        L80:
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L91
            X.0sJ r1 = r6.A08
            X.N1x r0 = r6.A00
            if (r0 == 0) goto L8d
            r7 = r0
        L8d:
            r1.invoke(r7)
            return
        L91:
            int r3 = r7.A00
            r0 = 5
            if (r3 != r0) goto Lbd
            java.util.Set r0 = r6.A06
            java.util.Iterator r2 = r0.iterator()
        L9c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb2
            int r1 = X.AbstractC167007dF.A0B(r2)
            int r0 = r5.intValue()
            int r0 = X.AbstractC50522MSa.A03(r0)
            r6.A00(r0, r1)
            goto L9c
        Lb2:
            int r0 = r5.intValue()
            int r0 = X.AbstractC50522MSa.A03(r0)
            r6.A00(r0, r4)
        Lbd:
            int r0 = r5.intValue()
            int r0 = X.AbstractC50522MSa.A03(r0)
            r6.A00(r0, r3)
            r6.A02(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55141Ocj.A01(X.Ocj, X.O6x, X.O6x):void");
    }

    private final void A02(AbstractC54520O6x abstractC54520O6x, AbstractC54520O6x abstractC54520O6x2) {
        LinkedHashSet linkedHashSet = this.A02;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (AbstractC50522MSa.A03(((AbstractC54520O6x) it.next()).A01.intValue()) > AbstractC50522MSa.A03(abstractC54520O6x.A01.intValue())) {
                    Object obj = null;
                    if (abstractC54520O6x2.A00 != abstractC54520O6x.A00) {
                        return;
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (it2.hasNext()) {
                            int A03 = AbstractC50522MSa.A03(((AbstractC54520O6x) next).A01.intValue());
                            do {
                                Object next2 = it2.next();
                                int A032 = AbstractC50522MSa.A03(((AbstractC54520O6x) next2).A01.intValue());
                                if (A03 < A032) {
                                    next = next2;
                                    A03 = A032;
                                }
                            } while (it2.hasNext());
                        }
                        int A033 = AbstractC50522MSa.A03(((AbstractC54520O6x) next).A01.intValue());
                        boolean z = false;
                        for (Object obj2 : linkedHashSet) {
                            if (AbstractC50522MSa.A03(((AbstractC54520O6x) obj2).A01.intValue()) == A033) {
                                obj = obj2;
                                z = true;
                            }
                        }
                        if (z) {
                            this.A08.invoke(obj);
                            this.A04.invoke();
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    throw new NoSuchElementException();
                }
            }
        }
        AbstractC54520O6x abstractC54520O6x3 = this.A00;
        if (abstractC54520O6x3 == null || abstractC54520O6x.A01 != C05F.A00) {
            abstractC54520O6x3 = abstractC54520O6x;
        }
        this.A08.invoke(abstractC54520O6x3);
        if (abstractC54520O6x.A00 == 5) {
            return;
        }
        this.A04.invoke();
    }

    public final void A03() {
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        AbstractC54520O6x abstractC54520O6x = (AbstractC54520O6x) interfaceC16820sZ.invoke();
        if (abstractC54520O6x != null && abstractC54520O6x.A00 == 3) {
            return;
        }
        AbstractC54520O6x abstractC54520O6x2 = (AbstractC54520O6x) interfaceC16820sZ.invoke();
        if (abstractC54520O6x2 != null && abstractC54520O6x2.A00 == 8) {
            return;
        }
        AbstractC54520O6x abstractC54520O6x3 = (AbstractC54520O6x) interfaceC16820sZ.invoke();
        if (abstractC54520O6x3 != null && abstractC54520O6x3.A00 == 9) {
            return;
        }
        AbstractC54520O6x abstractC54520O6x4 = (AbstractC54520O6x) interfaceC16820sZ.invoke();
        if (abstractC54520O6x4 != null && abstractC54520O6x4.A00 == 10) {
            return;
        }
        this.A02.clear();
    }

    public final void A05(AbstractC54520O6x abstractC54520O6x) {
        AbstractC54520O6x abstractC54520O6x2;
        int i = abstractC54520O6x.A00;
        if (i == 1 && (abstractC54520O6x instanceof AbstractC52072N1x)) {
            this.A00 = (AbstractC52072N1x) abstractC54520O6x;
        }
        if ((AbstractC25231BEo.A1b(this.A07) && this.A02.contains(N1X.A00) && i == 3 && abstractC54520O6x.A01 != C05F.A0C) || (abstractC54520O6x2 = (AbstractC54520O6x) this.A03.invoke()) == null) {
            return;
        }
        A01(this, abstractC54520O6x, abstractC54520O6x2);
    }

    public C55141Ocj(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A03 = interfaceC16820sZ;
        this.A08 = interfaceC16660sJ;
        this.A07 = interfaceC16820sZ2;
        this.A04 = interfaceC16820sZ3;
        this.A05 = interfaceC16660sJ2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.AbstractC53624NnV r3) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55141Ocj.A04(X.NnV):void");
    }
}
