package X;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;

/* renamed from: X.Xgo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72562Xgo {
    public static final AudioRecord A00(MediaProjection mediaProjection, int i) {
        AudioPlaybackCaptureConfiguration build = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection).addMatchingUsage(14).addMatchingUsage(1).addMatchingUsage(0).build();
        C14360o3.A07(build);
        AudioRecord build2 = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(16).build()).setAudioPlaybackCaptureConfig(build).setBufferSizeInBytes(i).build();
        C14360o3.A07(build2);
        return build2;
    }
}
