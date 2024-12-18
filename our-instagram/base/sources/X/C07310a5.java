package X;

import java.nio.ByteBuffer;

/* renamed from: X.0a5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07310a5 {
    public static final ByteBuffer A04 = ByteBuffer.allocate(4);
    public final int A00;
    public final C07290a3 A01;
    public final C07300a4 A02;
    public final ByteBuffer A03;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013c, code lost:
    
        if (r0 != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.C07310a5 r8, java.lang.String r9, byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07310a5.A00(X.0a5, java.lang.String, byte[], int, int):int");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0a4, java.lang.Object] */
    public C07310a5(ByteBuffer byteBuffer, int i) {
        C07290a3 c07290a3 = new C07290a3();
        this.A01 = c07290a3;
        this.A02 = new Object();
        this.A03 = byteBuffer;
        this.A00 = i;
        c07290a3.A01 = i;
        byteBuffer.putInt(c07290a3.A00);
        byteBuffer.putInt(c07290a3.A02);
        byteBuffer.putInt(c07290a3.A01);
    }
}
