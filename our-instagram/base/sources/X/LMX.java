package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMX implements DialogInterface.OnClickListener {
    public static final LMX A00 = new LMX();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
