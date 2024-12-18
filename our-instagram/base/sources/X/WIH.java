package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WIH implements DialogInterface.OnShowListener {
    public static final WIH A00 = new WIH();

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        VZQ.A00.addLast(dialogInterface);
    }
}
