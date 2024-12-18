package X;

import java.nio.ByteBuffer;

/* renamed from: X.1AE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1AE {
    public static final byte[] A00 = {60, -15};

    public static String A00(ByteBuffer byteBuffer, int i) {
        Object[] objArr;
        String str;
        int i2;
        if (i < 8) {
            return "file size too small";
        }
        byte b = byteBuffer.get();
        byte[] bArr = A00;
        if (b == bArr[0] && byteBuffer.get() == bArr[1]) {
            byte b2 = byteBuffer.get();
            if (b2 > 0 && b2 <= 1) {
                byte b3 = byteBuffer.get();
                if (b3 > 0 && b3 < (i2 = i - 2)) {
                    int i3 = byteBuffer.getInt();
                    if (i3 != i) {
                        objArr = new Object[]{Integer.valueOf(i3), Integer.valueOf(i)};
                        str = "Bad fileSize:%d, actual fileSize:%d";
                    } else {
                        byteBuffer.position(i2);
                        byte b4 = byteBuffer.get();
                        byte b5 = byteBuffer.get();
                        if (b4 == bArr[0] && b5 == bArr[1]) {
                            byteBuffer.position(b3);
                            return "";
                        }
                        objArr = new Object[]{Byte.valueOf(b4), Byte.valueOf(b5)};
                        str = "Bad footer magicHex:%02X %02X";
                    }
                } else {
                    objArr = new Object[]{Byte.valueOf(b3)};
                    str = "Bad bodyOffset:%d";
                }
            } else {
                objArr = new Object[]{Byte.valueOf(b2), (byte) 1};
                str = "Bad file ver:%d, current:%d";
            }
            return String.format(str, objArr);
        }
        byteBuffer.position(0);
        return "";
    }
}
