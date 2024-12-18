package X;

import android.content.Context;
import android.media.AudioManager;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.33r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C677733r implements AudioManager.OnAudioFocusChangeListener {
    public AudioManager.OnAudioFocusChangeListener A00;
    public C41101vI A01;
    public final Context A02;
    public final UserSession A03;

    public C677733r(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A03 = userSession;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        if ((i != -2 && i != -1) || (onAudioFocusChangeListener = this.A00) == null) {
            return;
        }
        onAudioFocusChangeListener.onAudioFocusChange(i);
    }

    public final void A00() {
        C41101vI c41101vI = this.A01;
        if (c41101vI != null) {
            c41101vI.A03(this);
            this.A00 = null;
        }
    }

    public final void A01(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        C41101vI c41101vI = this.A01;
        if (c41101vI == null) {
            Object systemService = this.A02.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (systemService != null) {
                c41101vI = new C41101vI((AudioManager) systemService, this.A03);
                this.A01 = c41101vI;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A00 = onAudioFocusChangeListener;
        c41101vI.A04(this);
    }
}
