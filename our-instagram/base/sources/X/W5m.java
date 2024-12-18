package X;

import android.media.AudioManager;
import android.media.AudioTrack;
import com.facebook.audiofiltercore.interfaces.AudioInput;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class W5m {
    public AudioTrack A00;
    public AudioInput A01;
    public AH7 A02;
    public C68680VaG A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AudioManager.OnAudioFocusChangeListener A07 = new C55331Ogu(this, 0);
    public final AudioManager A08;
    public final int A09;
    public final C69322VlU A0A;
    public final VCS A0B;

    private void A00() {
        AudioTrack audioTrack = this.A00;
        if (audioTrack != null) {
            audioTrack.release();
        }
        int i = 0;
        if (this.A0B == VCS.MUSIC) {
            i = 3;
        }
        this.A00 = new AudioTrack(i, 44100, 4, 2, this.A09, 1, 0);
    }

    public final void A01() {
        C68680VaG c68680VaG;
        AH7 ah7 = this.A02;
        if (ah7 != null) {
            ah7.A01 = this.A00.getUnderrunCount();
        }
        this.A05 = false;
        try {
            this.A00.pause();
            this.A00.flush();
        } catch (IllegalStateException e) {
            C0K8.A0G("AudioPlayer", "Failed to pause AudioPlayer", e);
        }
        C69322VlU c69322VlU = this.A0A;
        X1u x1u = c69322VlU.A01;
        if (x1u != null && x1u.isAlive()) {
            X1u x1u2 = c69322VlU.A01;
            x1u2.A00.A05 = false;
            boolean z = false;
            while (true) {
                try {
                    x1u2.join();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        AbstractC58318PtA.A18();
                    }
                    throw th;
                }
            }
            if (z) {
                AbstractC58318PtA.A18();
            }
            c69322VlU.A01 = null;
        }
        if (ah7 != null) {
            float A01 = ah7.A01();
            float f = ((float) ah7.A0C) / 1000000.0f;
            long j = ah7.A0B;
            long j2 = ah7.A06;
            HashMap hashMap = new HashMap(6);
            if (j2 > 30 && (c68680VaG = this.A03) != null) {
                hashMap.put(AbstractC111324zv.A00(1225), String.valueOf(A01));
                long j3 = ah7.A01;
                if (j3 > -1) {
                    hashMap.put(AbstractC111324zv.A00(1227), String.valueOf(j3));
                }
                hashMap.put(AbstractC111324zv.A00(1230), String.valueOf(ah7.A0A));
                hashMap.put(AbstractC111324zv.A00(1226), String.valueOf(Math.round(f)));
                hashMap.put(AbstractC111324zv.A00(1228), String.valueOf(ah7.A06));
                hashMap.put(AbstractC111324zv.A00(1229), String.valueOf(j));
                c68680VaG.A00.CiR(hashCode(), AbstractC111324zv.A00(1957), "AudioPlayer", hashMap);
            }
            this.A02 = null;
        }
    }

    public final void A02() {
        if (this.A05) {
            A01();
        }
        if (this.A04) {
            this.A08.abandonAudioFocus(this.A07);
        }
        if (this.A01 != null) {
            this.A01 = null;
        }
        try {
            this.A00.setPlaybackRate(44100);
        } catch (IllegalStateException e) {
            C0K8.A0G("AudioPlayer", "Failed to set playback rate for AudioPlayer", e);
        }
    }

    public final void A03(boolean z, boolean z2) {
        if (this.A01 != null) {
            AudioManager audioManager = this.A08;
            int i = 3;
            if (audioManager.getStreamVolume(3) <= 0 && z) {
                audioManager.setStreamVolume(3, (int) (audioManager.getStreamMaxVolume(3) * 0.5d), 4);
            }
            this.A06 = z2;
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A07;
            if (!z2) {
                i = 2;
            }
            boolean z3 = true;
            if (audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, i) != 1) {
                z3 = false;
            }
            this.A04 = z3;
            if (!z3) {
                A01();
                if (this.A04) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                    return;
                }
                return;
            }
            try {
                this.A00.play();
            } catch (IllegalStateException unused) {
                A00();
                this.A00.play();
            }
            int i2 = this.A09;
            AH7 ah7 = new AH7(AMJ.A01(2, 1, i2, 44100L) * 1000, i2 / 2);
            this.A02 = ah7;
            C69322VlU c69322VlU = this.A0A;
            AudioInput audioInput = this.A01;
            AudioTrack audioTrack = this.A00;
            c69322VlU.A02 = audioInput;
            c69322VlU.A00 = audioTrack;
            c69322VlU.A04 = new short[(i2 + 1) / 2];
            c69322VlU.A03 = ah7;
            if (c69322VlU.A01 == null) {
                c69322VlU.A05 = true;
                AH7 ah72 = c69322VlU.A03;
                ah72.A02();
                ah72.A09 = true;
                X1u x1u = new X1u(c69322VlU);
                c69322VlU.A01 = x1u;
                x1u.start();
            }
            this.A05 = true;
        }
    }

    public W5m(AudioManager audioManager, VCS vcs, C68680VaG c68680VaG) {
        audioManager.getClass();
        this.A08 = audioManager;
        this.A03 = c68680VaG;
        int minBufferSize = AudioTrack.getMinBufferSize(44100, 4, 2);
        this.A09 = minBufferSize <= 0 ? 4096 : minBufferSize;
        this.A0B = vcs;
        this.A0A = new C69322VlU();
        A00();
    }
}
