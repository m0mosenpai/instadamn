package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8KP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KP {
    public static final int A00 = (int) TimeUnit.MILLISECONDS.toMicros(1);

    public final File A00(C8KN c8kn, File file, String str, int i, int i2) {
        File file2 = file;
        c8kn.AQK();
        MY5 A002 = MY5.A00("audio_download_util");
        C9OQ c9oq = new C9OQ(new XOL(str));
        try {
            A002.A01(c9oq);
            int trackCount = ((MY7) A002).A00.getTrackCount();
            int i3 = 0;
            while (true) {
                if (i3 < trackCount) {
                    MediaFormat trackFormat = ((MY7) A002).A00.getTrackFormat(i3);
                    C14360o3.A07(trackFormat);
                    String string = trackFormat.getString("mime");
                    if (string != null && AbstractC002300n.A0h(string, "audio/", false)) {
                        A002.EMv(i3);
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            boolean z = false;
            if (i3 != -1) {
                z = true;
            }
            if (z) {
                if (file == null) {
                    file2 = new File(AbstractC916948n.A0E("-audio", ".mp4"));
                }
                try {
                    try {
                        MediaMuxer mediaMuxer = new MediaMuxer(file2.getCanonicalPath(), 0);
                        MediaFormat trackFormat2 = ((MY7) A002).A00.getTrackFormat(i3);
                        C14360o3.A07(trackFormat2);
                        trackFormat2.getString("mime");
                        c8kn.CqR();
                        try {
                            mediaMuxer.addTrack(trackFormat2);
                            mediaMuxer.start();
                            c8kn.CqS();
                            int i4 = A00;
                            int i5 = i2 * i4;
                            long j = i * i4;
                            A002.EMi(j, 0);
                            ByteBuffer allocate = ByteBuffer.allocate(C3OO.FLAG_MOVED);
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            while (((MY7) A002).A00.advance()) {
                                int readSampleData = ((MY7) A002).A00.readSampleData(allocate, 0);
                                long sampleTime = ((MY7) A002).A00.getSampleTime();
                                if (readSampleData < 0 || sampleTime > r12 + i5) {
                                    break;
                                }
                                bufferInfo.size = readSampleData;
                                bufferInfo.presentationTimeUs = sampleTime - j;
                                bufferInfo.flags = ((MY7) A002).A00.getSampleFlags();
                                mediaMuxer.writeSampleData(0, allocate, bufferInfo);
                            }
                            c8kn.CqP();
                            mediaMuxer.stop();
                            mediaMuxer.release();
                            A002.release();
                            c8kn.CqQ();
                            return file2;
                        } catch (Throwable th) {
                            mediaMuxer.release();
                            A002.release();
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new IOException("couldn't create MediaMuxer", e);
                    }
                } catch (IOException e2) {
                    throw new IOException("couldn't generate output file path", e2);
                }
            }
            throw new IllegalStateException("couldn't find an audio track in input media");
        } catch (IOException unused) {
            throw new IOException("couldn't read source data", c9oq.A00);
        }
    }
}
