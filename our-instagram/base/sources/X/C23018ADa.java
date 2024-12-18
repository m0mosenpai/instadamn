package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ADa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23018ADa {
    public static C214339eX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C214339eX c214339eX = new C214339eX();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("modes".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C88X parseFromJson = ADL.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c214339eX.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c214339eX, A0s);
                }
                c16l.A0z();
            }
            return c214339eX;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
