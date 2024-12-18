package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WZ0 implements XD8 {
    public MediaCodec.BufferInfo A00;
    public ByteBuffer A01;

    @Override // X.XD8
    public final MediaCodec.BufferInfo Aie() {
        return this.A00;
    }

    @Override // X.XD8
    public final ByteBuffer AjR() {
        return this.A01;
    }

    @Override // X.XD8
    public final void EQc(int i, int i2, long j, int i3) {
        throw C00O.createAndThrow();
    }
}
