package X;

import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WZ5 implements InterfaceC58194Pr0 {
    public int A00;
    public C66014TyA A01;
    public FFMpegMediaDemuxer A02;

    @Override // X.InterfaceC58194Pr0
    public final int E8O(ByteBuffer byteBuffer, int i) {
        return this.A02.readSampleData(byteBuffer, 0);
    }

    @Override // X.InterfaceC58194Pr0
    public final boolean AAz() {
        return this.A02.advance();
    }

    @Override // X.InterfaceC58194Pr0
    public final int Bq6() {
        return this.A02.getSampleFlags();
    }

    @Override // X.InterfaceC58194Pr0
    public final long Bq8() {
        return this.A02.getSampleTime();
    }

    @Override // X.InterfaceC58194Pr0
    public final int Bq9() {
        return this.A02.getSampleTrackIndex();
    }

    @Override // X.InterfaceC58194Pr0
    public final int CA9() {
        return this.A02.getTrackCount();
    }

    @Override // X.InterfaceC58194Pr0
    public final MediaFormat CAD(int i) {
        float f;
        FFMpegMediaFormat trackFormat = this.A02.getTrackFormat(i);
        if (trackFormat != null) {
            if ("audio/mp4a".equals(trackFormat.getString("mime"))) {
                trackFormat.setString("mime", "audio/mp4a-latm");
            }
            MediaFormat mediaFormat = new MediaFormat();
            Iterator A12 = AbstractC43593JPy.A12(trackFormat.mMap);
            while (A12.hasNext()) {
                String str = (String) A12.next();
                V v = FFMpegMediaFormat.ALL_KEYS.get(str);
                if (v == String.class) {
                    mediaFormat.setString(str, (String) trackFormat.mMap.get(str));
                } else if (v == Integer.class) {
                    mediaFormat.setInteger(str, AbstractC167017dG.A0K((Number) trackFormat.mMap.get(str)));
                } else if (v == Long.class) {
                    mediaFormat.setLong(str, AbstractC25232BEp.A0t((Number) trackFormat.mMap.get(str)));
                } else if (v == Float.class) {
                    Number number = (Number) trackFormat.mMap.get(str);
                    if (number != null) {
                        f = number.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    mediaFormat.setFloat(str, f);
                } else if (v == ByteBuffer.class) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) trackFormat.mMap.get(str));
                }
            }
            return mediaFormat;
        }
        return null;
    }

    @Override // X.InterfaceC58194Pr0
    public final void EMi(long j, int i) {
        this.A02.seekTo(this.A00, j, i);
    }

    @Override // X.InterfaceC58194Pr0
    public final void EMv(int i) {
        this.A02.selectTrack(i);
        this.A00 = i;
    }

    @Override // X.InterfaceC58194Pr0
    public final void ESw(String str) {
        try {
            FFMpegMediaDemuxer fFMpegMediaDemuxer = new FFMpegMediaDemuxer(this.A01, str, new FFMpegMediaDemuxer.Options());
            this.A02 = fFMpegMediaDemuxer;
            fFMpegMediaDemuxer.initialize();
        } catch (Exception e) {
            throw new IOException("create ffmpeg concat file failed", e);
        }
    }

    @Override // X.InterfaceC58194Pr0
    public final void release() {
        this.A02.release();
    }
}
