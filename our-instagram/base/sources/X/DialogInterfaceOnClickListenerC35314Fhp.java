package X;

import android.content.DialogInterface;

/* renamed from: X.Fhp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35314Fhp implements DialogInterface.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC126195nG A00;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            ViewOnClickListenerC126195nG viewOnClickListenerC126195nG = this.A00;
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(viewOnClickListenerC126195nG.A04));
            A0w.E77(AbstractC111324zv.A00(4548), true);
            A0w.apply();
            ViewOnClickListenerC126195nG.A00(viewOnClickListenerC126195nG);
        }
    }

    public DialogInterfaceOnClickListenerC35314Fhp(ViewOnClickListenerC126195nG viewOnClickListenerC126195nG) {
        this.A00 = viewOnClickListenerC126195nG;
    }
}
