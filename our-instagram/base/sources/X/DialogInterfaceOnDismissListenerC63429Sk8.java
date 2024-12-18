package X;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;

/* renamed from: X.Sk8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnDismissListenerC63429Sk8 implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
    public boolean A00 = false;
    public final Callback A01;
    public final Callback A02;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!this.A00) {
            this.A01.invoke(AbstractC25228BEl.A1Y(i));
            this.A00 = true;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A00) {
            this.A02.invoke(AbstractC58318PtA.A1b());
            this.A00 = true;
        }
    }

    public DialogInterfaceOnDismissListenerC63429Sk8(Callback callback, Callback callback2) {
        this.A01 = callback;
        this.A02 = callback2;
    }
}
