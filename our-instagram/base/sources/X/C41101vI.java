package X;

import android.media.AudioManager;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41101vI {
    public final AtomicBoolean A00;
    public final AtomicBoolean A01;
    public final AtomicBoolean A02;
    public final AudioManager A03;
    public final UserSession A04;
    public final C18240vB A05;

    public C41101vI(AudioManager audioManager, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A03 = audioManager;
        this.A04 = userSession;
        this.A05 = new C18240vB(AbstractC14350nz.A00());
        this.A02 = new AtomicBoolean();
        this.A01 = new AtomicBoolean();
        this.A00 = new AtomicBoolean();
    }

    public final void A01(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager audioManager = this.A03;
        if (audioManager != null) {
            AtomicBoolean atomicBoolean = this.A00;
            if (atomicBoolean.get()) {
                boolean z = false;
                if (C11T.A08()) {
                    if (!this.A01.getAndSet(true)) {
                        this.A02.set(false);
                        this.A05.ATO(new C50545MTa(onAudioFocusChangeListener, audioManager, this));
                        return;
                    }
                    return;
                }
                if (audioManager.abandonAudioFocus(onAudioFocusChangeListener) != 1) {
                    z = true;
                }
                atomicBoolean.set(z);
            }
        }
    }

    public final void A02(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager audioManager = this.A03;
        if (audioManager != null) {
            AtomicBoolean atomicBoolean = this.A00;
            if (!atomicBoolean.get()) {
                boolean z = false;
                if (C11T.A08()) {
                    if (!this.A02.getAndSet(true)) {
                        this.A01.set(false);
                        this.A05.ATO(new MU7(onAudioFocusChangeListener, audioManager, this));
                        return;
                    }
                    return;
                }
                if (audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, 4) == 1) {
                    z = true;
                }
                atomicBoolean.set(z);
            }
        }
    }

    public void A03(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        A01(onAudioFocusChangeListener);
    }

    public void A04(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        A02(onAudioFocusChangeListener);
    }
}
