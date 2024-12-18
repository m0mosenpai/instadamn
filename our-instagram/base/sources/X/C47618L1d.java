package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.L1d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47618L1d {
    public final C006802i A00;
    public final java.util.Set A01;
    public final UserSession A02;

    public C47618L1d(C006802i c006802i, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = c006802i;
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A01 = newSetFromMap;
    }
}
