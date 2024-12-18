package X;

import android.app.DatePickerDialog;
import android.content.Context;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CF9 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Number number;
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 0);
        Object obj = list.get(1);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        long A04 = ((C102884kP) obj).A04(35, 0L);
        Object obj2 = list.get(2);
        if (obj2 == null) {
            number = null;
        } else {
            number = (Number) obj2;
        }
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            Calendar calendar = Calendar.getInstance();
            if (number != null) {
                calendar.setTimeInMillis(number.longValue() * 1000);
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(context, new C28526CiK(c6fg, c6fq, A0t, calendar), calendar.get(1), calendar.get(2), calendar.get(5));
            datePickerDialog.getDatePicker().setMinDate(A04 * 1000);
            C0fJ.A00(datePickerDialog);
        }
        return null;
    }
}
