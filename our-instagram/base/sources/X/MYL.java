package X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class MYL {
    public MediaCodec.BufferInfo A00;
    public final int A01;
    public final WeakReference A02;

    public MYL(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A02 = new WeakReference(byteBuffer);
        this.A01 = i;
        this.A00 = bufferInfo;
    }
}
