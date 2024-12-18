package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import com.facebook.R;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.CWv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28022CWv {
    public static long A00(Long l, String str) {
        Calendar calendar;
        if (str != null) {
            calendar = Calendar.getInstance(TimeZone.getTimeZone(str));
        } else {
            calendar = Calendar.getInstance();
        }
        calendar.setTimeInMillis(l.longValue() * 1000);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(i, i2, i3);
        return calendar2.getTimeInMillis();
    }

    public static void A01(Context context, C6FG c6fg, final C6FQ c6fq, final InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, final Calendar calendar, boolean z) {
        int i = R.style.CdsSpinnerTimePickerDialogLight;
        if (z) {
            i = R.style.CdsSpinnerTimePickerDialogDark;
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, i, new TimePickerDialog.OnTimeSetListener() { // from class: X.CiN
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i2, int i3) {
                Calendar calendar2 = calendar;
                C6FQ c6fq2 = c6fq;
                InterfaceC103384lE interfaceC103384lE3 = interfaceC103384lE;
                calendar2.set(11, i2);
                calendar2.set(12, i3);
                String valueOf = String.valueOf(AbstractC166987dD.A0L(calendar2.getTimeInMillis()));
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(valueOf);
                AbstractC25227BEk.A1M(c6fq2, A0s, interfaceC103384lE3);
            }
        }, calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(AbstractC166997dE.A0p(context, 2131975592));
        timePickerDialog.setButton(-1, AbstractC166997dE.A0p(context, 2131957541), timePickerDialog);
        if (interfaceC103384lE2 != null) {
            timePickerDialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC35296FhV(1, c6fg, c6fq, interfaceC103384lE2));
        }
        C0fJ.A00(timePickerDialog);
    }
}
