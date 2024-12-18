package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AH6 {
    public static final AudioAttributesCompat A05;
    public final AudioAttributesCompat A00;
    public final Object A01;
    public final int A02;
    public final AudioManager.OnAudioFocusChangeListener A03;
    public final Handler A04;

    public AH6(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, int i) {
        AudioAttributes audioAttributes;
        this.A02 = i;
        this.A04 = handler;
        this.A00 = audioAttributesCompat;
        this.A03 = onAudioFocusChangeListener;
        if (audioAttributesCompat != null) {
            audioAttributes = (AudioAttributes) audioAttributesCompat.A00.Adi();
        } else {
            audioAttributes = null;
        }
        this.A01 = new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AH6)) {
            return false;
        }
        AH6 ah6 = (AH6) obj;
        return this.A02 == ah6.A02 && C02O.A00(this.A03, ah6.A03) && C02O.A00(this.A04, ah6.A04) && C02O.A00(this.A00, ah6.A00);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media.AudioAttributesImpl, java.lang.Object, androidx.media.AudioAttributesImplApi21] */
    static {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1);
        AudioAttributes build = builder.build();
        ?? obj = new Object();
        obj.A01 = build;
        obj.A00 = -1;
        ?? obj2 = new Object();
        obj2.A00 = obj;
        A05 = obj2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A02), this.A03, this.A04, this.A00, AbstractC166997dE.A0a()});
    }
}
