package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* renamed from: X.JsH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44796JsH extends C3OO implements C6C3 {
    public final TextView A00;
    public final CircularImageView A01;
    public final SimpleVideoLayout A02;
    public final C5TA A03;
    public final Context A04;
    public final UserSession A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44796JsH(Context context, View view, UserSession userSession) {
        super(view);
        AbstractC167027dH.A13(view, context, userSession);
        this.A04 = context;
        this.A05 = userSession;
        this.A02 = (SimpleVideoLayout) view.findViewById(R.id.clips_video_layout);
        this.A01 = (CircularImageView) view.findViewById(R.id.profile_image);
        this.A00 = AbstractC166987dD.A0e(view, R.id.username);
        this.A03 = new C5TA(context, userSession, null, this, "gallery_peek_video_player");
    }

    @Override // X.C6C3
    public final /* synthetic */ void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void Dza(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onCompletion() {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onStopVideo(String str, boolean z) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }
}
