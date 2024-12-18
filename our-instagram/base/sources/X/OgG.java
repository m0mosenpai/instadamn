package X;

import android.content.DialogInterface;

/* loaded from: classes9.dex */
public final class OgG implements DialogInterface.OnClickListener {
    public static final OgG A00 = new OgG();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
