package X;

import android.media.MediaCodec;
import android.media.MediaFormat;

/* loaded from: classes12.dex */
public final class XPZ extends MediaCodec.Callback {
    public final /* synthetic */ C72168XRc A00;

    public XPZ(C72168XRc c72168XRc) {
        this.A00 = c72168XRc;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.A00.A06.A01(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.A00.A01(mediaCodec, i);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.A00.A02(mediaCodec, i, bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.A00.A02 = mediaFormat;
    }
}
