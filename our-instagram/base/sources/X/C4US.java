package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* renamed from: X.4US, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4US {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public AudioTrack A0K;
    public C126345nV A0L;
    public Method A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public long A0R;
    public final C4UR A0S;
    public final long[] A0T;

    public C4US(C4UR c4ur) {
        this.A0S = c4ur;
        try {
            this.A0M = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0T = new long[10];
    }

    public static long A00(C4US c4us) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = c4us.A0J;
        if (j != -9223372036854775807L) {
            return Math.min(c4us.A06, c4us.A0I + ((Util.A05(c4us.A00, (elapsedRealtime * 1000) - j) * c4us.A03) / 1000000));
        }
        if (elapsedRealtime - c4us.A0R >= 5) {
            AudioTrack audioTrack = c4us.A0K;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
                if (Util.A00 <= 29) {
                    if (playbackHeadPosition == 0 && c4us.A0F > 0 && playState == 3) {
                        if (c4us.A07 == -9223372036854775807L) {
                            c4us.A07 = elapsedRealtime;
                        }
                    } else {
                        c4us.A07 = -9223372036854775807L;
                    }
                }
                if (c4us.A0F > playbackHeadPosition) {
                    c4us.A0G++;
                }
                c4us.A0F = playbackHeadPosition;
            }
            c4us.A0R = elapsedRealtime;
        }
        return c4us.A0F + (c4us.A0G << 32);
    }
}
