package X;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.VMx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68337VMx {
    public static ByteBuffer A00(ByteBuffer byteBuffer, List list) {
        if (!VME.A00(AbstractC69833VwJ.A00(list), 1.0f)) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.clear();
            while (byteBuffer.hasRemaining()) {
                duplicate.putShort((short) (byteBuffer.getShort() * r2));
            }
            duplicate.flip();
            return duplicate;
        }
        return byteBuffer;
    }
}
