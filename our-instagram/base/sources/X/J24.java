package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* loaded from: classes7.dex */
public final class J24 implements C6C3 {
    public UserSession A00;
    public C5TA A01;
    public C43057J1x A02;
    public INO A03;
    public boolean A04;
    public final InterfaceC11380iw A05;
    public final C39439HbR A06;
    public final boolean A07;

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCompletion() {
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
    public final void onStopVideo(String str, boolean z) {
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public static final void A00(J24 j24) {
        C5TA c5ta;
        if (j24.A07) {
            Boolean bool = AbstractC24321Hb.A00(j24.A00).A01;
            if ((bool == null || bool.booleanValue()) && (c5ta = j24.A01) != null) {
                c5ta.A02(1.0f, 0);
            }
        }
    }

    public static final void A01(J24 j24, boolean z) {
        IgSimpleImageView igSimpleImageView;
        int i;
        C43057J1x c43057J1x = j24.A02;
        if (z) {
            c43057J1x.Ekw();
            if (C18U.A06(C06090Tz.A06, j24.A00, 36319450340859333L)) {
                igSimpleImageView = c43057J1x.A02;
                i = 8;
            } else {
                return;
            }
        } else {
            c43057J1x.CMZ();
            if (!C18U.A06(C06090Tz.A06, j24.A00, 36319450340859333L)) {
                return;
            }
            igSimpleImageView = c43057J1x.A02;
            i = 0;
        }
        igSimpleImageView.setVisibility(i);
    }

    public final void A02() {
        C5TA c5ta = this.A01;
        if (c5ta != null) {
            C3Q0 c3q0 = ((C4QT) c5ta.A06).A0M;
            C14360o3.A07(c3q0);
            if (!AbstractC167007dF.A1X(c3q0, C3Q0.PREPARED)) {
                A04(true);
                return;
            }
            c5ta.A04(0, false);
            c5ta.A0B("resume", true);
            A00(this);
            A01(this, false);
        }
    }

    public final void A03(float f) {
        if (AbstractC40922IAu.A00(this.A00).booleanValue()) {
            View view = this.A02.A00;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f);
            C14360o3.A07(ofFloat);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f);
            C14360o3.A07(ofFloat2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(150L);
            animatorSet.start();
        }
    }

    public final void A04(boolean z) {
        this.A04 = z;
        C5TA c5ta = this.A01;
        if (c5ta == null) {
            c5ta = new C5TA(AbstractC166997dE.A0L(this.A02.A07), this.A00, this.A06.A01, this, this.A05.getModuleName());
            this.A01 = c5ta;
        }
        C39439HbR c39439HbR = this.A06;
        C38321qM c38321qM = c39439HbR.A00;
        String str = c38321qM.A0M;
        C75363a3 CFR = c38321qM.CFR();
        SimpleVideoLayout simpleVideoLayout = this.A02.A07;
        float f = 0.0f;
        if (this.A07) {
            f = 1.0f;
        }
        c5ta.A08(simpleVideoLayout, CFR, c39439HbR, str, this.A05.getModuleName(), f, -1, 0, false, false);
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        if (this.A04) {
            A02();
            this.A04 = false;
        }
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        INO ino = this.A03;
        if (ino != null && i >= 5000) {
            J24 j24 = ino.A02;
            if (j24 != null) {
                C5TA c5ta = j24.A01;
                if (c5ta != null) {
                    c5ta.A09("user_paused_video");
                }
                A01(j24, true);
            }
            ino.A02();
        }
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        C0f5 AEp = C18950wb.A01.AEp(AbstractC31173DnH.A0q(this), 1001132810);
        AEp.ABW("error_message", str);
        AEp.report();
    }

    public J24(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C39439HbR c39439HbR, C43057J1x c43057J1x) {
        this.A00 = userSession;
        this.A02 = c43057J1x;
        this.A06 = c39439HbR;
        this.A05 = interfaceC11380iw;
        this.A07 = C18U.A06(C06090Tz.A06, userSession, 36319450341055944L);
    }
}
