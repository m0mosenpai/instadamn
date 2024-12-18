package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* loaded from: classes7.dex */
public final class HD3 extends AbstractC59962oe implements C30G, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "VideoPreviewFragment";
    public SimpleVideoLayout A00;
    public C4QW A01;
    public String A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_arrow_back_24;
        A0B.A05 = 2131953583;
        A0B.A0G = ViewOnClickListenerC42032Ik1.A00(this, 3);
        interfaceC56362iU.A8u(new C3LY(A0B));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "bugreporter_videopreview";
    }

    @Override // X.C30G
    public final void onCompletion() {
    }

    @Override // X.C30G
    public final void onCues(List list) {
    }

    @Override // X.C30G
    public final void onDrawnToSurface() {
    }

    @Override // X.C30G
    public final void onLoop(int i) {
    }

    @Override // X.C30G
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.C30G
    public final void onSeeking(long j) {
    }

    @Override // X.C30G
    public final void onStopVideo(String str, boolean z) {
    }

    @Override // X.C30G
    public final void onStopped(C4S7 c4s7, int i) {
    }

    @Override // X.C30G
    public final void onSurfaceTextureDestroyed() {
    }

    @Override // X.C30G
    public final void onSurfaceTextureUpdated(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-661304432);
        super.onCreate(bundle);
        String string = requireArguments().getString(MSV.A00(877));
        if (string != null) {
            this.A02 = string;
            C0f9.A09(9224873, A02);
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("VideoPreviewFragment.videoPath is null but is required");
            C0f9.A09(-1003230597, A02);
            throw A14;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(332362262);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bugreporter_video_preview, viewGroup, false);
        this.A00 = (SimpleVideoLayout) inflate.requireViewById(R.id.video_container);
        C0f9.A09(2142944338, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2090261523);
        super.onPause();
        C4QW c4qw = this.A01;
        if (c4qw != null) {
            c4qw.EE4("fragment_paused");
        }
        C0f9.A09(721319642, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1927092650);
        super.onResume();
        SimpleVideoLayout simpleVideoLayout = this.A00;
        if (simpleVideoLayout != null) {
            C4QT A00 = C4QS.A00(simpleVideoLayout.getContext(), AbstractC166987dD.A0r(this.A03), null, this, "bugreporter_videopreview");
            String str = this.A02;
            if (str != null) {
                C4S7 c4s7 = new C4S7(str, 0);
                A00.Ed6(EnumC95184Qe.A04);
                A00.A0X = true;
                A00.EYb(true);
                SimpleVideoLayout simpleVideoLayout2 = this.A00;
                if (simpleVideoLayout2 != null) {
                    C4QP c4qp = new C4QP(false, false, false, false);
                    String str2 = this.A02;
                    if (str2 != null) {
                        A00.E5v(new C4SC(simpleVideoLayout2, c4qp, null, c4s7, str2, "bugreporter_videopreview", 0.0f, -1, 0, true));
                        A00.E4T("user request preview video", false);
                        this.A01 = A00;
                        C0f9.A09(-124808088, A02);
                        return;
                    }
                }
            }
            C14360o3.A0F("videoPath");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("videoContainer");
        throw C00O.createAndThrow();
    }
}
