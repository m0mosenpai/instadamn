package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.3Z3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z3 extends C3Z1 {
    public InterfaceC16660sJ A00;
    public InterfaceC16660sJ A01;
    public final long A02;
    public final boolean A03;
    public final C3Z1 A04;
    public final boolean A05;

    @Override // X.C3Z1, androidx.compose.runtime.snapshots.Snapshot
    public final void A0H() {
        C3Z1 c3z1;
        ((Snapshot) this).A02 = true;
        if (this.A05 && (c3z1 = this.A04) != null) {
            c3z1.A0H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3Z3(X.C3Z1 r6, X.InterfaceC16660sJ r7, X.InterfaceC16660sJ r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            X.3Yw r4 = X.C75063Yw.A04
            if (r6 == 0) goto Lf
            boolean r0 = r6 instanceof X.C3Z3
            if (r0 == 0) goto L67
            r0 = r6
            X.3Z3 r0 = (X.C3Z3) r0
            X.0sJ r0 = r0.A00
        Ld:
            if (r0 != 0) goto L1f
        Lf:
            java.util.concurrent.atomic.AtomicReference r0 = X.AbstractC75013Yr.A08
            java.lang.Object r1 = r0.get()
            X.3Z1 r1 = (X.C3Z1) r1
            boolean r0 = r1 instanceof X.C3Z3
            if (r0 == 0) goto L64
            X.3Z3 r1 = (X.C3Z3) r1
            X.0sJ r0 = r1.A00
        L1f:
            X.0sJ r3 = X.AbstractC75013Yr.A0C(r7, r0, r9)
            if (r6 == 0) goto L2b
            X.0sJ r2 = r6.A04()
            if (r2 != 0) goto L37
        L2b:
            java.util.concurrent.atomic.AtomicReference r0 = X.AbstractC75013Yr.A08
            java.lang.Object r0 = r0.get()
            androidx.compose.runtime.snapshots.Snapshot r0 = (androidx.compose.runtime.snapshots.Snapshot) r0
            X.0sJ r2 = r0.A04()
        L37:
            if (r8 == 0) goto L62
            if (r2 == 0) goto L45
            if (r8 == r2) goto L45
            r1 = 9
            X.9F3 r0 = new X.9F3
            r0.<init>(r8, r2, r1)
            r8 = r0
        L45:
            r0 = 0
            r5.<init>(r4, r3, r8, r0)
            r5.A04 = r6
            r5.A03 = r9
            r5.A05 = r10
            X.0sJ r0 = r5.A07
            r5.A00 = r0
            X.0sJ r0 = r5.A08
            r5.A01 = r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            r5.A02 = r0
            return
        L62:
            r8 = r2
            goto L45
        L64:
            X.0sJ r0 = r1.A07
            goto L1f
        L67:
            X.0sJ r0 = r6.A07
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Z3.<init>(X.3Z1, X.0sJ, X.0sJ, boolean, boolean):void");
    }

    public static final C3Z1 A00(C3Z3 c3z3) {
        C3Z1 c3z1 = c3z3.A04;
        if (c3z1 == null) {
            return (C3Z1) AbstractC75013Yr.A08.get();
        }
        return c3z1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final int A0F() {
        return A00(this).A0F();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final C75063Yw A0G() {
        return A00(this).A0G();
    }
}
