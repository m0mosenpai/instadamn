package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50512Tw extends AbstractC50522Tx {
    public final ByteBuffer A00 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    public abstract void A00(byte b);

    public void A01(byte[] b) {
        A02(b, 0, b.length);
    }

    public abstract void A02(byte[] b, int off, int len);
}
