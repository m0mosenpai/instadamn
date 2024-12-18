package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class VBE extends C70123W5d {
    public VBE(C22978ABc c22978ABc, ByteBuffer byteBuffer) {
        super(c22978ABc, byteBuffer);
        GLES20.glBindBuffer(34962, this.A03);
        GLES20.glBufferData(34962, byteBuffer.remaining(), byteBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
    }
}
