package X;

import com.meta.compose.material.bottomsheet.AnchoredDraggableState;

/* renamed from: X.BZs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25753BZs extends C58J implements C5DW {
    public C6M3 A00;
    public AnchoredDraggableState A01;
    public InterfaceC16620sF A02;
    public boolean A03;

    @Override // X.C58J
    public final void A0E() {
        this.A03 = false;
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A00(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A01(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A02(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    @Override // X.C5DW
    public final /* synthetic */ int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC25274BGo.A03(interfaceC1131659e, interfaceC1131259a, this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0066, code lost:
    
        if (r10.A03 != false) goto L17;
     */
    @Override // X.C5DW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC119205ac CpE(X.InterfaceC1131559d r11, X.C59Z r12, long r13) {
        /*
            r10 = this;
            X.AbstractC167017dG.A1N(r12, r11)
            X.59W r4 = r11.CpF(r13)
            boolean r0 = r12.CXp()
            if (r0 == 0) goto L11
            boolean r0 = r10.A03
            if (r0 != 0) goto L5d
        L11:
            int r1 = r4.A01
            int r0 = r4.A00
            long r0 = X.AbstractC119215ad.A00(r1, r0)
            X.0sF r3 = r10.A02
            X.5aN r2 = new X.5aN
            r2.<init>(r0)
            androidx.compose.ui.unit.Constraints r0 = new androidx.compose.ui.unit.Constraints
            r0.<init>(r13)
            java.lang.Object r0 = r3.invoke(r2, r0)
            X.0e4 r0 = (X.C09530e4) r0
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r9 = r10.A01
            java.lang.Object r2 = r0.A00
            java.lang.Object r8 = r0.A01
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.3Yl r1 = r9.A04
            boolean r0 = X.AbstractC25229BEm.A1U(r1, r2)
            if (r0 != 0) goto L5d
            r1.Egh(r2)
            X.O9R r1 = r9.A0A
            r0 = 37
            X.DGj r7 = new X.DGj
            r7.<init>(r0, r8, r9)
            X.139 r6 = r1.A01
            r5 = 0
        L4c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = X.C13A.A02
            int r2 = r3.get(r6)
            int r1 = r6.A00
            if (r2 > r1) goto L8f
            if (r2 > 0) goto L7b
            X.3Yl r0 = r9.A06
            r0.Egh(r8)
        L5d:
            boolean r0 = r12.CXp()
            if (r0 != 0) goto L68
            boolean r1 = r10.A03
            r0 = 0
            if (r1 == 0) goto L69
        L68:
            r0 = 1
        L69:
            r10.A03 = r0
            int r3 = r4.A01
            int r2 = r4.A00
            r1 = 39
            X.DRp r0 = new X.DRp
            r0.<init>(r1, r12, r4, r10)
            X.5ac r0 = X.AbstractC25229BEm.A0Z(r12, r0, r3, r2)
            return r0
        L7b:
            int r0 = r2 + (-1)
            boolean r0 = r3.compareAndSet(r6, r2, r0)
            if (r0 == 0) goto L4c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass139.A01
            r0.set(r6, r5)
            r7.invoke()     // Catch: java.lang.Throwable -> L9c
            r6.A04(r5)
            goto L5d
        L8f:
            int r0 = r3.get(r6)
            if (r0 <= r1) goto L4c
            boolean r0 = r3.compareAndSet(r6, r0, r1)
            if (r0 == 0) goto L8f
            goto L4c
        L9c:
            r0 = move-exception
            r6.A04(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25753BZs.CpE(X.59d, X.59Z, long):X.5ac");
    }
}
