package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.3Z0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z0 extends C3Z1 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3Z0(X.C75063Yw r5, int r6) {
        /*
            r4 = this;
            java.lang.Object r3 = X.AbstractC75013Yr.A07
            monitor-enter(r3)
            java.util.List r2 = X.AbstractC75013Yr.A03     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = X.AbstractC001800i.A0N(r2)     // Catch: java.lang.Throwable -> L1a
            X.0sJ r1 = (X.InterfaceC16660sJ) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L14
            r0 = 38
            X.9Dx r1 = new X.9Dx     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1a
        L14:
            monitor-exit(r3)
            r0 = 0
            r4.<init>(r5, r0, r1, r6)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Z0.<init>(X.3Yw, int):void");
    }

    @Override // X.C3Z1, androidx.compose.runtime.snapshots.Snapshot
    public final void A0H() {
        synchronized (AbstractC75013Yr.A07) {
            int i = ((Snapshot) this).A01;
            if (i >= 0) {
                AbstractC75013Yr.A0F(i);
                ((Snapshot) this).A01 = -1;
            }
        }
    }
}
