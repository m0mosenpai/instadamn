package X;

/* loaded from: classes9.dex */
public final class PM3 implements Runnable {
    public final /* synthetic */ C51164Mj7 A00;

    public PM3(C51164Mj7 c51164Mj7) {
        this.A00 = c51164Mj7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r1.A04.A09 != X.EnumC53185Nfh.A06) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            X.Mj7 r3 = r4.A00
            java.util.List r0 = r3.A01
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto L30
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        L10:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C52422NHs
            if (r0 == 0) goto L10
        L1f:
            boolean r0 = r1 instanceof X.C52422NHs
            if (r0 == 0) goto L30
            X.NHs r1 = (X.C52422NHs) r1
            if (r1 == 0) goto L30
            X.Mva r0 = r1.A04
            X.Nfh r2 = r0.A09
            X.Nfh r1 = X.EnumC53185Nfh.A06
            r0 = 2
            if (r2 == r1) goto L31
        L30:
            r0 = -1
        L31:
            r3.notifyItemChanged(r0)
            X.0do r0 = r3.A05
            android.os.Handler r2 = X.MSW.A09(r0)
            r0 = 150(0x96, double:7.4E-322)
            r2.postDelayed(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PM3.run():void");
    }
}
