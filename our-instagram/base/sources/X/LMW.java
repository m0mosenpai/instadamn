package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMW implements DialogInterface.OnClickListener {
    public static final LMW A00 = new LMW();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
