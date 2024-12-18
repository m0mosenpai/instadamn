package X;

import java.nio.ByteBuffer;

/* renamed from: X.0a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07300a4 {
    public static final int[] A03 = {0, 4};
    public static final boolean[] A04 = {true, false};
    public int A00;
    public byte[] A01;
    public byte[] A02;

    public final int A00(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.get()];
        this.A01 = bArr;
        byteBuffer.get(bArr);
        int length = this.A01.length + 1;
        int i = byteBuffer.get();
        this.A00 = 0;
        int i2 = 1;
        if (i < 0) {
            int abs = Math.abs(i);
            this.A00 = abs;
            i = A03[abs];
            if (i <= 0) {
                i = byteBuffer.get();
                i2 = 2;
            }
        }
        byte[] bArr2 = new byte[i];
        this.A02 = bArr2;
        byteBuffer.get(bArr2);
        return length + i2 + i;
    }
}
