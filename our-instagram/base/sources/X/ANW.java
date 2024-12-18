package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class ANW implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C8EU A00;

    public ANW(C8EU c8eu) {
        this.A00 = c8eu;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C8EV.A01(this.A00.A00, "sticker_creation_nux_not_now_button_tapped");
    }
}
