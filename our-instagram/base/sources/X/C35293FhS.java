package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

/* renamed from: X.FhS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35293FhS implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ GYI A00;
    public final /* synthetic */ C33244Ele A01;

    public C35293FhS(GYI gyi, C33244Ele c33244Ele) {
        this.A01 = c33244Ele;
        this.A00 = gyi;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.A00.DtH(AnonymousClass001.A0P(":", i, i2));
    }
}
