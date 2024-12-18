package X;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.music.external.pulseanimation.PulseAnimation;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149226nW implements InterfaceC149236nX {
    public ViewGroup A00;
    public C41181vS A01;
    public PulseAnimation A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final UserSession A06;
    public final InterfaceC150336ph A07;
    public final InterfaceC678133v A08;
    public final InterfaceC09390do A09;
    public final C677733r A0A;
    public final ReelViewerFragment A0B;

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        if (!c41181vS.equals(this.A01) || c141596ac.A0m) {
            A01();
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djr(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djs(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dju(int i, int i2) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Djv() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz7() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    public static final void A00(C149226nW c149226nW, boolean z) {
        C41181vS c41181vS;
        InterfaceC09390do interfaceC09390do = c149226nW.A09;
        AudioManager audioManager = (AudioManager) interfaceC09390do.getValue();
        C14360o3.A0B(audioManager, 0);
        int streamVolume = audioManager.getStreamVolume(3);
        AudioManager audioManager2 = (AudioManager) interfaceC09390do.getValue();
        C14360o3.A0B(audioManager2, 0);
        int streamMaxVolume = audioManager2.getStreamMaxVolume(3);
        if (z && (c41181vS = c149226nW.A01) != null) {
            c149226nW.A0B.A0R(c41181vS, streamVolume, streamMaxVolume);
        }
        boolean A00 = C4AJ.A00(c149226nW.A06, Integer.valueOf(streamVolume), c149226nW.A04, false);
        InterfaceC678133v interfaceC678133v = c149226nW.A08;
        float f = 0.001f;
        if (A00) {
            f = 1.0f;
        }
        interfaceC678133v.EhH(f);
    }

    public final void A01() {
        if (this.A01 != null) {
            if (this.A03) {
                this.A03 = false;
                PulseAnimation pulseAnimation = this.A02;
                if (pulseAnimation != null) {
                    pulseAnimation.A02();
                }
                this.A08.pause();
            }
            PulseAnimation pulseAnimation2 = this.A02;
            if (pulseAnimation2 != null) {
                ViewGroup viewGroup = this.A00;
                if (viewGroup != null) {
                    viewGroup.removeView(pulseAnimation2);
                }
                this.A02 = null;
            }
            InterfaceC678133v interfaceC678133v = this.A08;
            interfaceC678133v.AHi();
            interfaceC678133v.release();
            this.A01 = null;
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ int Bs6() {
        return 0;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void DXv(String str) {
        if (this.A01 != null && this.A03) {
            this.A03 = false;
            PulseAnimation pulseAnimation = this.A02;
            if (pulseAnimation != null) {
                pulseAnimation.A02();
            }
            this.A08.pause();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DhB() {
        if (this.A01 != null && !this.A03) {
            this.A03 = true;
            PulseAnimation pulseAnimation = this.A02;
            if (pulseAnimation != null) {
                pulseAnimation.A01();
            }
            this.A08.E4S();
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean DsD() {
        return false;
    }

    public C149226nW(Context context, UserSession userSession, ReelViewerFragment reelViewerFragment) {
        this.A06 = userSession;
        this.A0B = reelViewerFragment;
        this.A05 = context;
        C677733r c677733r = new C677733r(context, userSession);
        this.A0A = c677733r;
        this.A09 = AbstractC09440dt.A01(new C9E5(this, 26));
        this.A08 = AbstractC677833s.A01(context, userSession, null, c677733r, "ExternalShareAudioManagerImpl", false, AbstractC677833s.A02(userSession), false, false);
        this.A07 = new InterfaceC150336ph() { // from class: X.6nY
            @Override // X.InterfaceC150336ph
            public final void onCurrentTrackPlayTimeUpdated(int i) {
            }

            @Override // X.InterfaceC150336ph
            public final void onCurrentTrackPlaybackStarted() {
            }

            @Override // X.InterfaceC150336ph
            public final void onCurrentTrackPrepared(int i) {
            }

            @Override // X.InterfaceC150336ph
            public final void onCurrentTrackSeekComplete() {
            }

            @Override // X.InterfaceC150336ph
            public final void onCurrentTrackStartedPlaying() {
            }

            @Override // X.InterfaceC150336ph
            public final void onCurrentTrackStopped() {
            }

            @Override // X.InterfaceC150336ph
            public final void onCurrentTrackCompleted() {
                InterfaceC678133v interfaceC678133v = C149226nW.this.A08;
                interfaceC678133v.seekTo(0);
                interfaceC678133v.E4S();
            }
        };
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        A01();
    }
}
