package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Fcl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35074Fcl {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EDX, X.1um] */
    public static EDX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, c40791um, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, EDX edx, String str) {
        if ("verified".equals(str)) {
            edx.A04 = c16l.A0d();
            return;
        }
        if ("errors".equals(str)) {
            edx.A00 = AbstractC33653Eu3.A00(c16l);
            return;
        }
        ArrayList arrayList = null;
        if ("backup_codes".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = AbstractC166987dD.A1E();
                while (c16l.A1J() != C16R.A08) {
                    AbstractC167027dH.A0w(c16l, arrayList);
                }
            }
            edx.A03 = arrayList;
            return;
        }
        if (AbstractC31182DnR.A03().equals(str)) {
            edx.A01 = AbstractC167017dG.A0m(c16l);
        } else if ("trusted_device_nonce".equals(str)) {
            edx.A02 = AbstractC167017dG.A0m(c16l);
        } else {
            C55702hA.A01(c16l, edx, str);
        }
    }
}
