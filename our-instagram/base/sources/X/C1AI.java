package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1AI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1AI {
    public int A00;
    public ByteBuffer A01;

    public static String A00(ByteBuffer byteBuffer, int i) {
        int i2 = i + byteBuffer.getInt(i);
        if (byteBuffer.hasArray()) {
            return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i2 + 4, byteBuffer.getInt(i2), C1AP.A0A);
        }
        ByteBuffer order = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i3 = order.getInt(i2);
        byte[] bArr = new byte[i3];
        order.position(i2 + 4);
        order.get(bArr);
        return new String(bArr, 0, i3, C1AP.A0A);
    }

    public final int A02(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }

    public final int A03(int i) {
        int i2 = i + this.A00;
        return i2 + this.A01.getInt(i2) + 4;
    }

    public final int A04(int i) {
        int i2 = i + this.A00;
        return this.A01.getInt(i2 + this.A01.getInt(i2));
    }

    public final String A05(int i) {
        int i2 = i + this.A01.getInt(i);
        if (this.A01.hasArray()) {
            return new String(this.A01.array(), this.A01.arrayOffset() + i2 + 4, this.A01.getInt(i2), C1AP.A0A);
        }
        ByteBuffer order = this.A01.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i3 = order.getInt(i2);
        byte[] bArr = new byte[i3];
        order.position(i2 + 4);
        order.get(bArr);
        return new String(bArr, 0, i3, C1AP.A0A);
    }
}
