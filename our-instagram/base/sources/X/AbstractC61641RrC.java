package X;

import com.google.common.collect.ImmutableList;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: X.RrC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class AbstractC61641RrC {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ByteBuffer A00(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        WDn.A03(AbstractC167007dF.A1N(byteBuffer.position()), "The input buffer should have position set to 0.");
        ImmutableList A00 = SQU.A00(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < A00.size(); i2++) {
            i += ((Buffer) A00.get(i2)).remaining() + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (int i3 = 0; i3 < A00.size(); i3++) {
            ByteBuffer byteBuffer2 = (ByteBuffer) A00.get(i3);
            allocate.putInt(byteBuffer2.remaining());
            allocate.put(byteBuffer2);
        }
        allocate.rewind();
        return allocate;
    }
}
