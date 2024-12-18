package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.proxygen.TraceFieldType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.nio.channels.WritableByteChannel;
import org.webrtc.CameraEnumerationAndroid;

/* loaded from: classes11.dex */
public final class WG9 {
    public static final int[] A0M = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD};
    public long A00;
    public long A01;
    public C70087W2j A07;
    public File A08;
    public boolean A0A;
    public W4V A0D;
    public boolean A0G;
    public WritableByteChannel A09 = null;
    public FFMpegAVStream A04 = null;
    public ByteBuffer[] A0H = null;
    public ByteBuffer[] A0I = null;
    public FFMpegMediaMuxer A0C = null;
    public ByteBuffer A0F = null;
    public FFMpegBufferInfo A0B = null;
    public FileOutputStream A0E = null;
    public MediaCodec A02 = null;
    public MediaCodec A03 = null;
    public InterfaceC72006XEu A05 = null;
    public C69751Vul A06 = null;
    public final byte[] A0L = new byte[7];
    public final MediaCodec.BufferInfo A0J = new MediaCodec.BufferInfo();
    public final MediaCodec.BufferInfo A0K = new MediaCodec.BufferInfo();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Vul, java.lang.Object] */
    public static void A00(MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat, WG9 wg9, U7W u7w, byte[] bArr, float f, int i) {
        int i2;
        W4V w4v;
        int i3 = i;
        A01(bufferInfo, wg9, u7w, bArr);
        int integer = mediaFormat.getInteger("channel-count");
        if (u7w.A08()) {
            if ((!mediaFormat.containsKey("pcm-encoding") || mediaFormat.getInteger("pcm-encoding") == 2) && integer != (i2 = wg9.A07.A01)) {
                w4v = new W4V(integer, i2);
            } else {
                w4v = null;
            }
            wg9.A0D = w4v;
        } else {
            i3 = (i * wg9.A07.A01) / integer;
        }
        ByteBuffer byteBuffer = C69751Vul.A02;
        int integer2 = mediaFormat.getInteger("sample-rate");
        ?? obj = new Object();
        obj.A01 = C69751Vul.A02;
        obj.A00 = new C70192WFv(f, 1.0f, integer2, integer, i3);
        wg9.A06 = obj;
    }

    public static void A01(MediaCodec.BufferInfo bufferInfo, WG9 wg9, U7W u7w, byte[] bArr) {
        int i;
        while (true) {
            C69751Vul c69751Vul = wg9.A06;
            if (c69751Vul != null && c69751Vul.A00.A06 != 0) {
                int dequeueInputBuffer = wg9.A03.dequeueInputBuffer(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = wg9.A0H[dequeueInputBuffer];
                    byteBuffer.clear();
                    if (u7w.A08() && wg9.A0D != null) {
                        wg9.A0D.A00(wg9.A06.A00());
                        W4V w4v = wg9.A0D;
                        ByteBuffer byteBuffer2 = w4v.A02;
                        w4v.A02 = w4v.A00;
                        i = byteBuffer2.remaining();
                        byteBuffer.put(byteBuffer2);
                    } else {
                        C69751Vul c69751Vul2 = wg9.A06;
                        if (c69751Vul2.A00.A06 != 0) {
                            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                            int position = asShortBuffer.position();
                            c69751Vul2.A00.A05(asShortBuffer);
                            i = (asShortBuffer.position() - position) * 2;
                        } else {
                            i = 0;
                        }
                    }
                    wg9.A03.queueInputBuffer(dequeueInputBuffer, 0, i, 0L, 1);
                }
                A04(bufferInfo, wg9, bArr);
            } else {
                return;
            }
        }
    }

    public static void A02(WG9 wg9) {
        if (wg9.A0A) {
            wg9.A0F = ByteBuffer.allocateDirect(1048576);
            wg9.A0B = new FFMpegBufferInfo();
            FFMpegMediaMuxer fFMpegMediaMuxer = new FFMpegMediaMuxer(VYI.A00, wg9.A08.getCanonicalPath(), false);
            wg9.A0C = fFMpegMediaMuxer;
            fFMpegMediaMuxer.initialize();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(wg9.A08);
            wg9.A0E = fileOutputStream;
            wg9.A09 = fileOutputStream.getChannel();
        }
        wg9.A0G = false;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.Tyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.VIr, java.lang.Object] */
    public static void A03(WG9 wg9, byte[] bArr, int i, int i2) {
        MediaCodec mediaCodec = wg9.A03;
        if (mediaCodec != null) {
            C67628Uti c67628Uti = new C67628Uti(mediaCodec, (C66046Tyj) new Object());
            new Object().A00 = c67628Uti;
            c67628Uti.A00();
        }
        MediaCodec A02 = C0fT.A02("audio/mp4a-latm", 465465463);
        wg9.A03 = A02;
        int i3 = wg9.A07.A00;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger(TraceFieldType.Bitrate, i3);
        createAudioFormat.setInteger("sample-rate", i);
        createAudioFormat.setInteger("channel-count", i2);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("max-input-size", 64000);
        C0fT.A07(A02, null, createAudioFormat, null, 1, -292048562);
        bArr[0] = -1;
        bArr[1] = -15;
        int i4 = 0;
        while (true) {
            int[] iArr = A0M;
            if (i4 < 12) {
                if (i == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = 0;
                break;
            }
        }
        byte b = (byte) i2;
        bArr[2] = 64;
        byte b2 = (byte) ((((byte) i4) << 2) | 64);
        bArr[2] = b2;
        bArr[2] = (byte) (b2 | (b >> 2));
        bArr[3] = (byte) ((b & 3) << 6);
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = -4;
        C0fT.A05(wg9.A03, 814900264);
        wg9.A0H = wg9.A03.getInputBuffers();
        wg9.A0I = wg9.A03.getOutputBuffers();
    }

    public static boolean A04(MediaCodec.BufferInfo bufferInfo, WG9 wg9, byte[] bArr) {
        int dequeueOutputBuffer = wg9.A03.dequeueOutputBuffer(bufferInfo, 0L);
        boolean z = false;
        while (dequeueOutputBuffer != -1) {
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = wg9.A0I[dequeueOutputBuffer];
                AbstractC50522MSa.A0v(bufferInfo, byteBuffer);
                if ((bufferInfo.flags & 2) == 0) {
                    ByteBuffer byteBuffer2 = wg9.A0F;
                    FFMpegBufferInfo fFMpegBufferInfo = wg9.A0B;
                    int i = (bufferInfo.size - bufferInfo.offset) + 7;
                    bArr[3] = (byte) (((i >> 11) & 3) | (bArr[3] & 252));
                    bArr[4] = (byte) ((i >> 3) & 255);
                    bArr[5] = (byte) (((i & 7) << 5) | 31);
                    try {
                        if (wg9.A0A) {
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            byteBuffer2.clear();
                            byteBuffer2.position(0);
                            wrap.position(0);
                            byteBuffer2.limit(wrap.limit());
                            byteBuffer2.put(wrap);
                            int remaining = byteBuffer2.remaining();
                            fFMpegBufferInfo.offset = 0;
                            fFMpegBufferInfo.size = remaining;
                            fFMpegBufferInfo.presentationTimeUs = 0L;
                            fFMpegBufferInfo.flags = 1;
                            wg9.A04.writeFrame(fFMpegBufferInfo, byteBuffer2);
                        } else {
                            wg9.A09.write(ByteBuffer.wrap(bArr));
                        }
                        FFMpegBufferInfo fFMpegBufferInfo2 = wg9.A0B;
                        if (wg9.A0A) {
                            int i2 = bufferInfo.offset;
                            int i3 = bufferInfo.size;
                            fFMpegBufferInfo2.offset = i2;
                            fFMpegBufferInfo2.size = i3;
                            fFMpegBufferInfo2.presentationTimeUs = 0L;
                            fFMpegBufferInfo2.flags = 1;
                            wg9.A04.writeFrame(fFMpegBufferInfo2, byteBuffer);
                        } else {
                            wg9.A09.write(byteBuffer);
                        }
                    } catch (FFMpegBadDataException | IOException unused) {
                    }
                }
                if ((bufferInfo.flags & 4) != 0) {
                    z = true;
                }
                byteBuffer.clear();
                wg9.A03.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else if (dequeueOutputBuffer == -3) {
                wg9.A0I = wg9.A03.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = wg9.A03.getOutputFormat();
                FFMpegMediaMuxer fFMpegMediaMuxer = wg9.A0C;
                if (wg9.A0A) {
                    try {
                        wg9.A04 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(outputFormat), -1, fFMpegMediaMuxer.A02);
                        fFMpegMediaMuxer.A00();
                        FFMpegAVStream fFMpegAVStream = wg9.A04;
                        ByteBuffer byteBuffer3 = outputFormat.getByteBuffer("csd-0");
                        if (byteBuffer3 != null) {
                            FFMpegBufferInfo fFMpegBufferInfo3 = new FFMpegBufferInfo();
                            int limit = byteBuffer3.limit();
                            fFMpegBufferInfo3.offset = 0;
                            fFMpegBufferInfo3.size = limit;
                            fFMpegBufferInfo3.presentationTimeUs = 0L;
                            fFMpegBufferInfo3.flags = 2;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
                            allocateDirect.clear();
                            allocateDirect.position(0);
                            byteBuffer3.position(0);
                            allocateDirect.limit(byteBuffer3.limit());
                            allocateDirect.put(byteBuffer3);
                            try {
                                fFMpegAVStream.writeFrame(fFMpegBufferInfo3, allocateDirect);
                            } catch (Exception e) {
                                throw new Exception("Error in writing CSD data", e);
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception unused2) {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
            dequeueOutputBuffer = wg9.A03.dequeueOutputBuffer(bufferInfo, 0L);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tyj, java.lang.Object] */
    public final void A05() {
        if (!this.A0G) {
            ?? obj = new Object();
            MediaCodec mediaCodec = this.A02;
            if (mediaCodec != null) {
                try {
                    C0fT.A06(mediaCodec, 1286715035);
                } catch (Throwable th) {
                    C66046Tyj.A00(obj, th);
                }
            }
            C67628Uti c67628Uti = new C67628Uti(this.A02, (C66046Tyj) obj);
            new Object().A00 = c67628Uti;
            c67628Uti.A00();
            MediaCodec mediaCodec2 = this.A03;
            if (mediaCodec2 != null) {
                try {
                    C0fT.A06(mediaCodec2, 1286715035);
                } catch (Throwable th2) {
                    C66046Tyj.A00(obj, th2);
                }
            }
            C67628Uti c67628Uti2 = new C67628Uti(this.A03, (C66046Tyj) obj);
            new Object().A00 = c67628Uti2;
            c67628Uti2.A00();
            C67628Uti c67628Uti3 = new C67628Uti((C66046Tyj) obj, this.A05);
            new Object().A00 = c67628Uti3;
            c67628Uti3.A00();
            if (this.A0A) {
                try {
                    this.A0C.A01();
                } catch (Throwable th3) {
                    C66046Tyj.A00(obj, th3);
                }
            } else {
                WritableByteChannel writableByteChannel = this.A09;
                if (writableByteChannel != null) {
                    try {
                        writableByteChannel.close();
                    } catch (Throwable th4) {
                        C66046Tyj.A00(obj, th4);
                    }
                }
                FileOutputStream fileOutputStream = this.A0E;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
            this.A0G = true;
            obj.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        X.C66046Tyj.A00(r4, r0);
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Tyj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C70087W2j r24, java.io.File r25, long r26) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WG9.A06(X.W2j, java.io.File, long):void");
    }
}
