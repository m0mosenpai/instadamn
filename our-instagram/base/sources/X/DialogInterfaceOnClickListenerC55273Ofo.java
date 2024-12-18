package X;

import android.content.DialogInterface;

/* renamed from: X.Ofo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55273Ofo implements DialogInterface.OnClickListener {
    public final /* synthetic */ C54982OTq A00;
    public final /* synthetic */ OBN A01;

    public DialogInterfaceOnClickListenerC55273Ofo(C54982OTq c54982OTq, OBN obn) {
        this.A00 = c54982OTq;
        this.A01 = obn;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C54982OTq.A00(EnumC201098ur.ACCEPT, this.A00, null);
        OBN obn = this.A01;
        C79923hh.A00.A0C(obn.A00, obn.A01, obn.A02, false);
    }
}
