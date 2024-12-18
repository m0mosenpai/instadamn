package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.7s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175947s9 implements AudioManager.OnAudioFocusChangeListener {
    public Handler A00;
    public volatile C175917s6 A01;
    public volatile InterfaceC25222BDw A02;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Handler handler = this.A00;
        if (handler != null) {
            handler.post(new RunnableC24535Ats(this, i));
        }
    }
}
