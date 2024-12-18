package X;

import android.content.DialogInterface;

/* renamed from: X.Ifx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnDismissListenerC41843Ifx implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnDismissListenerC41843Ifx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ILW ilw;
        switch (this.A00) {
            case 0:
            case 1:
                C42090Ikx c42090Ikx = (C42090Ikx) this.A01;
                InterfaceC60142ow interfaceC60142ow = c42090Ikx.A09;
                if (interfaceC60142ow != null) {
                    interfaceC60142ow.D2E(c42090Ikx.A0E);
                }
                c42090Ikx.A03.onDismiss(dialogInterface);
                return;
            case 2:
                ((JI5) this.A01).Df1();
                return;
            case 3:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 4:
                ilw = ((C37609Gh4) this.A01).A05;
                ilw.A00();
                return;
            case 5:
                C37540Gfw c37540Gfw = ((C41699IdS) this.A01).A0D.A00.A09;
                if (c37540Gfw == null) {
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                c37540Gfw.A0G();
                return;
            case 6:
            case 7:
            default:
                ilw = ((C37610Gh5) this.A01).A03;
                ilw.A00();
                return;
            case 8:
                ilw = ((C37607Gh2) this.A01).A0E;
                ilw.A00();
                return;
            case 9:
                ilw = ((C37608Gh3) this.A01).A0H;
                ilw.A00();
                return;
        }
    }
}
