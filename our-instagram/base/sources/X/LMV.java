package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMV implements DialogInterface.OnClickListener {
    public static final LMV A00 = new LMV();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
