package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMZ implements DialogInterface.OnClickListener {
    public static final LMZ A00 = new LMZ();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
