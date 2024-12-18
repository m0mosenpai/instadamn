package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;

/* renamed from: X.PUj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC57096PUj implements InterfaceC16820sZ {
    public static C51996Myi A00(Context context, InterfaceC57907PmC interfaceC57907PmC, UserSession userSession, C54156Nws c54156Nws, String str, ExecutorService executorService, ExecutorService executorService2, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        Integer num;
        C1W6 c1w6 = (C1W6) interfaceC16820sZ.invoke();
        N0A n0a = new N0A(userSession);
        C55000OUz c55000OUz = C55000OUz.A00;
        C55740Op9 c55740Op9 = new C55740Op9(userSession, str);
        C14090nZ A0W = AbstractC43592JPx.A0W(C12L.A00, -18);
        if (c1w6 != null) {
            AbstractC167017dG.A1P(c54156Nws, c55000OUz);
            num = C05F.A01;
        } else {
            AbstractC167017dG.A1P(c54156Nws, c55000OUz);
            num = C05F.A00;
            c1w6 = null;
        }
        return new C51996Myi(context, interfaceC57907PmC, n0a, c55740Op9, c55000OUz, c54156Nws, c1w6, num, executorService2, executorService, A0W, z);
    }
}
