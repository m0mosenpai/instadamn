package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.PQe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56988PQe implements Runnable {
    public final /* synthetic */ C52255NAv A00;
    public final /* synthetic */ Reel A01;

    public RunnableC56988PQe(C52255NAv c52255NAv, Reel reel) {
        this.A00 = c52255NAv;
        this.A01 = reel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52255NAv c52255NAv = this.A00;
        Reel reel = this.A01;
        InterfaceC72953Ov interfaceC72953Ov = (InterfaceC72953Ov) c52255NAv.A09.A00(reel);
        if (interfaceC72953Ov != null) {
            c52255NAv.A08.A0F();
            Context context = interfaceC72953Ov.BlH().getContext();
            UserSession userSession = c52255NAv.A06;
            MSW.A1X(userSession);
            C140626Xq A03 = C1OU.A03(context, userSession, reel, new C6X7(new P8O(1, c52255NAv, interfaceC72953Ov, reel), interfaceC72953Ov.Blo(), reel.A1P), AbstractC82003lM.A00(userSession), c52255NAv.A05.getModuleName(), -1);
            A03.A04();
            c52255NAv.A02 = A03;
            interfaceC72953Ov.EcK(A03);
            c52255NAv.A07.EDY(A03);
        }
    }
}
