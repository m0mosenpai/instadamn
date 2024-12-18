package X;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class OG0 {
    public final OTP A00(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int limit = byteBuffer2.limit();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(limit);
        byteBuffer2.mark();
        while (true) {
            int position = byteBuffer2.position();
            if (position < limit) {
                if (limit - position > 3 && byteBuffer2.get(position) == 0 && byteBuffer2.get(position + 1) == 0 && byteBuffer2.get(position + 2) == 3) {
                    allocateDirect.put(byteBuffer2.get());
                    allocateDirect.put(byteBuffer2.get());
                    byteBuffer2.get();
                } else {
                    allocateDirect.put(byteBuffer2.get());
                }
            } else {
                byteBuffer2.reset();
                allocateDirect.flip();
                return new OTP(byteBuffer, allocateDirect);
            }
        }
    }
}
