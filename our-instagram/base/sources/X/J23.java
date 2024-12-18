package X;

import android.content.Context;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* loaded from: classes7.dex */
public final class J23 implements C6C3 {
    public Integer A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final SimpleVideoLayout A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final C41001IDw A08;

    public J23(Context context, UserSession userSession, SimpleVideoLayout simpleVideoLayout, C41001IDw c41001IDw, int i) {
        C14360o3.A0B(simpleVideoLayout, 3);
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = simpleVideoLayout;
        this.A02 = i;
        this.A08 = c41001IDw;
        this.A06 = AbstractC09440dt.A01(new C57515Pfp(this, 25));
        this.A07 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57515Pfp(this, 26));
        this.A00 = C05F.A00;
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        if (this.A00 != C05F.A0N) {
            Integer num = C05F.A0C;
            this.A00 = num;
            C38321qM c38321qM = (C38321qM) c4s7.A03;
            if (c38321qM != null && c38321qM.getId() != null) {
                InterfaceC09390do interfaceC09390do = this.A06;
                interfaceC09390do.getValue();
                if (this.A01 && this.A00 == num) {
                    InterfaceC09390do interfaceC09390do2 = this.A07;
                    ((C5TA) interfaceC09390do2.getValue()).A02(1.0f, 0);
                    ((C5TA) interfaceC09390do2.getValue()).A04(0, false);
                    ((C5TA) interfaceC09390do2.getValue()).A0B("recycler view scroll", false);
                    interfaceC09390do.getValue();
                    interfaceC09390do.getValue();
                    UserSession userSession = this.A04;
                    IEJ iej = (IEJ) userSession.A01(IEJ.class, new MHO(userSession, 39));
                    ((UserFlowLoggerImpl) iej.A01.getValue()).flowEndSuccess(iej.A00);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
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
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
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

    public final void A00() {
        ((C5TA) this.A07.getValue()).A0A("recycler view recycled");
        this.A00 = C05F.A0N;
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
        if (this.A00 != C05F.A0N) {
            this.A00 = C05F.A0C;
            ((C5TA) this.A07.getValue()).A02(1.0f, 0);
        }
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
        this.A00 = C05F.A01;
        this.A08.A00.A0B.setVisibility(0);
    }
}
