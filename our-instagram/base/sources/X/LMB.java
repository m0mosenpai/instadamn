package X;

import android.app.Activity;
import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMB implements DialogInterface.OnClickListener {
    public final /* synthetic */ C7GN A00;

    public LMB(C7GN c7gn) {
        this.A00 = c7gn;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object A00 = AbstractC13320mI.A00(this.A00.A0L, Activity.class);
        if (A00 != null) {
            WGH.A03((Activity) A00, 2131966672);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
