package X;

import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IQq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41320IQq {
    public static HBC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HBC hbc = new HBC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IL5 parseFromJson = I22.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    hbc.A0B = arrayList;
                } else if ("container_module".equals(A0q)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                } else if ("client_gap_rules".equals(A0q)) {
                    C38011pl parseFromJson2 = AbstractC38761r8.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    hbc.A06 = parseFromJson2;
                } else if ("contextual_ads_category".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    hbc.A09 = A0m;
                } else if (Location.EXTRAS.equals(A0q)) {
                    ContextualAdResponseExtrasImpl parseFromJson3 = AbstractC39850Hly.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson3, 0);
                    hbc.A01 = parseFromJson3;
                } else if (AbstractC37300Gc1.A1W(A0q)) {
                    hbc.A0D = c16l.A0d();
                } else if ("multi_ads_info".equals(A0q)) {
                    hbc.A03 = AbstractC40094HqL.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1159).equals(A0q)) {
                    hbc.A02 = AbstractC39851Hlz.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, hbc, A0q);
                }
                c16l.A0z();
            }
            return hbc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
