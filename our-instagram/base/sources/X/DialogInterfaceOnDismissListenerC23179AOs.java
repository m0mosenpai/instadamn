package X;

import android.content.DialogInterface;

/* renamed from: X.AOs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC23179AOs implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C149136nN A00;

    public DialogInterfaceOnDismissListenerC23179AOs(C149136nN c149136nN) {
        this.A00 = c149136nN;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C149136nN c149136nN = this.A00;
        c149136nN.A04.EJJ();
        AbstractC167007dF.A17(((InterfaceC19630xq) c149136nN.A06.getValue()).ARD(), "HAS_DISMISSED_STORY_MEMORY_DIALOG_NUX");
    }
}
