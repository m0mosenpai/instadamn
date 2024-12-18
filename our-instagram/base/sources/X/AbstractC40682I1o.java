package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I1o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40682I1o {
    public static MWT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MUW muw = null;
            ArrayList arrayList = null;
            C51841Mvj c51841Mvj = null;
            String str = null;
            C38617GyK c38617GyK = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2187).equals(A0s)) {
                    muw = AbstractC40679I1l.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1009).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51707Msc parseFromJson = VVF.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC111324zv.A00(2660).equals(A0s)) {
                    c51841Mvj = AbstractC54043Nut.parseFromJson(c16l);
                } else if ("policy_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(3231).equals(A0s)) {
                    c38617GyK = AbstractC40686I1s.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new MWT(muw, arrayList, c51841Mvj, c38617GyK, str, 6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
