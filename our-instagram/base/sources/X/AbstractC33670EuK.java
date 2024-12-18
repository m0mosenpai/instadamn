package X;

import com.instagram.api.schemas.CachedExternalLoginUserImpl;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.EuK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33670EuK {
    public static CachedExternalLoginUserImpl parseFromJson(C16L c16l) {
        String A01;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A01 = AbstractC37309GcB.A01();
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("external_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("fullname".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(5120).equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (A01.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str3 != null || !(c16l instanceof C07950bF)) {
                if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A01, c16l, "CachedExternalLoginUserImpl");
                } else {
                    return new CachedExternalLoginUserImpl(simpleImageUrl, str, str2, str3, str4, str5);
                }
            } else {
                AbstractC166997dE.A1V("pk", c16l, "CachedExternalLoginUserImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
