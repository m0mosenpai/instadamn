package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ESU extends C1P1 {
    public final /* synthetic */ UserSession A00;

    public ESU(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2079658625);
        ECE ece = (ECE) obj;
        int A0N = AbstractC167017dG.A0N(ece, -1297899602);
        Iterator it = ece.A00.iterator();
        while (it.hasNext()) {
            AbstractC31172DnG.A0i(it).AEH(this.A00);
        }
        C0f9.A0A(-43346857, A0N);
        C0f9.A0A(1728554370, A03);
    }
}
