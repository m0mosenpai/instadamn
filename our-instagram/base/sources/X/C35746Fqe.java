package X;

import android.widget.DatePicker;
import java.util.GregorianCalendar;

/* renamed from: X.Fqe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35746Fqe implements DatePicker.OnDateChangedListener {
    public final int A00;
    public final Object A01;

    public C35746Fqe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = this.A00;
        Object obj = this.A01;
        switch (i4) {
            case 0:
                C33001Ego c33001Ego = (C33001Ego) obj;
                c33001Ego.A00 = i3;
                c33001Ego.A01 = i2;
                c33001Ego.A02 = i;
                if (c33001Ego.A03 != null) {
                    C33001Ego.A01(c33001Ego);
                    return;
                }
                return;
            case 1:
                C32274EJj c32274EJj = (C32274EJj) obj;
                c32274EJj.A02.set(i, i2, i3);
                C32274EJj.A01(c32274EJj);
                return;
            default:
                EJZ ejz = (EJZ) obj;
                GregorianCalendar gregorianCalendar = ejz.A00;
                if (gregorianCalendar == null) {
                    C14360o3.A0F("selectedDate");
                    throw C00O.createAndThrow();
                }
                gregorianCalendar.set(i, i2, i3);
                EJZ.A00(ejz);
                return;
        }
    }
}
