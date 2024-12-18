package X;

import android.content.DialogInterface;

/* loaded from: classes12.dex */
public final class Y7t implements DialogInterface.OnClickListener {
    public final /* synthetic */ YP2 A00;

    public Y7t(YP2 yp2) {
        this.A00 = yp2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C14360o3.A0B(dialogInterface, 0);
        this.A00.DAt();
        dialogInterface.dismiss();
    }
}
