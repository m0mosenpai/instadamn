package X;

import android.content.DialogInterface;
import java.util.ArrayDeque;

/* loaded from: classes11.dex */
public final class WI9 implements DialogInterface.OnDismissListener {
    public static final WI9 A00 = new WI9();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ArrayDeque arrayDeque = VZQ.A00;
        if (!arrayDeque.isEmpty()) {
            arrayDeque.removeLast();
        }
    }
}
