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
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public final class J25 implements C6C3, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C5TA A00;
    public C39439HbR A01;
    public final C41101vI A02;
    public final UserSession A03;
    public final Context A04;
    public final AudioManager A05;
    public final Animation A06;
    public final InterfaceC11380iw A07;
    public final InterfaceC147586kj A08;
    public final boolean A09;

    public final void A00(C39439HbR c39439HbR) {
        this.A01 = c39439HbR;
        C38321qM c38321qM = c39439HbR.A00;
        C5TA c5ta = this.A00;
        if (c5ta == null) {
            c5ta = new C5TA(this.A04, this.A03, c39439HbR.A01, this, this.A07.getModuleName());
            this.A00 = c5ta;
        }
        String str = c38321qM.A0M;
        c5ta.A08(c39439HbR.A02.CF1(), c38321qM.A2H(), c39439HbR, str, this.A07.getModuleName(), 1.0f, -1, 0, false, false);
    }

    public final void A01(boolean z) {
        C5TA c5ta;
        IgImageView BGm;
        C5TA c5ta2;
        if (z && (c5ta2 = this.A00) != null) {
            c5ta2.A04(0, false);
        }
        if (this.A09 && (c5ta = this.A00) != null && c5ta.A06.getCurrentPositionMs() == 0) {
            C39439HbR c39439HbR = this.A01;
            if (c39439HbR != null && (BGm = c39439HbR.A02.BGm()) != null) {
                BGm.startAnimation(this.A06);
            }
        } else {
            C39439HbR c39439HbR2 = this.A01;
            if (c39439HbR2 != null) {
                c39439HbR2.A02.CMZ();
            }
        }
        C5TA c5ta3 = this.A00;
        if (c5ta3 != null) {
            c5ta3.A0B("resume", false);
        }
        C5TA c5ta4 = this.A00;
        if (c5ta4 != null && c5ta4.A0D()) {
            this.A02.A04(this);
            C5TA c5ta5 = this.A00;
            if (c5ta5 != null) {
                c5ta5.A02(1.0f, 0);
            }
        }
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        this.A08.DzY((C38321qM) c4s7.A03);
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCompletion() {
        A01(true);
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

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AbstractC86593tX.A0g(new C42201Imn(this, this), i);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C5TA c5ta;
        if (this.A01 == null || (c5ta = this.A00) == null || !c5ta.A0E()) {
            return false;
        }
        AudioManager audioManager = this.A05;
        C42202Imo c42202Imo = new C42202Imo(this, i, 1);
        C14360o3.A0B(audioManager, 2);
        return AbstractC41751IeQ.A05(audioManager, keyEvent, new J72(c42202Imo, 2), i);
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        this.A08.onProgressUpdate(i, i2, z);
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
        IgImageView BGm;
        C39439HbR c39439HbR = this.A01;
        if (c39439HbR != null && (BGm = c39439HbR.A02.BGm()) != null) {
            BGm.clearAnimation();
        }
        C39439HbR c39439HbR2 = this.A01;
        if (c39439HbR2 != null) {
            c39439HbR2.A02.Ekw();
        }
        this.A02.A03(this);
    }

    public J25(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC147586kj interfaceC147586kj, boolean z) {
        this.A04 = context;
        this.A03 = userSession;
        this.A07 = interfaceC11380iw;
        this.A08 = interfaceC147586kj;
        this.A09 = z;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        C14360o3.A07(loadAnimation);
        this.A06 = loadAnimation;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, MSV.A00(7));
        AudioManager audioManager = (AudioManager) systemService;
        this.A05 = audioManager;
        this.A02 = new C41101vI(audioManager, userSession);
    }
}
