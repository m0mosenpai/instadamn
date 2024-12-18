package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.399, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass399 {
    public final HashMap A00 = new HashMap();

    public final C79743hP A00(UserSession userSession, C75113Zb c75113Zb, String str, boolean z) {
        HashMap hashMap = this.A00;
        C79743hP c79743hP = (C79743hP) hashMap.get(str);
        if (c79743hP == null) {
            c79743hP = new C79743hP(userSession, c75113Zb, str, z);
        }
        hashMap.put(str, c79743hP);
        return c79743hP;
    }
}
