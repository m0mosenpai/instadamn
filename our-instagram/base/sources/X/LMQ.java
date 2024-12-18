package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMQ implements DialogInterface.OnClickListener {
    public static final LMQ A00 = new LMQ();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
