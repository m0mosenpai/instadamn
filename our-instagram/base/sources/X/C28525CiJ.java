package X;

import android.app.DatePickerDialog;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.CiJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28525CiJ implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ C6FG A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ Calendar A03;

    public C28525CiJ(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, Calendar calendar) {
        this.A03 = calendar;
        this.A02 = interfaceC103384lE;
        this.A01 = c6fq;
        this.A00 = c6fg;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A03;
        calendar.set(i, i2, i3);
        InterfaceC103384lE interfaceC103384lE = this.A02;
        if (interfaceC103384lE != null) {
            C6FQ c6fq = this.A01;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A01(this.A00);
            A0s.A02(DateFormat.format("yyyy-MM-dd", calendar));
            AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
        }
    }
}
