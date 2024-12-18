package X;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class OPP {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.O3e, java.lang.Object] */
    public static C54424O3e parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("whitelist_country_codes".equals(AbstractC166997dE.A0s(c16l))) {
                    HashSet hashSet = null;
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = AbstractC166987dD.A1H();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, hashSet);
                        }
                    }
                    obj.A00 = hashSet;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C54424O3e c54424O3e) {
        anonymousClass182.A0d();
        if (c54424O3e.A00 != null) {
            C16V.A03(anonymousClass182, "whitelist_country_codes");
            Iterator it = c54424O3e.A00.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
