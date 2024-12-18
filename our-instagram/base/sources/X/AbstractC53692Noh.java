package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Noh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53692Noh {
    public static final MediaCodec A00(AudioEncoderConfig audioEncoderConfig) {
        int i = 2;
        int i2 = audioEncoderConfig.sampleRate;
        int i3 = audioEncoderConfig.channels;
        int i4 = audioEncoderConfig.bitRate;
        if (audioEncoderConfig.profile == EnumC53196Nfs.A03) {
            i = 5;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", i);
        if (i == 5) {
            mediaFormat.setInteger("profile", i);
        }
        mediaFormat.setInteger("sample-rate", i2);
        mediaFormat.setInteger("channel-count", i3);
        mediaFormat.setInteger(TraceFieldType.Bitrate, i4);
        MediaCodec mediaCodec = null;
        RuntimeException e = null;
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                try {
                    mediaCodec = C0fT.A02("audio/mp4a-latm", 655056819);
                } catch (IOException e2) {
                    throw new RuntimeException("MediaCodec creation failed", e2);
                }
            } catch (RuntimeException e3) {
                e = e3;
                mediaCodec = null;
            }
            if (mediaCodec != null) {
                try {
                    C0fT.A07(mediaCodec, null, mediaFormat, null, 1, -731834737);
                    break;
                } catch (IllegalStateException e4) {
                    throw new RuntimeException("MediaCodec audio encoder configure failed", e4);
                }
            }
            continue;
        }
        if (mediaCodec == null) {
            if (e == null) {
                throw AbstractC166987dD.A18("Audio encoder failed to create");
            }
            throw e;
        }
        return mediaCodec;
    }
}
