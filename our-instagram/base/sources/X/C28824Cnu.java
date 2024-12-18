package X;

import java.util.List;

/* renamed from: X.Cnu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28824Cnu implements InterfaceC1127857k {
    public boolean A00;
    public final C28706Cly A01;

    public C28824Cnu(C28706Cly c28706Cly) {
        this.A01 = c28706Cly;
    }

    @Override // X.InterfaceC1127857k
    public final int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cnj(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cnj(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }

    @Override // X.InterfaceC1127857k
    public final int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cnm(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cnm(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r10.A00 == false) goto L36;
     */
    @Override // X.InterfaceC1127857k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC119205ac CpD(X.C59Z r11, java.util.List r12, long r13) {
        /*
            r10 = this;
            java.util.ArrayList r6 = X.AbstractC25230BEn.A0q(r12)
            int r2 = r12.size()
            r5 = 0
            r1 = 0
        La:
            if (r1 >= r2) goto L1c
            java.lang.Object r0 = r12.get(r1)
            X.59d r0 = (X.InterfaceC1131559d) r0
            X.59W r0 = r0.CpF(r13)
            r6.add(r0)
            int r1 = r1 + 1
            goto La
        L1c:
            boolean r0 = r6.isEmpty()
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L55
            r9 = r7
        L25:
            X.59W r9 = (X.C59W) r9
            if (r9 == 0) goto L53
            int r9 = r9.A01
        L2b:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L77
            java.lang.Object r7 = r6.get(r5)
            r0 = r7
            X.59W r0 = (X.C59W) r0
            int r4 = r0.A00
            int r3 = X.AbstractC25229BEm.A09(r6)
            if (r8 > r3) goto L77
            r2 = 1
        L41:
            java.lang.Object r1 = r6.get(r2)
            r0 = r1
            X.59W r0 = (X.C59W) r0
            int r0 = r0.A00
            if (r4 >= r0) goto L4e
            r7 = r1
            r4 = r0
        L4e:
            if (r2 == r3) goto L77
            int r2 = r2 + 1
            goto L41
        L53:
            r9 = 0
            goto L2b
        L55:
            java.lang.Object r9 = r6.get(r5)
            r0 = r9
            X.59W r0 = (X.C59W) r0
            int r4 = r0.A01
            int r3 = X.AbstractC25229BEm.A09(r6)
            if (r8 > r3) goto L25
            r2 = 1
        L65:
            java.lang.Object r1 = r6.get(r2)
            r0 = r1
            X.59W r0 = (X.C59W) r0
            int r0 = r0.A01
            if (r4 >= r0) goto L72
            r9 = r1
            r4 = r0
        L72:
            if (r2 == r3) goto L25
            int r2 = r2 + 1
            goto L65
        L77:
            X.59W r7 = (X.C59W) r7
            if (r7 == 0) goto L7d
            int r5 = r7.A00
        L7d:
            boolean r0 = r11.CXp()
            if (r0 == 0) goto L9f
            r10.A00 = r8
        L85:
            X.Cly r0 = r10.A01
            X.3Yl r3 = r0.A01
            long r0 = X.AbstractC119215ad.A00(r9, r5)
            X.5aN r2 = new X.5aN
            r2.<init>(r0)
            r3.Egh(r2)
        L95:
            r0 = 2
            X.DRS r0 = X.DRS.A00(r6, r0)
            X.5ac r0 = X.AbstractC25229BEm.A0Z(r11, r0, r9, r5)
            return r0
        L9f:
            boolean r0 = r10.A00
            if (r0 != 0) goto L95
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28824Cnu.CpD(X.59Z, java.util.List, long):X.5ac");
    }

    @Override // X.InterfaceC1127857k
    public final int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cpe(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cpe(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }

    @Override // X.InterfaceC1127857k
    public final int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AbstractC25235BEs.A0K(list, 0).Cph(i));
        int A05 = AbstractC25226BEj.A05(list);
        int i2 = 1;
        if (1 <= A05) {
            while (true) {
                valueOf = AbstractC25235BEs.A0j(valueOf, AbstractC25235BEs.A0K(list, i2).Cph(i));
                if (i2 == A05) {
                    break;
                }
                i2++;
            }
        }
        return AbstractC25227BEk.A06(valueOf, 0);
    }
}
