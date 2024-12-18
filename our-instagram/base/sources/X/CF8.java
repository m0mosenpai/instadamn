package X;

import android.app.DatePickerDialog;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class CF8 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Date parse;
        Date parse2;
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 0);
        Object obj = list.get(1);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) obj;
        Object A03 = c6fw.A03(2);
        C14360o3.A0C(A03, AbstractC43591JPw.A00(1));
        C6FG c6fg = (C6FG) A03;
        String A0E = c102884kP.A0E();
        String A0G = c102884kP.A0G();
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(c6fg.A00, new C28525CiJ(c6fg, c6fq, A0t, calendar), calendar.get(1), calendar.get(2), calendar.get(5));
        try {
            if (!TextUtils.isEmpty(A0E) && (parse2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(A0E)) != null) {
                datePickerDialog.getDatePicker().setMinDate(parse2.getTime());
            }
            if (!TextUtils.isEmpty(A0G) && (parse = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(A0G)) != null) {
                datePickerDialog.getDatePicker().setMaxDate(parse.getTime());
            }
        } catch (ParseException e) {
            AbstractC25241Le.A03("got wrong date format from server", e);
        }
        C0fJ.A00(datePickerDialog);
        return null;
    }
}
