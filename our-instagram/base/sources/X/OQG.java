package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import com.google.common.io.Files;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class OQG {
    public static final float A00(File file, List list) {
        try {
            if (list.size() == 1) {
                File file2 = (File) list.get(0);
                file2.getPath();
                file.getPath();
                Files.A01(file2, file);
            } else {
                MediaMuxer mediaMuxer = null;
                try {
                    String A0x = AbstractC43592JPx.A0x((File) list.get(0));
                    file.getAbsolutePath();
                    MY5 A00 = MY5.A00("media_stitch_utl_init_muxer");
                    try {
                        A00.ESw(A0x);
                        MediaMuxer mediaMuxer2 = new MediaMuxer(file.getPath(), 0);
                        int trackCount = ((MY7) A00).A00.getTrackCount();
                        for (int i = 0; i < trackCount; i++) {
                            MediaFormat trackFormat = ((MY7) A00).A00.getTrackFormat(i);
                            C14360o3.A07(trackFormat);
                            mediaMuxer2.addTrack(trackFormat);
                        }
                        mediaMuxer2.start();
                        A00.release();
                        mediaMuxer = mediaMuxer2;
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
                        Iterator it = list.iterator();
                        long j = 0;
                        while (it.hasNext()) {
                            File file3 = (File) it.next();
                            file3.getPath();
                            A00 = MY5.A00("media_stitch_utl_init_demuxer");
                            A00.ESw(file3.getPath());
                            int trackCount2 = ((MY7) A00).A00.getTrackCount();
                            for (int i2 = 0; i2 < trackCount2; i2++) {
                                A00.EMv(i2);
                            }
                            C14360o3.A0A(allocateDirect);
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            long j2 = 0;
                            while (true) {
                                allocateDirect.clear();
                                int readSampleData = ((MY7) A00).A00.readSampleData(allocateDirect, 0);
                                if (readSampleData < 0) {
                                    break;
                                }
                                long sampleTime = ((MY7) A00).A00.getSampleTime();
                                j2 = Math.max(j2, sampleTime);
                                int sampleFlags = ((MY7) A00).A00.getSampleFlags();
                                int sampleTrackIndex = ((MY7) A00).A00.getSampleTrackIndex();
                                bufferInfo.set(0, readSampleData, sampleTime + j, sampleFlags);
                                C14360o3.A0A(mediaMuxer2);
                                mediaMuxer2.writeSampleData(sampleTrackIndex, allocateDirect, bufferInfo);
                                A00.AAz();
                            }
                            A00.release();
                            j += j2;
                        }
                        mediaMuxer2.stop();
                        mediaMuxer2.release();
                    } catch (Throwable th) {
                        A00.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (mediaMuxer != null) {
                        mediaMuxer.release();
                        throw th2;
                    }
                    throw th2;
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getPath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata != null) {
                return Float.parseFloat(extractMetadata) / 1000.0f;
            }
            throw AbstractC166997dE.A0g();
        } catch (Exception e) {
            C0K8.A07(OQG.class, "Android demuxer muxer error for stitching movies.", e, new Object[0]);
            C0w9.A07("system_media_stitch_err", e);
            return 0.0f;
        }
    }
}
