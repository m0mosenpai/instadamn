package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.Xr6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72925Xr6 {
    public static final AudioAttributes A00 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i, int i2) {
        int i3 = 8;
        while (!AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Util.A00(i3)).build(), A00)) {
            i3--;
            if (i3 <= 0) {
                return 0;
            }
        }
        return i3;
    }
}
