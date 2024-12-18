package X;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract class SLQ {
    public int A00;
    public ByteBuffer A01;
    public static final ThreadLocal A04 = new TYC();
    public static final ThreadLocal A02 = new TYD();
    public static final ThreadLocal A03 = new ThreadLocal();

    public final int A00(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }
}
