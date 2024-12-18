package X;

import java.io.IOException;

/* renamed from: X.EvG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33728EvG {
    public static E80 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("contract_sent_date".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("media_igid".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "payout_per_delivery_amount");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("contract_sent_date", c16l, "PresetDealPayoutDetailsImpl");
            } else if (l != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("payout_per_delivery_amount", c16l, "PresetDealPayoutDetailsImpl");
                } else {
                    return new E80(num.intValue(), l.longValue(), num2.intValue());
                }
            } else {
                AbstractC166997dE.A1V("media_igid", c16l, "PresetDealPayoutDetailsImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
