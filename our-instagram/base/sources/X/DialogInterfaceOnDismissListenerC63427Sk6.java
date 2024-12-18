package X;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.widget.DatePicker;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.Sk6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnDismissListenerC63427Sk6 implements DialogInterface.OnDismissListener, DatePickerDialog.OnDateSetListener {
    public boolean A00 = false;
    public final InterfaceC65622ToD A01;
    public final /* synthetic */ DatePickerDialogModule A02;

    public DialogInterfaceOnDismissListenerC63427Sk6(DatePickerDialogModule datePickerDialogModule, InterfaceC65622ToD interfaceC65622ToD) {
        this.A02 = datePickerDialogModule;
        this.A01 = interfaceC65622ToD;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (!this.A00 && AbstractC58321PtD.A0b(this.A02).A0F()) {
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            A0c.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
            A0c.putInt("year", i);
            A0c.putInt("month", i2);
            A0c.putInt("day", i3);
            this.A01.resolve(A0c);
            this.A00 = true;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A00 && AbstractC58321PtD.A0b(this.A02).A0F()) {
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            A0c.putString("action", DatePickerDialogModule.ACTION_DISMISSED);
            this.A01.resolve(A0c);
            this.A00 = true;
        }
    }
}
