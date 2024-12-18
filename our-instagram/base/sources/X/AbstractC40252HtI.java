package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HtI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40252HtI {
    public static C38641qv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Long l = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("num_of_stories".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("snapshot_date".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("snapshot_date_string".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("snapshot_disclaimer".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("snapshot_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("stories".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("total_accounts_reached".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("total_impressions".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else {
                    num4 = AbstractC31178DnM.A0V(c16l, num4, A0s, "total_interactions");
                }
                c16l.A0z();
            }
            return new C38641qv(num, num2, num3, num4, l, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
