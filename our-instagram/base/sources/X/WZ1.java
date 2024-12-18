package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WZ1 implements XD8 {
    public final ByteBuffer A00 = ByteBuffer.allocateDirect(1048576);
    public final MediaCodec.BufferInfo A01 = new MediaCodec.BufferInfo();

    @Override // X.XD8
    public final void EQc(int i, int i2, long j, int i3) {
        this.A01.set(0, i2, j, i3);
    }

    @Override // X.XD8
    public final MediaCodec.BufferInfo Aie() {
        return this.A01;
    }

    @Override // X.XD8
    public final ByteBuffer AjR() {
        return this.A00;
    }
}
