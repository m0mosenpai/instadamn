package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.PSx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57058PSx implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C35775FrD A01;
    public final /* synthetic */ UserSession A02;

    public RunnableC57058PSx(Context context, C35775FrD c35775FrD, UserSession userSession) {
        this.A01 = c35775FrD;
        this.A00 = context;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.E2V(this.A00, new WTZ(null, null, null, null, 1.0f, false, false, false, true), VRA.A00(this.A02, false));
    }
}
