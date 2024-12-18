package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CbK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28173CbK {
    public static final long A02 = TimeUnit.MINUTES.toMillis(1);
    public final long A00 = A02;
    public final C62792tI A01;

    public /* synthetic */ C28173CbK(UserSession userSession) {
        this.A01 = C62792tI.A00(C1BX.A03.A01(new C681034y(userSession, "merlin_impression")));
    }
}
