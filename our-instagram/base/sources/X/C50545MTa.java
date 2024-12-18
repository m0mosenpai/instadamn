package X;

import android.media.AudioManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.MTa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50545MTa extends AbstractRunnableC14200nk {
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener A00;
    public final /* synthetic */ AudioManager A01;
    public final /* synthetic */ C41101vI A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50545MTa(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, AudioManager audioManager, C41101vI c41101vI) {
        super(1411717440, 3, false, false);
        this.A02 = c41101vI;
        this.A01 = audioManager;
        this.A00 = onAudioFocusChangeListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41101vI c41101vI = this.A02;
        boolean z = false;
        if (c41101vI.A01.getAndSet(false)) {
            int abandonAudioFocus = this.A01.abandonAudioFocus(this.A00);
            AtomicBoolean atomicBoolean = c41101vI.A00;
            if (abandonAudioFocus != 1) {
                z = true;
            }
            atomicBoolean.set(z);
        }
    }
}
