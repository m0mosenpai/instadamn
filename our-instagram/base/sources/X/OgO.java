package X;

import android.content.DialogInterface;

/* loaded from: classes9.dex */
public final class OgO implements DialogInterface.OnClickListener {
    public static final OgO A00 = new OgO();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
