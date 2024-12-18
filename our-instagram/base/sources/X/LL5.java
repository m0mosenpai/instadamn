package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes8.dex */
public abstract class LL5 {
    public static final SimpleDateFormat A00;
    public static final SimpleDateFormat A01;

    public static final String A01(C09530e4 c09530e4) {
        StringBuilder A11;
        C14360o3.A0B(c09530e4, 0);
        Date date = new Date(AbstractC166987dD.A0N(c09530e4.A00));
        Date date2 = new Date(AbstractC166987dD.A0N(c09530e4.A01));
        SimpleDateFormat simpleDateFormat = A00;
        String format = simpleDateFormat.format(date);
        String format2 = simpleDateFormat.format(date2);
        SimpleDateFormat simpleDateFormat2 = A01;
        String format3 = simpleDateFormat2.format(date);
        String format4 = simpleDateFormat2.format(date2);
        if (C14360o3.A0K(format, format2)) {
            boolean A0K = C14360o3.A0K(format3, format4);
            A11 = AbstractC166997dE.A11(format);
            A11.append(' ');
            if (A0K) {
                A11.append(format3);
            } else {
                A11.append(format3);
                A11.append(" - ");
                A11.append(format4);
            }
        } else {
            A11 = AbstractC166997dE.A11(format3);
            A11.append(' ');
            A11.append(format);
            A11.append(" - ");
            A11.append(format4);
            A11.append(' ');
            A11.append(format2);
        }
        return A11.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x026d, code lost:
    
        if (X.AbstractC166997dE.A1Z(r5.A03, true) == false) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0031. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r12, X.EnumC222729sD r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LL5.A02(android.content.Context, X.9sD, java.util.List):void");
    }

    static {
        Locale locale = C217113x.A06;
        A01 = new SimpleDateFormat("dd", locale);
        A00 = new SimpleDateFormat("MMM", locale);
    }

    public static final String A00(List list) {
        return AbstractC25226BEj.A1I(list, new Random().nextInt(list.size()));
    }

    public static void A03(Context context, Object obj, Object obj2, AbstractCollection abstractCollection, int i) {
        String string = context.getString(i, obj, obj2);
        C14360o3.A07(string);
        abstractCollection.add(string);
    }

    public static final boolean A04(C45089JxJ c45089JxJ, int i, int i2) {
        Calendar A002 = AbstractC195628l3.A00();
        A002.set(2, i);
        A002.set(5, i2);
        A002.set(11, 0);
        A002.set(12, 0);
        A002.set(13, 0);
        A002.set(14, 0);
        long timeInMillis = A002.getTimeInMillis();
        long j = 86400000 + timeInMillis;
        C09530e4 c09530e4 = c45089JxJ.A08;
        if (AbstractC166987dD.A0N(c09530e4.A00) < timeInMillis || AbstractC166987dD.A0N(c09530e4.A01) > j) {
            return false;
        }
        return true;
    }
}
