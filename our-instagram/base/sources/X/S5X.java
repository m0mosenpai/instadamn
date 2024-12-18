package X;

import android.content.Context;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class S5X {
    public static String A00(Context context, List list, Locale locale) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    Object obj = list.get(0);
                    String string = context.getString(2131963680);
                    TIM tim = new TIM(list.size() * 5);
                    Formatter formatter = new Formatter(tim, locale);
                    for (int i = 1; i < size; i++) {
                        formatter.format(string, obj, list.get(i));
                        List list2 = tim.A02;
                        obj = new TIR(list2, tim.A01, list2.size(), tim.A00);
                        tim.A01 = list2.size();
                        tim.A00 = 0;
                    }
                    return obj.toString();
                }
                return AbstractC31174DnI.A0t(context, list.get(0), list.get(1), 2131963680);
            }
            return AbstractC25226BEj.A1I(list, 0);
        }
        throw AbstractC58318PtA.A0Y();
    }
}
