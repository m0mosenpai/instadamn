package X;

import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class W6U {
    public static final Map A02(ECPPaymentRequest eCPPaymentRequest, List list) {
        C14360o3.A0B(eCPPaymentRequest, 1);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            PriceInfo priceInfo = (PriceInfo) obj;
            String A0O = AnonymousClass001.A0O("ITEM_LIST", i);
            String str = priceInfo.A04;
            String str2 = priceInfo.A05;
            ItemDetails itemDetails = eCPPaymentRequest.A04.A09;
            CurrencyAmount currencyAmount = priceInfo.A00;
            String str3 = priceInfo.A03;
            AbstractC166997dE.A1R(A0O, C63406Sjd.A04(new PuxEntityItem(currencyAmount, VG3.A0d, itemDetails, null, str, str2, AbstractC31180DnO.A0k(priceInfo.A02), str3)), A0q);
            i = i2;
        }
        return AbstractC06930Yk.A08(A0q);
    }

    public static final C63406Sjd A00(C63406Sjd c63406Sjd, Integer num) {
        TransactionInfo transactionInfo = (TransactionInfo) c63406Sjd.A01;
        Integer num2 = null;
        if (transactionInfo != null) {
            ArrayList<PriceInfo> arrayList = transactionInfo.A08;
            num2 = transactionInfo.A04;
            if (arrayList != null) {
                return C63406Sjd.A04(new PuxPriceTableItem(VG3.A0i, num2, num, arrayList));
            }
        }
        return C63406Sjd.A02(c63406Sjd, new PuxPriceTableItem(VG3.A0i, num2, num, new ArrayList()));
    }

    public static final List A01(String str, Map map) {
        PuxEntityItem puxEntityItem;
        String str2;
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object obj = ((C63406Sjd) it.next()).A01;
            if ((obj instanceof PuxEntityItem) && (puxEntityItem = (PuxEntityItem) obj) != null && (str2 = puxEntityItem.A03) != null) {
                arrayList.add(str2);
            }
        }
        ArrayList A0U = AbstractC001800i.A0U(arrayList);
        if (A0U.isEmpty() && str != null) {
            A0U.add(str);
        }
        return AbstractC001800i.A0a(A0U);
    }
}
