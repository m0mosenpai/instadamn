package X;

import com.instagram.api.schemas.GenAIMagicModNotificationType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class D15 implements Runnable {
    public final /* synthetic */ UserSession A00;

    public D15(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList A1E = AbstractC166987dD.A1E();
        UserSession userSession = this.A00;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A5a;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 472)) {
            if (!AbstractC167017dG.A1b(A00, A00.A5o, c0yrArr, 473) && AbstractC197508oL.A00(userSession).booleanValue()) {
                A1E.add(GenAIMagicModNotificationType.A04);
            }
            if (!AbstractC167017dG.A1b(A00, A00.A5p, c0yrArr, 474) && AbstractC197498oK.A00(userSession).booleanValue()) {
                A1E.add(GenAIMagicModNotificationType.A05);
            }
            if (!A1E.isEmpty()) {
                AbstractC166987dD.A1Z(new C57160PZe(A00, A1E, userSession, (InterfaceC23621Ds) null, 46), AbstractC24771Iv.A02(1879881788, 3));
            }
        }
    }
}
