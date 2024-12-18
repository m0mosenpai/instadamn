package X;

import android.media.AudioManager;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;

/* renamed from: X.9vC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224289vC {
    public int A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public Handler A02;
    public AudioAttributesCompat A03;

    public final AH6 A00() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
        if (onAudioFocusChangeListener != null) {
            return new AH6(onAudioFocusChangeListener, this.A02, this.A03, this.A00);
        }
        throw AbstractC166987dD.A14("Can't build an AudioFocusRequestCompat instance without a listener");
    }

    public final void A01(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        Handler A0J = AbstractC167007dF.A0J();
        if (onAudioFocusChangeListener != null) {
            this.A01 = onAudioFocusChangeListener;
            this.A02 = A0J;
            return;
        }
        throw AbstractC166987dD.A12("OnAudioFocusChangeListener must not be null");
    }
}
