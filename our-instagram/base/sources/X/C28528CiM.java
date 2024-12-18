package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

/* renamed from: X.CiM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28528CiM implements TimePickerDialog.OnTimeSetListener {
    public final int A00;
    public final Object A01;

    public C28528CiM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        if (this.A00 != 0) {
            ((InterfaceC30957DjE) this.A01).DtG((i * 3600) + (i2 * 60));
        } else {
            ((InterfaceC16660sJ) this.A01).invoke(new C36J(C36J.A05(C36H.A03(C36G.A04, i), C36H.A03(C36G.A07, i2))));
        }
    }
}
