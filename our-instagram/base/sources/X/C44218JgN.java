package X;

import android.content.Context;
import android.media.AudioManager;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.JgN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44218JgN implements AudioManager.OnAudioFocusChangeListener {
    public C5TA A00;
    public WeakReference A01;
    public boolean A02;
    public final AudioManager A03;
    public final C41101vI A04;
    public final UserSession A05;
    public final C44217JgM A06;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        float f = 0.5f;
        if (i != -3) {
            f = 0.0f;
            if (i != -2) {
                if (i != -1) {
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        return;
                    } else {
                        f = 1.0f;
                    }
                } else {
                    this.A04.A03(this);
                }
            }
        }
        A00(f, 0);
    }

    public final void A00(float f, int i) {
        C4S7 c4s7;
        C5TA c5ta = this.A00;
        if (c5ta != null) {
            c5ta.A02(f, i);
        }
        WeakReference weakReference = this.A01;
        if (weakReference != null && (c4s7 = (C4S7) weakReference.get()) != null) {
            c4s7.A00 = AbstractC167007dF.A1M(Float.compare(f, 0.0f));
        }
    }

    public final void A01(int i) {
        AbstractC24321Hb.A00(this.A05).A00(false);
        A00(0.0f, i);
        this.A04.A03(this);
    }

    public final void A02(int i) {
        AbstractC24321Hb.A00(this.A05).A00(true);
        A00(1.0f, i);
        this.A04.A04(this);
    }

    public C44218JgN(Context context, UserSession userSession, C44217JgM c44217JgM, C5TA c5ta) {
        AudioManager audioManager;
        this.A05 = userSession;
        this.A06 = c44217JgM;
        this.A00 = c5ta;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService instanceof AudioManager) {
            audioManager = (AudioManager) systemService;
        } else {
            audioManager = null;
        }
        this.A03 = audioManager;
        this.A04 = new C41101vI(audioManager, userSession);
    }
}
