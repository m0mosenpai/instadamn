package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMR implements DialogInterface.OnClickListener {
    public static final LMR A00 = new LMR();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
