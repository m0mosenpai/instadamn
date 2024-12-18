package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public final class J28 implements C6C3, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C39440HbS A00;
    public C5TA A01;
    public final Animation A02;
    public final C41101vI A03;
    public final UserSession A04;
    public final Context A05;
    public final AudioManager A06;
    public final Animation A07;
    public final InterfaceC11380iw A08;
    public final InterfaceC149606oD A09;

    public static void A00(J28 j28) {
        j28.A03(false, true);
    }

    public final void A02(C39440HbS c39440HbS, boolean z) {
        this.A00 = c39440HbS;
        C38321qM c38321qM = c39440HbS.A00;
        if (this.A01 == null) {
            this.A01 = new C5TA(this.A05, this.A04, c39440HbS.A01, this, this.A08.getModuleName());
        }
        try {
            InterfaceC43456JHu interfaceC43456JHu = c39440HbS.A02;
            interfaceC43456JHu.CF1();
            C5TA c5ta = this.A01;
            if (c5ta != null) {
                String str = c38321qM.A0M;
                C75363a3 A2H = c38321qM.A2H();
                SimpleVideoLayout CF1 = interfaceC43456JHu.CF1();
                float f = 0.0f;
                if (c39440HbS.A03) {
                    f = 1.0f;
                }
                c5ta.A08(CF1, A2H, c39440HbS, str, this.A08.getModuleName(), f, -1, 0, z, false);
            }
        } catch (C09590eA unused) {
            C0w9.A03("MultipleClipsVideoPlayer", "failed to resume multiple players");
        }
    }

    public final void A03(boolean z, boolean z2) {
        IgImageView BGm;
        C5TA c5ta;
        if (z2 && (c5ta = this.A01) != null) {
            c5ta.A04(0, false);
        }
        C5TA c5ta2 = this.A01;
        if (c5ta2 != null && c5ta2.A06.getCurrentPositionMs() == 0) {
            C39440HbS c39440HbS = this.A00;
            if (c39440HbS != null && (BGm = c39440HbS.A02.BGm()) != null) {
                BGm.startAnimation(this.A07);
            }
        } else {
            C39440HbS c39440HbS2 = this.A00;
            if (c39440HbS2 != null) {
                c39440HbS2.A02.CMZ();
            }
        }
        C5TA c5ta3 = this.A01;
        if (c5ta3 != null) {
            c5ta3.A0B("resume", false);
        }
        Boolean bool = AbstractC24321Hb.A00(this.A04).A01;
        if (bool == null || bool.booleanValue()) {
            C39440HbS c39440HbS3 = this.A00;
            if ((c39440HbS3 != null && c39440HbS3.A03) || z) {
                this.A03.A04(this);
                C5TA c5ta4 = this.A01;
                if (c5ta4 != null) {
                    c5ta4.A02(1.0f, 0);
                }
            }
        }
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        this.A09.DzY((C38321qM) c4s7.A03);
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public final void A01() {
        C5TA c5ta = this.A01;
        if (c5ta != null) {
            c5ta.A0A("out_of_playback_range");
        }
        this.A01 = null;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AbstractC86593tX.A0g(new C42203Imp(this, this, new C57755Pji(this, 40)), i);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C5TA c5ta;
        C39440HbS c39440HbS = this.A00;
        if (c39440HbS == null || (c5ta = this.A01) == null || !c39440HbS.A03 || !c5ta.A0E()) {
            return false;
        }
        AudioManager audioManager = this.A06;
        C42202Imo c42202Imo = new C42202Imo(this, i, 0);
        C14360o3.A0B(audioManager, 2);
        return AbstractC41751IeQ.A05(audioManager, keyEvent, new J72(c42202Imo, 2), i);
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A09.onProgressUpdate(i, i2, z);
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
        IgImageView BGm;
        C39440HbS c39440HbS = this.A00;
        if (c39440HbS != null && (BGm = c39440HbS.A02.BGm()) != null) {
            BGm.clearAnimation();
        }
        C39440HbS c39440HbS2 = this.A00;
        if (c39440HbS2 != null) {
            c39440HbS2.A02.Ekw();
        }
        this.A03.A03(this);
    }

    public J28(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC149606oD interfaceC149606oD) {
        this.A05 = context;
        this.A04 = userSession;
        this.A08 = interfaceC11380iw;
        this.A09 = interfaceC149606oD;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        C14360o3.A07(loadAnimation);
        this.A07 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_in);
        C14360o3.A07(loadAnimation2);
        this.A02 = loadAnimation2;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, MSV.A00(7));
        AudioManager audioManager = (AudioManager) systemService;
        this.A06 = audioManager;
        this.A03 = new C41101vI(audioManager, userSession);
    }

    @Override // X.C6C3
    public final void onCompletion() {
        A00(this);
        this.A09.onCompletion();
    }
}
