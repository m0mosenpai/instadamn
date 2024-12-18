package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61852rm {
    public static final C61862rn A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C61862rn) userSession.A01(C61862rn.class, new C9EX(userSession, 48));
    }

    public static final synchronized void A01(C61852rm c61852rm, long j) {
        synchronized (c61852rm) {
            HashMap hashMap = C61862rn.A0A;
            Long valueOf = Long.valueOf(j);
            hashMap.remove(valueOf);
            C61862rn.A0B.remove(valueOf);
            C61862rn.A0C.remove(valueOf);
        }
    }
}
