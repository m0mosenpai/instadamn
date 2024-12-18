package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WG3 {
    public static final List A00 = AbstractC16960so.A1Q(1, 2, 3, 4, 5, 6, 7, 10, 15, 30);
    public static final List A01 = AbstractC16960so.A1Q(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 20, 22, 25, 30);
    public static final List A02;

    public static final String A00(Context context, int i) {
        int i2 = 2131970648;
        if (i == 1) {
            i2 = 2131970650;
        }
        String A0a = AbstractC31177DnL.A0a(context, i, i2);
        C14360o3.A07(A0a);
        return A0a;
    }

    public static final String A01(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC25227BEk.A0w(str, 0, str.length() - 1);
    }

    public static final String A02(Currency currency, int i, int i2) {
        C14360o3.A0B(currency, 2);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(C1Q2.A02());
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(0);
        String format = currencyInstance.format(i / i2);
        C14360o3.A07(format);
        return format;
    }

    static {
        Integer[] numArr = new Integer[30];
        System.arraycopy(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{28, 29, 30}, 0, numArr, 27, 3);
        A02 = AbstractC16960so.A1Q(numArr);
    }

    public static final List A03(Context context) {
        List list = A02;
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int A0B = AbstractC167007dF.A0B(it);
            C70179WFe c70179WFe = VZI.A00;
            String A0a = AbstractC31177DnL.A0a(context, A0B, C70179WFe.A01(context).A00);
            C14360o3.A07(A0a);
            A0q.add(A0a);
        }
        List unmodifiableList = Collections.unmodifiableList(A0q);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static final List A05(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00(context, AbstractC167007dF.A0B(it)));
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static final List A04(Context context, PromoteData promoteData) {
        String A0b;
        boolean A1Y = AbstractC25229BEm.A1Y(promoteData);
        ArrayList arrayList = new ArrayList();
        for (Number number : promoteData.A1n) {
            if (promoteData.A0D()) {
                int intValue = number.intValue();
                int i = promoteData.A06;
                Currency currency = promoteData.A1j;
                C14360o3.A06(currency);
                String A0b2 = AbstractC31177DnL.A0b(context, A02(currency, intValue * 2, i), 2131970439);
                int i2 = promoteData.A06;
                Currency currency2 = promoteData.A1j;
                C14360o3.A06(currency2);
                double d = intValue;
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(C1Q2.A02());
                currencyInstance.setCurrency(currency2);
                currencyInstance.setMaximumFractionDigits(A1Y ? 1 : 0);
                String format = currencyInstance.format(d / i2);
                C14360o3.A07(format);
                A0b = AbstractC13670mt.A06("%s (%s)", A0b2, AbstractC31177DnL.A0b(context, format, 2131953991));
            } else {
                C14360o3.A0A(number);
                int intValue2 = number.intValue();
                int i3 = promoteData.A06;
                Currency currency3 = promoteData.A1j;
                C14360o3.A06(currency3);
                A0b = AbstractC31177DnL.A0b(context, A02(currency3, intValue2, i3), 2131970439);
            }
            arrayList.add(A0b);
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }
}
