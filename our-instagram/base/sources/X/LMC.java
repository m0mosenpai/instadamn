package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class LMC implements DialogInterface.OnClickListener {
    public final /* synthetic */ LI1 A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public LMC(LI1 li1, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = li1;
        this.A01 = interfaceC16820sZ;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        LI1 li1 = this.A00;
        if (li1.A00) {
            this.A01.invoke();
        } else {
            LI1.A00(li1);
        }
    }
}
