package X;

import android.content.DialogInterface;
import android.widget.CompoundButton;

/* renamed from: X.FkK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC35463FkK implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnDismissListenerC35463FkK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C193328hC c193328hC, Object obj, int i) {
        c193328hC.A0g(new DialogInterfaceOnDismissListenerC35463FkK(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC37219GaU interfaceC37219GaU;
        switch (this.A00) {
            case 0:
                ((L6B) this.A01).A00();
                return;
            case 1:
                ((C148086le) this.A01).A00();
                return;
            case 2:
                ((CompoundButton) this.A01).setChecked(true);
                return;
            case 3:
                C148786mn c148786mn = (C148786mn) this.A01;
                c148786mn.A01 = false;
                c148786mn.A07.EJJ();
                return;
            case 4:
                C32318ELi c32318ELi = (C32318ELi) this.A01;
                C83743oJ.A01(c32318ELi.A01).A0H(c32318ELi.A01.userId);
                C32318ELi.A00(c32318ELi);
                return;
            case 5:
                C32981Efn c32981Efn = (C32981Efn) this.A01;
                c32981Efn.A00 = null;
                c32981Efn.A03.unregisterLifecycleListener(c32981Efn);
                return;
            case 6:
                interfaceC37219GaU = (InterfaceC37219GaU) this.A01;
                interfaceC37219GaU.DqX();
                return;
            case 7:
            case 8:
            default:
                interfaceC37219GaU = (InterfaceC37219GaU) this.A01;
                if (interfaceC37219GaU == null) {
                    return;
                }
                interfaceC37219GaU.DqX();
                return;
            case 9:
                ((InterfaceC37213GaO) this.A01).DqX();
                return;
            case 10:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
        }
    }
}
