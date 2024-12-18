package X;

/* loaded from: classes10.dex */
public final class RcJ extends AbstractRunnableC14200nk {
    public final /* synthetic */ TFG A00;
    public final /* synthetic */ SJW A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcJ(TFG tfg, SJW sjw) {
        super(1773997430, 3, false, false);
        this.A01 = sjw;
        this.A00 = tfg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.A01 != 200) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            X.SJW r7 = r8.A01
            java.util.concurrent.atomic.AtomicBoolean r6 = r7.A09
            boolean r0 = r6.get()
            if (r0 != 0) goto L32
            X.TFG r0 = r8.A00
            java.lang.Object r0 = r0.A00
            X.3JQ r0 = (X.C3JQ) r0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L1b
            int r2 = r0.A01
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 1
            if (r2 == r0) goto L1c
        L1b:
            r1 = 0
        L1c:
            java.lang.String r3 = "is_http_success"
            r2 = 936452326(0x37d120e6, float:2.4930061E-5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0A
            if (r1 == 0) goto L33
            r0.set(r5)
            X.02i r1 = r7.A03
            int r0 = r7.A00
            r1.markerAnnotate(r2, r0, r3, r5)
        L2f:
            r6.set(r5)
        L32:
            return
        L33:
            r0.set(r4)
            X.02i r1 = r7.A03
            int r0 = r7.A00
            r1.markerAnnotate(r2, r0, r3, r4)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RcJ.run():void");
    }
}
