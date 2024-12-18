package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34785FUk {
    public static C32209EDi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32209EDi c32209EDi = new C32209EDi();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("categories".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            E9N parseFromJson = F51.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32209EDi.A01 = arrayList;
                } else if ("suggested_users".equals(A0s)) {
                    c32209EDi.A00 = C34783FUi.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c32209EDi, A0s);
                }
                c16l.A0z();
            }
            return c32209EDi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
