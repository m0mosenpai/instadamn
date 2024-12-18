package X;

import java.io.ByteArrayOutputStream;

/* loaded from: classes11.dex */
public final class VCI extends ByteArrayOutputStream {
    public final /* synthetic */ C71180WpR A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VCI(C71180WpR c71180WpR, int i) {
        super(i);
        this.A00 = c71180WpR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((java.io.ByteArrayOutputStream) r5).buf[r4] != 13) goto L6;
     */
    @Override // java.io.ByteArrayOutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r2 = r5.count
            if (r2 <= 0) goto Le
            byte[] r0 = r5.buf
            int r4 = r2 + (-1)
            r1 = r0[r4]
            r0 = 13
            if (r1 == r0) goto Lf
        Le:
            r4 = r2
        Lf:
            byte[] r3 = r5.buf     // Catch: java.io.UnsupportedEncodingException -> L20
            r2 = 0
            X.WpR r0 = r5.A00     // Catch: java.io.UnsupportedEncodingException -> L20
            java.nio.charset.Charset r0 = r0.A04     // Catch: java.io.UnsupportedEncodingException -> L20
            java.lang.String r1 = r0.name()     // Catch: java.io.UnsupportedEncodingException -> L20
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L20
            r0.<init>(r3, r2, r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L20
            return r0
        L20:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VCI.toString():java.lang.String");
    }
}
