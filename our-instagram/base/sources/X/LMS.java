package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMS implements DialogInterface.OnClickListener {
    public static final LMS A00 = new LMS();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
