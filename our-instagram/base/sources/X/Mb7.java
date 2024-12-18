package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class Mb7 extends MediaCodec.Callback {
    public final /* synthetic */ C55068OaO A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        C14360o3.A0B(codecException, 1);
        this.A02.set(codecException);
        this.A01.countDown();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        C14360o3.A0B(mediaFormat, 1);
        C55068OaO c55068OaO = this.A00;
        AtomicReference atomicReference = this.A02;
        CountDownLatch countDownLatch = this.A01;
        if (atomicReference.get() == null) {
            try {
                if (!c55068OaO.A08) {
                    mediaFormat.toString();
                    MediaMuxer mediaMuxer = c55068OaO.A05;
                    if (mediaMuxer != null) {
                        c55068OaO.A01 = mediaMuxer.addTrack(mediaFormat);
                        MediaMuxer mediaMuxer2 = c55068OaO.A05;
                        if (mediaMuxer2 != null) {
                            mediaMuxer2.start();
                        }
                        c55068OaO.A08 = true;
                        return;
                    }
                    throw AbstractC166987dD.A18("StaticImageVideoHelper::startMuxer::trackIndex is null");
                }
                throw AbstractC166987dD.A18("format changed twice");
            } catch (Exception e) {
                atomicReference.set(e);
                countDownLatch.countDown();
            }
        }
    }

    public Mb7(C55068OaO c55068OaO, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = countDownLatch;
        this.A00 = c55068OaO;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        AbstractC167017dG.A1O(mediaCodec, bufferInfo);
        CountDownLatch countDownLatch = this.A01;
        C55068OaO c55068OaO = this.A00;
        AtomicReference atomicReference = this.A02;
        if (atomicReference.get() == null) {
            try {
                if ((bufferInfo.flags & 4) != 0) {
                    countDownLatch.countDown();
                    return;
                }
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                if (outputBuffer != null) {
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (c55068OaO.A08) {
                            AbstractC50522MSa.A0v(bufferInfo, outputBuffer);
                            MediaMuxer mediaMuxer = c55068OaO.A05;
                            if (mediaMuxer != null) {
                                mediaMuxer.writeSampleData(c55068OaO.A01, outputBuffer, bufferInfo);
                            }
                        } else {
                            throw AbstractC166987dD.A18("muxer hasn't started");
                        }
                    }
                    MediaCodec mediaCodec2 = c55068OaO.A04;
                    if (mediaCodec2 != null) {
                        mediaCodec2.releaseOutputBuffer(i, false);
                        return;
                    }
                    return;
                }
                throw AbstractC166987dD.A18(AnonymousClass001.A0c("encoderOutputBuffer ", " was null", i));
            } catch (Exception e) {
                atomicReference.set(e);
                countDownLatch.countDown();
            }
        }
    }
}
