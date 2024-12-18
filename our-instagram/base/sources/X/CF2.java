package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class CF2 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = (C6FG) c6fw.A00.get(0);
        if (c6fg != null) {
            InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
            AbstractC12990ll A0B = C6BQ.A0B(c6fq);
            C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            ArrayList A02 = C105894q0.A01.A02(c6fg.A00, (UserSession) A0B);
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03(A02, 0);
            AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
        }
        return null;
    }
}
