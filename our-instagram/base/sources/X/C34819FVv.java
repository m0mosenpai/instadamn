package X;

import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FVv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34819FVv {
    public static C32197ECs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32197ECs c32197ECs = new C32197ECs();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("login_nonce".equals(A0s)) {
                    c32197ECs.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("device_based_login_enabled".equals(A0s)) {
                    c32197ECs.A02 = c16l.A0d();
                } else if ("feta_linked_profiles_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            OneTapLinkedProfileInfoImpl parseFromJson = AbstractC33720Ev8.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32197ECs.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32197ECs, A0s);
                }
                c16l.A0z();
            }
            return c32197ECs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
