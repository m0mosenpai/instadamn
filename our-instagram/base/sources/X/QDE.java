package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class QDE extends SZU {
    public final C62898SWe A00;
    public final C60892Rb6 A01;
    public final Executor A02;
    public final UserSession A03;

    public QDE(C62898SWe c62898SWe, R7U r7u, C60892Rb6 c60892Rb6, UserSession userSession, Executor executor) {
        super(r7u);
        this.A03 = userSession;
        this.A02 = executor;
        this.A00 = c62898SWe;
        this.A01 = c60892Rb6;
    }
}
