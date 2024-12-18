package X;

import android.content.DialogInterface;

/* renamed from: X.AOq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC23177AOq implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C8JT A00;

    public DialogInterfaceOnDismissListenerC23177AOq(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.A00.A0d = false;
    }
}
