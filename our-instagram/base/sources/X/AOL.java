package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AOL implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8YE A00;
    public final /* synthetic */ String A01;

    public AOL(C8YE c8ye, String str) {
        this.A00 = c8ye;
        this.A01 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8YE.A02(this.A00, this.A01);
    }
}
