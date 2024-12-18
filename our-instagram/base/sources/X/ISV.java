package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ISV {
    public static HBA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HBA hba = new HBA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_item".equals(A0s)) {
                    hba.A01 = AbstractC111134zU.parseFromJson(c16l);
                } else if ("merchant".equals(A0s)) {
                    hba.A02 = AbstractC31171DnF.A0S(c16l, false);
                } else {
                    ArrayList arrayList = null;
                    if ("sectional_items".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                IJD parseFromJson = I7C.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        hba.A04 = arrayList;
                    } else if ("metadata".equals(A0s)) {
                        hba.A00 = AbstractC40802I6e.parseFromJson(c16l);
                    } else if (AbstractC37300Gc1.A1W(A0s)) {
                        c16l.A0d();
                    } else if (AbstractC37300Gc1.A1S(A0s)) {
                        hba.A03 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C55702hA.A01(c16l, hba, A0s);
                    }
                }
                c16l.A0z();
            }
            return hba;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
