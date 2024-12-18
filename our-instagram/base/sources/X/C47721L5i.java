package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.L5i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47721L5i {
    public final KZA A00(UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, str);
        LEP lep = (LEP) userSession.A01(LEP.class, new MHO(userSession, 33));
        LruCache lruCache = lep.A00;
        KZA kza = (KZA) lruCache.get(str);
        if (kza == null) {
            KZA kza2 = new KZA(lep.A01, str);
            lruCache.put(str, kza2);
            return kza2;
        }
        return kza;
    }
}
