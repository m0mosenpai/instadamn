package X;

import java.nio.ByteBuffer;

/* renamed from: X.0aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07360aA {
    public static final C07350a9 A06 = new Object();
    public int A00;
    public int A01;
    public final int A02;
    public final C07410aF A03;
    public final ByteBuffer A04;
    public final ByteBuffer A05;

    public C07360aA(C07410aF c07410aF, ByteBuffer byteBuffer, int i) {
        C14360o3.A0B(byteBuffer, 1);
        this.A04 = byteBuffer;
        this.A03 = c07410aF;
        int i2 = c07410aF.A00;
        this.A02 = i2;
        this.A05 = ByteBuffer.allocate(4);
        this.A00 = -1;
        int i3 = i2 * c07410aF.A02;
        if (i >= i3 && byteBuffer.limit() >= i) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0O("Buffer is not suitable to store the current schema information. Should be at least ", i3));
        }
    }

    public static final void A00(C07360aA c07360aA, AbstractC07400aE abstractC07400aE, byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (i3 <= c07360aA.A00) {
            ByteBuffer byteBuffer = c07360aA.A04;
            if (byteBuffer.get(i3) == 1 && byteBuffer.getInt(i3 + 1) == i) {
                if (i3 >= 0 && (i2 = abstractC07400aE.A00) != -1) {
                    int i4 = i3 + i2;
                    byteBuffer.position(i4 + 1);
                    byteBuffer.put(bArr);
                    byteBuffer.put(i4, (byte) 1);
                    return;
                }
                return;
            }
            i3 += c07360aA.A02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r6.A00 > r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r6.A01 <= r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r6.A01 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        r5 = r5 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r5 < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r4.get(r5) != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        r6.A00 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(int r7) {
        /*
            r6 = this;
            r5 = 0
        L1:
            int r0 = r6.A00
            if (r5 > r0) goto L2d
            java.nio.ByteBuffer r4 = r6.A04
            byte r1 = r4.get(r5)
            r0 = 1
            if (r1 != r0) goto L3d
            int r0 = r5 + 1
            int r0 = r4.getInt(r0)
            if (r0 != r7) goto L3d
            r3 = r5
            if (r5 < 0) goto L2d
            r4.position(r5)
            int r2 = r6.A02
            byte[] r0 = new byte[r2]
            r4.put(r0)
            int r0 = r6.A00
            if (r0 <= r5) goto L2e
        L27:
            int r0 = r6.A01
            if (r0 <= r3) goto L2d
            r6.A01 = r3
        L2d:
            return
        L2e:
            int r5 = r5 - r2
            if (r5 < 0) goto L3b
            byte r1 = r4.get(r5)
            r0 = 1
            if (r1 != r0) goto L2e
        L38:
            r6.A00 = r5
            goto L27
        L3b:
            r5 = -1
            goto L38
        L3d:
            int r0 = r6.A02
            int r5 = r5 + r0
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07360aA.A01(int):void");
    }
}
