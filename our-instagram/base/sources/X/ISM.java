package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ISM {
    public static C38888HAk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38888HAk c38888HAk = new C38888HAk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("merchant_bag_infos".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IIP parseFromJson = I7W.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38888HAk.A02 = arrayList;
                } else if ("bags".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C41634IbP parseFromJson2 = I7Z.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38888HAk.A01 = arrayList;
                } else if ("user_errors".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C42859IxZ parseFromJson3 = I6R.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38888HAk.A03 = arrayList;
                } else if ("ig_funded_incentive_content".equals(A0s)) {
                    c38888HAk.A00 = AbstractC40723I3d.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c38888HAk, A0s);
                }
                c16l.A0z();
            }
            return c38888HAk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
