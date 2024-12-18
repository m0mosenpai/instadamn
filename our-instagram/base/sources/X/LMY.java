package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMY implements DialogInterface.OnClickListener {
    public static final LMY A00 = new LMY();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
