package X;

import com.instagram.model.payments.CurrencyAmountInfoImpl;
import java.io.IOException;

/* renamed from: X.IQz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41329IQz {
    public static CurrencyAmountInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("amount".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("amount_with_offset".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("currency".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "offset");
                }
                c16l.A0z();
            }
            return new CurrencyAmountInfoImpl(num, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, CurrencyAmountInfoImpl currencyAmountInfoImpl) {
        anonymousClass182.A0d();
        String str = currencyAmountInfoImpl.A01;
        if (str != null) {
            anonymousClass182.A0S("amount", str);
        }
        String str2 = currencyAmountInfoImpl.A02;
        if (str2 != null) {
            anonymousClass182.A0S("amount_with_offset", str2);
        }
        String str3 = currencyAmountInfoImpl.A03;
        if (str3 != null) {
            anonymousClass182.A0S("currency", str3);
        }
        Integer num = currencyAmountInfoImpl.A00;
        if (num != null) {
            anonymousClass182.A0Q("offset", num.intValue());
        }
        anonymousClass182.A0a();
    }
}
