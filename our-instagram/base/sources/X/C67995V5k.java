package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.V5k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67995V5k extends C2AG {
    public final /* synthetic */ C50622Uh A00;

    @Override // X.C11R
    public final int getRunnableId() {
        return 1039187132;
    }

    public C67995V5k(C50622Uh c50622Uh) {
        this.A00 = c50622Uh;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C50622Uh c50622Uh = this.A00;
        UserSession userSession = c50622Uh.A00;
        c50622Uh.A00(userSession, new C71603Jf(userSession));
        return null;
    }
}
