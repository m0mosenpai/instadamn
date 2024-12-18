package X;

import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.Nqw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53806Nqw {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A02;
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                int A03 = c102884kP.A03(38, Integer.MIN_VALUE);
                if (A03 != Integer.MIN_VALUE) {
                    String A0F = c102884kP.A0F();
                    if (A0F != null) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                        C14360o3.A07(currencyInstance);
                        currencyInstance.setMaximumFractionDigits(0);
                        currencyInstance.setCurrency(Currency.getInstance(A0F));
                        String format = currencyInstance.format(Integer.valueOf(A03));
                        C14360o3.A07(format);
                        AbstractC25651Mw.A00(C6BQ.A0B(c6fq)).E4s(new C56002OtZ(new ExistingStandaloneFundraiserForFeedModel(A0G, A0E, format, null)));
                        return null;
                    }
                    throw AbstractC166987dD.A12("Requires goal currency");
                }
                throw AbstractC166987dD.A12("Requires goal amount");
            }
            throw AbstractC166987dD.A12("Requires beneficiary short name");
        }
        throw AbstractC166987dD.A12("Requires fundraiser id");
    }
}
