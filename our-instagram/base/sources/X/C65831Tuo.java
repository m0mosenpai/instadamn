package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.Tuo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65831Tuo {
    public MediaFormat A00;
    public String A01;
    public ByteBuffer[] A02;
    public ByteBuffer[] A03;
    public final long A04;
    public final MediaCodec A05;
    public final Surface A06;
    public final Integer A07;
    public final StringBuilder A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final C66029TyR A00(long j) {
        ByteBuffer byteBuffer;
        boolean z = false;
        if (this.A06 == null) {
            z = true;
        }
        AbstractC1126356r.A07(z, null);
        MediaCodec mediaCodec = this.A05;
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
        if (dequeueInputBuffer < 0) {
            return null;
        }
        if (this.A09) {
            byteBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
        } else {
            byteBuffer = this.A02[dequeueInputBuffer];
        }
        return new C66029TyR(dequeueInputBuffer, byteBuffer, null);
    }

    public final C66029TyR A01(long j) {
        String str;
        C66029TyR c66029TyR;
        ByteBuffer byteBuffer;
        AbstractC1808580n.A03("MediaCodecWrapper.dequeueNextOutputBuffer()");
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            AbstractC1808580n.A03("MediaCodecWrapper.dequeueOutputBuffer()");
            try {
                MediaCodec mediaCodec = this.A05;
                int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                AbstractC1808580n.A01();
                if (dequeueOutputBuffer >= 0) {
                    if (this.A09) {
                        byteBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                    } else {
                        byteBuffer = this.A03[dequeueOutputBuffer];
                    }
                    c66029TyR = new C66029TyR(dequeueOutputBuffer, byteBuffer, bufferInfo);
                } else {
                    if (dequeueOutputBuffer != -3) {
                        if (dequeueOutputBuffer == -2) {
                            MediaFormat outputFormat = mediaCodec.getOutputFormat();
                            this.A00 = outputFormat;
                            this.A01 = AnonymousClass001.A0R(this.A01, String.format(Locale.US, "New output format: %s", outputFormat));
                            c66029TyR = new C66029TyR(-1, null, null);
                            c66029TyR.A01 = true;
                        }
                    } else {
                        AbstractC1808580n.A03("MediaCodecWrapper.buffersChanged()");
                        this.A03 = mediaCodec.getOutputBuffers();
                        AbstractC1808580n.A01();
                    }
                    return null;
                }
                return c66029TyR;
            } catch (Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    str = AbstractC1126356r.A03(th);
                } else {
                    str = "null";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Codec info: ");
                sb.append(this.A01);
                sb.append(" methodInvocationList: ");
                sb.append((Object) this.A08);
                sb.append(" mediaCodecException: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString(), th);
            }
        } finally {
            AbstractC1808580n.A01();
        }
    }

    public final void A02() {
        StringBuilder sb = this.A08;
        sb.append("startB,");
        MediaCodec mediaCodec = this.A05;
        C0fT.A05(mediaCodec, 1807375446);
        if (this.A06 == null) {
            this.A02 = mediaCodec.getInputBuffers();
        }
        this.A03 = mediaCodec.getOutputBuffers();
        sb.append("startE,");
    }

    public final void A03(C66029TyR c66029TyR) {
        MediaCodec mediaCodec = this.A05;
        int i = c66029TyR.A02;
        MediaCodec.BufferInfo bufferInfo = c66029TyR.A00;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public final void A04(C66029TyR c66029TyR, boolean z) {
        AbstractC1808580n.A03("MediaCodecWrapper.releaseOutputBuffer");
        int i = c66029TyR.A02;
        if (i >= 0) {
            this.A05.releaseOutputBuffer(i, z);
        }
        AbstractC1808580n.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r5 == X.C05F.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65831Tuo(android.media.MediaCodec r3, android.view.Surface r4, java.lang.Integer r5, java.lang.String r6, long r7, boolean r9, boolean r10, boolean r11) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto La
            java.lang.Integer r0 = X.C05F.A01
            r1 = 0
            if (r5 != r0) goto Lb
        La:
            r1 = 1
        Lb:
            r0 = 0
            X.AbstractC1126356r.A07(r1, r0)
            r2.A07 = r5
            r2.A05 = r3
            r2.A06 = r4
            r2.A0A = r9
            r2.A01 = r6
            r2.A09 = r10
            r2.A0B = r11
            r2.A04 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2.A08 = r1
            java.lang.String r0 = "MediaCodecWrapper "
            r1.append(r0)
            int r0 = r2.hashCode()
            r1.append(r0)
            java.lang.String r0 = " ctor codec="
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65831Tuo.<init>(android.media.MediaCodec, android.view.Surface, java.lang.Integer, java.lang.String, long, boolean, boolean, boolean):void");
    }
}
