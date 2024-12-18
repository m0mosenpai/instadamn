package X;

import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.Cln, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28695Cln implements DatePicker.OnDateChangedListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C28695Cln(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A03 = interfaceC103384lE;
            this.A02 = c102884kP;
        } else {
            this.A02 = c102884kP;
            this.A03 = interfaceC103384lE;
        }
        this.A01 = c6fg;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        switch (this.A00) {
            case 0:
                Calendar calendar = Calendar.getInstance();
                calendar.set(i, i2, i3, 0, 0, 0);
                C102884kP c102884kP = (C102884kP) this.A02;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A03("0", 0);
                A0s.A02(Long.valueOf(AbstractC166987dD.A0L(calendar.getTimeInMillis())));
                C6FP.A03((C6FG) this.A01, c102884kP, A0s.A00(), interfaceC103384lE);
                return;
            case 1:
                InterfaceC103384lE interfaceC103384lE2 = (InterfaceC103384lE) this.A03;
                if (interfaceC103384lE2 == null) {
                    return;
                }
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(i, i2, i3, 0, 0);
                C102884kP c102884kP2 = (C102884kP) this.A02;
                C6FX A0s2 = AbstractC25225BEi.A0s();
                A0s2.A03("0", 0);
                A0s2.A02(Long.valueOf(AbstractC166987dD.A0L(calendar2.getTimeInMillis())));
                C6FP.A03((C6FG) this.A01, c102884kP2, A0s2.A00(), interfaceC103384lE2);
                return;
            default:
                return;
        }
    }
}
