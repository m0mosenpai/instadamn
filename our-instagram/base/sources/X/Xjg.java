package X;

import android.media.MediaRecorder;
import android.os.Build;

/* loaded from: classes12.dex */
public abstract class Xjg {
    public static final MediaRecorder A00(MediaRecorder.OnErrorListener onErrorListener, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        C14360o3.A0B(str, 0);
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.reset();
        mediaRecorder.setAudioSource(i5);
        if (Build.VERSION.SDK_INT >= 30 && z) {
            mediaRecorder.setPrivacySensitive(true);
        }
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(i);
        mediaRecorder.setAudioChannels(1);
        if (C14360o3.A0K(Build.MODEL, AbstractC111324zv.A00(1714))) {
            mediaRecorder.setAudioSamplingRate(i2);
        } else {
            mediaRecorder.setAudioSamplingRate(i3);
        }
        mediaRecorder.setAudioEncodingBitRate(i4);
        mediaRecorder.setOutputFile(str);
        if (onErrorListener != null) {
            mediaRecorder.setOnErrorListener(onErrorListener);
        }
        return mediaRecorder;
    }
}
