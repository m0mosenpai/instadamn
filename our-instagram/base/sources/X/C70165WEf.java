package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.widget.listcell.ListCell;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.WEf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70165WEf {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r1 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A01(X.XJm r3) {
        /*
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.String r0 = r3.C2e()
            if (r0 == 0) goto L9f
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 != 0) goto L9f
            java.lang.String r0 = r3.AZn()
            if (r0 == 0) goto L9f
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 != 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r3.C2e()
            r2.append(r0)
            java.lang.String r1 = ", "
            r2.append(r1)
            java.lang.String r0 = r3.C2f()
            if (r0 == 0) goto L43
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = r3.C2f()
            r2.append(r0)
            r2.append(r1)
        L43:
            java.lang.String r0 = r3.AZn()
            r2.append(r0)
            java.lang.String r0 = r3.AZp()
            if (r0 == 0) goto L56
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 == 0) goto L67
        L56:
            java.lang.String r0 = r3.CIk()
            if (r0 == 0) goto L62
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 == 0) goto L67
        L62:
            java.lang.String r0 = r2.toString()
            return r0
        L67:
            java.lang.String r0 = ","
            r2.append(r0)
            java.lang.String r0 = r3.AZp()
            if (r0 == 0) goto L79
            boolean r1 = X.AbstractC001900j.A0T(r0)
            r0 = 0
            if (r1 == 0) goto L7a
        L79:
            r0 = 1
        L7a:
            java.lang.String r1 = " "
            if (r0 != 0) goto L88
            r2.append(r1)
            java.lang.String r0 = r3.AZp()
            r2.append(r0)
        L88:
            java.lang.String r0 = r3.CIk()
            if (r0 == 0) goto L62
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 != 0) goto L62
            r2.append(r1)
            java.lang.String r0 = r3.CIk()
            r2.append(r0)
            goto L62
        L9f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70165WEf.A01(X.XJm):java.lang.String");
    }

    public static final void A02(BaseSelectionCheckoutItem baseSelectionCheckoutItem, ListCell listCell, String str, String str2) {
        Integer num;
        Context context;
        int i;
        UEL uel;
        int intValue = baseSelectionCheckoutItem.Bsx().intValue();
        if (intValue != 3) {
            if (intValue != 2) {
                num = C05F.A01;
                context = listCell.getContext();
                i = 2131961411;
            } else {
                Integer num2 = C05F.A02;
                C14360o3.A0B(num2, 1);
                uel = new UEL(listCell, num2, null, str, str2, false, true);
                AbstractC010103p.A0B(listCell, uel);
            }
        } else {
            num = C05F.A02;
            context = listCell.getContext();
            i = 2131961549;
        }
        String string = context.getString(i);
        boolean A1Y = AbstractC25229BEm.A1Y(num);
        uel = new UEL(listCell, num, string, str, str2, A1Y, A1Y);
        AbstractC010103p.A0B(listCell, uel);
    }

    public final SpannableStringBuilder A03(Context context, Date date, Date date2, Locale locale, boolean z) {
        String format;
        int length;
        if (date == null && date2 == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", locale);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 1);
        Date date3 = date;
        if (date == null) {
            date3 = date2;
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC65702TsY.A0h(AnonymousClass001.A0C(context.getString(2131961381), ' '), locale, new Object[0], 0));
        int length2 = spannableStringBuilder.length();
        C14360o3.A0A(calendar);
        if ((calendar.get(1) == calendar3.get(1) && calendar.get(2) == calendar3.get(2) && calendar.get(5) == calendar3.get(5)) || calendar.after(calendar3)) {
            spannableStringBuilder.append((CharSequence) AbstractC65702TsY.A0h(AbstractC31177DnL.A0b(context, simpleDateFormat.format(date3), 2131961379), locale, new Object[0], 0));
            length = spannableStringBuilder.length();
            if (calendar3.after(calendar)) {
                String A0a = AbstractC31177DnL.A0a(context, calendar3.get(11) - calendar.get(11), 2131961380);
                C14360o3.A07(A0a);
                spannableStringBuilder.append((CharSequence) AnonymousClass001.A0R(", ", AbstractC65702TsY.A0h(A0a, locale, new Object[0], 0)));
                length++;
            }
        } else {
            if (calendar3.after(calendar) && calendar2.get(1) == calendar3.get(1) && calendar2.get(2) == calendar3.get(2) && calendar2.get(5) == calendar3.get(5)) {
                format = String.format(locale, AbstractC31177DnL.A0b(context, simpleDateFormat.format(date3), 2131961378), Arrays.copyOf(new Object[0], 0));
            } else if (date != null && date2 != null) {
                format = String.format("%1s - %2s", MSX.A1b(simpleDateFormat.format(date), simpleDateFormat.format(date2), 2));
            } else {
                format = simpleDateFormat.format(date3);
                spannableStringBuilder.append((CharSequence) format);
                length = spannableStringBuilder.length();
            }
            C14360o3.A07(format);
            spannableStringBuilder.append((CharSequence) format);
            length = spannableStringBuilder.length();
        }
        if (!z) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), length2, length, 33);
        return spannableStringBuilder;
    }

    public static final String A00(Context context, CurrencyAmount currencyAmount) {
        String A00;
        if (currencyAmount != null) {
            String str = currencyAmount.A01;
            if (str.length() > 0 && AnonymousClass010.A0n(str) != null && Float.parseFloat(str) != 0.0f && (A00 = W43.A00.A00(currencyAmount.A00, new BigDecimal(str))) != null) {
                return A00;
            }
        }
        return AbstractC166997dE.A0p(context, 2131961538);
    }

    public final String A04(Context context, CurrencyAmount currencyAmount, String str, Date date, Date date2, Locale locale) {
        int i;
        String str2;
        Object[] objArr;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", locale);
        if (date != null) {
            if (date2 != null) {
                i = 2131961392;
                objArr = new Object[]{simpleDateFormat.format(date), simpleDateFormat.format(date2), A00(context, currencyAmount)};
                String string = context.getString(i, objArr);
                C14360o3.A0A(string);
                return string;
            }
        } else if (date2 == null) {
            return AbstractC65702TsY.A0h("%1s • %2s", locale, new Object[]{str, A00(context, currencyAmount)}, 2);
        }
        i = 2131961393;
        if ((date == null || (str2 = simpleDateFormat.format(date)) == null) && (date2 == null || (str2 = simpleDateFormat.format(date2)) == null)) {
            str2 = "";
        }
        objArr = new Object[]{str2, A00(context, currencyAmount)};
        String string2 = context.getString(i, objArr);
        C14360o3.A0A(string2);
        return string2;
    }
}
