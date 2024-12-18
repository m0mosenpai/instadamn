package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EZG extends C2AG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.C11R
    public final int getRunnableId() {
        return 260;
    }

    public EZG(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        AbstractC167017dG.A1N(context, userSession);
        return C35269Fh4.A01(context, null, userSession, null, null);
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C35117FeJ.A00(this.A00, this.A01, null);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C35117FeJ.A00(this.A00, this.A01, AbstractC25228BEl.A1C(obj));
    }
}
