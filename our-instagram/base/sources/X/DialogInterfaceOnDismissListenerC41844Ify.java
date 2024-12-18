package X;

import android.content.DialogInterface;

/* renamed from: X.Ify, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnDismissListenerC41844Ify implements DialogInterface.OnDismissListener {
    public final /* synthetic */ InterfaceC1118853a A00;
    public final /* synthetic */ C149126nM A01;

    public DialogInterfaceOnDismissListenerC41844Ify(InterfaceC1118853a interfaceC1118853a, C149126nM c149126nM) {
        this.A01 = c149126nM;
        this.A00 = interfaceC1118853a;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A01.A00 = false;
        this.A00.EJJ();
    }
}
