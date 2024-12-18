package X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: X.TyR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66029TyR implements XD8 {
    public MediaCodec.BufferInfo A00;
    public boolean A01 = false;
    public final int A02;
    public final WeakReference A03;

    @Override // X.XD8
    public final void EQc(int i, int i2, long j, int i3) {
        MediaCodec.BufferInfo bufferInfo = this.A00;
        if (bufferInfo == null) {
            bufferInfo = new MediaCodec.BufferInfo();
            this.A00 = bufferInfo;
        }
        bufferInfo.set(0, i2, j, i3);
    }

    @Override // X.XD8
    public final MediaCodec.BufferInfo Aie() {
        return this.A00;
    }

    @Override // X.XD8
    public final ByteBuffer AjR() {
        return (ByteBuffer) this.A03.get();
    }

    public C66029TyR(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A03 = new WeakReference(byteBuffer);
        this.A02 = i;
        this.A00 = bufferInfo;
    }
}
