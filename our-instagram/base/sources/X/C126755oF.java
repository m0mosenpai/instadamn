package X;

/* renamed from: X.5oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126755oF implements InterfaceC98244b3 {
    public byte[] A00;
    public final long A01 = C98264b5.A03.getAndIncrement();
    public final C4C7 A02;
    public final C98254b4 A03;

    @Override // X.InterfaceC98244b3
    public final void AGY() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    @Override // X.InterfaceC98244b3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ChG() {
        /*
            r4 = this;
            X.4b4 r3 = r4.A03
            r0 = 0
            r3.A00 = r0
            X.4C7 r0 = r4.A02     // Catch: java.lang.Throwable -> L30
            r3.open(r0)     // Catch: java.lang.Throwable -> L30
        Lb:
            long r0 = r3.A00     // Catch: java.lang.Throwable -> L30
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L30
            byte[] r1 = r4.A00     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L22
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L30
        L16:
            r4.A00 = r1     // Catch: java.lang.Throwable -> L30
        L18:
            int r0 = r1.length     // Catch: java.lang.Throwable -> L30
            int r0 = r0 - r2
            int r1 = r3.read(r1, r2, r0)     // Catch: java.lang.Throwable -> L30
            r0 = -1
            if (r1 != r0) goto Lb
            goto L2c
        L22:
            int r0 = r1.length     // Catch: java.lang.Throwable -> L30
            if (r2 != r0) goto L18
            int r0 = r0 * 2
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> L30
            goto L16
        L2c:
            r3.close()     // Catch: java.io.IOException -> L2f
        L2f:
            return
        L30:
            r0 = move-exception
            r3.close()     // Catch: java.io.IOException -> L34
        L34:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126755oF.ChG():void");
    }

    public C126755oF(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7) {
        this.A02 = c4c7;
        this.A03 = new C98254b4(interfaceC92354Bq);
    }
}
