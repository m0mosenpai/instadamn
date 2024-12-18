package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.util.List;

/* renamed from: X.KaD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46056KaD extends SimpleVideoLayout implements InterfaceC60602pj, C30G {
    public final UserSession A00;
    public final TextureView A01;
    public final InterfaceC09390do A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46056KaD(Context context, UserSession userSession) {
        super(context, null, 0);
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
        this.A01 = new ScalingTextureView(context);
        this.A02 = C1XM.A00(new ME1(23, context, this));
    }

    public final void A03(MQ8 mq8, boolean z) {
        C14360o3.A0B(mq8, 0);
        if (mq8.AkZ()) {
            if (!z) {
                String CFA = getAnnotationVideoPlayer().CFA();
                C44201Jg4 c44201Jg4 = (C44201Jg4) mq8;
                String str = c44201Jg4.A0E.A03;
                if (str == null) {
                    str = c44201Jg4.A0F;
                }
                if (C14360o3.A0K(CFA, str)) {
                    A00();
                    return;
                }
            }
            A02();
            getAnnotationVideoPlayer().E5v(new C4SC(this, new C4QP(false, false, false, false), ((C44201Jg4) mq8).A0E.A00, new C4S7(mq8, 0), null, "map_annotation_player", 0.0f, 0, 0, true));
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.C30G
    public final void onCompletion() {
    }

    @Override // android.view.View, X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
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

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.C30G
    public final void onSeeking(long j) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
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
        MQ8 mq8;
        C14360o3.A0B(c4s7, 0);
        if (A01() && (mq8 = (MQ8) c4s7.A03) != null) {
            Bitmap bitmap = this.A01.getBitmap();
            C44201Jg4 c44201Jg4 = (C44201Jg4) mq8;
            if (bitmap != null) {
                if (c44201Jg4.A0E.A05) {
                    bitmap = BlurUtil.blur(bitmap, 0.25f, 20);
                }
                c44201Jg4.A04 = bitmap;
                C44201Jg4.A01(c44201Jg4);
            }
        }
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        MQ8 mq8 = (MQ8) c4s7.A03;
        if (mq8 != null) {
            mq8.invalidateSelf();
        }
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final C4QW getAnnotationVideoPlayer() {
        return (C4QW) AbstractC166987dD.A17(this.A02);
    }

    private final void A00() {
        if (getAnnotationVideoPlayer().CFA() != null && ((C4QT) getAnnotationVideoPlayer()).A0K != null && !getAnnotationVideoPlayer().isPlaying()) {
            getAnnotationVideoPlayer().E4T("play_by_user", false);
        }
    }

    private final boolean A01() {
        if (getAnnotationVideoPlayer().CFA() != null && ((C4QT) getAnnotationVideoPlayer()).A0K != null && getAnnotationVideoPlayer().isPlaying()) {
            return true;
        }
        return false;
    }

    public final void A02() {
        if (A01()) {
            getAnnotationVideoPlayer().Eol("pause_by_user", true);
        }
    }

    @Override // X.AbstractC43201yn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1308798986);
        super.onAttachedToWindow();
        TextureView textureView = this.A01;
        AbstractC43593JPy.A1B(textureView, -1);
        addView(textureView);
        C0f9.A0D(-1431310250, A06);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        if (A01()) {
            A02();
            getAnnotationVideoPlayer().EE4("release_by_user");
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        if (A01()) {
            A02();
            getAnnotationVideoPlayer().EE4("release_by_user");
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        if (A01()) {
            getAnnotationVideoPlayer().E3d("pause_by_user");
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        A00();
    }

    @Override // X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        A02();
        A00();
    }
}
