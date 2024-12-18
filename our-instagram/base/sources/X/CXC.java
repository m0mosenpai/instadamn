package X;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ComponentActivity;

/* loaded from: classes5.dex */
public abstract class CXC {
    public static final C27947CTg A01(C76223bS c76223bS, String str, InterfaceC16660sJ interfaceC16660sJ) {
        Object A00;
        Context A002 = AbstractC77363dM.A00(c76223bS);
        ComponentActivity componentActivity = (ComponentActivity) AbstractC77183d4.A00(c76223bS, new C57243PbR(A002, 30), new Object[]{A002});
        OJB ojb = (OJB) AbstractC77183d4.A00(c76223bS, new C57258Pbg(str, componentActivity, 1), new Object[]{str});
        C51762Yz A003 = AbstractC77073ct.A00(c76223bS, new C57243PbR(ojb, 32));
        AbstractC77313dH.A00(c76223bS, new C57254Pbc(0, ojb, A003), new Object[]{ojb});
        InterfaceC75873as interfaceC75873as = AbstractC75843ap.A00;
        C14360o3.A0B(interfaceC75873as, 1);
        C2XU c2xu = c76223bS.ArD().A07;
        if (c2xu == null) {
            A00 = interfaceC75873as.AwR();
        } else {
            A00 = c2xu.A00(interfaceC75873as);
        }
        C07X c07x = (C07X) A00;
        if (c07x == null) {
            c07x = componentActivity;
        }
        C07T lifecycle = c07x.getLifecycle();
        Object A004 = AbstractC77183d4.A00(c76223bS, new C57243PbR(ojb, 31), new Object[]{ojb});
        AbstractC77313dH.A00(c76223bS, new C57254Pbc(2, lifecycle, A004), new Object[]{lifecycle, A004});
        Object A005 = AbstractC77183d4.A00(c76223bS, D9r.A00, new Object[0]);
        C14360o3.A07(A005);
        String str2 = (String) A005;
        AbstractC77313dH.A00(c76223bS, new ME8(componentActivity, interfaceC16660sJ, ojb, str2, 0), new Object[]{str2, ojb});
        return new C27947CTg(ojb, ((CV1) A003.A03).A00);
    }

    public static final int A00(Activity activity, String str) {
        if (C02G.A00(activity, str) == 0) {
            return 0;
        }
        if (AbstractC114515Ew.A06(activity, str)) {
            return -1;
        }
        return -2;
    }
}
