package X;

/* renamed from: X.5sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC129275sp implements Runnable {
    public final int A00;
    public final C129235sl A01;
    public final C129165sd A02;
    public final boolean A03;
    public final /* synthetic */ GestureDetectorOnGestureListenerC72583Nf A04;

    public RunnableC129275sp(C129235sl c129235sl, C129165sd c129165sd, GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf, int i, boolean z) {
        this.A04 = gestureDetectorOnGestureListenerC72583Nf;
        this.A02 = c129165sd;
        this.A01 = c129235sl;
        this.A00 = i;
        this.A03 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r14.A00() != false) goto L6;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r19 = this;
            r10 = r19
            X.5sl r14 = r10.A01
            boolean r0 = r14.A01()
            r12 = 0
            if (r0 == 0) goto L12
            boolean r0 = r14.A00()
            r11 = 1
            if (r0 == 0) goto L13
        L12:
            r11 = 0
        L13:
            X.3Nf r8 = r10.A04
            java.util.Map r6 = r8.A0D
            X.5sd r13 = r10.A02
            java.lang.String r5 = r13.A0D
            java.lang.Object r15 = r6.get(r5)
            java.util.List r15 = (java.util.List) r15
            int r7 = r10.A00
            long r2 = (long) r7
            X.A9e r0 = r8.A08
            X.Y0D r4 = r0.A00
            long r0 = r4.A01
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r2 = 0
            if (r9 >= 0) goto L30
            r2 = 1
        L30:
            boolean r1 = r10.A03
            if (r1 == 0) goto L3f
            if (r2 != 0) goto L3f
            if (r15 == 0) goto L3f
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L3f
            r12 = 1
        L3f:
            if (r11 != 0) goto L57
            if (r12 != 0) goto L57
            if (r2 == 0) goto L71
            android.os.Handler r2 = r8.A06
            int r9 = r7 + 1
            X.5sp r5 = new X.5sp
            r6 = r14
            r7 = r13
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            long r0 = r4.A00
            r2.postDelayed(r5, r0)
            return
        L57:
            X.7ld r0 = r8.A0B
            X.7lg r12 = r0.A03
            long r2 = r4.A00
            int r0 = r7 + 1
            long r0 = (long) r0
            long r2 = r2 * r0
            double r0 = (double) r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            boolean r2 = r4.A04
            r18 = r2
            r16 = r0
            r12.A01(r13, r14, r15, r16, r18)
        L71:
            r6.remove(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC129275sp.run():void");
    }
}
