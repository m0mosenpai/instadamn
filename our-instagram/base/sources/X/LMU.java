package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMU implements DialogInterface.OnClickListener {
    public static final LMU A00 = new LMU();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
