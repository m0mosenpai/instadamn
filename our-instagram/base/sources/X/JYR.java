package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class JYR implements InterfaceC60442pS, C6C3 {
    public static final String __redex_internal_original_name = "NotesVideoPlayer";
    public C5TA A00;
    public InterfaceC16660sJ A01;
    public InterfaceC16620sF A02;
    public final String A03;
    public final Context A04;
    public final UserSession A05;

    public JYR(Context context, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        this.A04 = context;
        this.A05 = userSession;
        this.A03 = str;
    }

    public final void A01(C38321qM c38321qM, InterfaceC74623Ww interfaceC74623Ww) {
        C14360o3.A0B(interfaceC74623Ww, 1);
        if (this.A00 == null) {
            Context context = this.A04;
            UserSession userSession = this.A05;
            C5TA c5ta = new C5TA(context, userSession, new C30O(userSession, this, null, false), this, this.A03);
            this.A00 = c5ta;
            c5ta.A01();
        }
        C5TA c5ta2 = this.A00;
        if (c5ta2 != null) {
            c5ta2.A08(interfaceC74623Ww, c38321qM.A2H(), new C4S7(c38321qM, 0), c38321qM.A0M, this.A03, 0.0f, -1, 0, true, true);
        }
    }

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        C5TA c5ta = this.A00;
        if (c5ta != null) {
            c5ta.A0A(str);
        }
        this.A00 = null;
    }

    @Override // X.C6C3
    public final /* synthetic */ void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void Dza(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c4s7);
        }
    }

    @Override // X.C6C3
    public final /* synthetic */ void E0M(int i, int i2) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
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
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        C14360o3.A0B(c4s7, 0);
        InterfaceC16620sF interfaceC16620sF = this.A02;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(c4s7, str);
        }
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    public static void A00(JYR jyr, String str, String str2) {
        String A0R = AnonymousClass001.A0R(str, str2);
        C14360o3.A0B(A0R, 0);
        C5TA c5ta = jyr.A00;
        if (c5ta != null) {
            c5ta.A09(A0R);
        }
    }
}
