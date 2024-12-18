package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HnL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39930HnL {
    public static QIy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            Boolean bool = null;
            C39561sd c39561sd = null;
            String str2 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("follow_requests_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H3N parseFromJson = AbstractC39929HnK.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("global_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_horizontal_scroll_unit".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("item_client_gap_rules".equals(A0s)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "view_state_item_type");
                }
                c16l.A0z();
            }
            return new QIy(arrayList, num, bool, c39561sd, num2, str, str2, 3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
