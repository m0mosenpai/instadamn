package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "prefer to use DirectThreadStorePlugin for dependency injection")
/* renamed from: X.1aE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28761aE {
    public static final List A00 = new ArrayList();

    public static final C2DS A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C2DS) userSession.A01(C2DS.class, new C9E1(userSession, 8));
    }
}
