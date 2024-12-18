package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IS6 {
    public static HBB parseFromJson(C16L c16l) {
        EnumC127875qG enumC127875qG;
        C14360o3.A0B(c16l, 0);
        try {
            HBB hbb = new HBB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("rank_token".equals(A0q)) {
                    hbb.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("sections".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C130455uq parseFromJson = AbstractC130445up.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    hbb.A04 = arrayList;
                } else if (AbstractC37300Gc1.A1S(A0q)) {
                    hbb.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(45).equals(A0q)) {
                    hbb.A05 = c16l.A0d();
                } else if ("refinements".equals(A0q)) {
                    hbb.A00 = AbstractC40620Hze.parseFromJson(c16l);
                } else if ("topic_status".equals(A0q)) {
                    int A1D = c16l.A1D();
                    EnumC127875qG[] values = EnumC127875qG.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC127875qG = values[i];
                            if (enumC127875qG.A00 == A1D) {
                                break;
                            }
                            i++;
                        } else {
                            enumC127875qG = EnumC127875qG.A05;
                            break;
                        }
                    }
                    hbb.A01 = enumC127875qG;
                } else {
                    C55702hA.A01(c16l, hbb, A0q);
                }
                c16l.A0z();
            }
            return hbb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
