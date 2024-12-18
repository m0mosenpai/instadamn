package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.util.creation.ShaderBridge;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MYS implements InterfaceC58145PqA, InterfaceC58047PoY {
    public C55126Obn A00;
    public final /* synthetic */ MXA A01;

    public final synchronized C55126Obn A00() {
        return this.A00;
    }

    @Override // X.InterfaceC58145PqA
    public final InterfaceC58165PqV ALt(String str, String str2) {
        return null;
    }

    @Override // X.InterfaceC58145PqA
    public final void AMu(OJQ ojq, PhotoSession photoSession, String str) {
        MXA mxa = this.A01;
        P09 p09 = new P09(mxa.A02, ojq, mxa.A04.CE4(), photoSession.A05, this, this, MXA.A00(mxa, str, photoSession.A09), photoSession.A0D.getValue());
        mxa.A0A.put(str, p09);
        ShaderBridge.loadLibraries(new C56784PIb(p09));
    }

    @Override // X.InterfaceC58145PqA
    public final void AP6() {
    }

    @Override // X.InterfaceC58047PoY
    public final void DEF(Exception exc) {
        MXA mxa = this.A01;
        if (!mxa.A01) {
            mxa.A01 = true;
            C19280xC A00 = AbstractC31718DwN.A00(C05F.A0R);
            A00.A0C("error", AbstractC167017dG.A0n(exc, "Rendering error: ", AbstractC166987dD.A1C()));
            UserSession userSession = mxa.A03;
            AbstractC31173DnH.A1S(A00, userSession);
            mxa.A05.A0A(null, C05F.A1I);
            MX1.A01(userSession).A0B(false, exc.getMessage());
        }
    }

    @Override // X.InterfaceC58145PqA
    public final synchronized void destroy() {
        C55126Obn c55126Obn = this.A00;
        if (c55126Obn != null) {
            synchronized (c55126Obn.A04) {
                c55126Obn.A00 = true;
            }
            if (c55126Obn.A09 != null) {
                C55126Obn.A01(c55126Obn);
                C55126Obn.A00(c55126Obn);
            }
            this.A00 = null;
            MXA mxa = this.A01;
            Map map = mxa.A0A;
            mxa.A00 = new RunnableC56867PLm(AbstractC31180DnO.A0n(map));
            map.clear();
        }
    }

    public MYS(MXA mxa) {
        this.A01 = mxa;
    }

    @Override // X.InterfaceC58047PoY
    public final void DfN() {
        MXA mxa = this.A01;
        mxa.A01 = false;
        Runnable runnable = mxa.A00;
        if (runnable != null) {
            runnable.run();
            mxa.A00 = null;
        }
    }
}
