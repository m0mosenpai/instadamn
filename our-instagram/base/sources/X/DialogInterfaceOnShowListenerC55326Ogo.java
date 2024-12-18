package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Window;

/* renamed from: X.Ogo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnShowListenerC55326Ogo implements DialogInterface.OnShowListener {
    public final /* synthetic */ PCT A00;
    public final /* synthetic */ C51904Mwm A01;

    public DialogInterfaceOnShowListenerC55326Ogo(PCT pct, C51904Mwm c51904Mwm) {
        this.A00 = pct;
        this.A01 = c51904Mwm;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        PCT pct = this.A00;
        boolean z = this.A01.A0F;
        Window window = ((Dialog) pct.A0X.getValue()).getWindow();
        if (window != null) {
            int i = -2;
            if (z) {
                i = -1;
            }
            window.setLayout(i, i);
        }
    }
}
