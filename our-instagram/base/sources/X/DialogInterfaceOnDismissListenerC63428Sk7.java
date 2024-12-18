package X;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.Sk7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnDismissListenerC63428Sk7 implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
    public boolean A00 = false;
    public final Callback A01;
    public final /* synthetic */ DialogModule A02;

    public DialogInterfaceOnDismissListenerC63428Sk7(Callback callback, DialogModule dialogModule) {
        this.A02 = dialogModule;
        this.A01 = callback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!this.A00 && AbstractC58321PtD.A0b(this.A02).A0F()) {
            this.A01.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.A00 = true;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A00 && AbstractC58321PtD.A0b(this.A02).A0F()) {
            AbstractC58321PtD.A1K(this.A01, DialogModule.ACTION_DISMISSED);
            this.A00 = true;
        }
    }
}
