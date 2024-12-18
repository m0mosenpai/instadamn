package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AOK implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8YE A00;
    public final /* synthetic */ String A01;

    public AOK(C8YE c8ye, String str) {
        this.A00 = c8ye;
        this.A01 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8YE c8ye = this.A00;
        C18920wW c18920wW = c8ye.A06;
        C8YA c8ya = c8ye.A0A;
        ALg.A02(c18920wW, c8ya.AbY(), this.A01, c8ye.A03);
        c8ya.Dw9();
    }
}
