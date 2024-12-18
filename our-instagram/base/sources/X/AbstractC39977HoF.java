package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HoF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39977HoF {
    public static C38246Grp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "browse_info_dicts")) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38245Gro parseFromJson = AbstractC39783Hkt.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("browse_info_dicts", c16l, "IGConsiderAndBrowseOptions");
                throw C00O.createAndThrow();
            }
            return new C38246Grp(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
