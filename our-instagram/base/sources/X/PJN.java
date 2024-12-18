package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* loaded from: classes9.dex */
public final class PJN implements C6C3 {
    public Integer A00;
    public final SimpleVideoLayout A01;
    public final InterfaceC09390do A02;
    public final O4E A03;

    public PJN(Context context, UserSession userSession, O4E o4e, SimpleVideoLayout simpleVideoLayout) {
        C14360o3.A0B(simpleVideoLayout, 3);
        this.A01 = simpleVideoLayout;
        this.A03 = o4e;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29900DGo(47, context, this, userSession));
        this.A00 = C05F.A00;
    }

    @Override // X.C6C3
    public final /* synthetic */ void Dz8(C4S7 c4s7) {
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

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        if (this.A00 != C05F.A0N) {
            this.A00 = C05F.A0C;
        }
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
        this.A00 = C05F.A01;
        C51361MmM c51361MmM = this.A03.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        c51361MmM.A09.setVisibility(0);
    }
}
