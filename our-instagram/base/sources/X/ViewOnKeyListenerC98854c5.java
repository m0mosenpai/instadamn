package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4c5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC98854c5 extends C30F implements AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public ViewOnKeyListenerC67971V4l A00;
    public C68105VBj A01;
    public C4QW A02;
    public Runnable A03;
    public boolean A04;
    public final Context A05;
    public final Animation A06;
    public final C41101vI A07;
    public final UserSession A08;
    public final AudioManager A09;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C4QW c4qw;
        float f;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        return;
                    }
                    c4qw = this.A02;
                    if (c4qw != null) {
                        f = 1.0f;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    A02();
                    return;
                }
            } else {
                c4qw = this.A02;
                if (c4qw != null) {
                    f = 0.0f;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        } else {
            c4qw = this.A02;
            if (c4qw != null) {
                f = 0.5f;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c4qw.EhI(f, 0);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C68105VBj c68105VBj;
        C14360o3.A0B(keyEvent, 2);
        C4QW c4qw = this.A02;
        if (c4qw == null || (c68105VBj = this.A01) == null || ((C4QT) c4qw).A0M != C3Q0.PLAYING || keyEvent.getAction() != 0 || !this.A04 || (i != 24 && i != 25)) {
            return false;
        }
        if (!((C4S7) c68105VBj).A00 && c68105VBj.A00.A02) {
            A00(this);
        } else {
            int i2 = -1;
            if (i == 24) {
                i2 = 1;
            }
            AudioManager audioManager = this.A09;
            if (audioManager != null) {
                audioManager.adjustStreamVolume(3, i2, 1);
                boolean z = false;
                if (audioManager.getStreamVolume(3) == 0) {
                    z = true;
                }
                AbstractC24321Hb.A00(this.A08).A00(!z);
                if (z) {
                    ((C4S7) c68105VBj).A00 = false;
                    return true;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return true;
    }

    public static final void A00(ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5) {
        AbstractC24321Hb.A00(viewOnKeyListenerC98854c5.A08).A00(true);
        C68105VBj c68105VBj = viewOnKeyListenerC98854c5.A01;
        if (c68105VBj != null) {
            ((C4S7) c68105VBj).A00 = true;
        }
        A01(viewOnKeyListenerC98854c5, true);
    }

    public static final void A01(ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5, boolean z) {
        C4QW c4qw = viewOnKeyListenerC98854c5.A02;
        if (c4qw != null) {
            if (z) {
                c4qw.EhI(1.0f, 0);
                viewOnKeyListenerC98854c5.A07.A04(viewOnKeyListenerC98854c5);
                return;
            } else {
                c4qw.EhI(0.0f, 0);
                viewOnKeyListenerC98854c5.A07.A03(viewOnKeyListenerC98854c5);
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02() {
        AbstractC24321Hb.A00(this.A08).A00(false);
        C68105VBj c68105VBj = this.A01;
        if (c68105VBj != null) {
            ((C4S7) c68105VBj).A00 = false;
        }
        A01(this, false);
    }

    public ViewOnKeyListenerC98854c5(Context context, UserSession userSession) {
        this.A05 = context;
        this.A08 = userSession;
        this.A06 = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A09 = audioManager;
        this.A07 = new C41101vI(audioManager, userSession);
    }
}
