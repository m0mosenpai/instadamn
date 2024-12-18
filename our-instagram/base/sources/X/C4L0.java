package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.4L0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4L0 {
    public static final C28821aL A00(UserSession userSession) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C36151mZ c36151mZ : C28821aL.A05) {
            linkedHashMap.put(c36151mZ.A01, c36151mZ.A00.AXR(userSession));
        }
        return (C28821aL) userSession.A01(C28821aL.class, new C9FA(16, userSession, linkedHashMap));
    }
}
