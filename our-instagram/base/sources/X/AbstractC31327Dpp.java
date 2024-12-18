package X;

import java.io.IOException;

/* renamed from: X.Dpp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31327Dpp {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FGG] */
    public static FGG parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("biz_thread_throttling_state".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumC81843l3 enumC81843l3 = (EnumC81843l3) EnumC81843l3.A01.get(A1P);
                    if (enumC81843l3 == null) {
                        enumC81843l3 = EnumC81843l3.A06;
                    }
                    obj.A00 = enumC81843l3;
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
}
