package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes9.dex */
public final class Mb8 extends MediaCodec.Callback {
    public boolean A00;
    public boolean A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final CompletableFuture A03 = new CompletableFuture();
    public final /* synthetic */ int A04;
    public final /* synthetic */ MediaExtractor A05;
    public final /* synthetic */ C129805tk A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16610sE A08;

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        C14360o3.A0B(cryptoException, 1);
        this.A07.invoke(cryptoException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        C14360o3.A0B(codecException, 1);
        this.A07.invoke(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C14360o3.A0B(mediaCodec, 0);
        if (!this.A00 && !this.A01) {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i);
            if (inputBuffer == null) {
                this.A07.invoke(AbstractC166987dD.A14("onInputBufferAvailable but input buffer is null"));
                return;
            }
            MediaExtractor mediaExtractor = this.A05;
            int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
            mediaExtractor.advance();
            if (readSampleData < 0) {
                InterfaceC16660sJ interfaceC16660sJ = this.A07;
                try {
                    mediaCodec.queueInputBuffer(i, 0, 0, -1L, 4);
                } catch (MediaCodec.CryptoException e) {
                    interfaceC16660sJ.invoke(e);
                }
                this.A00 = true;
                return;
            }
            long sampleTime = mediaExtractor.getSampleTime();
            boolean A1P = AbstractC167007dF.A1P(mediaExtractor.getSampleFlags() & 1, 1);
            InterfaceC16660sJ interfaceC16660sJ2 = this.A07;
            try {
                mediaCodec.queueInputBuffer(i, 0, readSampleData, sampleTime, A1P ? 1 : 0);
                return;
            } catch (MediaCodec.CryptoException e2) {
                interfaceC16660sJ2.invoke(e2);
                return;
            }
        }
        C0K8.A0D("DecoderUtil", "onInputBufferAvailable called after end of stream");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if ((r10.flags & 4) == 4) goto L10;
     */
    @Override // android.media.MediaCodec.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOutputBufferAvailable(android.media.MediaCodec r8, int r9, android.media.MediaCodec.BufferInfo r10) {
        /*
            r7 = this;
            r4 = 0
            X.AbstractC167007dF.A1D(r8, r4, r10)
            java.nio.ByteBuffer r2 = r8.getOutputBuffer(r9)
            if (r2 != 0) goto L16
            X.0sJ r1 = r7.A07
            java.lang.String r0 = "onOutputBufferAvailable called but output buffer is null"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            r1.invoke(r0)
        L15:
            return
        L16:
            int r1 = r2.remaining()
            byte[] r0 = new byte[r1]
            r2.get(r0, r4, r1)
            java.util.List r5 = r7.A02
            java.util.List r0 = X.AbstractC009903n.A0E(r0)
            r5.addAll(r0)
            boolean r0 = r7.A01
            r3 = 1
            if (r0 != 0) goto L35
            int r0 = r10.flags
            r2 = 4
            r1 = r0 & 4
            r0 = 0
            if (r1 != r2) goto L36
        L35:
            r0 = 1
        L36:
            r7.A01 = r0
            r8.releaseOutputBuffer(r9, r4)
            boolean r0 = r7.A01
            if (r0 == 0) goto L15
            android.media.MediaFormat r1 = r8.getOutputFormat()
            X.C14360o3.A07(r1)
            java.lang.String r0 = "channel-count"
            int r0 = r1.getInteger(r0)
            byte r4 = (byte) r0
            java.lang.String r0 = "sample-rate"
            int r6 = r1.getInteger(r0)
            r0 = -2142492646(0xffffffff804c281a, float:-6.993883E-39)
            X.C0fT.A06(r8, r0)
            r0 = 1472386786(0x57c2d6e2, float:4.2845634E14)
            X.C0fT.A03(r8, r0)
            android.media.MediaExtractor r0 = r7.A05
            r0.release()
            java.util.concurrent.CompletableFuture r1 = r7.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.complete(r0)
            X.5tk r0 = r7.A06
            if (r0 == 0) goto L7d
            int r3 = r7.A04
            X.02i r2 = r0.A00
            java.lang.String r1 = "AUDIO_DECODE_END"
            r0 = 331815788(0x13c71b6c, float:5.0261703E-27)
            r2.markerPoint(r0, r3, r1)
        L7d:
            X.0sE r3 = r7.A08
            byte[] r2 = X.AbstractC001800i.A0v(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            r3.invoke(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Mb8.onOutputBufferAvailable(android.media.MediaCodec, int, android.media.MediaCodec$BufferInfo):void");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C14360o3.A0B(mediaFormat, 1);
    }

    public Mb8(MediaExtractor mediaExtractor, C129805tk c129805tk, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, int i) {
        this.A07 = interfaceC16660sJ;
        this.A05 = mediaExtractor;
        this.A06 = c129805tk;
        this.A04 = i;
        this.A08 = interfaceC16610sE;
    }
}
