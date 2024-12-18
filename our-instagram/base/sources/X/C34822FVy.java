package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FVy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34822FVy {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.EBi, X.1um, X.1ul] */
    public static C32161EBi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC31171DnF.A1a(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (AbstractC111324zv.A00(3193).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C132765yz parseFromJson = AbstractC33708Euw.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
