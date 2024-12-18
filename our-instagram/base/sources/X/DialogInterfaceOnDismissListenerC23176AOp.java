package X;

import android.content.DialogInterface;

/* renamed from: X.AOp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnDismissListenerC23176AOp implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C8JT A00;

    public DialogInterfaceOnDismissListenerC23176AOp(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C50643MXf c50643MXf;
        C8JT c8jt = this.A00;
        if (!c8jt.A0p && (c50643MXf = c8jt.A0F) != null && c50643MXf.A0H) {
            InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
            if (interfaceC58267PsB == null) {
                c50643MXf.A0E();
            } else {
                interfaceC58267PsB.start();
                c50643MXf.A0N.postOnAnimation(c50643MXf.A0g);
            }
        }
    }
}
