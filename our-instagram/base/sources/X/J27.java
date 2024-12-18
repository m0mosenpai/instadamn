package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
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
public final class J27 implements C6C3, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public C5TA A00;
    public C39441HbT A01;
    public final Context A02;
    public final Animation A03;
    public final C41101vI A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final AudioManager A07;
    public final Animation A08;
    public final C41725Idw A09;

    public static final void A00(J27 j27, int i) {
        AbstractC24321Hb.A00(j27.A06).A00(false);
        C5TA c5ta = j27.A00;
        if (c5ta != null) {
            c5ta.A02(0.0f, i);
        }
        j27.A04.A03(j27);
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AbstractC41751IeQ.A04(new C29888DGc(this, 0), new DRR(this, 0), i);
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

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        C41725Idw c41725Idw = this.A09;
        int i = c41725Idw.A01 + 1;
        c41725Idw.A01 = i;
        if (i == c41725Idw.A08.size()) {
            C41725Idw.A02(c41725Idw);
        }
    }

    @Override // X.C6C3
    public final void onCompletion() {
        C41725Idw c41725Idw = this.A09;
        Handler handler = c41725Idw.A04;
        handler.removeCallbacks(c41725Idw.A06);
        handler.removeCallbacks(c41725Idw.A05);
        C41725Idw.A01(c41725Idw);
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C5TA c5ta;
        if (this.A01 == null || (c5ta = this.A00) == null || !c5ta.A0E()) {
            return false;
        }
        return AbstractC41751IeQ.A05(this.A07, keyEvent, new C57250PbY(this, i, 2), i);
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        C51737MtK c51737MtK;
        J26 j26 = this.A09.A02;
        if (j26 != null && (c51737MtK = j26.A05.A09) != null) {
            c51737MtK.A00 = j26.A01;
            c51737MtK.A01 = i;
        }
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
        C39441HbT c39441HbT = this.A01;
        if (c39441HbT != null) {
            IgImageView igImageView = c39441HbT.A03.A00;
            if (igImageView != null) {
                igImageView.clearAnimation();
            }
            C14360o3.A0F("imagePlaceholder");
            throw C00O.createAndThrow();
        }
        C39441HbT c39441HbT2 = this.A01;
        if (c39441HbT2 != null) {
            IgImageView igImageView2 = c39441HbT2.A03.A00;
            if (igImageView2 != null) {
                igImageView2.setVisibility(0);
            }
            C14360o3.A0F("imagePlaceholder");
            throw C00O.createAndThrow();
        }
        this.A04.A03(this);
    }

    public J27(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41725Idw c41725Idw) {
        this.A02 = context;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A09 = c41725Idw;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_out);
        C14360o3.A07(loadAnimation);
        this.A03 = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.cover_photo_fade_in);
        C14360o3.A07(loadAnimation2);
        this.A08 = loadAnimation2;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, MSV.A00(7));
        AudioManager audioManager = (AudioManager) systemService;
        this.A07 = audioManager;
        this.A04 = new C41101vI(audioManager, userSession);
    }
}
