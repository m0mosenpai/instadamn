package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1A implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;

    public B1A(Context context, UserSession userSession, long j) {
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            UserSession userSession = this.A02;
            C4QF c4qf = (C4QF) C4QD.A00(userSession).A02.getValue();
            C73543Rf A00 = AbstractC73533Re.A00(this.A01, userSession);
            if (C4QG.A00(A00.A00(), c4qf, this.A00)) {
                ((C73693Rv) A00.A04.getValue()).A00(null);
                c4qf.A05(AbstractC111324zv.A00(4817), A00.A00().now());
            }
        } catch (Exception e) {
            AbstractC167017dG.A1J(C18950wb.A01, AbstractC111324zv.A00(1611), e, 1011495295);
        }
        return C0eB.A00;
    }
}
