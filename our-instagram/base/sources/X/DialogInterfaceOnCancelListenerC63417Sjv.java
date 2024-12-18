package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.Sjv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnCancelListenerC63417Sjv implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnCancelListenerC63417Sjv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                C64480TFq c64480TFq = (C64480TFq) this.A01;
                C64480TFq.A01(c64480TFq, MSV.A00(1103));
                C218914p.A06(c64480TFq);
                return;
            case 1:
                ((Dialog) this.A01).cancel();
                return;
            default:
                ((SLC) this.A01).A00();
                return;
        }
    }
}
