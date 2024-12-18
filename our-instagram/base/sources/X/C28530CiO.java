package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

/* renamed from: X.CiO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28530CiO implements TimePickerDialog.OnTimeSetListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C28530CiO(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, Calendar calendar, int i) {
        this.A00 = i;
        this.A02 = calendar;
        if (i != 0) {
            this.A03 = c6fq;
            this.A04 = interfaceC103384lE;
        } else {
            this.A04 = interfaceC103384lE;
            this.A03 = c6fq;
        }
        this.A01 = c6fg;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        int i3 = this.A00;
        Object obj = this.A02;
        if (i3 != 0) {
            Calendar calendar = (Calendar) obj;
            calendar.set(11, i);
            calendar.set(12, i2);
            long A0L = AbstractC166987dD.A0L(calendar.getTimeInMillis());
            C6FQ c6fq = (C6FQ) this.A03;
            InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A04;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A01(this.A01);
            A0s.A02(Long.valueOf(A0L));
            AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
            return;
        }
        Calendar calendar2 = (Calendar) obj;
        calendar2.set(11, i);
        calendar2.set(12, i2);
        InterfaceC103384lE interfaceC103384lE2 = (InterfaceC103384lE) this.A04;
        if (interfaceC103384lE2 == null) {
            return;
        }
        C6FQ c6fq2 = (C6FQ) this.A03;
        C6FX A0s2 = AbstractC25225BEi.A0s();
        A0s2.A01(this.A01);
        A0s2.A02(String.valueOf(i));
        A0s2.A03(String.valueOf(i2), 2);
        AbstractC25227BEk.A1M(c6fq2, A0s2, interfaceC103384lE2);
    }
}
