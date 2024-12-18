package X;

import com.fbpay.w3c.CardDetails;
import java.util.Calendar;

/* renamed from: X.Si5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63348Si5 {
    public static final CardDetails A01(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = null;
        Integer num = null;
        Integer num2 = null;
        String str8 = null;
        String str9 = null;
        if (str != null) {
            str6 = AbstractC58322PtE.A0r(str);
            if (str6.length() > 4) {
                str8 = AbstractC43592JPx.A0z(str, str.length() - 4);
            }
            str7 = EnumC61219RhJ.A06.A02(str6).toString();
        } else {
            str6 = null;
        }
        if (str3 != null && str3.length() != 0) {
            C09530e4 A03 = AbstractC63230Sfi.A03(str3);
            if (A03 != null) {
                num = (Integer) A03.A00;
                num2 = (Integer) A03.A01;
            }
        } else if (str4 != null && str4.length() != 0 && str5 != null && str5.length() != 0) {
            num = AbstractC58319PtB.A0m(str4);
            num2 = AbstractC63230Sfi.A00(AbstractC58319PtB.A0m(str5));
        }
        if (str2 != null) {
            str9 = AbstractC25228BEl.A1A(str2);
        }
        return new CardDetails(null, null, null, num, num2, str7, null, str6, null, str9, str8);
    }

    public static final boolean A02(CardDetails cardDetails) {
        String str;
        String str2 = cardDetails.A07;
        if (str2 == null || !SSH.A01(str2) || (str = cardDetails.A05) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A04(CardDetails cardDetails) {
        Integer num = cardDetails.A03;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = cardDetails.A04;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Calendar calendar = Calendar.getInstance();
                calendar.set(2, intValue - 1);
                calendar.set(1, intValue2);
                return !calendar.before(Calendar.getInstance());
            }
        }
        return false;
    }

    public static final CardDetails A00(QIj qIj) {
        return A01(qIj.A01, qIj.A02, qIj.A03, qIj.A04, qIj.A05);
    }

    public static final boolean A05(CardDetails cardDetails) {
        int intValue;
        Integer num = cardDetails.A03;
        if (num == null || 1 > (intValue = num.intValue()) || intValue >= 13) {
            return false;
        }
        return true;
    }

    public static final boolean A03(CardDetails cardDetails) {
        Integer num;
        String str;
        int length;
        if (A02(cardDetails) && A05(cardDetails) && (num = cardDetails.A04) != null && num.intValue() >= 2000 && (str = cardDetails.A09) != null && (((length = str.length()) == 3 || length == 4) && A04(cardDetails))) {
            return true;
        }
        return false;
    }
}
