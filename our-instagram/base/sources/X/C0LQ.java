package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: X.0LQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LQ extends C0IG {
    public final Exception A00;
    public final MediaCrypto A01;
    public final MediaFormat A02;
    public final Surface A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LQ(MediaCodec mediaCodec, MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Exception exc, int i) {
        super(i, Integer.valueOf(mediaCodec.hashCode()));
        C14360o3.A0B(mediaCodec, 2);
        this.A02 = mediaFormat;
        this.A03 = surface;
        this.A01 = mediaCrypto;
        this.A00 = exc;
    }
}
