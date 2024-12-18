package X;

import android.media.MediaRecorder;
import android.os.CountDownTimer;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Tys, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66055Tys implements MRH {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public MediaRecorder A07;
    public CountDownTimer A08;
    public L33 A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final C7GO A0D;
    public final MPO A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final W1W A0I;
    public final boolean A0J;

    public C66055Tys(W1W w1w, C7GO c7go, MPO mpo, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167007dF.A1F(c7go, 1, mpo);
        C14360o3.A0B(w1w, 6);
        this.A0D = c7go;
        this.A05 = i;
        this.A0E = mpo;
        this.A0F = z;
        this.A0I = w1w;
        this.A0G = z2;
        this.A0H = z3;
        this.A0C = i2;
        this.A0J = z4;
        this.A0A = true;
        this.A02 = i5;
        this.A03 = i6;
        this.A04 = i3;
        this.A06 = i4;
    }

    @Override // X.MRH
    public final void AHz() {
        this.A09 = null;
    }

    public static final void A00(C66055Tys c66055Tys, Exception exc) {
        String str;
        W1W w1w = c66055Tys.A0I;
        float f = c66055Tys.A00;
        int i = c66055Tys.A01;
        if (exc instanceof IllegalStateException) {
            str = "vrc_startRecordingInternal_state_error";
        } else if (exc instanceof IOException) {
            str = "vrc_startRecordingInternal_io_error";
        } else {
            str = "vrc_startRecordingInternal_runtime_error";
        }
        C7Oi c7Oi = w1w.A00;
        c7Oi.A01("start_error");
        c7Oi.A01(str);
        c7Oi.A02(str, exc.getMessage());
        W1W.A00(w1w, f, i);
        CountDownTimer countDownTimer = c66055Tys.A08;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c66055Tys.A09 = null;
        c66055Tys.A02(exc, "Voice recording failed to start.");
        c66055Tys.release();
    }

    public static final void A01(C66055Tys c66055Tys, Integer num, boolean z) {
        L33 l33;
        W1W w1w = c66055Tys.A0I;
        C7Oi c7Oi = w1w.A00;
        c7Oi.A01("stop_recording");
        try {
            try {
                CountDownTimer countDownTimer = c66055Tys.A08;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                MediaRecorder mediaRecorder = c66055Tys.A07;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                if (c66055Tys.A0J && (l33 = c66055Tys.A09) != null) {
                    try {
                        File file = new File(l33.A02.AWv(AbstractC43591JPw.A00(124)));
                        File file2 = new File(l33.A01);
                        FFMpegMediaDemuxer.Options options = new FFMpegMediaDemuxer.Options();
                        file.getCanonicalPath();
                        C66014TyA c66014TyA = AbstractC66016TyE.A00;
                        FFMpegMediaDemuxer fFMpegMediaDemuxer = new FFMpegMediaDemuxer(c66014TyA, file2.getAbsolutePath(), options);
                        fFMpegMediaDemuxer.initialize();
                        try {
                            FFMpegMediaMuxer fFMpegMediaMuxer = new FFMpegMediaMuxer(c66014TyA, file.getCanonicalPath(), false, null, -1, false, null, "faststart");
                            fFMpegMediaMuxer.initialize();
                            int trackCount = fFMpegMediaDemuxer.getTrackCount();
                            FFMpegMediaFormat[] fFMpegMediaFormatArr = new FFMpegMediaFormat[trackCount];
                            int trackCount2 = fFMpegMediaDemuxer.getTrackCount();
                            FFMpegAVStream[] fFMpegAVStreamArr = new FFMpegAVStream[trackCount2];
                            long[] jArr = new long[fFMpegMediaDemuxer.getTrackCount()];
                            for (int i = 0; i < trackCount2; i++) {
                                FFMpegMediaFormat trackFormat = fFMpegMediaDemuxer.getTrackFormat(i);
                                fFMpegMediaFormatArr[i] = trackFormat;
                                fFMpegAVStreamArr[i] = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(trackFormat, -1, -1);
                                jArr[i] = Long.MIN_VALUE;
                                fFMpegMediaDemuxer.selectTrack(i);
                            }
                            fFMpegMediaMuxer.A00();
                            for (int i2 = 0; i2 < trackCount; i2++) {
                                try {
                                    ByteBuffer byteBuffer = fFMpegMediaFormatArr[i2].getByteBuffer("csd-0");
                                    if (byteBuffer != null) {
                                        FFMpegBufferInfo fFMpegBufferInfo = new FFMpegBufferInfo();
                                        int capacity = byteBuffer.capacity();
                                        fFMpegBufferInfo.offset = 0;
                                        fFMpegBufferInfo.size = capacity;
                                        fFMpegBufferInfo.presentationTimeUs = 0L;
                                        fFMpegBufferInfo.flags = 2;
                                        VSK.A00(fFMpegAVStreamArr[i2], fFMpegBufferInfo, byteBuffer);
                                    }
                                } finally {
                                    fFMpegMediaMuxer.A01();
                                }
                            }
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
                            do {
                                int readSampleData = fFMpegMediaDemuxer.readSampleData(allocateDirect, 0);
                                if (readSampleData == -1) {
                                    break;
                                }
                                int sampleTrackIndex = fFMpegMediaDemuxer.getSampleTrackIndex();
                                int sampleFlags = fFMpegMediaDemuxer.getSampleFlags();
                                long sampleTime = fFMpegMediaDemuxer.getSampleTime();
                                fFMpegMediaDemuxer.getSampleDuration();
                                if (sampleTime == jArr[sampleTrackIndex]) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Number of tracks: ");
                                    sb.append(trackCount);
                                    sb.append(", Track index: ");
                                    sb.append(sampleTrackIndex);
                                    sb.append(", Track media format: ");
                                    AbstractC58318PtA.A1V(sb, fFMpegMediaFormatArr[sampleTrackIndex]);
                                    sb.append(", Sample time: ");
                                    sb.append(sampleTime);
                                    C0w9.A03("ffmpeg_muxer_invalid_sample_time", sb.toString());
                                } else {
                                    jArr[sampleTrackIndex] = sampleTime;
                                    FFMpegBufferInfo fFMpegBufferInfo2 = new FFMpegBufferInfo();
                                    fFMpegBufferInfo2.offset = 0;
                                    fFMpegBufferInfo2.size = readSampleData;
                                    fFMpegBufferInfo2.presentationTimeUs = sampleTime;
                                    fFMpegBufferInfo2.flags = sampleFlags;
                                    VSK.A00(fFMpegAVStreamArr[sampleTrackIndex], fFMpegBufferInfo2, allocateDirect);
                                }
                            } while (fFMpegMediaDemuxer.advance());
                            fFMpegMediaDemuxer.release();
                            String path = file.getPath();
                            C14360o3.A0B(path, 0);
                            l33.A01 = path;
                        } catch (Throwable th) {
                            fFMpegMediaDemuxer.release();
                            throw th;
                        }
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    c66055Tys.A09 = null;
                }
                if (num == C05F.A00) {
                    c66055Tys.A0D.DdZ();
                }
                float f = c66055Tys.A00;
                int i3 = c66055Tys.A01;
                c7Oi.A01("stop_recording_ok");
                c7Oi.A02("max_ampitude", String.valueOf((int) (f * 100.0f)));
                c7Oi.A02("vmrecording_duration", Long.toString(((int) ((i3 & 4294967295L) / 1000)) & 4294967295L, 10));
                c7Oi.A01("vmrecording_success");
                ((XEY) c7Oi.A00.getValue()).A6w();
            } catch (RuntimeException e) {
                float f2 = c66055Tys.A00;
                int i4 = c66055Tys.A01;
                c7Oi.A02("vrc_stopRecordingInternal_runtime_error", e.getMessage());
                c7Oi.A01("stop_recording_error");
                W1W.A00(w1w, f2, i4);
                c66055Tys.A09 = null;
                c66055Tys.A0B = false;
                if (C14360o3.A0K(e.getMessage(), "stop failed.")) {
                    c66055Tys.A0D.DdZ();
                    C0K8.A0P("VoiceRecordController", AnonymousClass001.A0R("Voice recording failed to stop.", " %s"), e.getMessage());
                } else {
                    c66055Tys.A02(e, "Voice recording failed to stop.");
                }
            }
        } finally {
            c66055Tys.A0B = false;
            c66055Tys.release();
        }
    }

    private final void A02(Exception exc, String str) {
        Exception runtimeException;
        String A0g = AnonymousClass001.A0g(str, " Exception raised with message: ", exc.getMessage());
        if (exc instanceof IllegalStateException) {
            runtimeException = new IllegalStateException(A0g, exc);
        } else if (exc instanceof IOException) {
            runtimeException = new IOException(A0g, exc);
        } else {
            runtimeException = new RuntimeException(A0g, exc);
        }
        C0K8.A0F("VoiceRecordController", A0g, exc);
        this.A0D.DEF(runtimeException);
    }

    @Override // X.MRH
    public final L33 Auq() {
        return this.A09;
    }

    @Override // X.MRH
    public final void Cov() {
        WIW wiw;
        if (!this.A0B) {
            this.A00 = 0.0f;
            boolean z = false;
            this.A01 = 0;
            C7Oi c7Oi = this.A0I.A00;
            ((XEY) c7Oi.A00.getValue()).A6y(AbstractC111324zv.A00(3311));
            c7Oi.A01("vmrecording_start");
            try {
                L33 l33 = new L33(this.A0E);
                this.A09 = l33;
                if (this.A0H) {
                    wiw = new WIW(this);
                } else {
                    wiw = null;
                }
                MediaRecorder A00 = Xjg.A00(wiw, l33.A01, this.A02, this.A06, this.A04, this.A03, this.A0C, this.A0F);
                this.A07 = A00;
                A00.prepare();
                MediaRecorder mediaRecorder = this.A07;
                if (mediaRecorder != null) {
                    mediaRecorder.start();
                }
                this.A0B = true;
                CountDownTimer countDownTimer = this.A08;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                U92 u92 = new U92(new C57517Pfr(this, 40), new C57755Pji(this, 42), this.A05);
                this.A08 = u92;
                u92.start();
                c7Oi.A01("vrc_startRecordingInternal_ok");
                z = true;
            } catch (IOException | IllegalStateException | RuntimeException e) {
                A00(this, e);
            }
            this.A0D.DdX(z);
        }
    }

    @Override // X.MRH
    public final void Eoe(boolean z) {
        if (this.A0B) {
            A01(this, C05F.A00, z);
        }
    }

    @Override // X.MRH
    public final boolean isRecording() {
        return this.A0B;
    }

    @Override // X.MRH
    public final void release() {
        MediaRecorder mediaRecorder = this.A07;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
        }
        MediaRecorder mediaRecorder2 = this.A07;
        if (mediaRecorder2 != null) {
            mediaRecorder2.release();
        }
        this.A07 = null;
        this.A0B = false;
        this.A00 = 0.0f;
        this.A01 = 0;
    }
}
