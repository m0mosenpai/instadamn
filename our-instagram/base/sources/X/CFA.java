package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class CFA {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Date parse;
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 0);
        C102884kP c102884kP = (C102884kP) list.get(1);
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, AbstractC43591JPw.A00(1));
        C6FG c6fg = (C6FG) A00;
        if (c102884kP != null) {
            str = c102884kP.A0E();
        } else {
            str = null;
        }
        Calendar calendar = Calendar.getInstance();
        Context context = c6fg.A00;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && (parse = new SimpleDateFormat("HH:mm", Locale.US).parse(str)) != null) {
                    calendar.setTime(parse);
                }
            } catch (ParseException e) {
                AbstractC25241Le.A03("got wrong time format from server", e);
            }
        }
        C0fJ.A00(new TimePickerDialog(context, new C28530CiO(c6fg, c6fq, A0t, calendar, 0), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context)));
        return null;
    }
}
