package X;

import com.instagram.model.payments.CurrencyAmountInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I2O {
    public static Map A00(CurrencyAmountInfo currencyAmountInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (currencyAmountInfo.getAmount() != null) {
            A1I.put("amount", currencyAmountInfo.getAmount());
        }
        if (currencyAmountInfo.getAmountWithOffset() != null) {
            A1I.put("amount_with_offset", currencyAmountInfo.getAmountWithOffset());
        }
        if (currencyAmountInfo.getCurrency() != null) {
            A1I.put("currency", currencyAmountInfo.getCurrency());
        }
        if (currencyAmountInfo.BYa() != null) {
            A1I.put("offset", currencyAmountInfo.BYa());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
