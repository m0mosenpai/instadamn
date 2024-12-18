package X;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import com.facebook.R;
import java.util.Calendar;

/* renamed from: X.CiK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28526CiK implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ Calendar A03;

    public C28526CiK(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, Calendar calendar) {
        this.A03 = calendar;
        this.A00 = c6fg;
        this.A02 = interfaceC103384lE;
        this.A01 = c6fq;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A03;
        calendar.set(i, i2, i3);
        C6FG c6fg = this.A00;
        InterfaceC103384lE interfaceC103384lE = this.A02;
        C6FQ c6fq = this.A01;
        Context context = c6fg.A00;
        C0fJ.A00(new TimePickerDialog(context, R.style.SpinnerTimePickerDialog, new C28530CiO(c6fg, c6fq, interfaceC103384lE, calendar, 1), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context)));
    }
}
