package X;

import android.content.Context;
import com.instagram.autoplay.models.AutoplayPlaybackState;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U0s extends MZA {
    public AutoplayPlaybackState A00;
    public final C65868TvV A01;
    public final C66110Tzo A02;
    public final UserSession A03;

    @Override // X.MZA
    public final int A07(MZB mzb) {
        if (!C18U.A06(C06090Tz.A05, this.A03, 36320743126475631L) || ((C4S7) mzb).A05) {
            return mzb.A02;
        }
        return 0;
    }

    @Override // X.MZA, X.C6C3
    public final void Dzb(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        A00(AutoplayPlaybackState.PLAYING, (C38321qM) c4s7.A03, "onVideoPreparedAndStarted");
    }

    @Override // X.MZA, X.C6C3
    public final void onStopVideo(String str, boolean z) {
        C14360o3.A0B(str, 0);
        A00(AutoplayPlaybackState.PAUSED, A08(), "onStopVideo");
        super.onStopVideo(str, z);
    }

    @Override // X.MZA, X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        C14360o3.A0B(c4s7, 0);
        A00(AutoplayPlaybackState.FAILURE, (C38321qM) c4s7.A03, "onVideoPlayerError");
        super.onVideoPlayerError(c4s7, str);
    }

    @Override // X.MZA, X.C6C3
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        A00(AutoplayPlaybackState.PLAYING, (C38321qM) c4s7.A03, "onVideoStartedPlaying");
        super.onVideoStartedPlaying(c4s7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0s(Context context, C65868TvV c65868TvV, C66110Tzo c66110Tzo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        super(context, userSession, interfaceC60442pS, str, 0L);
        C14360o3.A0B(c66110Tzo, 2);
        this.A01 = c65868TvV;
        this.A02 = c66110Tzo;
        this.A03 = userSession;
    }

    private final void A00(AutoplayPlaybackState autoplayPlaybackState, C38321qM c38321qM, String str) {
        AutoplayPlaybackState autoplayPlaybackState2 = this.A00;
        if (autoplayPlaybackState2 != autoplayPlaybackState) {
            if ((autoplayPlaybackState2 == AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE && autoplayPlaybackState == AutoplayPlaybackState.PLAYING) || c38321qM == null) {
                return;
            }
            C14360o3.A0B(AnonymousClass001.A0g(str, ": ", c38321qM.getId()), 0);
            C65868TvV c65868TvV = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("onPlaybackStateChanged: ");
            sb.append(c38321qM.getId());
            C14360o3.A0B(AbstractC167017dG.A0n(autoplayPlaybackState, ", state ", sb), 0);
            c65868TvV.A03.A02(autoplayPlaybackState, c38321qM);
            ((C44213JgH) c65868TvV.A04.getValue()).A00();
            this.A00 = autoplayPlaybackState;
        }
    }

    @Override // X.MZA, X.C6C3
    public final void onProgressStateChanged(boolean z) {
        if (z && !A0H()) {
            A00(AutoplayPlaybackState.BUFFERING, A08(), "onProgressStateChanged (buffering)");
        }
    }

    @Override // X.MZA
    public final void A0D(String str, boolean z) {
        A00(AutoplayPlaybackState.PAUSED, A08(), "stopVideo");
        super.A0D(str, z);
    }

    @Override // X.MZA, X.C6C3
    public final void onLoop(int i) {
        A00(AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE, A08(), "onLoop");
    }

    @Override // X.MZA, X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        if (A0H()) {
            AutoplayPlaybackState autoplayPlaybackState = this.A00;
            AutoplayPlaybackState autoplayPlaybackState2 = AutoplayPlaybackState.PLAYING;
            if (autoplayPlaybackState != autoplayPlaybackState2) {
                A00(autoplayPlaybackState2, A08(), "onProgressUpdate");
            }
        }
        super.onProgressUpdate(i, i2, z);
    }
}
