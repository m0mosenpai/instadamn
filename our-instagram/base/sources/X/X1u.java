package X;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.audiofiltercore.interfaces.AudioInput;

/* loaded from: classes11.dex */
public final class X1u extends Thread {
    public final /* synthetic */ C69322VlU A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1u(C69322VlU c69322VlU) {
        super("AudioTrackThread");
        this.A00 = c69322VlU;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-19);
        while (true) {
            C69322VlU c69322VlU = this.A00;
            if (c69322VlU.A05) {
                try {
                    c69322VlU.A02.getClass();
                    c69322VlU.A00.getClass();
                    c69322VlU.A04.getClass();
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    AudioInput audioInput = c69322VlU.A02;
                    short[] sArr = c69322VlU.A04;
                    if (audioInput.read(sArr, sArr.length) > 0) {
                        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
                        AH7 ah7 = c69322VlU.A03;
                        ah7.A07 += elapsedRealtimeNanos2;
                        ah7.A06++;
                    }
                    AudioTrack audioTrack = c69322VlU.A00;
                    short[] sArr2 = c69322VlU.A04;
                    audioTrack.write(sArr2, 0, sArr2.length);
                } catch (Exception e) {
                    C0K8.A05(C69322VlU.class, "Exception", e);
                    return;
                }
            } else {
                return;
            }
        }
    }
}
