package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMT implements DialogInterface.OnClickListener {
    public static final LMT A00 = new LMT();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
