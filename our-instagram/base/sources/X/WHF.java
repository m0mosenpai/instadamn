package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WHF implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public WHF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            InterfaceC71983XDs interfaceC71983XDs = (InterfaceC71983XDs) this.A01;
            if (interfaceC71983XDs != null) {
                interfaceC71983XDs.onCancel();
                return;
            }
            return;
        }
        ((XCV) this.A01).DsW();
    }
}
