package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class KM3 extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C27741Wc A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM3(UserSession userSession, C27741Wc c27741Wc) {
        super(340);
        this.A01 = c27741Wc;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator A16 = AbstractC166997dE.A16(this.A01.A01);
        while (A16.hasNext()) {
            C1X9 c1x9 = (C1X9) A16.next();
            UserSession userSession = this.A00;
            InterfaceC71793Kc A00 = c1x9.A00(userSession);
            A00.ASk();
            A00.EEx(userSession);
        }
    }
}
