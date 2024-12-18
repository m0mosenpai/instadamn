package X;

import java.lang.reflect.Array;

/* renamed from: X.XoL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72829XoL {
    public final int A00;
    public final int A01;
    public final byte[][] A02;

    public final String toString() {
        String str;
        int i = this.A01;
        int i2 = this.A00;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.A02[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b != 0) {
                    if (b != 1) {
                        str = "  ";
                    } else {
                        str = " 1";
                    }
                } else {
                    str = " 0";
                }
                sb.append(str);
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public C72829XoL(int i, int i2) {
        this.A02 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.A01 = i;
        this.A00 = i2;
    }
}
