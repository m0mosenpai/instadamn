package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: X.U8x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66324U8x extends MediaCodec.Callback {
    public final /* synthetic */ MediaExtractor A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ C69663Vt4 A02;
    public final /* synthetic */ C69428VnD A03;
    public final /* synthetic */ Semaphore A04;

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        C14360o3.A0B(mediaCodec, 0);
        ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i);
        MediaExtractor mediaExtractor = this.A00;
        long sampleTime = mediaExtractor.getSampleTime();
        C14360o3.A0A(inputBuffer);
        int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
        boolean z = !mediaExtractor.advance();
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        if ((sampleTime >= 0 && readSampleData >= 0) || z) {
            mediaCodec.queueInputBuffer(i, 0, Math.max(0, readSampleData), Math.max(0L, sampleTime), i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        AbstractC167017dG.A1O(mediaCodec, bufferInfo);
        Handler handler = this.A01;
        Semaphore semaphore = this.A04;
        handler.post(new RunnableC71623WxV(bufferInfo, mediaCodec, this.A02, this.A03, semaphore, i));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    public C66324U8x(MediaExtractor mediaExtractor, Handler handler, C69663Vt4 c69663Vt4, C69428VnD c69428VnD, Semaphore semaphore) {
        this.A00 = mediaExtractor;
        this.A01 = handler;
        this.A04 = semaphore;
        this.A03 = c69428VnD;
        this.A02 = c69663Vt4;
    }
}
