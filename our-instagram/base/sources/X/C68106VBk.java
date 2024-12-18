package X;

import android.content.Context;
import android.media.AudioManager;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.VBk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68106VBk extends C30F implements AudioManager.OnAudioFocusChangeListener {
    public C138276Oi A00;
    public L56 A01;
    public C4QW A02;
    public final Context A05;
    public final C41101vI A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;
    public final C30P A09;
    public boolean A04 = false;
    public boolean A03 = false;

    public final void A00(boolean z) {
        String str;
        AbstractC79383gk.A02(null);
        C4QW c4qw = this.A02;
        if (c4qw != null && c4qw.getCurrentPositionMs() < c4qw.Azm()) {
            C4QW c4qw2 = this.A02;
            C3Q0 c3q0 = ((C4QT) c4qw2).A0M;
            if (c3q0 != C3Q0.PAUSED && c3q0 != C3Q0.IDLE && c3q0 != C3Q0.PREPARED) {
                if (z) {
                    str = MSV.A00(276);
                } else {
                    str = "fragment_paused";
                }
                this.A04 = z;
                c4qw2.E3d(str);
                C138276Oi c138276Oi = this.A00;
                if (c138276Oi != null) {
                    c138276Oi.A01("paused");
                }
                this.A06.A03(this);
            }
        }
    }

    public final void A01(boolean z) {
        L56 l56;
        C3Q0 c3q0;
        AbstractC79383gk.A02(null);
        C4QW c4qw = this.A02;
        if (c4qw != null && (l56 = this.A01) != null && (c3q0 = ((C4QT) c4qw).A0M) != C3Q0.PREPARING) {
            if (c3q0 == C3Q0.PLAYING) {
                if (!l56.A02 && c4qw.getCurrentPositionMs() >= c4qw.Azm()) {
                    C4QW c4qw2 = this.A02;
                    if (c4qw2 != null && this.A01 != null) {
                        this.A02.EMg(AbstractC13600mm.A03(0, 0, c4qw2.Azm()), true);
                    }
                    this.A03 = false;
                } else {
                    return;
                }
            }
            if (!z) {
                if (c3q0 != C3Q0.PREPARED) {
                    if (c3q0 == C3Q0.PAUSED && this.A04) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A02.E4T("resume", false);
            C138276Oi c138276Oi = this.A00;
            if (c138276Oi != null) {
                c138276Oi.A01("playing");
            }
            this.A06.A04(this);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        float f;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        return;
                    } else {
                        f = 1.0f;
                    }
                } else {
                    this.A06.A03(this);
                }
            }
            f = 0.0f;
        } else {
            f = 0.5f;
        }
        C4QW c4qw = this.A02;
        if (c4qw == null) {
            return;
        }
        c4qw.EhI(f, 0);
    }

    @Override // X.C30F, X.C30G
    public final void onStopVideo(String str, boolean z) {
        this.A01 = null;
        this.A00 = null;
    }

    @Override // X.C30F, X.C30G
    public final void onCompletion() {
        C138276Oi c138276Oi;
        L56 l56 = this.A01;
        if (l56 != null && !l56.A02 && (c138276Oi = this.A00) != null) {
            c138276Oi.A01("playback_complete");
        }
    }

    @Override // X.C30F, X.C30G
    public final void onCues(List list) {
        C86013sY c86013sY;
        C138276Oi c138276Oi = this.A00;
        if (c138276Oi != null && (c86013sY = c138276Oi.A00) != null) {
            AbstractC86533tR.A02(c86013sY, list, true);
        }
    }

    @Override // X.C30F, X.C30G
    public final void onPrepare(C4S7 c4s7) {
        C138276Oi c138276Oi = this.A00;
        if (c138276Oi != null) {
            c138276Oi.A01("attempt_to_play");
        }
    }

    @Override // X.C30F, X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
        L56 l56;
        C102884kP c102884kP;
        InterfaceC103384lE A0B;
        C4QW c4qw = this.A02;
        if (c4qw != null && (l56 = this.A01) != null) {
            if (!this.A03 && l56.A02 && c4qw.getCurrentPositionMs() >= c4qw.Azm()) {
                onCompletion();
                this.A03 = true;
            }
            C138276Oi c138276Oi = this.A00;
            if (c138276Oi != null && !this.A03 && (A0B = (c102884kP = c138276Oi.A04).A0B(54)) != null) {
                C6FX c6fx = new C6FX();
                c6fx.A01(Integer.valueOf(i));
                C6FG c6fg = c138276Oi.A03;
                c6fx.A02(c6fg);
                AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, A0B);
            }
        }
    }

    @Override // X.C30F, X.C30G
    public final void onSeeking(long j) {
        C138276Oi c138276Oi = this.A00;
        if (c138276Oi != null) {
            c138276Oi.A01("seeking");
        }
    }

    @Override // X.C30F, X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        C138276Oi c138276Oi = this.A00;
        if (c138276Oi != null) {
            c138276Oi.A01("error");
        }
    }

    @Override // X.C30F, X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
        C138276Oi c138276Oi = this.A00;
        if (c138276Oi != null) {
            c138276Oi.A01("prepared");
        }
    }

    @Override // X.C30F, X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        C138276Oi c138276Oi = this.A00;
        if (c138276Oi != null) {
            c138276Oi.A01("playing");
        }
    }

    public C68106VBk(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A07 = userSession;
        this.A05 = context;
        this.A08 = interfaceC60442pS;
        this.A09 = new C46086Kak(userSession, interfaceC60442pS);
        this.A06 = new C41101vI((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND), userSession);
    }
}
