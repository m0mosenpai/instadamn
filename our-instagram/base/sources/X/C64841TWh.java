package X;

/* renamed from: X.TWh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64841TWh implements InterfaceC65677Tr7 {
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public short A04;
    public final InterfaceC65701TsN A05;

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        return -1;
     */
    @Override // X.InterfaceC65677Tr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E7q(X.TWX r12, long r13) {
        /*
            r11 = this;
        L0:
            int r0 = r11.A01
            r9 = -1
            if (r0 != 0) goto L7d
            X.TsN r8 = r11.A05
            short r0 = r11.A04
            long r0 = (long) r0
            r8.Em6(r0)
            r6 = 0
            r11.A04 = r6
            byte r0 = r11.A00
            r0 = r0 & 4
            if (r0 != 0) goto L94
            int r5 = r11.A03
            int r0 = X.InterfaceC65701TsN.A00(r8)
            int r1 = r0 << 16
            int r0 = X.InterfaceC65701TsN.A00(r8)
            int r0 = r0 << 8
            r1 = r1 | r0
            int r0 = X.InterfaceC65701TsN.A00(r8)
            r0 = r0 | r1
            r11.A01 = r0
            r11.A02 = r0
            int r0 = X.InterfaceC65701TsN.A00(r8)
            byte r4 = (byte) r0
            int r0 = X.InterfaceC65701TsN.A00(r8)
            byte r0 = (byte) r0
            r11.A00 = r0
            java.util.logging.Logger r7 = X.THV.A03
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r7.isLoggable(r0)
            r3 = 1
            if (r0 == 0) goto L53
            int r2 = r11.A03
            int r1 = r11.A02
            byte r0 = r11.A00
            java.lang.String r0 = X.C63116SdK.A00(r4, r0, r2, r1, r3)
            r7.fine(r0)
        L53:
            int r1 = r8.readInt()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r0
            r11.A03 = r1
            r0 = 9
            if (r4 != r0) goto L72
            if (r1 == r5) goto L0
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r1 = "TYPE_CONTINUATION streamId changed"
        L67:
            java.lang.String[] r0 = X.C63116SdK.A01
            java.lang.String r0 = X.AbstractC58321PtD.A0x(r1, r2)
            java.io.IOException r0 = X.MSW.A0y(r0)
            throw r0
        L72:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%s != TYPE_CONTINUATION"
            goto L67
        L7d:
            X.TsN r2 = r11.A05
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r13, r0)
            long r3 = r2.E7q(r12, r0)
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 == 0) goto L94
            int r0 = r11.A01
            long r1 = (long) r0
            long r1 = r1 - r3
            int r0 = (int) r1
            r11.A01 = r0
            return r3
        L94:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64841TWh.E7q(X.TWX, long):long");
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A05.Eq9();
    }

    public C64841TWh(InterfaceC65701TsN interfaceC65701TsN) {
        this.A05 = interfaceC65701TsN;
    }
}
