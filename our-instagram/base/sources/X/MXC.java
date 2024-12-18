package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MXC implements InterfaceC58145PqA {
    public final MXD A00;
    public final Runnable A01;
    public final ArrayList A02;
    public final /* synthetic */ MXA A03;

    public MXC(Context context, UserSession userSession, MXA mxa) {
        C14360o3.A0B(userSession, 3);
        this.A03 = mxa;
        this.A02 = AbstractC166987dD.A1E();
        this.A00 = new MXD(context, userSession);
        this.A01 = new MXE(this);
    }

    public final void A00(InterfaceC57934Pme interfaceC57934Pme) {
        Handler handler = this.A00.A02;
        Runnable runnable = this.A01;
        handler.removeCallbacks(runnable);
        ArrayList arrayList = this.A02;
        MSZ.A1P(interfaceC57934Pme, arrayList);
        while (arrayList.size() > 4) {
            ((InterfaceC57934Pme) arrayList.remove(0)).E3i();
        }
        handler.postDelayed(runnable, 10000L);
    }

    @Override // X.InterfaceC58145PqA
    public final void AMu(OJQ ojq, PhotoSession photoSession, String str) {
        MXD mxd = this.A00;
        Handler handler = mxd.A02;
        handler.post(new RunnableC56869PLo(mxd));
        handler.postDelayed(this.A01, 10000L);
        MXA mxa = this.A03;
        mxa.A0A.put(str, new P0A(mxa.A02, mxa.A03, photoSession.A05, this, this, mxd, MXA.A00(mxa, str, photoSession.A09), photoSession.A0D.getValue()));
    }

    @Override // X.InterfaceC58145PqA
    public final InterfaceC58165PqV ALt(String str, String str2) {
        MXD mxd = this.A00;
        Handler handler = mxd.A02;
        handler.post(new RunnableC56869PLo(mxd));
        handler.postDelayed(this.A01, 10000L);
        MXA mxa = this.A03;
        UserSession userSession = mxa.A03;
        if (str2 != null) {
            return new C56208OxH(userSession, this, mxd, MXA.A00(mxa, str2, null));
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58145PqA
    public final void AP6() {
        MXD mxd = this.A00;
        Handler handler = mxd.A02;
        handler.removeCallbacks(this.A01);
        handler.post(new RunnableC50712Ma9(mxd));
    }

    @Override // X.InterfaceC58145PqA
    public final void destroy() {
        Map map = this.A03.A0A;
        Iterator it = AbstractC31180DnO.A0n(map).iterator();
        while (it.hasNext()) {
            ((InterfaceC197218ns) it.next()).AP5();
        }
        map.clear();
        this.A02.clear();
    }
}
